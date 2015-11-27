package de.cau.cs.se.geco.architecture.generator;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelModifier;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.ModelSequence;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.TargetTraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GenerateBoxingModel implements IGenerator<GecoModel, BoxingModel> {
  @Override
  public BoxingModel generate(final GecoModel input) {
    final BoxingModel result = BoxingFactory.eINSTANCE.createBoxingModel();
    result.setDerivedFrom(input);
    EList<ModelSequence> _models = input.getModels();
    final Consumer<ModelSequence> _function = (ModelSequence sequence) -> {
      EList<Model> _models_1 = sequence.getModels();
      final Consumer<Model> _function_1 = (Model model) -> {
        final ModelDeclaration modeldeclaration = BoxingFactory.eINSTANCE.createModelDeclaration();
        ModelNodeType _type = sequence.getType();
        modeldeclaration.setSelector(_type);
        modeldeclaration.setModel(model);
        ModelModifier _modifier = sequence.getModifier();
        modeldeclaration.setModifier(_modifier);
        EList<ModelDeclaration> _models_2 = result.getModels();
        _models_2.add(modeldeclaration);
      };
      _models_1.forEach(_function_1);
    };
    _models.forEach(_function);
    final ArrayList<Unit> units = new ArrayList<Unit>();
    EList<Fragment> _fragments = input.getFragments();
    final Consumer<Fragment> _function_1 = (Fragment fragment) -> {
      boolean _matched = false;
      if (!_matched) {
        if (fragment instanceof Generator) {
          _matched=true;
          Unit _createGenerator = this.createGenerator(((Generator)fragment));
          units.add(_createGenerator);
        }
      }
      if (!_matched) {
        if (fragment instanceof Weaver) {
          AspectModel _aspectModel = ((Weaver)fragment).getAspectModel();
          if ((_aspectModel instanceof Generator)) {
            _matched=true;
            Unit _createGenerator = this.createGenerator(((Weaver)fragment));
            units.add(_createGenerator);
            EList<JvmType> _allProcessors = result.getAllProcessors();
            AspectModel _aspectModel_1 = ((Weaver)fragment).getAspectModel();
            JvmType _reference = ((Generator) _aspectModel_1).getReference();
            this.addUniqueType(_allProcessors, _reference);
          }
        }
      }
      if (!_matched) {
        if (fragment instanceof Weaver) {
          AspectModel _aspectModel = ((Weaver)fragment).getAspectModel();
          boolean _equals = Objects.equal(_aspectModel, null);
          if (_equals) {
            _matched=true;
            Unit _createWeaver = this.createWeaver(((Weaver)fragment));
            units.add(_createWeaver);
          }
        }
      }
      EList<JvmType> _allProcessors = result.getAllProcessors();
      JvmType _reference = fragment.getReference();
      this.addUniqueType(_allProcessors, _reference);
    };
    _fragments.forEach(_function_1);
    EList<ModelSequence> _models_1 = input.getModels();
    Group group = this.createGroup(_models_1);
    EList<Group> _groups = result.getGroups();
    _groups.add(group);
    while ((units.size() > 0)) {
      {
        for (int i = 0; (i < units.size()); i++) {
          {
            final Unit unit = units.get(i);
            boolean _matchGroup = this.matchGroup(unit, group);
            if (_matchGroup) {
              units.remove(i);
              EList<Unit> _units = group.getUnits();
              _units.add(unit);
              i--;
            }
          }
        }
        int _size = units.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          Group _createGroup = this.createGroup(group);
          group = _createGroup;
          EList<Group> _groups_1 = result.getGroups();
          _groups_1.add(group);
        }
      }
    }
    System.out.println("start");
    final Consumer<Unit> _function_2 = (Unit unit) -> {
      this.print(unit);
    };
    units.forEach(_function_2);
    EList<Group> _groups_1 = result.getGroups();
    final Consumer<Group> _function_3 = (Group it) -> {
      this.print(it);
      EList<Unit> _units = it.getUnits();
      final Consumer<Unit> _function_4 = (Unit unit) -> {
        this.print(unit);
      };
      _units.forEach(_function_4);
    };
    _groups_1.forEach(_function_3);
    return result;
  }
  
  private void print(final Group group) {
    System.out.println("group");
    EList<TraceModel> _sourceTraceModels = group.getSourceTraceModels();
    final Function1<TraceModel, String> _function = (TraceModel it) -> {
      TraceModel _determineTraceModel = this.determineTraceModel(it);
      return _determineTraceModel.getName();
    };
    List<String> _map = ListExtensions.<TraceModel, String>map(_sourceTraceModels, _function);
    String _join = IterableExtensions.join(_map, ", ");
    String _plus = ("\tread " + _join);
    System.out.println(_plus);
  }
  
  private void print(final Unit unit) {
    final Fragment processor = unit.getFragment();
    boolean _matched = false;
    if (!_matched) {
      if (processor instanceof Generator) {
        _matched=true;
        JvmType _reference = ((Generator)processor).getReference();
        String _qualifiedName = _reference.getQualifiedName();
        String _plus = ("\tG " + _qualifiedName);
        System.out.print(_plus);
        TargetTraceModel _targetTraceModel = ((Generator)processor).getTargetTraceModel();
        boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
        if (_notEquals) {
          TargetTraceModel _targetTraceModel_1 = ((Generator)processor).getTargetTraceModel();
          TraceModel _determineTraceModel = this.determineTraceModel(_targetTraceModel_1);
          String _name = _determineTraceModel.getName();
          String _plus_1 = (" write " + _name);
          System.out.print(_plus_1);
        }
        EList<TraceModelReference> _sourceTraceModels = ((Generator)processor).getSourceTraceModels();
        boolean _notEquals_1 = (!Objects.equal(_sourceTraceModels, null));
        if (_notEquals_1) {
          EList<TraceModelReference> _sourceTraceModels_1 = ((Generator)processor).getSourceTraceModels();
          final Function1<TraceModelReference, String> _function = (TraceModelReference it) -> {
            TraceModel _determineTraceModel_1 = this.determineTraceModel(it);
            return _determineTraceModel_1.getName();
          };
          List<String> _map = ListExtensions.<TraceModelReference, String>map(_sourceTraceModels_1, _function);
          String _join = IterableExtensions.join(_map, ", ");
          String _plus_2 = (" read " + _join);
          System.out.print(_plus_2);
        }
        System.out.println();
      }
    }
    if (!_matched) {
      if (processor instanceof Weaver) {
        _matched=true;
        JvmType _reference = ((Weaver)processor).getReference();
        String _qualifiedName = _reference.getQualifiedName();
        String _plus = ("\tW " + _qualifiedName);
        System.out.println(_plus);
      }
    }
  }
  
  /**
   * Check if the given group provides the necessary inputs for the unit.
   */
  private boolean matchGroup(final Unit unit, final Group group) {
    boolean _and = false;
    EList<Model> _sourceModels = unit.getSourceModels();
    final Function1<Model, Boolean> _function = (Model unitMM) -> {
      EList<Model> _sourceModels_1 = group.getSourceModels();
      final Function1<Model, Boolean> _function_1 = (Model it) -> {
        return Boolean.valueOf(it.equals(unitMM));
      };
      return Boolean.valueOf(IterableExtensions.<Model>exists(_sourceModels_1, _function_1));
    };
    boolean _forall = IterableExtensions.<Model>forall(_sourceModels, _function);
    if (!_forall) {
      _and = false;
    } else {
      EList<TraceModel> _sourceTraceModels = unit.getSourceTraceModels();
      final Function1<TraceModel, Boolean> _function_1 = (TraceModel unitTR) -> {
        EList<TraceModel> _sourceTraceModels_1 = group.getSourceTraceModels();
        final Function1<TraceModel, Boolean> _function_2 = (TraceModel it) -> {
          return Boolean.valueOf(it.equals(unitTR));
        };
        return Boolean.valueOf(IterableExtensions.<TraceModel>exists(_sourceTraceModels_1, _function_2));
      };
      boolean _forall_1 = IterableExtensions.<TraceModel>forall(_sourceTraceModels, _function_1);
      _and = _forall_1;
    }
    return _and;
  }
  
  /**
   * Create a new group based on a sequence of free metamodels.
   */
  private Group createGroup(final EList<ModelSequence> metamodels) {
    final Group group = BoxingFactory.eINSTANCE.createGroup();
    final Consumer<ModelSequence> _function = (ModelSequence sequence) -> {
      ModelModifier _modifier = sequence.getModifier();
      boolean _equals = Objects.equal(_modifier, ModelModifier.INPUT);
      if (_equals) {
        EList<Model> _models = sequence.getModels();
        final Consumer<Model> _function_1 = (Model it) -> {
          EList<Model> _sourceModels = group.getSourceModels();
          _sourceModels.add(it);
        };
        _models.forEach(_function_1);
      }
    };
    metamodels.forEach(_function);
    return group;
  }
  
  /**
   * Create a new group based on the previous groups inputs and all outputs of its units.
   */
  private Group createGroup(final Group oldGroup) {
    final Group group = BoxingFactory.eINSTANCE.createGroup();
    EList<Model> _sourceModels = group.getSourceModels();
    EList<Model> _sourceModels_1 = oldGroup.getSourceModels();
    _sourceModels.addAll(_sourceModels_1);
    EList<TraceModel> _sourceTraceModels = group.getSourceTraceModels();
    EList<TraceModel> _sourceTraceModels_1 = oldGroup.getSourceTraceModels();
    _sourceTraceModels.addAll(_sourceTraceModels_1);
    EList<Unit> _units = oldGroup.getUnits();
    final Consumer<Unit> _function = (Unit unit) -> {
      EList<Model> _sourceModels_2 = group.getSourceModels();
      Model _targetModel = unit.getTargetModel();
      this.addUnique(_sourceModels_2, _targetModel);
      TraceModel _targetTraceModel = unit.getTargetTraceModel();
      boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
      if (_notEquals) {
        EList<TraceModel> _sourceTraceModels_2 = group.getSourceTraceModels();
        TraceModel _targetTraceModel_1 = unit.getTargetTraceModel();
        this.addUnique(_sourceTraceModels_2, _targetTraceModel_1);
      }
    };
    _units.forEach(_function);
    return group;
  }
  
  /**
   * create a unit node for a generator.
   */
  private Unit createGenerator(final Generator generator) {
    final Unit result = BoxingFactory.eINSTANCE.createUnit();
    result.setFragment(generator);
    SourceModelNodeSelector _sourceModel = generator.getSourceModel();
    Model _reference = _sourceModel.getReference();
    boolean _notEquals = (!Objects.equal(_reference, null));
    if (_notEquals) {
      EList<Model> _sourceModels = result.getSourceModels();
      SourceModelNodeSelector _sourceModel_1 = generator.getSourceModel();
      Model _reference_1 = _sourceModel_1.getReference();
      _sourceModels.add(_reference_1);
    }
    EList<SourceModelNodeSelector> _sourceAuxModels = generator.getSourceAuxModels();
    final Consumer<SourceModelNodeSelector> _function = (SourceModelNodeSelector model) -> {
      EList<Model> _sourceModels_1 = result.getSourceModels();
      Model _reference_2 = model.getReference();
      this.addUnique(_sourceModels_1, _reference_2);
    };
    _sourceAuxModels.forEach(_function);
    EList<TraceModel> _sourceTraceModels = result.getSourceTraceModels();
    EList<TraceModelReference> _sourceTraceModels_1 = generator.getSourceTraceModels();
    this.addAllUnique(_sourceTraceModels, _sourceTraceModels_1);
    TargetModelNodeType _targetModel = generator.getTargetModel();
    Model _reference_2 = _targetModel.getReference();
    result.setTargetModel(_reference_2);
    TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
    boolean _notEquals_1 = (!Objects.equal(_targetTraceModel, null));
    if (_notEquals_1) {
      TargetTraceModel _targetTraceModel_1 = generator.getTargetTraceModel();
      TraceModel _determineTraceModel = this.determineTraceModel(_targetTraceModel_1);
      result.setTargetTraceModel(_determineTraceModel);
    } else {
      result.setTargetTraceModel(null);
    }
    JvmType _reference_3 = generator.getReference();
    if ((_reference_3 instanceof JvmGenericType)) {
      JvmType _reference_4 = generator.getReference();
      final JvmGenericType type = ((JvmGenericType) _reference_4);
      JvmTypeReference _determineGeneratorInputType = ArchitectureTyping.determineGeneratorInputType(type);
      result.setInputTypeReference(_determineGeneratorInputType);
      JvmTypeReference _determineGeneratorOutputType = ArchitectureTyping.determineGeneratorOutputType(type);
      result.setOutputTypeReference(_determineGeneratorOutputType);
      Map<String, JvmTypeReference> _determineGeneratorAuxTypes = ArchitectureTyping.determineGeneratorAuxTypes(type);
      result.setAuxiliaryInputTypeMap(_determineGeneratorAuxTypes);
    }
    return result;
  }
  
  /**
   * create a unit node for a weaver-generator combination.
   */
  private Unit createGenerator(final Weaver weaver) {
    final Unit result = BoxingFactory.eINSTANCE.createUnit();
    result.setFragment(weaver);
    AspectModel _aspectModel = weaver.getAspectModel();
    final Generator generator = ((Generator) _aspectModel);
    EList<Model> _sourceModels = result.getSourceModels();
    SourceModelNodeSelector _sourceModel = generator.getSourceModel();
    Model _reference = _sourceModel.getReference();
    _sourceModels.add(_reference);
    EList<SourceModelNodeSelector> _sourceAuxModels = generator.getSourceAuxModels();
    final Consumer<SourceModelNodeSelector> _function = (SourceModelNodeSelector model) -> {
      EList<Model> _sourceModels_1 = result.getSourceModels();
      Model _reference_1 = model.getReference();
      this.addUnique(_sourceModels_1, _reference_1);
    };
    _sourceAuxModels.forEach(_function);
    EList<TraceModel> _sourceTraceModels = result.getSourceTraceModels();
    EList<TraceModelReference> _sourceTraceModels_1 = generator.getSourceTraceModels();
    this.addAllUnique(_sourceTraceModels, _sourceTraceModels_1);
    SourceModelNodeSelector _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
    Model _reference_1 = _resolveWeaverSourceModel.getReference();
    result.setTargetModel(_reference_1);
    EList<Model> _sourceModels_1 = result.getSourceModels();
    Model _targetModel = result.getTargetModel();
    this.addUnique(_sourceModels_1, _targetModel);
    TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
    boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
    if (_notEquals) {
      TargetTraceModel _targetTraceModel_1 = generator.getTargetTraceModel();
      TraceModel _determineTraceModel = this.determineTraceModel(_targetTraceModel_1);
      result.setTargetTraceModel(_determineTraceModel);
    } else {
      result.setTargetTraceModel(null);
    }
    JvmType _reference_2 = generator.getReference();
    if ((_reference_2 instanceof JvmGenericType)) {
      JvmType _reference_3 = generator.getReference();
      final JvmGenericType type = ((JvmGenericType) _reference_3);
      JvmTypeReference _determineGeneratorInputType = ArchitectureTyping.determineGeneratorInputType(type);
      result.setInputTypeReference(_determineGeneratorInputType);
      JvmTypeReference _determineGeneratorOutputType = ArchitectureTyping.determineGeneratorOutputType(type);
      result.setOutputTypeReference(_determineGeneratorOutputType);
      Map<String, JvmTypeReference> _determineGeneratorAuxTypes = ArchitectureTyping.determineGeneratorAuxTypes(type);
      result.setAuxiliaryInputTypeMap(_determineGeneratorAuxTypes);
    }
    return result;
  }
  
  /**
   * create a unit node for a weaver.
   */
  private Unit createWeaver(final Weaver weaver) {
    final Unit result = BoxingFactory.eINSTANCE.createUnit();
    result.setFragment(weaver);
    EList<Model> _sourceModels = result.getSourceModels();
    SourceModelNodeSelector _sourceModel = weaver.getSourceModel();
    Model _reference = _sourceModel.getReference();
    _sourceModels.add(_reference);
    EList<Model> _sourceModels_1 = result.getSourceModels();
    AspectModel _aspectModel = weaver.getAspectModel();
    Model _reference_1 = ((TargetModelNodeType) _aspectModel).getReference();
    _sourceModels_1.add(_reference_1);
    SourceModelNodeSelector _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
    Model _reference_2 = _resolveWeaverSourceModel.getReference();
    result.setTargetModel(_reference_2);
    result.setTargetTraceModel(null);
    return result;
  }
  
  /**
   * Determine the trace model.
   */
  private TraceModel determineTraceModel(final TargetTraceModel model) {
    TraceModel _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (model instanceof TraceModel) {
        _matched=true;
        _switchResult = ((TraceModel)model);
      }
    }
    if (!_matched) {
      if (model instanceof TraceModelReference) {
        _matched=true;
        _switchResult = ((TraceModelReference)model).getTraceModel();
      }
    }
    if (!_matched) {
      throw new UnsupportedOperationException("what???");
    }
    return _switchResult;
  }
  
  /**
   * Add a list of trace model to a trace model list. Check for each element if it is
   * already in the list. If so do not add it again.
   */
  private void addAllUnique(final EList<TraceModel> list, final EList<TraceModelReference> insert) {
    final Consumer<TraceModelReference> _function = (TraceModelReference it) -> {
      TraceModel _traceModel = it.getTraceModel();
      this.addUnique(list, _traceModel);
    };
    insert.forEach(_function);
  }
  
  /**
   * Add a write trace model if it is not already in the list.
   */
  private void addUnique(final EList<TraceModel> list, final TraceModel model) {
    boolean _contains = list.contains(model);
    boolean _not = (!_contains);
    if (_not) {
      list.add(model);
    }
  }
  
  /**
   * Add a write trace model if it is not already in the list.
   */
  private void addUnique(final EList<Model> list, final Model model) {
    boolean _contains = list.contains(model);
    boolean _not = (!_contains);
    if (_not) {
      list.add(model);
    }
  }
  
  /**
   * Add a JvmType to a list if it is not already listed.
   */
  private void addUniqueType(final EList<JvmType> list, final JvmType type) {
    boolean _contains = list.contains(type);
    boolean _not = (!_contains);
    if (_not) {
      list.add(type);
    }
  }
}
