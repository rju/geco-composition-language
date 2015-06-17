package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.scoping.EPackageScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
        if (context instanceof RegisteredPackage) {
          String _name = reference.getName();
          boolean _equals = _name.equals("modelPackage");
          if (_equals) {
            _matched=true;
            Resource _eResource = ((RegisteredPackage)context).eResource();
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
            RegisteredPackage _target = ((ModelNodeType)context).getTarget();
            EPackage _modelPackage = _target.getModelPackage();
            EList<EClassifier> _eClassifiers = _modelPackage.getEClassifiers();
            _switchResult = Scopes.scopeFor(_eClassifiers);
          }
        }
      }
      if (!_matched) {
        if (context instanceof NodeProperty) {
          String _name = reference.getName();
          boolean _equals = _name.equals("property");
          if (_equals) {
            _matched=true;
            EObject _eContainer = ((NodeProperty)context).eContainer();
            _switchResult = this.createNodePropertyScope(_eContainer);
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
  
  private IScope createNodePropertyScope(final EObject container) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (container instanceof SourceModelNodeSelector) {
        _matched=true;
        Metamodel _reference = ((SourceModelNodeSelector)container).getReference();
        EObject _eContainer = _reference.eContainer();
        ModelNodeType _type = ((MetamodelSequence) _eContainer).getType();
        EClass _resolveType = this.resolveType(_type);
        EList<EReference> _eAllReferences = _resolveType.getEAllReferences();
        _switchResult = Scopes.scopeFor(_eAllReferences);
      }
    }
    if (!_matched) {
      if (container instanceof ModelNodeType) {
        _matched=true;
        EClass _type = ((ModelNodeType)container).getType();
        EList<EReference> _eAllReferences = _type.getEAllReferences();
        _switchResult = Scopes.scopeFor(_eAllReferences);
      }
    }
    if (!_matched) {
      if (container instanceof NodeProperty) {
        _matched=true;
        EReference _property = ((NodeProperty)container).getProperty();
        EClass _eReferenceType = _property.getEReferenceType();
        EList<EReference> _eAllReferences = _eReferenceType.getEAllReferences();
        _switchResult = Scopes.scopeFor(_eAllReferences);
      }
    }
    return _switchResult;
  }
  
  private EClass resolveType(final ModelNodeType type) {
    NodeProperty _property = type.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      return type.getType();
    } else {
      NodeProperty _property_1 = type.getProperty();
      return this.resolveType(_property_1);
    }
  }
  
  private EClass resolveType(final NodeProperty property) {
    NodeProperty _subProperty = property.getSubProperty();
    boolean _equals = Objects.equal(_subProperty, null);
    if (_equals) {
      EReference _property = property.getProperty();
      return _property.getEReferenceType();
    } else {
      NodeProperty _subProperty_1 = property.getSubProperty();
      return this.resolveType(_subProperty_1);
    }
  }
  
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
}
