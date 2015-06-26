package de.cau.cs.se.geco.architecture.generator;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral;
import de.cau.cs.se.geco.architecture.architecture.Comparator;
import de.cau.cs.se.geco.architecture.architecture.CompareExpression;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.IntLiteral;
import de.cau.cs.se.geco.architecture.architecture.Literal;
import de.cau.cs.se.geco.architecture.architecture.LogicOperator;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Negation;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.StringLiteral;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Typeof;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.Transformation;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateGecoCode implements IGenerator<BoxingModel, CharSequence> {
  private String className;
  
  public GenerateGecoCode(final String className) {
    this.className = className;
  }
  
  public CharSequence generate(final BoxingModel input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    Model _derivedFrom = input.getDerivedFrom();
    String _name = _derivedFrom.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList");
    _builder.newLine();
    _builder.append("import java.util.Collection");
    _builder.newLine();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.newLine();
    Model _derivedFrom_1 = input.getDerivedFrom();
    EList<Import> _imports = _derivedFrom_1.getImports();
    final Function1<Import, CharSequence> _function = new Function1<Import, CharSequence>() {
      public CharSequence apply(final Import it) {
        return GenerateGecoCode.this.createImport(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Import, CharSequence>map(_imports, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("val URI uri");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("class ");
    _builder.append(this.className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    EList<Transformation> _transformations = input.getTransformations();
    final Function1<Transformation, CharSequence> _function_1 = new Function1<Transformation, CharSequence>() {
      public CharSequence apply(final Transformation it) {
        return GenerateGecoCode.this.createField(it);
      }
    };
    List<CharSequence> _map_1 = ListExtensions.<Transformation, CharSequence>map(_transformations, _function_1);
    String _join_1 = IterableExtensions.join(_map_1);
    _builder.append(_join_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("new(URI uri) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.uri = uri");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void execute(Collection<EObject> models) {");
    _builder.newLine();
    _builder.append("\t\t");
    EList<RootModelNode> _sourceModels = input.getSourceModels();
    final Function1<RootModelNode, CharSequence> _function_2 = new Function1<RootModelNode, CharSequence>() {
      public CharSequence apply(final RootModelNode it) {
        return GenerateGecoCode.this.createRootModel(it);
      }
    };
    List<CharSequence> _map_2 = ListExtensions.<RootModelNode, CharSequence>map(_sourceModels, _function_2);
    String _join_2 = IterableExtensions.join(_map_2, "\n");
    _builder.append(_join_2, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createRootModel(final RootModelNode rootModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("models.filter(");
    RegisteredPackage _declaredModel = rootModel.getDeclaredModel();
    JvmType _importedNamespace = _declaredModel.getImportedNamespace();
    String _qualifiedName = _importedNamespace.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append(").forEach[");
    RegisteredPackage _declaredModel_1 = rootModel.getDeclaredModel();
    String _name = _declaredModel_1.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append(" |");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<PropertyModelNode> _models = rootModel.getModels();
    final Function1<PropertyModelNode, CharSequence> _function = new Function1<PropertyModelNode, CharSequence>() {
      public CharSequence apply(final PropertyModelNode it) {
        RegisteredPackage _declaredModel = rootModel.getDeclaredModel();
        String _name = _declaredModel.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        return GenerateGecoCode.this.createPropertyModel(it, _firstLower);
      }
    };
    List<CharSequence> _map = ListExtensions.<PropertyModelNode, CharSequence>map(_models, _function);
    String _join = IterableExtensions.join(_map, "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createPropertyModel(final PropertyModelNode propertyModel, final String propertyName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(propertyName, "");
    _builder.append(".");
    String _deriveName = this.deriveName(propertyModel);
    _builder.append(_deriveName, "");
    _builder.append(".forEach[");
    String _deriveName_1 = this.deriveName(propertyModel);
    _builder.append(_deriveName_1, "");
    _builder.append(" |");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<PropertyModelNode> _models = propertyModel.getModels();
    final Function1<PropertyModelNode, CharSequence> _function = new Function1<PropertyModelNode, CharSequence>() {
      public CharSequence apply(final PropertyModelNode it) {
        String _deriveName = GenerateGecoCode.this.deriveName(propertyModel);
        return GenerateGecoCode.this.createPropertyModel(it, _deriveName);
      }
    };
    List<CharSequence> _map = ListExtensions.<PropertyModelNode, CharSequence>map(_models, _function);
    String _join = IterableExtensions.join(_map, "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  public String deriveName(final PropertyModelNode propertyModel) {
    NodeProperty _declaredNodeProperty = propertyModel.getDeclaredNodeProperty();
    JvmMember _property = _declaredNodeProperty.getProperty();
    return _property.getSimpleName();
  }
  
  private CharSequence createMetamodels(final MetamodelSequence sequence) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Metamodel> _metamodels = sequence.getMetamodels();
    final Function1<Metamodel, CharSequence> _function = new Function1<Metamodel, CharSequence>() {
      public CharSequence apply(final Metamodel it) {
        ModelNodeType _type = sequence.getType();
        return GenerateGecoCode.this.createMetamodel(it, _type);
      }
    };
    List<CharSequence> _map = ListExtensions.<Metamodel, CharSequence>map(_metamodels, _function);
    String _join = IterableExtensions.join(_map, "\n");
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createMetamodel(final Metamodel metamodel, final ModelNodeType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    JvmType _resolveType = ArchitectureTyping.resolveType(type);
    String _qualifiedName = _resolveType.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append(" ");
    String _name = metamodel.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    CharSequence _createModelNodeType = this.createModelNodeType(type);
    _builder.append(_createModelNodeType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createModelNodeType(final ModelNodeType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("models.filter(");
    RegisteredPackage _target = type.getTarget();
    JvmType _importedNamespace = _target.getImportedNamespace();
    String _qualifiedName = _importedNamespace.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append(")");
    String _xifexpression = null;
    NodeProperty _property = type.getProperty();
    boolean _notEquals = (!Objects.equal(_property, null));
    if (_notEquals) {
      _xifexpression = ".";
    }
    _builder.append(_xifexpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createImport(final Import node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    JvmType _importedNamespace = node.getImportedNamespace();
    String _qualifiedName = _importedNamespace.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createField(final Transformation transformation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    JvmType _derivedFrom = transformation.getDerivedFrom();
    String _instanceName = this.getInstanceName(_derivedFrom);
    _builder.append(_instanceName, "");
    _builder.append(" = new ");
    JvmType _derivedFrom_1 = transformation.getDerivedFrom();
    String _simpleName = _derivedFrom_1.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * ---------------------------------------------------
   */
  private CharSequence _createExecution(final Generator generator) {
    CharSequence _xifexpression = null;
    SourceModelNodeSelector _sourceModel = generator.getSourceModel();
    Metamodel _reference = _sourceModel.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val ");
      TargetModelNodeType _targetModel = generator.getTargetModel();
      Metamodel _reference_1 = _targetModel.getReference();
      String _name = _reference_1.getName();
      _builder.append(_name, "");
      _builder.append(" = ");
      JvmType _reference_2 = generator.getReference();
      String _instanceName = this.getInstanceName(_reference_2);
      _builder.append(_instanceName, "");
      _builder.append(".generate(null)");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      SourceModelNodeSelector _sourceModel_1 = generator.getSourceModel();
      CharSequence _createGenerator = this.createGenerator(generator);
      CharSequence _createSourceModelQuery = this.createSourceModelQuery(_sourceModel_1, _createGenerator);
      _builder_1.append(_createSourceModelQuery, "");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence _createExecution(final Weaver weaver) {
    CharSequence _switchResult = null;
    AspectModel _aspectModel = weaver.getAspectModel();
    boolean _matched = false;
    if (!_matched) {
      if (_aspectModel instanceof Generator) {
        _matched=true;
        _switchResult = this.createWeaverWithAspectGenerator(weaver);
      }
    }
    if (!_matched) {
      if (_aspectModel instanceof TargetModelNodeType) {
        _matched=true;
        _switchResult = this.createWeaverWithAspectModel(weaver);
      }
    }
    return _switchResult;
  }
  
  private CharSequence createWeaverWithAspectModel(final Weaver weaver) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  private CharSequence createWeaverWithAspectGenerator(final Weaver weaver) {
    return null;
  }
  
  private CharSequence createAspectModelReference(final AspectModel model) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (model instanceof Generator) {
        _matched=true;
        _switchResult = this.createAspectModelReferenceGenerator(((Generator)model));
      }
    }
    if (!_matched) {
      if (model instanceof TargetModelNodeType) {
        _matched=true;
        _switchResult = this.createAspectModelReferenceTargetModel(((TargetModelNodeType)model));
      }
    }
    return _switchResult;
  }
  
  private CharSequence createAspectModelReferenceTargetModel(final TargetModelNodeType type) {
    StringConcatenation _builder = new StringConcatenation();
    Metamodel _reference = type.getReference();
    String _name = _reference.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  private CharSequence createAspectModelReferenceGenerator(final Generator generator) {
    StringConcatenation _builder = new StringConcatenation();
    JvmType _reference = generator.getReference();
    String _instanceName = this.getInstanceName(_reference);
    _builder.append(_instanceName, "");
    _builder.append(".generate(SOURCE)");
    return _builder;
  }
  
  private CharSequence createSourceModelReference(final Metamodel metamodel) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = metamodel.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  private CharSequence createSourceModelQuery(final SourceModelNodeSelector selector, final CharSequence generator) {
    StringConcatenation _builder = new StringConcatenation();
    Metamodel _reference = selector.getReference();
    String _name = _reference.getName();
    _builder.append(_name, "");
    ConstraintExpression _constraint = selector.getConstraint();
    CharSequence _createConstraint = this.createConstraint(_constraint);
    _builder.append(_createConstraint, "");
    return _builder;
  }
  
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
        final Function1<Literal, CharSequence> _function = new Function1<Literal, CharSequence>() {
          public CharSequence apply(final Literal it) {
            return GenerateGecoCode.this.createConstraint(it);
          }
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
  
  private CharSequence _createConstraint(final Typeof expression) {
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
  
  /**
   * Create the invocation of a generator.
   */
  private CharSequence createGenerator(final Generator generator) {
    StringConcatenation _builder = new StringConcatenation();
    JvmType _reference = generator.getReference();
    String _instanceName = this.getInstanceName(_reference);
    _builder.append(_instanceName, "");
    _builder.append("(it)");
    return _builder;
  }
  
  private String getInstanceName(final JvmType type) {
    String _simpleName = type.getSimpleName();
    return StringExtensions.toFirstLower(_simpleName);
  }
  
  private CharSequence createExecution(final Connection generator) {
    if (generator instanceof Generator) {
      return _createExecution((Generator)generator);
    } else if (generator instanceof Weaver) {
      return _createExecution((Weaver)generator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(generator).toString());
    }
  }
  
  private CharSequence createConstraint(final ConstraintExpression expression) {
    if (expression instanceof Literal) {
      return _createConstraint((Literal)expression);
    } else if (expression instanceof NodeProperty) {
      return _createConstraint((NodeProperty)expression);
    } else if (expression instanceof Typeof) {
      return _createConstraint((Typeof)expression);
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
