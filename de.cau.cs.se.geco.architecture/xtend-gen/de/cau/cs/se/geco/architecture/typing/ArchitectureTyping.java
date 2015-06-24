package de.cau.cs.se.geco.architecture.typing;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.BasicConstraint;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Negation;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.Typeof;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ArchitectureTyping {
  public static JvmType resolveType(final ModelNodeType type) {
    JvmType _xifexpression = null;
    NodeProperty _property = type.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      RegisteredPackage _target = type.getTarget();
      _xifexpression = _target.getImportedNamespace();
    } else {
      NodeProperty _property_1 = type.getProperty();
      _xifexpression = ArchitectureTyping.resolveType(_property_1);
    }
    return _xifexpression;
  }
  
  public static JvmType resolveType(final NodeProperty property) {
    JvmType _xifexpression = null;
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
  
  public static JvmType resolveType(final JvmMember member) {
    JvmType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (member instanceof JvmOperation) {
        _matched=true;
        JvmTypeReference _returnType = ((JvmOperation)member).getReturnType();
        _switchResult = ArchitectureTyping.resolveType(_returnType);
      }
    }
    if (!_matched) {
      if (member instanceof JvmAnnotationType) {
        _matched=true;
        _switchResult = ((JvmType)member);
      }
    }
    if (!_matched) {
      Class<? extends JvmMember> _class = member.getClass();
      String _plus = ("Resolve type error. " + _class);
      String _plus_1 = (_plus + " is not supported.");
      throw new UnsupportedOperationException(_plus_1);
    }
    return _switchResult;
  }
  
  public static JvmType resolveType(final JvmTypeReference typeReference) {
    JvmType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (typeReference instanceof JvmParameterizedTypeReference) {
        _matched=true;
        EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference)typeReference).getArguments();
        JvmTypeReference _last = IterableExtensions.<JvmTypeReference>last(_arguments);
        _switchResult = _last.getType();
      }
    }
    if (!_matched) {
      _switchResult = typeReference.getType();
    }
    return _switchResult;
  }
  
  public static JvmType resolveType(final Metamodel metamodel) {
    EObject _eContainer = metamodel.eContainer();
    ModelNodeType _type = ((MetamodelSequence) _eContainer).getType();
    return ArchitectureTyping.resolveType(_type);
  }
  
  /**
   * Resolve type of a source model node selector.
   */
  public static JvmType resolveType(final SourceModelNodeSelector selector) {
    JvmType _xblockexpression = null;
    {
      Metamodel _reference = selector.getReference();
      final JvmType baseType = ArchitectureTyping.resolveType(_reference);
      ConstraintExpression _constraint = selector.getConstraint();
      final JvmType type = ArchitectureTyping.findTypeOf(_constraint);
      JvmType _xifexpression = null;
      boolean _notEquals = (!Objects.equal(type, null));
      if (_notEquals) {
        _xifexpression = type;
      } else {
        _xifexpression = baseType;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private static JvmType _findTypeOf(final ConstraintExpression expression) {
    ConstraintExpression _left = expression.getLeft();
    final JvmType result = ArchitectureTyping.findTypeOf(_left);
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      ConstraintExpression _right = expression.getRight();
      boolean _notEquals = (!Objects.equal(_right, null));
      if (_notEquals) {
        ConstraintExpression _right_1 = expression.getRight();
        return ArchitectureTyping.findTypeOf(_right_1);
      } else {
        return null;
      }
    } else {
      return result;
    }
  }
  
  private static JvmType _findTypeOf(final ParenthesisConstraint expression) {
    ConstraintExpression _constraint = expression.getConstraint();
    return ArchitectureTyping.findTypeOf(_constraint);
  }
  
  private static JvmType _findTypeOf(final Typeof expression) {
    return expression.getType();
  }
  
  private static JvmType _findTypeOf(final Negation expression) {
    ConstraintExpression _constraint = expression.getConstraint();
    return ArchitectureTyping.findTypeOf(_constraint);
  }
  
  private static JvmType _findTypeOf(final BasicConstraint expression) {
    return null;
  }
  
  /**
   * Resolve the source model reference of the weaver instance.
   */
  public static Metamodel resolveWeaverSourceModel(final Weaver weaver) {
    Metamodel _xifexpression = null;
    SourceModelNodeSelector _sourceModel = weaver.getSourceModel();
    boolean _notEquals = (!Objects.equal(_sourceModel, null));
    if (_notEquals) {
      SourceModelNodeSelector _sourceModel_1 = weaver.getSourceModel();
      _xifexpression = _sourceModel_1.getReference();
    } else {
      Weaver _predecessingWeaver = ArchitectureTyping.predecessingWeaver(weaver);
      Metamodel _resolveWeaverSourceModel = null;
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
    final EList<Connection> connections = ((Model) _eContainer).getConnections();
    final int index = connections.lastIndexOf(weaver);
    if ((index > 0)) {
      int i = 1;
      while ((((index - i) >= 0) && (!(connections.get((index - i)) instanceof Weaver)))) {
        i++;
      }
      if ((i <= index)) {
        Connection _get = connections.get((index - i));
        return ((Weaver) _get);
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
  
  private static JvmType findTypeOf(final ConstraintExpression expression) {
    if (expression instanceof Typeof) {
      return _findTypeOf((Typeof)expression);
    } else if (expression instanceof Negation) {
      return _findTypeOf((Negation)expression);
    } else if (expression instanceof ParenthesisConstraint) {
      return _findTypeOf((ParenthesisConstraint)expression);
    } else if (expression instanceof BasicConstraint) {
      return _findTypeOf((BasicConstraint)expression);
    } else if (expression != null) {
      return _findTypeOf(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
