package de.cau.cs.se.geco.architecture.generator.code;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelModifier;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModel;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.generator.code.NameResolver;
import de.cau.cs.se.geco.architecture.generator.code.SelectorQuery;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class GenerateGecoCode implements IGenerator<BoxingModel, CharSequence> {
  @Inject
  @Extension
  private SelectorQuery _selectorQuery;
  
  @Inject
  @Extension
  private NameResolver _nameResolver;
  
  private String className;
  
  public GenerateGecoCode(final String className) {
    this.className = className;
  }
  
  @Override
  public CharSequence generate(final BoxingModel input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = input.getDerivedFrom().getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList");
    _builder.newLine();
    _builder.append("import java.util.Collection");
    _builder.newLine();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    final Function1<Import, CharSequence> _function = (Import it) -> {
      return this.createImport(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<Import, CharSequence>map(input.getDerivedFrom().getImports(), _function));
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("class ");
    _builder.append(this.className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("val URI uri");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/** instantiate all generators. */");
    _builder.newLine();
    _builder.append("\t");
    final Function1<JvmType, CharSequence> _function_1 = (JvmType it) -> {
      return this.createField(it);
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<JvmType, CharSequence>map(input.getAllProcessors(), _function_1));
    _builder.append(_join_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/** define collections for models used as in put. */");
    _builder.newLine();
    _builder.append("\t");
    final Function1<ModelDeclaration, CharSequence> _function_2 = (ModelDeclaration it) -> {
      return this.createCollectionForMetamodel(it);
    };
    String _join_2 = IterableExtensions.join(ListExtensions.<ModelDeclaration, CharSequence>map(input.getModels(), _function_2));
    _builder.append(_join_2, "\t");
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
    _builder.append("/** separate input models in collections for specific source model types. */");
    _builder.newLine();
    _builder.append("\t\t");
    final Function1<ModelDeclaration, Boolean> _function_3 = (ModelDeclaration it) -> {
      ModelModifier _modifier = it.getModifier();
      return Boolean.valueOf(Objects.equal(_modifier, ModelModifier.INPUT));
    };
    final Function1<ModelDeclaration, CharSequence> _function_4 = (ModelDeclaration it) -> {
      return this.createCollectionInitalization(it);
    };
    String _join_3 = IterableExtensions.join(IterableExtensions.<ModelDeclaration, CharSequence>map(IterableExtensions.<ModelDeclaration>filter(input.getModels(), _function_3), _function_4));
    _builder.append(_join_3, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/** main generation groups. */");
    _builder.newLine();
    _builder.append("\t\t");
    final Function1<Pair<Integer, Group>, CharSequence> _function_5 = (Pair<Integer, Group> it) -> {
      return this.createMainGroupCall((it.getKey()).intValue());
    };
    String _join_4 = IterableExtensions.join(IterableExtensions.<Pair<Integer, Group>, CharSequence>map(IterableExtensions.<Group>indexed(input.getGroups()), _function_5), "\n");
    _builder.append(_join_4, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final Function1<Pair<Integer, Group>, CharSequence> _function_6 = (Pair<Integer, Group> it) -> {
      return this.createMainGroup(it.getValue(), (it.getKey()).intValue());
    };
    String _join_5 = IterableExtensions.join(IterableExtensions.<Pair<Integer, Group>, CharSequence>map(IterableExtensions.<Group>indexed(input.getGroups()), _function_6), "\n");
    _builder.append(_join_5, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create an import rule.
   */
  private CharSequence createImport(final Import node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _qualifiedName = node.getImportedNamespace().getQualifiedName();
    _builder.append(_qualifiedName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create a field for an generator and instantiate it.
   */
  private CharSequence createField(final JvmType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    String _instanceName = this._nameResolver.getInstanceName(type);
    _builder.append(_instanceName);
    _builder.append(" = new ");
    String _simpleName = type.getSimpleName();
    _builder.append(_simpleName);
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create collections for models declared with the metamodel expression in GECO.
   * These are used in the class property declaration area.
   */
  private CharSequence createCollectionForMetamodel(final ModelDeclaration declaration) {
    CharSequence _xifexpression = null;
    boolean _isCollectionType = ArchitectureTyping.isCollectionType(declaration);
    if (_isCollectionType) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val ");
      String _name = declaration.getModel().getName();
      _builder.append(_name);
      _builder.append(" = new ArrayList<");
      String _qualifiedName = ArchitectureTyping.determineElementType(ArchitectureTyping.resolveType(declaration.getSelector())).getQualifiedName();
      _builder.append(_qualifiedName);
      _builder.append(">()");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("var ");
      String _qualifiedName_1 = ArchitectureTyping.determineElementType(ArchitectureTyping.resolveType(declaration.getSelector())).getQualifiedName();
      _builder_1.append(_qualifiedName_1);
      _builder_1.append(" ");
      String _name_1 = declaration.getModel().getName();
      _builder_1.append(_name_1);
      _builder_1.append(" = null");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Create initialization for collections used to traverse the input models and fill the proper collections.
   */
  private CharSequence createCollectionInitalization(final ModelDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    CharSequence _collectionName = this._nameResolver.collectionName(declaration.getModel());
    _builder.append(_collectionName);
    _builder.append(" = models.filter(");
    String _qualifiedName = declaration.getSelector().getTarget().getImportedNamespace().getQualifiedName();
    _builder.append(_qualifiedName);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    CharSequence _collectionName_1 = this._nameResolver.collectionName(declaration.getModel());
    _builder.append(_collectionName_1);
    _builder.append(".forEach[");
    CharSequence _createSelectorQuery = this._selectorQuery.createSelectorQuery(declaration.getSelector(), declaration.getModel().getName());
    _builder.append(_createSelectorQuery);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create call to a group execution method.
   */
  private CharSequence createMainGroupCall(final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("executeGroup");
    _builder.append(i);
    _builder.append("()");
    return _builder;
  }
  
  /**
   * Create a group execution method.
   */
  private CharSequence createMainGroup(final Group group, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/** ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    final Function1<Model, String> _function = (Model it) -> {
      String _name = it.getName();
      return ("@param " + _name);
    };
    String _join = IterableExtensions.join(ListExtensions.<Model, String>map(group.getSourceModels(), _function), "\n");
    _builder.append(_join, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("private def executeGroup");
    _builder.append(i);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<Unit, CharSequence> _function_1 = (Unit it) -> {
      return this.createUnitExecution(it);
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<Unit, CharSequence>map(group.getUnits(), _function_1));
    _builder.append(_join_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create code for a single execution unit.
   */
  private CharSequence createUnitExecution(final Unit unit) {
    CharSequence _xblockexpression = null;
    {
      final Fragment processor = unit.getFragment();
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (processor instanceof Generator) {
        _matched=true;
        _switchResult = this.createGeneratorExecution(((Generator)processor), unit);
      }
      if (!_matched) {
        if (processor instanceof Weaver) {
          AspectModel _aspectModel = ((Weaver)processor).getAspectModel();
          if ((_aspectModel instanceof Generator)) {
            _matched=true;
            _switchResult = this.createWeaverGeneratorExecution(((Weaver)processor), unit);
          }
        }
      }
      if (!_matched) {
        if (processor instanceof Weaver) {
          AspectModel _aspectModel = ((Weaver)processor).getAspectModel();
          if ((_aspectModel instanceof TargetModel)) {
            _matched=true;
            _switchResult = this.createWeaverExecution(((Weaver)processor), unit);
          }
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  /**
   * Create code for the execution of a generator which is not
   * directly connected to a weaver.
   */
  private CharSequence createGeneratorExecution(final Generator generator, final Unit unit) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createSourceAuxModels = this.createSourceAuxModels(generator.getSourceAuxModels());
    _builder.append(_createSourceAuxModels);
    _builder.newLineIfNotEmpty();
    CharSequence _createSourceModelNesting = this.createSourceModelNesting(generator.getSourceModel(), generator, unit);
    _builder.append(_createSourceModelNesting);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createWeaverGeneratorExecution(final Weaver weaver, final Unit unit) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    AspectModel _aspectModel = weaver.getAspectModel();
    CharSequence _createSourceAuxModels = this.createSourceAuxModels(((Generator) _aspectModel).getSourceAuxModels());
    _builder.append(_createSourceAuxModels, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    AspectModel _aspectModel_1 = weaver.getAspectModel();
    CharSequence _createSourceModelNesting = this.createSourceModelNesting(((Generator) _aspectModel_1).getSourceModel(), weaver, unit);
    _builder.append(_createSourceModelNesting, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final SourceModelSelector sourceModel, final Weaver weaver, final Unit unit) {
    CharSequence _xifexpression = null;
    Model _reference = sourceModel.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      _xifexpression = this.createWeaverCall(weaver, unit, "null");
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(ArchitectureTyping.resolveType(sourceModel), unit.getInputTypeReference());
      if (_isSubTypeOf) {
        _xifexpression_1 = this.createWeaverCall(weaver, unit, sourceModel.getReference().getName());
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _name = sourceModel.getReference().getName();
        _builder.append(_name);
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(sourceModel.getConstraint());
        _builder.append(_createConstraintFilter);
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(sourceModel.getProperty(), weaver, unit, "it");
        _builder.append(_createSourceModelNesting, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("]");
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final NodeProperty node, final Weaver weaver, final Unit unit, final String modelVarName) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(node, null);
    if (_equals) {
      _xifexpression = this.createWeaverCall(weaver, unit, modelVarName);
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(ArchitectureTyping.resolveType(node), unit.getInputTypeReference());
      if (_isSubTypeOf) {
        _xifexpression_1 = this.createWeaverCall(weaver, unit, modelVarName);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _simpleName = node.getProperty().getSimpleName();
        _builder.append(_simpleName);
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(node.getConstraint());
        _builder.append(_createConstraintFilter);
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(node.getSubProperty(), weaver, unit, "it");
        _builder.append(_createSourceModelNesting, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("]");
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private CharSequence createWeaverCall(final Weaver weaver, final Unit unit, final String varModelName) {
    StringConcatenation _builder = new StringConcatenation();
    AspectModel _aspectModel = weaver.getAspectModel();
    CharSequence _createGeneratorCall = this.createGeneratorCall(((Generator) _aspectModel), varModelName);
    _builder.append(_createGeneratorCall);
    _builder.newLineIfNotEmpty();
    CharSequence _createWeaverInvocation = this.createWeaverInvocation(weaver, unit);
    _builder.append(_createWeaverInvocation);
    return _builder;
  }
  
  private CharSequence createWeaverInvocation(final Weaver weaver, final Unit unit) {
    CharSequence _xifexpression = null;
    boolean _isListType = ArchitectureTyping.isListType(unit.getInputTypeReference());
    if (_isListType) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspectModel.forEach[");
      String _instanceName = this._nameResolver.getInstanceName(weaver.getReference());
      _builder.append(_instanceName);
      _builder.append(".weave(");
      CharSequence _valueReference = this.valueReference(ArchitectureTyping.resolveWeaverSourceModel(weaver));
      _builder.append(_valueReference);
      _builder.append(",it)]");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _instanceName_1 = this._nameResolver.getInstanceName(weaver.getReference());
      _builder_1.append(_instanceName_1);
      _builder_1.append(".weave(");
      CharSequence _valueReference_1 = this.valueReference(ArchitectureTyping.resolveWeaverSourceModel(weaver));
      _builder_1.append(_valueReference_1);
      _builder_1.append(",aspectModel)");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence valueReference(final SourceModelSelector selector) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = selector.getReference().getName();
    _builder.append(_name);
    NodeProperty _property = selector.getProperty();
    CharSequence _valueReference = null;
    if (_property!=null) {
      _valueReference=this.valueReference(_property);
    }
    _builder.append(_valueReference);
    return _builder;
  }
  
  private CharSequence valueReference(final NodeProperty property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".");
    String _simpleName = property.getProperty().getSimpleName();
    _builder.append(_simpleName);
    NodeProperty _subProperty = property.getSubProperty();
    CharSequence _valueReference = null;
    if (_subProperty!=null) {
      _valueReference=this.valueReference(_subProperty);
    }
    _builder.append(_valueReference);
    return _builder;
  }
  
  private CharSequence createWeaverExecution(final Weaver weaver, final Unit unit) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  /**
   * Prepare collections for auxiliary input.
   */
  private CharSequence createSourceAuxModels(final EList<SourceModelSelector> sourceAuxModels) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Pair<Integer, SourceModelSelector>, CharSequence> _function = (Pair<Integer, SourceModelSelector> it) -> {
      return this._selectorQuery.createSourceAuxModel(it.getValue(), (it.getKey()).intValue());
    };
    String _join = IterableExtensions.join(IterableExtensions.<Pair<Integer, SourceModelSelector>, CharSequence>map(IterableExtensions.<SourceModelSelector>indexed(sourceAuxModels), _function));
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create a generator invocation.
   */
  private CharSequence createGeneratorCall(final Generator generator, final String modelVarName) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createTargetModel = this.createTargetModel(generator);
    _builder.append(_createTargetModel);
    _builder.append(" ");
    String _instanceName = this._nameResolver.getInstanceName(generator.getReference());
    _builder.append(_instanceName);
    _builder.append(".generate(");
    _builder.append(modelVarName);
    _builder.append(")");
    return _builder;
  }
  
  /**
   * Create reference to target model. += is for pre-existing collections and = for aspect models
   * which are automatically woven into a model.
   */
  private CharSequence createTargetModel(final Generator generator) {
    CharSequence _xifexpression = null;
    TargetModel _targetModel = generator.getTargetModel();
    boolean _notEquals = (!Objects.equal(_targetModel, null));
    if (_notEquals) {
      CharSequence _xifexpression_1 = null;
      boolean _isCollectionType = ArchitectureTyping.isCollectionType(generator.getTargetModel().getReference());
      if (_isCollectionType) {
        StringConcatenation _builder = new StringConcatenation();
        String _name = generator.getTargetModel().getReference().getName();
        _builder.append(_name);
        _builder.append(" += ");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name_1 = generator.getTargetModel().getReference().getName();
        _builder_1.append(_name_1);
        _builder_1.append(" = ");
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("val aspectModel = ");
      _xifexpression = _builder_2;
    }
    return _xifexpression;
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final SourceModelSelector sourceModel, final Generator generator, final Unit unit) {
    CharSequence _xifexpression = null;
    Model _reference = sourceModel.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      _xifexpression = this.createGeneratorCall(generator, "null");
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(ArchitectureTyping.resolveType(sourceModel), unit.getInputTypeReference());
      if (_isSubTypeOf) {
        _xifexpression_1 = this.createGeneratorCall(generator, sourceModel.getReference().getName());
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _name = sourceModel.getReference().getName();
        _builder.append(_name);
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(sourceModel.getConstraint());
        _builder.append(_createConstraintFilter);
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(sourceModel.getProperty(), generator, unit, "it");
        _builder.append(_createSourceModelNesting, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("]");
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final NodeProperty node, final Generator generator, final Unit unit, final String modelVarName) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(node, null);
    if (_equals) {
      _xifexpression = this.createGeneratorCall(generator, modelVarName);
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(ArchitectureTyping.resolveType(node), unit.getInputTypeReference());
      if (_isSubTypeOf) {
        _xifexpression_1 = this.createGeneratorCall(generator, modelVarName);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _simpleName = node.getProperty().getSimpleName();
        _builder.append(_simpleName);
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(node.getConstraint());
        _builder.append(_createConstraintFilter);
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(node.getSubProperty(), generator, unit, "it");
        _builder.append(_createSourceModelNesting, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("]");
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
