/***************************************************************************
 * Copyright (C) 2016 Reiner Jung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.xtext.scoping.IScope
import de.cau.cs.se.geco.architecture.architecture.Generator
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject
import de.cau.cs.se.geco.architecture.architecture.GecoModel
import de.cau.cs.se.geco.architecture.framework.IWeaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.architecture.Weaver
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider
import com.google.inject.Inject
import com.google.inject.name.Named
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScopeProvider

import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.ModelType
import org.eclipse.xtext.common.types.JvmDeclaredType
import de.cau.cs.se.geco.architecture.architecture.NodeType
import de.cau.cs.se.geco.architecture.architecture.InstanceOf
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector
import de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.TargetModel
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference
import de.cau.cs.se.geco.architecture.architecture.ModelSequence
import de.cau.cs.se.geco.architecture.framework.IWeaverSeparatePointcut

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*


/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ArchitectureScopeProvider extends AbstractArchitectureScopeProvider implements IDelegatingScopeProvider {
	
	@Inject
	IJvmTypeProvider.Factory typeProviderFactory
	
	@Inject @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	IScopeProvider delegate

	override getScope(EObject context, EReference reference) {
		switch(context) {
			// nodes with specific scopes
			NodeProperty case reference.name.equals("property"): createPropertyScope(context.eContainer, reference)
			Generator case reference.name.equals("reference"): createGeneratorReferenceScope(context, reference)
			Weaver case reference.name.equals("reference"): createWeaverReferenceScope(context, reference)
			NodeType: createNodeTypeScope(context, reference)
			InstanceOf: createInstanceOfScope(context, reference)
			// delegation scope
			Generator case reference.name.equals("readTraceModels"),
			TraceModelReference,
			Import,
			ModelType,
			RegisteredRootClass,
			SourceModelSelector,
			TargetModel: delegate.getScope(context, reference)
			// default scope, prints out node type and reference. Should not be called.
			// Development and debugging helper
			default: {
				System.out.println(">> " + context + " " + reference)
				throw new UnsupportedOperationException("No scope available for " + context.class)
			}
		}
	}
		
	override getDelegate() {
		return delegate
	}
	
	/**
	 * Create scope for property.
	 */
	private def IScope createPropertyScope(EObject container, EReference reference) {
		switch(container) {
			ModelType: container.target.importedNamespace.createJvmDeclaredTypeScope(reference)
			NodeProperty: (container.property as JvmOperation).returnType.type.createJvmDeclaredTypeScope(reference)
			SourceModelSelector: {
				val genericType = (container.reference.eContainer as ModelSequence).type.resolveType.determineElementType
				// TODO this must be converted into a typing method
				if (container.constraint !== null) {
					if (container.constraint instanceof InstanceOf) {
						return (container.constraint as InstanceOf).type.createJvmDeclaredTypeScope(reference)
					}
				}
				return genericType.createJvmDeclaredTypeScope(reference)
			}
			default: IScope.NULLSCOPE
		}
	}
		
	/**
	 * Create scope of JvmDeclareType for its member (getters for features).
	 */
	private def IScope createJvmDeclaredTypeScope(JvmType type, EReference reference) {
		switch(type) {
			JvmDeclaredType: new JvmMemberTypeScope(type)
			default: IScope.NULLSCOPE
		}
	}
	
	/**
	 * Scope for generators.
	 */
	private def IScope createGeneratorReferenceScope(Generator context, EReference reference) {
		return new JvmImportTypeScope(context.modelRoot.imports.
			filter[it.importedNamespace.implementsInterface(context, IGenerator.name)]
		) 	 
	}

	/**
	 * Scope for weavers.
	 */
	private def IScope createWeaverReferenceScope(Weaver context, EReference reference) {
		return new JvmImportTypeScope(context.modelRoot.imports.
			filter[
				it.importedNamespace.implementsInterface(context, IWeaver.name) ||
				it.importedNamespace.implementsInterface(context, IWeaverSeparatePointcut.name)
			]
		)
	}
	
	/**
	 * Scope for the trace model scope.
	 */
	private def IScope createNodeTypeScope(NodeType nodeType, EReference reference) {
		val generator = nodeType.generatorContextNode
		if ((nodeType.eContainer as NodeSetRelation).sourceNodes.exists[it.equals(nodeType)]) {
			if (generator.sourceModel.reference !== null) {
				/** source node type */
				
				return new JvmRegisterMetamodelImportScope(generator.sourceModel.reference.resolveType.determineElementType, 
					nodeType.modelRoot.eResource().getResourceSet(), typeProviderFactory
				)
			} else /** this should not happen in a valid model. Provide solid fallback for incomplete model. */
				return IScope.NULLSCOPE
		} else {
			if (generator.targetModel === null) {
				if (generator.eContainer instanceof Weaver) {
					val sourceModel = (generator.eContainer as Weaver).resolveWeaverSourceModel
					if (sourceModel !== null)
						return new JvmRegisterMetamodelImportScope(sourceModel.reference.resolveType.determineElementType,
							nodeType.modelRoot.eResource().getResourceSet(), typeProviderFactory
						)
					else
						return IScope.NULLSCOPE
				} else /** this should not happen in a valid model. Provide solid fallback for incomplete model. */
					IScope.NULLSCOPE
			} else {
				return new JvmRegisterMetamodelImportScope(generator.targetModel.reference.resolveType.determineElementType, 
					nodeType.modelRoot.eResource().getResourceSet(), typeProviderFactory
				)
			}
		}
	}
		
	/**
	 * Scope for the type of call.
	 */
	private def IScope createInstanceOfScope(InstanceOf type, EReference reference) {
		val context = type.metaModelContextNode
		if (context !== null) {
			return new JvmRegisterMetamodelImportScope(context, 
				type.modelRoot.eResource().getResourceSet(),
				typeProviderFactory
			)
		} else
			IScope.NULLSCOPE
	}
	
	private def GecoModel getModelRoot(EObject object) {
		val container = object.eContainer
		switch (container) {
			GecoModel: return container
			case null: throw new Exception("Corrupted model: No Model node.")
			default: container.modelRoot
		}
	}
	
	private def JvmType getMetaModelContextNode(EObject type) {
		val container = type.eContainer
		switch (container) {
			NodeProperty: return container.property.resolveType.determineElementType
			SourceModelSelector: return container.reference.resolveType.determineElementType
			case null : throw new Exception("Corrupted model: Cannot find NodeProperty or SourceModelNodeSelector context.")
			default: type.eContainer.metaModelContextNode
		}
	}
			
	private def Generator getGeneratorContextNode(EObject type) {
		val container = type.eContainer
		switch (container) {
			Generator: return container
			case null : throw new Exception("Corrupted model: Cannot find Generator context.")
			default: type.eContainer.generatorContextNode
		}
	}
	
	/**
	 * Check if the given JvmType implements the interface specified by typeName.
	 */
	private def Boolean implementsInterface(JvmType type, EObject object, String typeName) {
		val matchingType = typeProviderFactory.createTypeProvider(object.eResource.resourceSet).
			findTypeByName(typeName)
		switch(type) {
			JvmGenericType: type.isSubTypeOf(matchingType)
			default: false
		}
	}
		
}
