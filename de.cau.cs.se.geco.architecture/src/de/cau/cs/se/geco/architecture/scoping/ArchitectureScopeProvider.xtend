package de.cau.cs.se.geco.architecture.scoping

import com.google.inject.Inject
import com.google.inject.name.Named
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Model
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.architecture.Import
import java.util.ArrayList
import de.cau.cs.se.geco.architecture.architecture.Weaver

class ArchitectureScopeProvider implements IDelegatingScopeProvider {
			
	@Inject @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	IScopeProvider delegate
		
	override getScope(EObject context, EReference reference) {
		switch(context) {
			// Find scope for the package property in the MetaModel rule.
			// reference.name.equals("property name")
			NodeProperty case reference.name.equals("property"): createPropertyScope(context.eContainer, reference)
			Generator case reference.name.equals("generator"): createJvmTypeScope(context.eContainer)
			default: {
				System.out.println(">> " + context + " " + reference)
				delegate.getScope(context, reference)
			}
		}
	}
	
	private def IScope createJvmTypeScope(EObject container) {
		if (container instanceof Model) { 
			val result = new ArrayList<JvmType>()
			(container as Model).imports.forEach[result += it.importedNamespace]
			return Scopes.scopeFor(result)
		} else if (container instanceof Weaver)
			createJvmTypeScope(container.eContainer)
		else				
			throw new UnsupportedOperationException("Illegal nesting of generator inside a " + container.class.name)
	}
	
	private def IScope createPropertyScope(EObject container, EReference reference) {
		switch(container) {
			ModelNodeType: container.target.registeredPackage.createJvmDeclaredTypeScope(reference)
			NodeProperty: IScope.NULLSCOPE
			default: IScope.NULLSCOPE
		}
	}
	
	private def IScope createJvmDeclaredTypeScope(JvmType type, EReference reference) {
		switch(type) {
			JvmDeclaredType: new JvmMemberType(type)
			default: IScope.NULLSCOPE
		}
	}
	

	override getDelegate() {
		return delegate
	}
	
}