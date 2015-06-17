package de.cau.cs.se.geco.architecture.scoping

import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import org.eclipse.emf.ecore.EReference
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Named
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider

class ArchitectureScopeProvider implements IDelegatingScopeProvider {
		
	public final static String NAMED_DELEGATE = "de.cau.cs.se.geco.architecture.scoping.ArchitectureScopeProvider.delegate";
	
	@Inject @Named(NAMED_DELEGATE)
	IScopeProvider delegate
		
	override getScope(EObject context, EReference reference) {
		System.out.println(">> " + context + " " + reference)
		switch(context) {
			// Find scope for the package property in the MetaModel rule.
			Metamodel case reference.name.equals("modelPackage"): new EPackageScope(context.eResource().getResourceSet())
			ModelNodeType case reference.name.equals("type"): Scopes.scopeFor(context.target.modelPackage.EClassifiers)
			default: delegate.getScope(context, reference)
		}
	}
	
	override getDelegate() {
		return delegate
	}
	
}