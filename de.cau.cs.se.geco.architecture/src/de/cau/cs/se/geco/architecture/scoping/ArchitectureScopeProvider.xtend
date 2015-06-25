/*
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.xtext.scoping.IScope
import de.cau.cs.se.geco.architecture.architecture.Generator
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.framework.IWeaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.architecture.Weaver
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider
import com.google.inject.Inject
import com.google.inject.name.Named
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScopeProvider

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import org.eclipse.xtext.common.types.JvmDeclaredType
import de.cau.cs.se.geco.architecture.architecture.NodeType
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference

class ArchitectureScopeProvider extends AbstractScopeProvider implements IDelegatingScopeProvider {
	
	@Inject
	IJvmTypeProvider.Factory typeProviderFactory
	
	@Inject @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	IScopeProvider delegate

	val String WEAVER_INTERFACE = IWeaver.name
	
	val String GENERATOR_INTERFACE = IGenerator.name

	override getScope(EObject context, EReference reference) {
		switch(context) {
			// nodes with specific scopes
			NodeProperty case reference.name.equals("property"): createPropertyScope(context.eContainer, reference)
			Generator case reference.name.equals("reference"): createGeneratorReferenceScope(context, reference)
			Weaver case reference.name.equals("reference"): createWeaverReferenceScope(context, reference)
			NodeType: createNodeTypeScope(context, reference)
			Typeof: createTypeofScope(context, reference)
			// delegation scope
			Generator case reference.name.equals("readTraceModels"),
			TraceModelReference,
			Import,
			ModelNodeType,
			RegisteredPackage,
			SourceModelNodeSelector,
			TargetModelNodeType: delegate.getScope(context, reference)
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
			ModelNodeType: container.target.importedNamespace.createJvmDeclaredTypeScope(reference)
			NodeProperty: (container.property as JvmOperation).returnType.type.createJvmDeclaredTypeScope(reference)
			SourceModelNodeSelector: container.resolveType.createJvmDeclaredTypeScope(reference)
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
			filter[it.importedNamespace.implementsInterface(context, GENERATOR_INTERFACE)]
		) 	 
	}

	/**
	 * Scope for weavers.
	 */
	private def IScope createWeaverReferenceScope(Weaver context, EReference reference) {
		return new JvmImportTypeScope(context.modelRoot.imports.
			filter[it.importedNamespace.implementsInterface(context, WEAVER_INTERFACE)]
		)
	}
	
	/**
	 * Scope for the trace model scope.
	 */
	private def IScope createNodeTypeScope(NodeType nodeType, EReference reference) {
		val generator = nodeType.generatorContextNode
		if ((nodeType.eContainer as NodeSetRelation).sourceNodes.exists[it.equals(nodeType)]) {
			if (generator.sourceModel.reference != null) {
				/** source node type */
				
				return new JvmRegisterMetamodelImportScope(generator.sourceModel.reference.resolveType, 
					nodeType.modelRoot.eResource().getResourceSet(), typeProviderFactory
				)
			} else /** this should not happen in a valid model. Provide solid fallback for incomplete model. */
				return IScope.NULLSCOPE
		} else {
			if (generator.targetModel.reference == null) {
				if (generator.eContainer instanceof Weaver) {
					val sourceModel = (generator.eContainer as Weaver).resolveWeaverSourceModel
					if (sourceModel != null)
						return new JvmRegisterMetamodelImportScope(sourceModel.resolveType,
							nodeType.modelRoot.eResource().getResourceSet(), typeProviderFactory
						)
					else
						return IScope.NULLSCOPE
				} else /** this should not happen in a valid model. Provide solid fallback for incomplete model. */
					IScope.NULLSCOPE
			} else {
				return new JvmRegisterMetamodelImportScope(generator.targetModel.reference.resolveType, 
					nodeType.modelRoot.eResource().getResourceSet(), typeProviderFactory
				)
			}
		}
	}
		
	/**
	 * Scope for the type of call.
	 */
	private def IScope createTypeofScope(Typeof type, EReference reference) {
		val context = type.metaModelContextNode
		if (context != null) {
			return new JvmRegisterMetamodelImportScope(context, 
				type.modelRoot.eResource().getResourceSet(),
				typeProviderFactory
			)
		} else
			IScope.NULLSCOPE
	}
	
	private def Model getModelRoot(EObject object) {
		val container = object.eContainer
		switch (container) {
			Model: return container
			case null: throw new Exception("Corrupted model: No Model node.")
			default: container.modelRoot
		}
	}
	
	private def JvmType getMetaModelContextNode(EObject type) {
		val container = type.eContainer
		switch (container) {
			NodeProperty: return container.property.resolveType
			SourceModelNodeSelector: return container.reference.resolveType
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
			JvmGenericType: type.isSubtypeOf(matchingType)
			default: false
		}
	}
	
	def Boolean isSubtypeOf(JvmGenericType type, JvmType matchingType) {
		if (type.superTypes.exists[it.type.equals(matchingType)]) {
			return true
		} else {
			type.superTypes.exists[(it.type as JvmGenericType).isSubtypeOf(matchingType)]		
		}
	}
	
}
