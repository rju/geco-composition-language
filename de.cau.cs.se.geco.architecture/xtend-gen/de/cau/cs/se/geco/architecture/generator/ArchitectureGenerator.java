/**
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
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
import de.cau.cs.se.geco.architecture.framework.AbstractRequireTraceModelGenerator;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class ArchitectureGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    final String fileName = _trimFileExtension.lastSegment();
    StringConcatenation _builder = new StringConcatenation();
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    Model _last = IteratorExtensions.<Model>last(_filter);
    String _name = _last.getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    _builder.append(File.separator, "");
    _builder.append(fileName, "");
    _builder.append(".xtend");
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<Model> _filter_1 = Iterators.<Model>filter(_allContents_1, Model.class);
    Model _last_1 = IteratorExtensions.<Model>last(_filter_1);
    CharSequence _createGeneratorExecution = this.createGeneratorExecution(_last_1, fileName);
    fsa.generateFile(_builder.toString(), _createGeneratorExecution);
  }
  
  private CharSequence createGeneratorExecution(final Model model, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.menges.nexgen");
    _builder.newLine();
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
    EList<Import> _imports = model.getImports();
    final Function1<Import, CharSequence> _function = new Function1<Import, CharSequence>() {
      public CharSequence apply(final Import it) {
        return ArchitectureGenerator.this.createImport(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Import, CharSequence>map(_imports, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("class ");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append(".");
    _builder.append(className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    EList<Connection> _connections = model.getConnections();
    final Function1<Connection, CharSequence> _function_1 = new Function1<Connection, CharSequence>() {
      public CharSequence apply(final Connection it) {
        return ArchitectureGenerator.this.createField(it);
      }
    };
    List<CharSequence> _map_1 = ListExtensions.<Connection, CharSequence>map(_connections, _function_1);
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
    EList<Connection> _connections_1 = model.getConnections();
    final Function1<Connection, CharSequence> _function_2 = new Function1<Connection, CharSequence>() {
      public CharSequence apply(final Connection it) {
        return ArchitectureGenerator.this.createExecution(it);
      }
    };
    List<CharSequence> _map_2 = ListExtensions.<Connection, CharSequence>map(_connections_1, _function_2);
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
  
  private CharSequence createMetamodels(final MetamodelSequence sequence) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Metamodel> _metamodels = sequence.getMetamodels();
    final Function1<Metamodel, CharSequence> _function = new Function1<Metamodel, CharSequence>() {
      public CharSequence apply(final Metamodel it) {
        ModelNodeType _type = sequence.getType();
        return ArchitectureGenerator.this.createMetamodel(it, _type);
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
  
  private CharSequence createField(final Connection connection) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    String _instanceName = this.getInstanceName(connection);
    _builder.append(_instanceName, "");
    _builder.append(" = new ");
    JvmType _reference = connection.getReference();
    String _simpleName = _reference.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
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
      String _instanceName = this.getInstanceName(generator);
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
    CharSequence _xifexpression = null;
    AspectModel _aspectModel = weaver.getAspectModel();
    JvmType _reference = ((Generator) _aspectModel).getReference();
    boolean _isSingleOutput = this.isSingleOutput(((JvmGenericType) _reference));
    if (_isSingleOutput) {
      StringConcatenation _builder = new StringConcatenation();
      String _instanceName = this.getInstanceName(weaver);
      _builder.append(_instanceName, "");
      _builder.append(".weave(");
      Metamodel _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      CharSequence _createSourceModelReference = this.createSourceModelReference(_resolveWeaverSourceModel);
      _builder.append(_createSourceModelReference, "");
      _builder.append(", ");
      AspectModel _aspectModel_1 = weaver.getAspectModel();
      CharSequence _createAspectModelReference = this.createAspectModelReference(_aspectModel_1);
      _builder.append(_createAspectModelReference, "");
      _xifexpression = _builder;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
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
    String _instanceName = this.getInstanceName(generator);
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
  
  private boolean isSingleOutput(final JvmGenericType type) {
    EList<JvmTypeReference> _superTypes = type.getSuperTypes();
    final Function1<JvmTypeReference, Boolean> _function = new Function1<JvmTypeReference, Boolean>() {
      public Boolean apply(final JvmTypeReference it) {
        String _simpleName = it.getSimpleName();
        String _simpleName_1 = IGenerator.class.getSimpleName();
        return Boolean.valueOf(_simpleName.startsWith(_simpleName_1));
      }
    };
    final JvmTypeReference generatorInterface = IterableExtensions.<JvmTypeReference>findFirst(_superTypes, _function);
    boolean _equals = Objects.equal(generatorInterface, null);
    if (_equals) {
      EList<JvmTypeReference> _superTypes_1 = type.getSuperTypes();
      final Function1<JvmTypeReference, Boolean> _function_1 = new Function1<JvmTypeReference, Boolean>() {
        public Boolean apply(final JvmTypeReference it) {
          String _simpleName = it.getSimpleName();
          String _simpleName_1 = AbstractRequireTraceModelGenerator.class.getSimpleName();
          return Boolean.valueOf(_simpleName.startsWith(_simpleName_1));
        }
      };
      final JvmTypeReference abstractGenerator = IterableExtensions.<JvmTypeReference>findFirst(_superTypes_1, _function_1);
      EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference) abstractGenerator).getArguments();
      JvmTypeReference _get = _arguments.get(1);
      final JvmType targetType = _get.getType();
      boolean _or = false;
      boolean _or_1 = false;
      String _simpleName = targetType.getSimpleName();
      boolean _startsWith = _simpleName.startsWith("List");
      if (_startsWith) {
        _or_1 = true;
      } else {
        String _simpleName_1 = targetType.getSimpleName();
        boolean _startsWith_1 = _simpleName_1.startsWith("EList");
        _or_1 = _startsWith_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        String _simpleName_2 = targetType.getSimpleName();
        boolean _startsWith_2 = _simpleName_2.startsWith("Iterator");
        _or = _startsWith_2;
      }
      return _or;
    } else {
      EList<JvmTypeReference> _arguments_1 = ((JvmParameterizedTypeReference) generatorInterface).getArguments();
      JvmTypeReference _get_1 = _arguments_1.get(1);
      final JvmType targetType_1 = _get_1.getType();
      boolean _or_2 = false;
      boolean _or_3 = false;
      String _simpleName_3 = targetType_1.getSimpleName();
      boolean _startsWith_3 = _simpleName_3.startsWith("List");
      if (_startsWith_3) {
        _or_3 = true;
      } else {
        String _simpleName_4 = targetType_1.getSimpleName();
        boolean _startsWith_4 = _simpleName_4.startsWith("EList");
        _or_3 = _startsWith_4;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        String _simpleName_5 = targetType_1.getSimpleName();
        boolean _startsWith_5 = _simpleName_5.startsWith("Iterator");
        _or_2 = _startsWith_5;
      }
      return _or_2;
    }
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
            return ArchitectureGenerator.this.createConstraint(it);
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
    String _instanceName = this.getInstanceName(generator);
    _builder.append(_instanceName, "");
    _builder.append("(it)");
    return _builder;
  }
  
  private String getInstanceName(final Connection connection) {
    JvmType _reference = connection.getReference();
    String _simpleName = _reference.getSimpleName();
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
