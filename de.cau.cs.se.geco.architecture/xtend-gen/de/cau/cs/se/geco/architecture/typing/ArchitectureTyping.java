package de.cau.cs.se.geco.architecture.typing;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
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
  protected static JvmTypeReference _resolveType(final /* SourceModelSelector */Object selector) {
    throw new Error("Unresolved compilation problems:"
      + "\nInstanceOf cannot be resolved to a type."
      + "\nInstanceOf cannot be resolved to a type."
      + "\nInstanceOf cannot be resolved to a type."
      + "\nproperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\nisListType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  protected static JvmTypeReference _resolveType(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nModelSequence cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  protected static JvmTypeReference _resolveType(final /* ModelType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nproperty cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nimportedNamespace cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ncollection cannot be resolved");
  }
  
  protected static JvmTypeReference _resolveType(final JvmType type) {
    final JvmAnyTypeReference reference = TypesFactory.eINSTANCE.createJvmAnyTypeReference();
    reference.setType(type);
    return reference;
  }
  
  protected static JvmTypeReference _resolveType(final /* NodeProperty */Object property) {
    throw new Error("Unresolved compilation problems:"
      + "\nsubProperty cannot be resolved"
      + "\n== cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nsubProperty cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  protected static JvmTypeReference _resolveType(final /* TargetModel */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  protected static JvmTypeReference _resolveType(final JvmOperation operation) {
    return operation.getReturnType();
  }
  
  /**
   * Evaluate type of an ConstraintExpression.
   */
  protected static JvmTypeReference _resolveType(final /* ConstraintExpression */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nleft cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\n== cannot be resolved"
      + "\nright cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nright cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  /**
   * Evaluate type of an ParenthesisConstraint.
   */
  protected static JvmTypeReference _resolveType(final /* ParenthesisConstraint */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nconstraint cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  /**
   * Evaluate type of an Typeof.
   */
  protected static JvmTypeReference _resolveType(final /* InstanceOf */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  /**
   * Evaluate type of an Negation.
   */
  protected static JvmTypeReference _resolveType(final /* Negation */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nconstraint cannot be resolved"
      + "\nresolveType cannot be resolved");
  }
  
  /**
   * Evaluate type of an BasicConstraint.
   */
  protected static JvmTypeReference _resolveType(final /* BasicConstraint */Object expression) {
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
    throw new Error("Unresolved compilation problems:"
      + "\nModelSequence cannot be resolved to a type."
      + "\nThe method or field selector is undefined for the type ModelDeclaration"
      + "\nThe method or field model is undefined for the type ModelDeclaration"
      + "\nresolveType cannot be resolved"
      + "\nisListType cannot be resolved"
      + "\n|| cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncollection cannot be resolved");
  }
  
  public static boolean isCollectionType(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nModelSequence cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nisListType cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ncollection cannot be resolved");
  }
  
  /**
   * Resolve the source model reference of the weaver instance.
   */
  public static /* SourceModelSelector */Object resolveWeaverSourceModel(final /* Weaver */Object weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nsourceModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\npredecessingWeaver cannot be resolved"
      + "\nresolveWeaverSourceModel cannot be resolved");
  }
  
  /**
   * Returns the predecessing weaver of the given weaver or null on error.
   */
  public static /* Weaver */Object predecessingWeaver(final /* Weaver */Object weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nGecoModel cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nfragments cannot be resolved"
      + "\nlastIndexOf cannot be resolved"
      + "\n> cannot be resolved"
      + "\n- cannot be resolved"
      + "\n>= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nget cannot be resolved"
      + "\n- cannot be resolved"
      + "\nget cannot be resolved"
      + "\n- cannot be resolved");
  }
  
  public static JvmTypeReference resolveType(final EObject operation) {
    if (operation instanceof JvmOperation) {
      return _resolveType((JvmOperation)operation);
    } else if (operation instanceof JvmType) {
      return _resolveType((JvmType)operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else if (operation != null) {
      return _resolveType(operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation).toString());
    }
  }
}
