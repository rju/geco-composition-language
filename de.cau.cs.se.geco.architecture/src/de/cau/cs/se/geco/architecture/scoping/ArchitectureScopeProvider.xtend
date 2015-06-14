package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import org.eclipse.xtext.scoping.Scopes

class ArchitectureScopeProvider extends AbstractDeclarativeScopeProvider {
	
	public final static String NAMED_DELEGATE = "de.cau.cs.se.geco.architecture.scoping.ArchitectureScopeProvider.delegate";
	
	def scope_ModelNodeType_type(ModelNodeType ctx, EReference reference) {
		return Scopes.scopeFor(ctx.target.modelPackage.EClassifiers)
	}
	
	/**
	 * Find scope for the package property in the MetaModel rule.
	 * 
	 * @param context
	 *            The Package-object of the resulting model.
	 * @param reference
	 *            The EReference-reference object of the AST.
	 * @return The scope for the package attribute.
	 */
	def IScope scope_Metamodel_modelPackage(Metamodel context, EReference reference) {
 		val IScope result = new EPackageScope(context.eResource().getResourceSet())
		return result
	}
}