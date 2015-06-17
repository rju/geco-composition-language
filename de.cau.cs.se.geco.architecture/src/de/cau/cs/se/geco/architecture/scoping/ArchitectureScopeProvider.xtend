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
import org.eclipse.emf.ecore.EClass

class ArchitectureScopeProvider implements IDelegatingScopeProvider {
		
	public final static String NAMED_DELEGATE = "de.cau.cs.se.geco.architecture.scoping.ArchitectureScopeProvider.delegate";
	
	@Inject @Named(NAMED_DELEGATE)
	IScopeProvider delegate
		
	override getScope(EObject context, EReference reference) {
		System.out.println(">> " + context + " " + reference)
		switch(context) {
			// Find scope for the package property in the MetaModel rule.
			RegisteredPackage case reference.name.equals("modelPackage"): new EPackageScope(context.eResource().getResourceSet())
			ModelNodeType case reference.name.equals("type"): Scopes.scopeFor(context.target.modelPackage.EClassifiers)
			NodeProperty case reference.name.equals("property"): createNodePropertyScope(context.eContainer)
			default: delegate.getScope(context, reference)
		}
	}
	
	private def createNodePropertyScope(EObject container) {
		switch(container) {
			SourceModelNodeSelector: Scopes.scopeFor((container.reference.eContainer as MetamodelSequence).type.resolveType.EAllReferences)
			ModelNodeType: Scopes.scopeFor(container.type.EAllReferences)
			NodeProperty: Scopes.scopeFor(container.property.EReferenceType.EAllReferences)
		}
	}
	
	private def EClass resolveType(ModelNodeType type) {
		if (type.property == null)
			return type.type
		else
			return type.property.resolveType
	}
	
	private def EClass resolveType(NodeProperty property) {
		if (property.subProperty == null)
			return property.property.EReferenceType
		else
			return property.subProperty.resolveType
	} 
	
	override getDelegate() {
		return delegate
	}
	
}