package de.cau.cs.se.geco.architecture.generator.code;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelModifier;
import de.cau.cs.se.geco.architecture.architecture.ModelType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass;
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
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
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
    GecoModel _derivedFrom = input.getDerivedFrom();
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
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    GecoModel _derivedFrom_1 = input.getDerivedFrom();
    EList<Import> _imports = _derivedFrom_1.getImports();
    final Function1<Import, CharSequence> _function = (Import it) -> {
      return this.createImport(it);
    };
    List<CharSequence> _map = ListExtensions.<Import, CharSequence>map(_imports, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("class ");
    _builder.append(this.className, "");
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
    EList<JvmType> _allProcessors = input.getAllProcessors();
    final Function1<JvmType, CharSequence> _function_1 = (JvmType it) -> {
      return this.createField(it);
    };
    List<CharSequence> _map_1 = ListExtensions.<JvmType, CharSequence>map(_allProcessors, _function_1);
    String _join_1 = IterableExtensions.join(_map_1);
    _builder.append(_join_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/** define collections for models used as in put. */");
    _builder.newLine();
    _builder.append("\t");
    EList<ModelDeclaration> _models = input.getModels();
    final Function1<ModelDeclaration, CharSequence> _function_2 = (ModelDeclaration it) -> {
      return this.createCollectionForMetamodel(it);
    };
    List<CharSequence> _map_2 = ListExtensions.<ModelDeclaration, CharSequence>map(_models, _function_2);
    String _join_2 = IterableExtensions.join(_map_2);
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
    EList<ModelDeclaration> _models_1 = input.getModels();
    final Function1<ModelDeclaration, Boolean> _function_3 = (ModelDeclaration it) -> {
      ModelModifier _modifier = it.getModifier();
      return Boolean.valueOf(Objects.equal(_modifier, ModelModifier.INPUT));
    };
    Iterable<ModelDeclaration> _filter = IterableExtensions.<ModelDeclaration>filter(_models_1, _function_3);
    final Function1<ModelDeclaration, CharSequence> _function_4 = (ModelDeclaration it) -> {
      return this.createCollectionInitalization(it);
    };
    Iterable<CharSequence> _map_3 = IterableExtensions.<ModelDeclaration, CharSequence>map(_filter, _function_4);
    String _join_3 = IterableExtensions.join(_map_3);
    _builder.append(_join_3, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/** main generation groups. */");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Group> _groups = input.getGroups();
    Iterable<Pair<Integer, Group>> _indexed = IterableExtensions.<Group>indexed(_groups);
    final Function1<Pair<Integer, Group>, CharSequence> _function_5 = (Pair<Integer, Group> it) -> {
      Integer _key = it.getKey();
      return this.createMainGroupCall((_key).intValue());
    };
    Iterable<CharSequence> _map_4 = IterableExtensions.<Pair<Integer, Group>, CharSequence>map(_indexed, _function_5);
    String _join_4 = IterableExtensions.join(_map_4, "\n");
    _builder.append(_join_4, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    EList<Group> _groups_1 = input.getGroups();
    Iterable<Pair<Integer, Group>> _indexed_1 = IterableExtensions.<Group>indexed(_groups_1);
    final Function1<Pair<Integer, Group>, CharSequence> _function_6 = (Pair<Integer, Group> it) -> {
      Group _value = it.getValue();
      Integer _key = it.getKey();
      return this.createMainGroup(_value, (_key).intValue());
    };
    Iterable<CharSequence> _map_5 = IterableExtensions.<Pair<Integer, Group>, CharSequence>map(_indexed_1, _function_6);
    String _join_5 = IterableExtensions.join(_map_5, "\n");
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
    JvmType _importedNamespace = node.getImportedNamespace();
    String _qualifiedName = _importedNamespace.getQualifiedName();
    _builder.append(_qualifiedName, "");
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
    _builder.append(_instanceName, "");
    _builder.append(" = new ");
    String _simpleName = null;
    if (type!=null) {
      _simpleName=type.getSimpleName();
    }
    _builder.append(_simpleName, "");
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
      Model _model = declaration.getModel();
      String _name = _model.getName();
      _builder.append(_name, "");
      _builder.append(" = new ArrayList<");
      ModelType _selector = declaration.getSelector();
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_selector);
      JvmType _determineElementType = ArchitectureTyping.determineElementType(_resolveType);
      String _qualifiedName = _determineElementType.getQualifiedName();
      _builder.append(_qualifiedName, "");
      _builder.append(">()");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("var ");
      ModelType _selector_1 = declaration.getSelector();
      JvmTypeReference _resolveType_1 = ArchitectureTyping.resolveType(_selector_1);
      JvmType _determineElementType_1 = ArchitectureTyping.determineElementType(_resolveType_1);
      String _qualifiedName_1 = _determineElementType_1.getQualifiedName();
      _builder_1.append(_qualifiedName_1, "");
      _builder_1.append(" ");
      Model _model_1 = declaration.getModel();
      String _name_1 = _model_1.getName();
      _builder_1.append(_name_1, "");
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
    Model _model = declaration.getModel();
    CharSequence _collectionName = this._nameResolver.collectionName(_model);
    _builder.append(_collectionName, "");
    _builder.append(" = models.filter(");
    ModelType _selector = declaration.getSelector();
    RegisteredRootClass _target = _selector.getTarget();
    JvmType _importedNamespace = _target.getImportedNamespace();
    String _qualifiedName = _importedNamespace.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    Model _model_1 = declaration.getModel();
    CharSequence _collectionName_1 = this._nameResolver.collectionName(_model_1);
    _builder.append(_collectionName_1, "");
    _builder.append(".forEach[");
    ModelType _selector_1 = declaration.getSelector();
    Model _model_2 = declaration.getModel();
    String _name = _model_2.getName();
    CharSequence _createSelectorQuery = this._selectorQuery.createSelectorQuery(_selector_1, _name);
    _builder.append(_createSelectorQuery, "");
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
    _builder.append(i, "");
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
    EList<Model> _sourceModels = group.getSourceModels();
    final Function1<Model, String> _function = (Model it) -> {
      String _name = it.getName();
      return ("@param " + _name);
    };
    List<String> _map = ListExtensions.<Model, String>map(_sourceModels, _function);
    String _join = IterableExtensions.join(_map, "\n");
    _builder.append(_join, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("private def executeGroup");
    _builder.append(i, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Unit> _units = group.getUnits();
    final Function1<Unit, CharSequence> _function_1 = (Unit it) -> {
      return this.createUnitExecution(it);
    };
    List<CharSequence> _map_1 = ListExtensions.<Unit, CharSequence>map(_units, _function_1);
    String _join_1 = IterableExtensions.join(_map_1);
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
      if (!_matched) {
        if (processor instanceof Generator) {
          _matched=true;
          _switchResult = this.createGeneratorExecution(((Generator)processor), unit);
        }
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
    EList<SourceModelSelector> _sourceAuxModels = generator.getSourceAuxModels();
    CharSequence _createSourceAuxModels = this.createSourceAuxModels(_sourceAuxModels);
    _builder.append(_createSourceAuxModels, "");
    _builder.newLineIfNotEmpty();
    SourceModelSelector _sourceModel = generator.getSourceModel();
    CharSequence _createSourceModelNesting = this.createSourceModelNesting(_sourceModel, generator, unit);
    _builder.append(_createSourceModelNesting, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createWeaverGeneratorExecution(final Weaver weaver, final Unit unit) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    AspectModel _aspectModel = weaver.getAspectModel();
    EList<SourceModelSelector> _sourceAuxModels = ((Generator) _aspectModel).getSourceAuxModels();
    CharSequence _createSourceAuxModels = this.createSourceAuxModels(_sourceAuxModels);
    _builder.append(_createSourceAuxModels, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    AspectModel _aspectModel_1 = weaver.getAspectModel();
    SourceModelSelector _sourceModel = ((Generator) _aspectModel_1).getSourceModel();
    CharSequence _createSourceModelNesting = this.createSourceModelNesting(_sourceModel, weaver, unit);
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
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(sourceModel);
      JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(_resolveType, _inputTypeReference);
      if (_isSubTypeOf) {
        Model _reference_1 = sourceModel.getReference();
        String _name = _reference_1.getName();
        _xifexpression_1 = this.createWeaverCall(weaver, unit, _name);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        Model _reference_2 = sourceModel.getReference();
        String _name_1 = _reference_2.getName();
        _builder.append(_name_1, "");
        ConstraintExpression _constraint = sourceModel.getConstraint();
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(_constraint);
        _builder.append(_createConstraintFilter, "");
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        NodeProperty _property = sourceModel.getProperty();
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(_property, weaver, unit, "it");
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
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(node);
      JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(_resolveType, _inputTypeReference);
      if (_isSubTypeOf) {
        _xifexpression_1 = this.createWeaverCall(weaver, unit, modelVarName);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        JvmMember _property = node.getProperty();
        String _simpleName = _property.getSimpleName();
        _builder.append(_simpleName, "");
        ConstraintExpression _constraint = node.getConstraint();
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(_constraint);
        _builder.append(_createConstraintFilter, "");
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        NodeProperty _subProperty = node.getSubProperty();
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(_subProperty, weaver, unit, "it");
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
    _builder.append(_createGeneratorCall, "");
    _builder.newLineIfNotEmpty();
    CharSequence _createWeaverInvocation = this.createWeaverInvocation(weaver, unit);
    _builder.append(_createWeaverInvocation, "");
    return _builder;
  }
  
  private CharSequence createWeaverInvocation(final Weaver weaver, final Unit unit) {
    CharSequence _xifexpression = null;
    JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
    boolean _isListType = ArchitectureTyping.isListType(_inputTypeReference);
    if (_isListType) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspectModel.forEach[");
      JvmType _reference = weaver.getReference();
      String _instanceName = this._nameResolver.getInstanceName(_reference);
      _builder.append(_instanceName, "");
      _builder.append(".weave(");
      SourceModelSelector _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      CharSequence _valueReference = this.valueReference(_resolveWeaverSourceModel);
      _builder.append(_valueReference, "");
      _builder.append(",it)]");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      JvmType _reference_1 = weaver.getReference();
      String _instanceName_1 = this._nameResolver.getInstanceName(_reference_1);
      _builder_1.append(_instanceName_1, "");
      _builder_1.append(".weave(");
      SourceModelSelector _resolveWeaverSourceModel_1 = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      CharSequence _valueReference_1 = this.valueReference(_resolveWeaverSourceModel_1);
      _builder_1.append(_valueReference_1, "");
      _builder_1.append(",aspectModel)");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence valueReference(final SourceModelSelector selector) {
    StringConcatenation _builder = new StringConcatenation();
    Model _reference = selector.getReference();
    String _name = _reference.getName();
    _builder.append(_name, "");
    NodeProperty _property = selector.getProperty();
    CharSequence _valueReference = null;
    if (_property!=null) {
      _valueReference=this.valueReference(_property);
    }
    _builder.append(_valueReference, "");
    return _builder;
  }
  
  private CharSequence valueReference(final NodeProperty property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".");
    JvmMember _property = property.getProperty();
    String _simpleName = _property.getSimpleName();
    _builder.append(_simpleName, "");
    NodeProperty _subProperty = property.getSubProperty();
    CharSequence _valueReference = null;
    if (_subProperty!=null) {
      _valueReference=this.valueReference(_subProperty);
    }
    _builder.append(_valueReference, "");
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
    Iterable<Pair<Integer, SourceModelSelector>> _indexed = IterableExtensions.<SourceModelSelector>indexed(sourceAuxModels);
    final Function1<Pair<Integer, SourceModelSelector>, CharSequence> _function = (Pair<Integer, SourceModelSelector> it) -> {
      SourceModelSelector _value = it.getValue();
      Integer _key = it.getKey();
      return this._selectorQuery.createSourceAuxModel(_value, (_key).intValue());
    };
    Iterable<CharSequence> _map = IterableExtensions.<Pair<Integer, SourceModelSelector>, CharSequence>map(_indexed, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create a generator invocation.
   */
  private CharSequence createGeneratorCall(final Generator generator, final String modelVarName) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createTargetModel = this.createTargetModel(generator);
    _builder.append(_createTargetModel, "");
    _builder.append(" ");
    JvmType _reference = generator.getReference();
    String _instanceName = this._nameResolver.getInstanceName(_reference);
    _builder.append(_instanceName, "");
    _builder.append(".generate(");
    _builder.append(modelVarName, "");
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
      TargetModel _targetModel_1 = generator.getTargetModel();
      Model _reference = _targetModel_1.getReference();
      boolean _isCollectionType = ArchitectureTyping.isCollectionType(_reference);
      if (_isCollectionType) {
        StringConcatenation _builder = new StringConcatenation();
        TargetModel _targetModel_2 = generator.getTargetModel();
        Model _reference_1 = _targetModel_2.getReference();
        String _name = _reference_1.getName();
        _builder.append(_name, "");
        _builder.append(" += ");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        TargetModel _targetModel_3 = generator.getTargetModel();
        Model _reference_2 = _targetModel_3.getReference();
        String _name_1 = _reference_2.getName();
        _builder_1.append(_name_1, "");
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
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(sourceModel);
      JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(_resolveType, _inputTypeReference);
      if (_isSubTypeOf) {
        Model _reference_1 = sourceModel.getReference();
        String _name = _reference_1.getName();
        _xifexpression_1 = this.createGeneratorCall(generator, _name);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        Model _reference_2 = sourceModel.getReference();
        String _name_1 = _reference_2.getName();
        _builder.append(_name_1, "");
        ConstraintExpression _constraint = sourceModel.getConstraint();
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(_constraint);
        _builder.append(_createConstraintFilter, "");
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        NodeProperty _property = sourceModel.getProperty();
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(_property, generator, unit, "it");
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
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(node);
      JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(_resolveType, _inputTypeReference);
      if (_isSubTypeOf) {
        _xifexpression_1 = this.createGeneratorCall(generator, modelVarName);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        JvmMember _property = node.getProperty();
        String _simpleName = _property.getSimpleName();
        _builder.append(_simpleName, "");
        ConstraintExpression _constraint = node.getConstraint();
        CharSequence _createConstraintFilter = this._selectorQuery.createConstraintFilter(_constraint);
        _builder.append(_createConstraintFilter, "");
        _builder.append(".forEach[");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        NodeProperty _subProperty = node.getSubProperty();
        CharSequence _createSourceModelNesting = this.createSourceModelNesting(_subProperty, generator, unit, "it");
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
