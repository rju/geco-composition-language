package de.cau.cs.se.geco.architecture.generator.code;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral;
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral;
import de.cau.cs.se.geco.architecture.architecture.Comparator;
import de.cau.cs.se.geco.architecture.architecture.CompareExpression;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral;
import de.cau.cs.se.geco.architecture.architecture.InstanceOf;
import de.cau.cs.se.geco.architecture.architecture.IntLiteral;
import de.cau.cs.se.geco.architecture.architecture.Literal;
import de.cau.cs.se.geco.architecture.architecture.LogicOperator;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelType;
import de.cau.cs.se.geco.architecture.architecture.Negation;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector;
import de.cau.cs.se.geco.architecture.architecture.StringLiteral;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class SelectorQuery {
  /**
   * Process a node type selector query. If no property is set only add an instance of type to the model list.
   * If the property has a list type iterate over the property (one more for each).
   * If the property has a flat type only add the single value.
   */
  public CharSequence createSelectorQuery(final ModelType type, final String modelName) {
    CharSequence _xifexpression = null;
    NodeProperty _property = type.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(modelName, "");
      _builder.append(".add(it)");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      NodeProperty _property_1 = type.getProperty();
      JvmMember _property_2 = _property_1.getProperty();
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_property_2);
      boolean _isListType = ArchitectureTyping.isListType(_resolveType);
      if (_isListType) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("it.");
        NodeProperty _property_3 = type.getProperty();
        JvmMember _property_4 = _property_3.getProperty();
        String _simpleName = _property_4.getSimpleName();
        _builder_1.append(_simpleName, "");
        _builder_1.append("().forEach[");
        NodeProperty _property_5 = type.getProperty();
        CharSequence _createPropertyQuery = this.createPropertyQuery(_property_5, modelName);
        _builder_1.append(_createPropertyQuery, "");
        _builder_1.append("]");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(modelName, "");
        _builder_2.append(".add(it.");
        NodeProperty _property_6 = type.getProperty();
        JvmMember _property_7 = _property_6.getProperty();
        String _simpleName_1 = _property_7.getSimpleName();
        _builder_2.append(_simpleName_1, "");
        _builder_2.append(")");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Create an initialization section for an auxiliary model collection.
   */
  public CharSequence createSourceAuxModel(final SourceModelSelector sourceAuxModel, final int i) {
    CharSequence _xifexpression = null;
    NodeProperty _property = sourceAuxModel.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val aux");
      _builder.append(i, "");
      _builder.append(" = ");
      Model _reference = sourceAuxModel.getReference();
      String _name = _reference.getName();
      _builder.append(_name, "");
      ConstraintExpression _constraint = sourceAuxModel.getConstraint();
      CharSequence _createConstraintFilter = this.createConstraintFilter(_constraint);
      _builder.append(_createConstraintFilter, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("val aux");
      _builder_1.append(i, "");
      _builder_1.append(" = new ArrayList<");
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(sourceAuxModel);
      String _qualifiedName = _resolveType.getQualifiedName();
      _builder_1.append(_qualifiedName, "");
      _builder_1.append(">()");
      _builder_1.newLineIfNotEmpty();
      Model _reference_1 = sourceAuxModel.getReference();
      String _name_1 = _reference_1.getName();
      _builder_1.append(_name_1, "");
      _builder_1.append(".forEach[it.");
      NodeProperty _property_1 = sourceAuxModel.getProperty();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("aux");
      _builder_2.append(i, "");
      CharSequence _createPropertyQuery = this.createPropertyQuery(_property_1, _builder_2.toString());
      _builder_1.append(_createPropertyQuery, "");
      _builder_1.append("]");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Check if the given property value instance has a sub property. If not,
   * just add the value, else create a for each loop for list properties or a single
   * value add for non list types.
   */
  private CharSequence createPropertyQuery(final NodeProperty property, final String modelName) {
    CharSequence _xifexpression = null;
    NodeProperty _subProperty = property.getSubProperty();
    boolean _equals = Objects.equal(_subProperty, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(modelName, "");
      _builder.append(".add(it)");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      JvmMember _property = property.getProperty();
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_property);
      boolean _isListType = ArchitectureTyping.isListType(_resolveType);
      if (_isListType) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("it.");
        JvmMember _property_1 = property.getProperty();
        String _simpleName = _property_1.getSimpleName();
        _builder_1.append(_simpleName, "");
        _builder_1.append("().forEach[");
        NodeProperty _subProperty_1 = property.getSubProperty();
        CharSequence _createPropertyQuery = this.createPropertyQuery(_subProperty_1, modelName);
        _builder_1.append(_createPropertyQuery, "");
        _builder_1.append("]");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(modelName, "");
        _builder_2.append(".add(it.");
        NodeProperty _subProperty_2 = property.getSubProperty();
        JvmMember _property_2 = _subProperty_2.getProperty();
        String _simpleName_1 = _property_2.getSimpleName();
        _builder_2.append(_simpleName_1, "");
        _builder_2.append(")");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Create a constraint filter for a query if a filter is defined.
   */
  public CharSequence createConstraintFilter(final ConstraintExpression expression) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      if ((expression instanceof InstanceOf)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(".filter(");
        JvmType _type = ((InstanceOf)expression).getType();
        String _qualifiedName = _type.getQualifiedName();
        _builder_1.append(_qualifiedName, "");
        _builder_1.append(")");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(".filter[");
        CharSequence _createConstraint = this.createConstraint(expression);
        _builder_2.append(_createConstraint, "");
        _builder_2.append("]");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * constraint computation
   */
  private CharSequence _createConstraint(final Negation expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    ConstraintExpression _constraint = expression.getConstraint();
    _builder.append(_constraint, "");
    return _builder;
  }
  
  private CharSequence _createConstraint(final Literal expression) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (expression instanceof ArrayLiteral) {
        _matched=true;
        EList<Literal> _literals = ((ArrayLiteral)expression).getLiterals();
        final Function1<Literal, CharSequence> _function = (Literal it) -> {
          return this.createConstraint(it);
        };
        List<CharSequence> _map = ListExtensions.<Literal, CharSequence>map(_literals, _function);
        String _plus = ("{" + _map);
        _switchResult = (_plus + "}");
      }
    }
    if (!_matched) {
      if (expression instanceof BooleanLiteral) {
        _matched=true;
        _switchResult = ((BooleanLiteral)expression).getValue();
      }
    }
    if (!_matched) {
      if (expression instanceof FloatLiteral) {
        _matched=true;
        _switchResult = ((FloatLiteral)expression).getValue();
      }
    }
    if (!_matched) {
      if (expression instanceof IntLiteral) {
        _matched=true;
        int _value = ((IntLiteral)expression).getValue();
        _switchResult = Integer.valueOf(_value).toString();
      }
    }
    if (!_matched) {
      if (expression instanceof StringLiteral) {
        _matched=true;
        _switchResult = (("\"" + expression) + "\"");
      }
    }
    return _switchResult;
  }
  
  private CharSequence _createConstraint(final NodeProperty expression) {
    StringConcatenation _builder = new StringConcatenation();
    JvmMember _property = expression.getProperty();
    String _simpleName = _property.getSimpleName();
    _builder.append(_simpleName, "");
    return _builder;
  }
  
  private CharSequence _createConstraint(final InstanceOf expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("it instanceof ");
    JvmType _type = expression.getType();
    String _qualifiedName = _type.getQualifiedName();
    _builder.append(_qualifiedName, "");
    return _builder;
  }
  
  private CharSequence _createConstraint(final ConstraintExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CompareExpression _left = expression.getLeft();
    CharSequence _createConstraint = this.createConstraint(_left);
    _builder.append(_createConstraint, "");
    _builder.append(" ");
    LogicOperator _operator = expression.getOperator();
    String _createOperator = this.createOperator(_operator);
    _builder.append(_createOperator, "");
    _builder.append(" ");
    ConstraintExpression _right = expression.getRight();
    CharSequence _createConstraint_1 = this.createConstraint(_right);
    _builder.append(_createConstraint_1, "");
    _builder.append(")");
    return _builder;
  }
  
  private String createOperator(final LogicOperator operator) {
    String _switchResult = null;
    if (operator != null) {
      switch (operator) {
        case AND:
          _switchResult = "&&";
          break;
        case OR:
          _switchResult = "||";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  private CharSequence _createConstraint(final CompareExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CompareExpression _left = expression.getLeft();
    CharSequence _createConstraint = this.createConstraint(_left);
    _builder.append(_createConstraint, "");
    _builder.append(" ");
    Comparator _comparator = expression.getComparator();
    String _literal = _comparator.getLiteral();
    _builder.append(_literal, "");
    _builder.append(" ");
    ConstraintExpression _right = expression.getRight();
    CharSequence _createConstraint_1 = this.createConstraint(_right);
    _builder.append(_createConstraint_1, "");
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence createConstraint(final ConstraintExpression expression) {
    if (expression instanceof InstanceOf) {
      return _createConstraint((InstanceOf)expression);
    } else if (expression instanceof Literal) {
      return _createConstraint((Literal)expression);
    } else if (expression instanceof NodeProperty) {
      return _createConstraint((NodeProperty)expression);
    } else if (expression instanceof Negation) {
      return _createConstraint((Negation)expression);
    } else if (expression instanceof CompareExpression) {
      return _createConstraint((CompareExpression)expression);
    } else if (expression != null) {
      return _createConstraint(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
