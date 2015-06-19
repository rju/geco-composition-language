package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Named
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.WeaverImport
import de.cau.cs.se.geco.architecture.architecture.GeneratorImport
import de.cau.cs.se.geco.architecture.architecture.Generator

import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation
import org.eclipse.xtext.scoping.IScope
import de.cau.cs.se.geco.architecture.architecture.TraceModel

class ArchitectureScopeProvider implements IDelegatingScopeProvider {
			
	@Inject @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	IScopeProvider delegate
		
	override getScope(EObject context, EReference reference) {
		switch(context) {
			Weaver case reference.name.equals("weaver"): new JvmScope(context.eResource(), WeaverImport)
			Generator case reference.name.equals("generator"): new JvmScope(context.eResource(), GeneratorImport)
			default: {
				System.out.println(">> " + context + " " + reference)
				delegate.getScope(context, reference)
			}
		}
	}

	
	override getDelegate() {
		return delegate
	}
	
}