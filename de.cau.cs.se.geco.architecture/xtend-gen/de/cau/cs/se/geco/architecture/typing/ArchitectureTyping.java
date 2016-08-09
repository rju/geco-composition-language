package de.cau.cs.se.geco.architecture.typing;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.se.geco.architecture.architecture.BasicConstraint;
import de.cau.cs.se.geco.architecture.architecture.CompareExpression;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.architecture.InstanceOf;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelSequence;
import de.cau.cs.se.geco.architecture.architecture.ModelType;
import de.cau.cs.se.geco.architecture.architecture.Negation;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint;
import de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass;
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModel;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ArchitectureTyping {
  protected static JvmTypeReference _resolveType(final SourceModelSelector selector) {
    NodeProperty _property = selector.getProperty();
    boolean _notEquals = (!Objects.equal(_property, null));
    if (_notEquals) {
      NodeProperty _property_1 = selector.getProperty();
      return ArchitectureTyping.resolveType(_property_1);
    } else {
      Model _reference = selector.getReference();
      JvmTypeReference _resolveType = null;
      if (_reference!=null) {
        _resolveType=ArchitectureTyping.resolveType(_reference);
      }
      final JvmTypeReference genericTypeReference = _resolveType;
      ConstraintExpression _constraint = selector.getConstraint();
      boolean _notEquals_1 = (!Objects.equal(_constraint, null));
      if (_notEquals_1) {
        ConstraintExpression _constraint_1 = selector.getConstraint();
        if ((_constraint_1 instanceof InstanceOf)) {
          boolean _isListType = ArchitectureTyping.isListType(genericTypeReference);
          if (_isListType) {
            final JvmParameterizedTypeReference paramTypeReference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
            JvmType _type = genericTypeReference.getType();
            paramTypeReference.setType(_type);
            EList<JvmTypeReference> _arguments = paramTypeReference.getArguments();
            ConstraintExpression _constraint_2 = selector.getConstraint();
            JvmTypeReference _resolveType_1 = ArchitectureTyping.resolveType(((InstanceOf) _constraint_2));
            _arguments.add(_resolveType_1);
            return paramTypeReference;
          } else {
            ConstraintExpression _constraint_3 = selector.getConstraint();
            return ArchitectureTyping.resolveType(((InstanceOf) _constraint_3));
          }
        } else {
          return genericTypeReference;
        }
      } else {
        return genericTypeReference;
      }
    }
  }
  
  protected static JvmTypeReference _resolveType(final Model model) {
    EObject _eContainer = model.eContainer();
    ModelType _type = ((ModelSequence) _eContainer).getType();
    return ArchitectureTyping.resolveType(_type);
  }
  
  protected static JvmTypeReference _resolveType(final ModelType type) {
    JvmTypeReference _xifexpression = null;
    NodeProperty _property = type.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      RegisteredRootClass _target = type.getTarget();
      JvmType _importedNamespace = _target.getImportedNamespace();
      _xifexpression = ArchitectureTyping.resolveType(_importedNamespace);
    } else {
      NodeProperty _property_1 = type.getProperty();
      _xifexpression = ArchitectureTyping.resolveType(_property_1);
    }
    final JvmTypeReference result = _xifexpression;
    boolean _isCollection = type.isCollection();
    if (_isCollection) {
      final JvmParameterizedTypeReference list = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
      final JvmGenericType listType = TypesFactory.eINSTANCE.createJvmGenericType();
      listType.setPackageName("java.lang");
      listType.setSimpleName("Collection");
      list.setType(listType);
      EList<JvmTypeReference> _arguments = list.getArguments();
      _arguments.add(result);
      return list;
    } else {
      return result;
    }
  }
  
  protected static JvmTypeReference _resolveType(final JvmType type) {
    final JvmAnyTypeReference reference = TypesFactory.eINSTANCE.createJvmAnyTypeReference();
    reference.setType(type);
    return reference;
  }
  
  protected static JvmTypeReference _resolveType(final NodeProperty property) {
    JvmTypeReference _xifexpression = null;
    NodeProperty _subProperty = property.getSubProperty();
    boolean _equals = Objects.equal(_subProperty, null);
    if (_equals) {
      JvmMember _property = property.getProperty();
      _xifexpression = ArchitectureTyping.resolveType(_property);
    } else {
      NodeProperty _subProperty_1 = property.getSubProperty();
      _xifexpression = ArchitectureTyping.resolveType(_subProperty_1);
    }
    return _xifexpression;
  }
  
  protected static JvmTypeReference _resolveType(final TargetModel model) {
    Model _reference = model.getReference();
    JvmTypeReference _resolveType = null;
    if (_reference!=null) {
      _resolveType=ArchitectureTyping.resolveType(_reference);
    }
    return _resolveType;
  }
  
  protected static JvmTypeReference _resolveType(final JvmOperation operation) {
    return operation.getReturnType();
  }
  
  /**
   * Evaluate type of an ConstraintExpression.
   */
  protected static JvmTypeReference _resolveType(final ConstraintExpression expression) {
    CompareExpression _left = expression.getLeft();
    final JvmTypeReference result = ArchitectureTyping.resolveType(_left);
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      ConstraintExpression _right = expression.getRight();
      boolean _notEquals = (!Objects.equal(_right, null));
      if (_notEquals) {
        ConstraintExpression _right_1 = expression.getRight();
        return ArchitectureTyping.resolveType(_right_1);
      } else {
        return null;
      }
    } else {
      return result;
    }
  }
  
  /**
   * Evaluate type of an ParenthesisConstraint.
   */
  protected static JvmTypeReference _resolveType(final ParenthesisConstraint expression) {
    ConstraintExpression _constraint = expression.getConstraint();
    return ArchitectureTyping.resolveType(_constraint);
  }
  
  /**
   * Evaluate type of an Typeof.
   */
  protected static JvmTypeReference _resolveType(final InstanceOf expression) {
    JvmType _type = expression.getType();
    return ArchitectureTyping.resolveType(_type);
  }
  
  /**
   * Evaluate type of an Negation.
   */
  protected static JvmTypeReference _resolveType(final Negation expression) {
    ConstraintExpression _constraint = expression.getConstraint();
    return ArchitectureTyping.resolveType(_constraint);
  }
  
  /**
   * Evaluate type of an BasicConstraint.
   */
  protected static JvmTypeReference _resolveType(final BasicConstraint expression) {
    throw new UnsupportedOperationException("BasicConstraint cannot be handled in resolveType");
  }
  
  protected static JvmTypeReference _resolveType(final EObject operation) {
    Class<? extends EObject> _class = operation.getClass();
    String _name = _class.getName();
    String _plus = ("resolve type reference for " + _name);
    String _plus_1 = (_plus + " not supported");
    throw new UnsupportedOperationException(_plus_1);
  }
  
  public static boolean isSubTypeOf(final JvmTypeReference type, final JvmTypeReference matchingType) {
    if (((type.getType() instanceof JvmGenericType) && (matchingType.getType() instanceof JvmGenericType))) {
      boolean _eIsProxy = type.eIsProxy();
      if (_eIsProxy) {
        JvmType _type = type.getType();
        _type.hashCode();
      }
      JvmType _type_1 = type.getType();
      final JvmGenericType left = ((JvmGenericType) _type_1);
      JvmType _type_2 = matchingType.getType();
      final JvmGenericType right = ((JvmGenericType) _type_2);
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(left, right);
      if (_isSubTypeOf) {
        if (((type instanceof JvmParameterizedTypeReference) && (matchingType instanceof JvmParameterizedTypeReference))) {
          final EList<JvmTypeReference> leftArg = ((JvmParameterizedTypeReference) type).getArguments();
          final EList<JvmTypeReference> rightArg = ((JvmParameterizedTypeReference) matchingType).getArguments();
          int _size = leftArg.size();
          int _size_1 = rightArg.size();
          boolean _equals = (_size == _size_1);
          if (_equals) {
            boolean result = true;
            for (int i = 0; (i < leftArg.size()); i++) {
              JvmTypeReference _get = leftArg.get(i);
              JvmTypeReference _get_1 = rightArg.get(i);
              boolean _isSubTypeOf_1 = ArchitectureTyping.isSubTypeOf(_get, _get_1);
              boolean _not = (!_isSubTypeOf_1);
              if (_not) {
                result = false;
              }
            }
            return result;
          }
        } else {
          return true;
        }
      }
      return false;
    } else {
      return false;
    }
  }
  
  /**
   * Check if a type is equal to or a subtype of matchingType.
   */
  public static boolean isSubTypeOf(final JvmGenericType type, final JvmType matchingType) {
    boolean _xifexpression = false;
    boolean _equals = type.equals(matchingType);
    if (_equals) {
      return true;
    } else {
      EList<JvmTypeReference> _superTypes = type.getSuperTypes();
      final Function1<JvmTypeReference, Boolean> _function = (JvmTypeReference it) -> {
        boolean _xblockexpression = false;
        {
          final JvmType superType = it.getType();
          boolean _switchResult = false;
          boolean _matched = false;
          if (superType instanceof JvmGenericType) {
            _matched=true;
            _switchResult = ArchitectureTyping.isSubTypeOf(((JvmGenericType)superType), matchingType);
          }
          if (!_matched) {
            if (superType instanceof JvmVoid) {
              _matched=true;
              _switchResult = false;
            }
          }
          if (!_matched) {
            _switchResult = false;
          }
          _xblockexpression = _switchResult;
        }
        return Boolean.valueOf(_xblockexpression);
      };
      _xifexpression = IterableExtensions.<JvmTypeReference>exists(_superTypes, _function);
    }
    return _xifexpression;
  }
  
  /**
   * find out if the given type is a list or collection type.
   * Note: This is an ugly implementation based on name matches.
   */
  public static boolean isListType(final JvmTypeReference type) {
    boolean _xblockexpression = false;
    {
      JvmType _type = type.getType();
      final String name = _type.getQualifiedName();
      boolean _switchResult = false;
      boolean _matched = false;
      if (Objects.equal(name, null)) {
        _matched=true;
        boolean _xblockexpression_1 = false;
        {
          JvmType _type_1 = type.getType();
          String _plus = ((("AnnotationType? " + type) + " -- ") + _type_1);
          System.out.println(_plus);
          _xblockexpression_1 = false;
        }
        _switchResult = _xblockexpression_1;
      }
      if (!_matched) {
        if (Objects.equal(name, "java.util.Collection")) {
          _matched=true;
        }
        if (!_matched) {
          if (Objects.equal(name, "java.util.List")) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (Objects.equal(name, "java.util.ArrayList")) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (Objects.equal(name, "java.lang.Collection")) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (Objects.equal(name, "org.eclipse.emf.common.util.EList")) {
            _matched=true;
          }
        }
        if (_matched) {
          _switchResult = true;
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  /**
   * Determine the base type of a reference. For any type this is the type
   * where the reference points to. Except for list types where the first type
   * argument defines the element type.
   */
  public static JvmType determineElementType(final JvmTypeReference reference) {
    JvmType _switchResult = null;
    boolean _matched = false;
    if (reference instanceof JvmParameterizedTypeReference) {
      _matched=true;
      JvmType _xifexpression = null;
      EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference)reference).getArguments();
      int _size = _arguments.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        EList<JvmTypeReference> _arguments_1 = ((JvmParameterizedTypeReference)reference).getArguments();
        JvmTypeReference _get = _arguments_1.get(0);
        _xifexpression = _get.getType();
      } else {
        JvmType _xifexpression_1 = null;
        EList<JvmTypeReference> _arguments_2 = ((JvmParameterizedTypeReference)reference).getArguments();
        int _size_1 = _arguments_2.size();
        boolean _equals_1 = (_size_1 == 2);
        if (_equals_1) {
          EList<JvmTypeReference> _arguments_3 = ((JvmParameterizedTypeReference)reference).getArguments();
          JvmTypeReference _get_1 = _arguments_3.get(1);
          _xifexpression_1 = _get_1.getType();
        }
        _xifexpression = _xifexpression_1;
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      _switchResult = reference.getType();
    }
    return _switchResult;
  }
  
  /**
   * Determine the output type reference of a generator.
   */
  public static JvmTypeReference determineGeneratorOutputType(final JvmGenericType type) {
    EList<JvmMember> _members = type.getMembers();
    Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Function1<JvmOperation, Boolean> _function = (JvmOperation member) -> {
      String _simpleName = member.getSimpleName();
      return Boolean.valueOf(_simpleName.equals("generate"));
    };
    final JvmOperation member = IterableExtensions.<JvmOperation>findFirst(_filter, _function);
    return member.getReturnType();
  }
  
  /**
   * Determine the input type reference of a generator.
   */
  public static JvmTypeReference determineGeneratorInputType(final JvmGenericType type) {
    EList<JvmMember> _members = type.getMembers();
    Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Function1<JvmOperation, Boolean> _function = (JvmOperation member) -> {
      String _simpleName = member.getSimpleName();
      return Boolean.valueOf(_simpleName.equals("generate"));
    };
    final JvmOperation member = IterableExtensions.<JvmOperation>findFirst(_filter, _function);
    EList<JvmFormalParameter> _parameters = member.getParameters();
    int _size = _parameters.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<JvmFormalParameter> _parameters_1 = member.getParameters();
      JvmFormalParameter _get = _parameters_1.get(0);
      return _get.getParameterType();
    } else {
      return null;
    }
  }
  
  /**
   * Determine the input type reference of a generator.
   */
  public static Map<String, JvmTypeReference> determineGeneratorAuxTypes(final JvmGenericType type) {
    final HashMap<String, JvmTypeReference> result = new HashMap<String, JvmTypeReference>();
    EList<JvmMember> _members = type.getMembers();
    Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Consumer<JvmOperation> _function = (JvmOperation member) -> {
      String _simpleName = member.getSimpleName();
      boolean _startsWith = _simpleName.startsWith("set");
      if (_startsWith) {
        EList<JvmFormalParameter> _parameters = member.getParameters();
        int _size = _parameters.size();
        boolean _equals = (_size == 1);
        if (_equals) {
          String _simpleName_1 = member.getSimpleName();
          String _substring = _simpleName_1.substring(3);
          String _firstLower = StringExtensions.toFirstLower(_substring);
          EList<JvmFormalParameter> _parameters_1 = member.getParameters();
          JvmFormalParameter _get = _parameters_1.get(0);
          JvmTypeReference _parameterType = _get.getParameterType();
          result.put(_firstLower, _parameterType);
        }
      }
    };
    _filter.forEach(_function);
    return result;
  }
  
  /**
   * Check if the given model declaration is a simple or collection type.
   */
  public static boolean isCollectionType(final ModelDeclaration declaration) {
    return (ArchitectureTyping.isListType(ArchitectureTyping.resolveType(declaration.getSelector())) || 
      ((ModelSequence) declaration.getModel().eContainer()).getType().isCollection());
  }
  
  public static boolean isCollectionType(final Model model) {
    EObject _eContainer = model.eContainer();
    final ModelType nodeType = ((ModelSequence) _eContainer).getType();
    return (ArchitectureTyping.isListType(ArchitectureTyping.resolveType(nodeType)) || nodeType.isCollection());
  }
  
  /**
   * Resolve the source model reference of the weaver instance.
   */
  public static SourceModelSelector resolveWeaverSourceModel(final Weaver weaver) {
    SourceModelSelector _xifexpression = null;
    SourceModelSelector _sourceModel = weaver.getSourceModel();
    boolean _notEquals = (!Objects.equal(_sourceModel, null));
    if (_notEquals) {
      _xifexpression = weaver.getSourceModel();
    } else {
      Weaver _predecessingWeaver = ArchitectureTyping.predecessingWeaver(weaver);
      SourceModelSelector _resolveWeaverSourceModel = null;
      if (_predecessingWeaver!=null) {
        _resolveWeaverSourceModel=ArchitectureTyping.resolveWeaverSourceModel(_predecessingWeaver);
      }
      _xifexpression = _resolveWeaverSourceModel;
    }
    return _xifexpression;
  }
  
  /**
   * Returns the predecessing weaver of the given weaver or null on error.
   */
  public static Weaver predecessingWeaver(final Weaver weaver) {
    EObject _eContainer = weaver.eContainer();
    final EList<Fragment> connections = ((GecoModel) _eContainer).getFragments();
    final int index = connections.lastIndexOf(weaver);
    if ((index > 0)) {
      int i = 1;
      while ((((index - i) >= 0) && (!(connections.get((index - i)) instanceof Weaver)))) {
        i++;
      }
      if ((i <= index)) {
        Fragment _get = connections.get((index - i));
        return ((Weaver) _get);
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
  
  public static JvmTypeReference resolveType(final EObject operation) {
    if (operation instanceof JvmOperation) {
      return _resolveType((JvmOperation)operation);
    } else if (operation instanceof InstanceOf) {
      return _resolveType((InstanceOf)operation);
    } else if (operation instanceof NodeProperty) {
      return _resolveType((NodeProperty)operation);
    } else if (operation instanceof Negation) {
      return _resolveType((Negation)operation);
    } else if (operation instanceof ParenthesisConstraint) {
      return _resolveType((ParenthesisConstraint)operation);
    } else if (operation instanceof BasicConstraint) {
      return _resolveType((BasicConstraint)operation);
    } else if (operation instanceof TargetModel) {
      return _resolveType((TargetModel)operation);
    } else if (operation instanceof JvmType) {
      return _resolveType((JvmType)operation);
    } else if (operation instanceof ConstraintExpression) {
      return _resolveType((ConstraintExpression)operation);
    } else if (operation instanceof Model) {
      return _resolveType((Model)operation);
    } else if (operation instanceof ModelType) {
      return _resolveType((ModelType)operation);
    } else if (operation instanceof SourceModelSelector) {
      return _resolveType((SourceModelSelector)operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation).toString());
    }
  }
}
