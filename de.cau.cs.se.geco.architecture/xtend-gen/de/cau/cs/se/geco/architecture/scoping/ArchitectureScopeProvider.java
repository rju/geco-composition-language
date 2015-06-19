package de.cau.cs.se.geco.architecture.scoping;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.GeneratorImport;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation;
import de.cau.cs.se.geco.architecture.architecture.NodeType;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.architecture.WeaverImport;
import de.cau.cs.se.geco.architecture.scoping.EPackageContentScope;
import de.cau.cs.se.geco.architecture.scoping.EPackageScope;
import de.cau.cs.se.geco.architecture.scoping.JvmScope;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ArchitectureScopeProvider implements IDelegatingScopeProvider {
  @Inject
  @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
  private IScopeProvider delegate;
  
  public IScope getScope(final EObject context, final EReference reference) {
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
      if (context instanceof Weaver) {
        String _name = reference.getName();
        boolean _equals = _name.equals("weaver");
        if (_equals) {
          _matched=true;
          Resource _eResource = ((Weaver)context).eResource();
          _switchResult = new JvmScope(_eResource, WeaverImport.class);
        }
      }
    }
    if (!_matched) {
      if (context instanceof Generator) {
        String _name = reference.getName();
        boolean _equals = _name.equals("generator");
        if (_equals) {
          _matched=true;
          Resource _eResource = ((Generator)context).eResource();
          _switchResult = new JvmScope(_eResource, GeneratorImport.class);
        }
      }
    }
    if (!_matched) {
      if (context instanceof NodeType) {
        String _name = reference.getName();
        boolean _equals = _name.equals("eclass");
        if (_equals) {
          _matched=true;
          EObject _eContainer = ((NodeType)context).eContainer();
          _switchResult = this.createNodeTypeScope(((NodeSetRelation) _eContainer), ((NodeType)context));
        }
      }
    }
    if (!_matched) {
      IScope _xblockexpression = null;
      {
        System.out.println((((">> " + context) + " ") + reference));
        _xblockexpression = this.delegate.getScope(context, reference);
      }
      _switchResult = _xblockexpression;
    }
    return _switchResult;
  }
  
  private IScope createNodeTypeScope(final NodeSetRelation relation, final NodeType nodeType) {
    EList<NodeType> _sourceNodes = relation.getSourceNodes();
    final Function1<NodeType, Boolean> _function = new Function1<NodeType, Boolean>() {
      public Boolean apply(final NodeType it) {
        return Boolean.valueOf(it.equals(nodeType));
      }
    };
    boolean _exists = IterableExtensions.<NodeType>exists(_sourceNodes, _function);
    if (_exists) {
      EObject _eContainer = relation.eContainer();
      EObject _eContainer_1 = ((TraceModel) _eContainer).eContainer();
      SourceModelNodeSelector _sourceModel = ((Generator) _eContainer_1).getSourceModel();
      Metamodel _reference = _sourceModel.getReference();
      final EClass modelRootType = ArchitectureTyping.resolveType(_reference);
      Resource _eResource = modelRootType.eResource();
      return new EPackageContentScope(_eResource);
    } else {
      return IScope.NULLSCOPE;
    }
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
        EClass _resolveType = ArchitectureTyping.resolveType(_type);
        EList<EReference> _eAllReferences = null;
        if (_resolveType!=null) {
          _eAllReferences=_resolveType.getEAllReferences();
        }
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
  
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
}
