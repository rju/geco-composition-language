/**
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation;
import de.cau.cs.se.geco.architecture.architecture.NodeType;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;
import de.cau.cs.se.geco.architecture.architecture.Typeof;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.framework.IWeaver;
import de.cau.cs.se.geco.architecture.scoping.JvmImportTypeScope;
import de.cau.cs.se.geco.architecture.scoping.JvmMemberTypeScope;
import de.cau.cs.se.geco.architecture.scoping.JvmRegisterMetamodelImportScope;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ArchitectureScopeProvider extends AbstractScopeProvider implements IDelegatingScopeProvider {
  @Inject
  private IJvmTypeProvider.Factory typeProviderFactory;
  
  @Inject
  @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
  private IScopeProvider delegate;
  
  private final String WEAVER_INTERFACE = IWeaver.class.getName();
  
  private final String GENERATOR_INTERFACE = IGenerator.class.getName();
  
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (context instanceof NodeProperty) {
        String _name = reference.getName();
        boolean _equals = _name.equals("property");
        if (_equals) {
          _matched=true;
          EObject _eContainer = ((NodeProperty)context).eContainer();
          _switchResult = this.createPropertyScope(_eContainer, reference);
        }
      }
    }
    if (!_matched) {
      if (context instanceof Generator) {
        String _name = reference.getName();
        boolean _equals = _name.equals("reference");
        if (_equals) {
          _matched=true;
          _switchResult = this.createGeneratorReferenceScope(((Generator)context), reference);
        }
      }
    }
    if (!_matched) {
      if (context instanceof Weaver) {
        String _name = reference.getName();
        boolean _equals = _name.equals("reference");
        if (_equals) {
          _matched=true;
          _switchResult = this.createWeaverReferenceScope(((Weaver)context), reference);
        }
      }
    }
    if (!_matched) {
      if (context instanceof NodeType) {
        _matched=true;
        _switchResult = this.createNodeTypeScope(((NodeType)context), reference);
      }
    }
    if (!_matched) {
      if (context instanceof Typeof) {
        _matched=true;
        _switchResult = this.createTypeofScope(((Typeof)context), reference);
      }
    }
    if (!_matched) {
      if (context instanceof Generator) {
        String _name = reference.getName();
        boolean _equals = _name.equals("readTraceModels");
        if (_equals) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof TraceModelReference) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof Import) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof ModelNodeType) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof RegisteredPackage) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof SourceModelNodeSelector) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof TargetModelNodeType) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = this.delegate.getScope(context, reference);
      }
    }
    if (!_matched) {
      {
        System.out.println((((">> " + context) + " ") + reference));
        Class<? extends EObject> _class = context.getClass();
        String _plus = ("No scope available for " + _class);
        throw new UnsupportedOperationException(_plus);
      }
    }
    return _switchResult;
  }
  
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
  
  /**
   * Create scope for property.
   */
  private IScope createPropertyScope(final EObject container, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (container instanceof ModelNodeType) {
        _matched=true;
        RegisteredPackage _target = ((ModelNodeType)container).getTarget();
        JvmType _importedNamespace = _target.getImportedNamespace();
        _switchResult = this.createJvmDeclaredTypeScope(_importedNamespace, reference);
      }
    }
    if (!_matched) {
      if (container instanceof NodeProperty) {
        _matched=true;
        JvmMember _property = ((NodeProperty)container).getProperty();
        JvmTypeReference _returnType = ((JvmOperation) _property).getReturnType();
        JvmType _type = _returnType.getType();
        _switchResult = this.createJvmDeclaredTypeScope(_type, reference);
      }
    }
    if (!_matched) {
      if (container instanceof SourceModelNodeSelector) {
        _matched=true;
        JvmType _resolveType = ArchitectureTyping.resolveType(((SourceModelNodeSelector)container));
        _switchResult = this.createJvmDeclaredTypeScope(_resolveType, reference);
      }
    }
    if (!_matched) {
      _switchResult = IScope.NULLSCOPE;
    }
    return _switchResult;
  }
  
  /**
   * Create scope of JvmDeclareType for its member (getters for features).
   */
  private IScope createJvmDeclaredTypeScope(final JvmType type, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof JvmDeclaredType) {
        _matched=true;
        _switchResult = new JvmMemberTypeScope(((JvmDeclaredType)type));
      }
    }
    if (!_matched) {
      _switchResult = IScope.NULLSCOPE;
    }
    return _switchResult;
  }
  
  /**
   * Scope for generators.
   */
  private IScope createGeneratorReferenceScope(final Generator context, final EReference reference) {
    Model _modelRoot = this.getModelRoot(context);
    EList<Import> _imports = _modelRoot.getImports();
    final Function1<Import, Boolean> _function = new Function1<Import, Boolean>() {
      public Boolean apply(final Import it) {
        JvmType _importedNamespace = it.getImportedNamespace();
        return ArchitectureScopeProvider.this.implementsInterface(_importedNamespace, context, ArchitectureScopeProvider.this.GENERATOR_INTERFACE);
      }
    };
    Iterable<Import> _filter = IterableExtensions.<Import>filter(_imports, _function);
    return new JvmImportTypeScope(_filter);
  }
  
  /**
   * Scope for weavers.
   */
  private IScope createWeaverReferenceScope(final Weaver context, final EReference reference) {
    Model _modelRoot = this.getModelRoot(context);
    EList<Import> _imports = _modelRoot.getImports();
    final Function1<Import, Boolean> _function = new Function1<Import, Boolean>() {
      public Boolean apply(final Import it) {
        JvmType _importedNamespace = it.getImportedNamespace();
        return ArchitectureScopeProvider.this.implementsInterface(_importedNamespace, context, ArchitectureScopeProvider.this.WEAVER_INTERFACE);
      }
    };
    Iterable<Import> _filter = IterableExtensions.<Import>filter(_imports, _function);
    return new JvmImportTypeScope(_filter);
  }
  
  /**
   * Scope for the trace model scope.
   */
  private IScope createNodeTypeScope(final NodeType nodeType, final EReference reference) {
    IScope _xblockexpression = null;
    {
      final Generator generator = this.getGeneratorContextNode(nodeType);
      IScope _xifexpression = null;
      EObject _eContainer = nodeType.eContainer();
      EList<NodeType> _sourceNodes = ((NodeSetRelation) _eContainer).getSourceNodes();
      final Function1<NodeType, Boolean> _function = new Function1<NodeType, Boolean>() {
        public Boolean apply(final NodeType it) {
          return Boolean.valueOf(it.equals(nodeType));
        }
      };
      boolean _exists = IterableExtensions.<NodeType>exists(_sourceNodes, _function);
      if (_exists) {
        SourceModelNodeSelector _sourceModel = generator.getSourceModel();
        Metamodel _reference = _sourceModel.getReference();
        boolean _notEquals = (!Objects.equal(_reference, null));
        if (_notEquals) {
          SourceModelNodeSelector _sourceModel_1 = generator.getSourceModel();
          Metamodel _reference_1 = _sourceModel_1.getReference();
          JvmType _resolveType = ArchitectureTyping.resolveType(_reference_1);
          Model _modelRoot = this.getModelRoot(nodeType);
          Resource _eResource = _modelRoot.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          return new JvmRegisterMetamodelImportScope(_resolveType, _resourceSet, this.typeProviderFactory);
        } else {
          return IScope.NULLSCOPE;
        }
      } else {
        IScope _xifexpression_1 = null;
        TargetModelNodeType _targetModel = generator.getTargetModel();
        Metamodel _reference_2 = _targetModel.getReference();
        boolean _equals = Objects.equal(_reference_2, null);
        if (_equals) {
          IScope _xifexpression_2 = null;
          EObject _eContainer_1 = generator.eContainer();
          if ((_eContainer_1 instanceof Weaver)) {
            EObject _eContainer_2 = generator.eContainer();
            final Metamodel sourceModel = ArchitectureTyping.resolveWeaverSourceModel(((Weaver) _eContainer_2));
            boolean _notEquals_1 = (!Objects.equal(sourceModel, null));
            if (_notEquals_1) {
              JvmType _resolveType_1 = ArchitectureTyping.resolveType(sourceModel);
              Model _modelRoot_1 = this.getModelRoot(nodeType);
              Resource _eResource_1 = _modelRoot_1.eResource();
              ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
              return new JvmRegisterMetamodelImportScope(_resolveType_1, _resourceSet_1, this.typeProviderFactory);
            } else {
              return IScope.NULLSCOPE;
            }
          } else {
            _xifexpression_2 = IScope.NULLSCOPE;
          }
          _xifexpression_1 = _xifexpression_2;
        } else {
          TargetModelNodeType _targetModel_1 = generator.getTargetModel();
          Metamodel _reference_3 = _targetModel_1.getReference();
          JvmType _resolveType_2 = ArchitectureTyping.resolveType(_reference_3);
          Model _modelRoot_2 = this.getModelRoot(nodeType);
          Resource _eResource_2 = _modelRoot_2.eResource();
          ResourceSet _resourceSet_2 = _eResource_2.getResourceSet();
          return new JvmRegisterMetamodelImportScope(_resolveType_2, _resourceSet_2, this.typeProviderFactory);
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Scope for the type of call.
   */
  private IScope createTypeofScope(final Typeof type, final EReference reference) {
    IScope _xblockexpression = null;
    {
      final JvmType context = this.getMetaModelContextNode(type);
      IScope _xifexpression = null;
      boolean _notEquals = (!Objects.equal(context, null));
      if (_notEquals) {
        Model _modelRoot = this.getModelRoot(type);
        Resource _eResource = _modelRoot.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        return new JvmRegisterMetamodelImportScope(context, _resourceSet, 
          this.typeProviderFactory);
      } else {
        _xifexpression = IScope.NULLSCOPE;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private Model getModelRoot(final EObject object) {
    try {
      Model _xblockexpression = null;
      {
        final EObject container = object.eContainer();
        Model _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (container instanceof Model) {
            _matched=true;
            return ((Model)container);
          }
        }
        if (!_matched) {
          if (Objects.equal(container, null)) {
            _matched=true;
            throw new Exception("Corrupted model: No Model node.");
          }
        }
        if (!_matched) {
          _switchResult = this.getModelRoot(container);
        }
        _xblockexpression = _switchResult;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private JvmType getMetaModelContextNode(final EObject type) {
    try {
      JvmType _xblockexpression = null;
      {
        final EObject container = type.eContainer();
        JvmType _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (container instanceof NodeProperty) {
            _matched=true;
            JvmMember _property = ((NodeProperty)container).getProperty();
            return ArchitectureTyping.resolveType(_property);
          }
        }
        if (!_matched) {
          if (container instanceof SourceModelNodeSelector) {
            _matched=true;
            Metamodel _reference = ((SourceModelNodeSelector)container).getReference();
            return ArchitectureTyping.resolveType(_reference);
          }
        }
        if (!_matched) {
          if (Objects.equal(container, null)) {
            _matched=true;
            throw new Exception("Corrupted model: Cannot find NodeProperty or SourceModelNodeSelector context.");
          }
        }
        if (!_matched) {
          EObject _eContainer = type.eContainer();
          _switchResult = this.getMetaModelContextNode(_eContainer);
        }
        _xblockexpression = _switchResult;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Generator getGeneratorContextNode(final EObject type) {
    try {
      Generator _xblockexpression = null;
      {
        final EObject container = type.eContainer();
        Generator _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (container instanceof Generator) {
            _matched=true;
            return ((Generator)container);
          }
        }
        if (!_matched) {
          if (Objects.equal(container, null)) {
            _matched=true;
            throw new Exception("Corrupted model: Cannot find Generator context.");
          }
        }
        if (!_matched) {
          EObject _eContainer = type.eContainer();
          _switchResult = this.getGeneratorContextNode(_eContainer);
        }
        _xblockexpression = _switchResult;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Check if the given JvmType implements the interface specified by typeName.
   */
  private Boolean implementsInterface(final JvmType type, final EObject object, final String typeName) {
    Boolean _xblockexpression = null;
    {
      Resource _eResource = object.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      IJvmTypeProvider _createTypeProvider = this.typeProviderFactory.createTypeProvider(_resourceSet);
      final JvmType matchingType = _createTypeProvider.findTypeByName(typeName);
      Boolean _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (type instanceof JvmGenericType) {
          _matched=true;
          _switchResult = this.isSubtypeOf(((JvmGenericType)type), matchingType);
        }
      }
      if (!_matched) {
        _switchResult = Boolean.valueOf(false);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public Boolean isSubtypeOf(final JvmGenericType type, final JvmType matchingType) {
    boolean _xifexpression = false;
    EList<JvmTypeReference> _superTypes = type.getSuperTypes();
    final Function1<JvmTypeReference, Boolean> _function = new Function1<JvmTypeReference, Boolean>() {
      public Boolean apply(final JvmTypeReference it) {
        JvmType _type = it.getType();
        return Boolean.valueOf(_type.equals(matchingType));
      }
    };
    boolean _exists = IterableExtensions.<JvmTypeReference>exists(_superTypes, _function);
    if (_exists) {
      return Boolean.valueOf(true);
    } else {
      EList<JvmTypeReference> _superTypes_1 = type.getSuperTypes();
      final Function1<JvmTypeReference, Boolean> _function_1 = new Function1<JvmTypeReference, Boolean>() {
        public Boolean apply(final JvmTypeReference it) {
          JvmType _type = it.getType();
          return ArchitectureScopeProvider.this.isSubtypeOf(((JvmGenericType) _type), matchingType);
        }
      };
      _xifexpression = IterableExtensions.<JvmTypeReference>exists(_superTypes_1, _function_1);
    }
    return Boolean.valueOf(_xifexpression);
  }
}