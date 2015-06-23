package de.cau.cs.se.geco.architecture.scoping

import com.google.inject.Inject
import com.google.inject.name.Named
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.Weaver
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import de.cau.cs.se.geco.architecture.architecture.NodeType
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.impl.JvmGenericTypeImplCustom
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.framework.IWeaver
import de.cau.cs.se.geco.architecture.framework.IGenerator

class ArchitectureScopeProvider implements IDelegatingScopeProvider {
	
	@Inject
	private IJvmTypeProvider.Factory typeProviderFactory
				
	@Inject @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	IScopeProvider delegate
	
	val String WEAVER_INTERFACE = IWeaver.name
	
	val String GENERATOR_INTERFACE = IGenerator.name
		
	override getScope(EObject context, EReference reference) {
		switch(context) {
			// Find scope for the package property in the MetaModel rule.
			// reference.name.equals("property name")
			NodeProperty case reference.name.equals("property"): createPropertyScope(context.eContainer, reference)
			//Generator case reference.name.equals("generator"): createGeneratorJvmTypeScope(context.eContainer)
			//Weaver case reference.name.equals("weaver"): createWeaverJvmTypeScope(context.eContainer)
			Import, RegisteredPackage: delegate.getScope(context, reference)
			Typeof: createTypeofScope(context, reference)
			NodeType: createNodeTypeScope(context, reference)
			default: {
				System.out.println(">> " + context + " " + reference)
				delegate.getScope(context, reference)
			}
		}
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
					nodeType.modelNode.eResource().getResourceSet(), typeProviderFactory
				)
			} else 
				return IScope.NULLSCOPE
		} else {
			if (generator.targetModel.reference == null) {
				if (generator.eContainer instanceof Weaver) {
					return new JvmRegisterMetamodelImportScope((generator.eContainer as Weaver).
							resolveWeaverSourceModel.resolveType,
						nodeType.modelNode.eResource().getResourceSet(), typeProviderFactory
					)
				} else
					IScope.NULLSCOPE
			} else {
				return new JvmRegisterMetamodelImportScope(generator.targetModel.reference.resolveType, 
					nodeType.modelNode.eResource().getResourceSet(), typeProviderFactory
				)
			}
		}
	}
	
	private def Generator getGeneratorContextNode(EObject type) {
		val container = type.eContainer
		switch (container) {
			Generator: return container
			case null : return null
			default: type.eContainer.generatorContextNode
		}
	}
	
	/**
	 * Scope for the type of call.
	 */
	private def IScope createTypeofScope(Typeof type, EReference reference) {
		val context = type.metaModelContextNode
		if (context != null) {
			return new JvmRegisterMetamodelImportScope(context, 
				type.modelNode.eResource().getResourceSet(),
				typeProviderFactory
			)
		} else
			IScope.NULLSCOPE
	}
	
	private def Model getModelNode(EObject node) {
		if (node != null) {
			if (node instanceof Model)
				return node as Model
			else
				return node.eContainer.modelNode
		} else
			return null	
	}
	
	private def JvmType getMetaModelContextNode(EObject type) {
		val container = type.eContainer
		switch (container) {
			NodeProperty: return container.property.resolveType
			SourceModelNodeSelector: return container.reference.resolveType
			case null : return null
			default: type.eContainer.metaModelContextNode
		}
	}
	
//	private def IScope createWeaverJvmTypeScope(EObject container) {
//		if (container instanceof Model) { 
//			val result = new ArrayList<JvmType>()
//			(container as Model).imports.forEach[result += it.importedNamespace]
//			return new JvmImportTypeScope((container as Model).imports.
//				filter[WEAVER_INTERFACE.equals(it.importedNamespace.simpleName)]
//			)
//		} else				
//			throw new UnsupportedOperationException("Illegal nesting of weaver inside a " + container.class.name)
//	}
//	
//	/**
//	 * 
//	 */
//	private def IScope createGeneratorJvmTypeScope(EObject container) {
//		if (container instanceof Model) { 
//			return new JvmImportTypeScope((container as Model).imports.
//				filter[GENERATOR_INTERFACE.equals(it.importedNamespace.simpleName)]
//			)
//		} else if (container instanceof Weaver)
//			createGeneratorJvmTypeScope(container.eContainer)
//		else				
//			throw new UnsupportedOperationException("Illegal nesting of generator inside a " + container.class.name)
//	}
	
	/**
	 * Create scope for property.
	 */
	private def IScope createPropertyScope(EObject container, EReference reference) {
		switch(container) {
			ModelNodeType: container.target.importedNamespace.createJvmDeclaredTypeScope(reference)
			NodeProperty: IScope.NULLSCOPE
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
	

	override getDelegate() {
		return delegate
	}
	
}