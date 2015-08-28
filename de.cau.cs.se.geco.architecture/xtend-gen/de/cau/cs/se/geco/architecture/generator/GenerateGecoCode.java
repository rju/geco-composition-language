package de.cau.cs.se.geco.architecture.generator;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral;
import de.cau.cs.se.geco.architecture.architecture.Comparator;
import de.cau.cs.se.geco.architecture.architecture.CompareExpression;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.IntLiteral;
import de.cau.cs.se.geco.architecture.architecture.Literal;
import de.cau.cs.se.geco.architecture.architecture.LogicOperator;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelModifier;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Negation;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.StringLiteral;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Typeof;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateGecoCode implements IGenerator<BoxingModel, CharSequence> {
  private String className;
  
  public GenerateGecoCode(final String className) {
    this.className = className;
  }
  
  @Override
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
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    Model _derivedFrom_1 = input.getDerivedFrom();
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
      MetamodelModifier _modifier = it.getModifier();
      return Boolean.valueOf(Objects.equal(_modifier, MetamodelModifier.INPUT));
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
    String _instanceName = this.getInstanceName(type);
    _builder.append(_instanceName, "");
    _builder.append(" = new ");
    String _simpleName = type.getSimpleName();
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
      Metamodel _metamodel = declaration.getMetamodel();
      String _name = _metamodel.getName();
      _builder.append(_name, "");
      _builder.append(" = new ArrayList<");
      ModelNodeType _selector = declaration.getSelector();
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
      ModelNodeType _selector_1 = declaration.getSelector();
      JvmTypeReference _resolveType_1 = ArchitectureTyping.resolveType(_selector_1);
      JvmType _determineElementType_1 = ArchitectureTyping.determineElementType(_resolveType_1);
      String _qualifiedName_1 = _determineElementType_1.getQualifiedName();
      _builder_1.append(_qualifiedName_1, "");
      _builder_1.append(" ");
      Metamodel _metamodel_1 = declaration.getMetamodel();
      String _name_1 = _metamodel_1.getName();
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
    Metamodel _metamodel = declaration.getMetamodel();
    CharSequence _collectionName = this.collectionName(_metamodel);
    _builder.append(_collectionName, "");
    _builder.append(" = models.filter(");
    ModelNodeType _selector = declaration.getSelector();
    RegisteredPackage _target = _selector.getTarget();
    JvmType _importedNamespace = _target.getImportedNamespace();
    String _qualifiedName = _importedNamespace.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    Metamodel _metamodel_1 = declaration.getMetamodel();
    CharSequence _collectionName_1 = this.collectionName(_metamodel_1);
    _builder.append(_collectionName_1, "");
    _builder.append(".forEach[");
    ModelNodeType _selector_1 = declaration.getSelector();
    Metamodel _metamodel_2 = declaration.getMetamodel();
    String _name = _metamodel_2.getName();
    CharSequence _createSelectorQuery = this.createSelectorQuery(_selector_1, _name);
    _builder.append(_createSelectorQuery, "");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Process a node type selector query. If no property is set only add an instance of type to the model list.
   * If the property has a list type iterate over the property (one more for each).
   * If the property has a flat type only add the single value.
   */
  private CharSequence createSelectorQuery(final ModelNodeType type, final String modelName) {
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
    EList<Metamodel> _sourceModels = group.getSourceModels();
    final Function1<Metamodel, String> _function = (Metamodel it) -> {
      String _name = it.getName();
      return ("@param " + _name);
    };
    List<String> _map = ListExtensions.<Metamodel, String>map(_sourceModels, _function);
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
      final Processor processor = unit.getProcessor();
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
          if ((_aspectModel instanceof TargetModelNodeType)) {
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
    EList<SourceModelNodeSelector> _sourceAuxModels = generator.getSourceAuxModels();
    CharSequence _createSourceAuxModels = this.createSourceAuxModels(_sourceAuxModels);
    _builder.append(_createSourceAuxModels, "");
    _builder.newLineIfNotEmpty();
    SourceModelNodeSelector _sourceModel = generator.getSourceModel();
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
    EList<SourceModelNodeSelector> _sourceAuxModels = ((Generator) _aspectModel).getSourceAuxModels();
    CharSequence _createSourceAuxModels = this.createSourceAuxModels(_sourceAuxModels);
    _builder.append(_createSourceAuxModels, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    AspectModel _aspectModel_1 = weaver.getAspectModel();
    SourceModelNodeSelector _sourceModel = ((Generator) _aspectModel_1).getSourceModel();
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
  private CharSequence createSourceModelNesting(final SourceModelNodeSelector sourceModel, final Weaver weaver, final Unit unit) {
    CharSequence _xifexpression = null;
    Metamodel _reference = sourceModel.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      _xifexpression = this.createWeaverCall(weaver, unit, "null");
    } else {
      CharSequence _xifexpression_1 = null;
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(sourceModel);
      JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(_resolveType, _inputTypeReference);
      if (_isSubTypeOf) {
        Metamodel _reference_1 = sourceModel.getReference();
        String _name = _reference_1.getName();
        _xifexpression_1 = this.createWeaverCall(weaver, unit, _name);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        Metamodel _reference_2 = sourceModel.getReference();
        String _name_1 = _reference_2.getName();
        _builder.append(_name_1, "");
        ConstraintExpression _constraint = sourceModel.getConstraint();
        CharSequence _createConstraintFilter = this.createConstraintFilter(_constraint);
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
        CharSequence _createConstraintFilter = this.createConstraintFilter(_constraint);
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
      String _instanceName = this.getInstanceName(_reference);
      _builder.append(_instanceName, "");
      _builder.append(".weave(");
      SourceModelNodeSelector _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      CharSequence _valueReference = this.valueReference(_resolveWeaverSourceModel);
      _builder.append(_valueReference, "");
      _builder.append(",it)]");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      JvmType _reference_1 = weaver.getReference();
      String _instanceName_1 = this.getInstanceName(_reference_1);
      _builder_1.append(_instanceName_1, "");
      _builder_1.append(".weave(");
      SourceModelNodeSelector _resolveWeaverSourceModel_1 = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      CharSequence _valueReference_1 = this.valueReference(_resolveWeaverSourceModel_1);
      _builder_1.append(_valueReference_1, "");
      _builder_1.append(",aspectModel)");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence valueReference(final SourceModelNodeSelector selector) {
    StringConcatenation _builder = new StringConcatenation();
    Metamodel _reference = selector.getReference();
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
  private CharSequence createSourceAuxModels(final EList<SourceModelNodeSelector> sourceAuxModels) {
    StringConcatenation _builder = new StringConcatenation();
    Iterable<Pair<Integer, SourceModelNodeSelector>> _indexed = IterableExtensions.<SourceModelNodeSelector>indexed(sourceAuxModels);
    final Function1<Pair<Integer, SourceModelNodeSelector>, CharSequence> _function = (Pair<Integer, SourceModelNodeSelector> it) -> {
      SourceModelNodeSelector _value = it.getValue();
      Integer _key = it.getKey();
      return this.createSourceAuxModel(_value, (_key).intValue());
    };
    Iterable<CharSequence> _map = IterableExtensions.<Pair<Integer, SourceModelNodeSelector>, CharSequence>map(_indexed, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create an initialization section for an auxiliary model collection.
   */
  private CharSequence createSourceAuxModel(final SourceModelNodeSelector sourceAuxModel, final int i) {
    CharSequence _xifexpression = null;
    NodeProperty _property = sourceAuxModel.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val aux");
      _builder.append(i, "");
      _builder.append(" = ");
      Metamodel _reference = sourceAuxModel.getReference();
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
      Metamodel _reference_1 = sourceAuxModel.getReference();
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
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final SourceModelNodeSelector sourceModel, final Generator generator, final Unit unit) {
    CharSequence _xifexpression = null;
    Metamodel _reference = sourceModel.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      _xifexpression = this.createGeneratorCall(generator, "null");
    } else {
      CharSequence _xifexpression_1 = null;
      JvmTypeReference _resolveType = ArchitectureTyping.resolveType(sourceModel);
      JvmTypeReference _inputTypeReference = unit.getInputTypeReference();
      boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(_resolveType, _inputTypeReference);
      if (_isSubTypeOf) {
        Metamodel _reference_1 = sourceModel.getReference();
        String _name = _reference_1.getName();
        _xifexpression_1 = this.createGeneratorCall(generator, _name);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        Metamodel _reference_2 = sourceModel.getReference();
        String _name_1 = _reference_2.getName();
        _builder.append(_name_1, "");
        ConstraintExpression _constraint = sourceModel.getConstraint();
        CharSequence _createConstraintFilter = this.createConstraintFilter(_constraint);
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
        CharSequence _createConstraintFilter = this.createConstraintFilter(_constraint);
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
  
  /**
   * Create a generator invocation.
   */
  private CharSequence createGeneratorCall(final Generator generator, final String modelVarName) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createTargetModel = this.createTargetModel(generator);
    _builder.append(_createTargetModel, "");
    _builder.append(" ");
    JvmType _reference = generator.getReference();
    String _instanceName = this.getInstanceName(_reference);
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
    TargetModelNodeType _targetModel = generator.getTargetModel();
    Metamodel _reference = _targetModel.getReference();
    boolean _notEquals = (!Objects.equal(_reference, null));
    if (_notEquals) {
      CharSequence _xifexpression_1 = null;
      TargetModelNodeType _targetModel_1 = generator.getTargetModel();
      Metamodel _reference_1 = _targetModel_1.getReference();
      boolean _isCollectionType = ArchitectureTyping.isCollectionType(_reference_1);
      if (_isCollectionType) {
        StringConcatenation _builder = new StringConcatenation();
        TargetModelNodeType _targetModel_2 = generator.getTargetModel();
        Metamodel _reference_2 = _targetModel_2.getReference();
        String _name = _reference_2.getName();
        _builder.append(_name, "");
        _builder.append(" += ");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        TargetModelNodeType _targetModel_3 = generator.getTargetModel();
        Metamodel _reference_3 = _targetModel_3.getReference();
        String _name_1 = _reference_3.getName();
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
   * Create a constraint filter for a query if a filter is defined.
   */
  private CharSequence createConstraintFilter(final ConstraintExpression expression) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      if ((expression instanceof Typeof)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(".filter(");
        JvmType _type = ((Typeof)expression).getType();
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
  
  private String getInstanceName(final JvmType type) {
    String _simpleName = type.getSimpleName();
    return StringExtensions.toFirstLower(_simpleName);
  }
  
  /**
   * Name of internal collections for models for a specific metamodel.
   */
  private CharSequence collectionName(final Metamodel metamodel) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = metamodel.getName();
    _builder.append(_name, "");
    _builder.append("BaseCollection");
    return _builder;
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
