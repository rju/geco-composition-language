package de.cau.cs.se.geco.architecture.scoping;

import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.scoping.EPackageScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

@SuppressWarnings("all")
public class ArchitectureScopeProvider extends AbstractDeclarativeScopeProvider {
  public final static String NAMED_DELEGATE = "de.cau.cs.se.geco.architecture.scoping.ArchitectureScopeProvider.delegate";
  
  public IScope scope_ModelNodeType_type(final ModelNodeType ctx, final EReference reference) {
    Metamodel _target = ctx.getTarget();
    EPackage _modelPackage = _target.getModelPackage();
    EList<EClassifier> _eClassifiers = _modelPackage.getEClassifiers();
    return Scopes.scopeFor(_eClassifiers);
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
  public IScope scope_Metamodel_modelPackage(final Metamodel context, final EReference reference) {
    Resource _eResource = context.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final IScope result = new EPackageScope(_resourceSet);
    return result;
  }
}
