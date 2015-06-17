package de.cau.cs.se.geco.architecture.scoping;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.scoping.EPackageScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider;

@SuppressWarnings("all")
public class ArchitectureScopeProvider implements IDelegatingScopeProvider {
  public final static String NAMED_DELEGATE = "de.cau.cs.se.geco.architecture.scoping.ArchitectureScopeProvider.delegate";
  
  @Inject
  @Named(ArchitectureScopeProvider.NAMED_DELEGATE)
  private IScopeProvider delegate;
  
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      System.out.println((((">> " + context) + " ") + reference));
      IScope _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (context instanceof Metamodel) {
          String _name = reference.getName();
          boolean _equals = _name.equals("modelPackage");
          if (_equals) {
            _matched=true;
            Resource _eResource = ((Metamodel)context).eResource();
            ResourceSet _resourceSet = _eResource.getResourceSet();
            _switchResult = new EPackageScope(_resourceSet);
          }
        }
      }
      if (!_matched) {
        if (context instanceof ModelNodeType) {
          String _name = reference.getName();
          boolean _equals = _name.equals("type");
          if (_equals) {
            _matched=true;
            Metamodel _target = ((ModelNodeType)context).getTarget();
            EPackage _modelPackage = _target.getModelPackage();
            EList<EClassifier> _eClassifiers = _modelPackage.getEClassifiers();
            _switchResult = Scopes.scopeFor(_eClassifiers);
          }
        }
      }
      if (!_matched) {
        _switchResult = this.delegate.getScope(context, reference);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
}
