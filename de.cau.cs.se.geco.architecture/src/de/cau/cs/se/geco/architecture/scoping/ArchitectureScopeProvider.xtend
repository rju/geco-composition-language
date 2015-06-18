package de.cau.cs.se.geco.architecture.scoping

import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Named
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.WeaverImport
import de.cau.cs.se.geco.architecture.architecture.GeneratorImport
import de.cau.cs.se.geco.architecture.architecture.Generator

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*

class ArchitectureScopeProvider implements IDelegatingScopeProvider {
			
	@Inject @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	IScopeProvider delegate
		
	override getScope(EObject context, EReference reference) {
		switch(context) {
			// Find scope for the package property in the MetaModel rule.
			RegisteredPackage case reference.name.equals("modelPackage"): new EPackageScope(context.eResource().getResourceSet())
			ModelNodeType case reference.name.equals("type"): Scopes.scopeFor(context.target.modelPackage.EClassifiers)
			NodeProperty case reference.name.equals("property"): createNodePropertyScope(context.eContainer)
			Weaver case reference.name.equals("weaver"): new JvmScope(context.eResource(), WeaverImport)
			Generator case reference.name.equals("generator"): new JvmScope(context.eResource(), GeneratorImport)
			default: {
				System.out.println(">> " + context + " " + reference)
				delegate.getScope(context, reference)
			}
		}
	}
	
	private def createNodePropertyScope(EObject container) {
		switch(container) {
			SourceModelNodeSelector: Scopes.scopeFor((container.reference.eContainer as MetamodelSequence).
				type.resolveType?.EAllReferences
			)
			ModelNodeType: Scopes.scopeFor(container.type.EAllReferences)
			NodeProperty: Scopes.scopeFor(container.property.EReferenceType.EAllReferences)
		}
	}
	

	
	override getDelegate() {
		return delegate
	}
	
}