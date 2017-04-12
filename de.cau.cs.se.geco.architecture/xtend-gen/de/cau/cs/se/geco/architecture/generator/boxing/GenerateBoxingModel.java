package de.cau.cs.se.geco.architecture.generator.boxing;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelModifier;
import de.cau.cs.se.geco.architecture.architecture.ModelSequence;
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModel;
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
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GenerateBoxingModel implements IGenerator<GecoModel, BoxingModel> {
  @Override
  public BoxingModel generate(final GecoModel input) {
    final BoxingModel result = BoxingFactory.eINSTANCE.createBoxingModel();
    result.setDerivedFrom(input);
    final Consumer<ModelSequence> _function = (ModelSequence sequence) -> {
      final Consumer<Model> _function_1 = (Model model) -> {
        final ModelDeclaration modeldeclaration = BoxingFactory.eINSTANCE.createModelDeclaration();
        modeldeclaration.setSelector(sequence.getType());
        modeldeclaration.setModel(model);
        modeldeclaration.setModifier(sequence.getModifier());
        result.getModels().add(modeldeclaration);
      };
      sequence.getModels().forEach(_function_1);
    };
    input.getModels().forEach(_function);
    final ArrayList<Unit> units = new ArrayList<Unit>();
    final Consumer<Fragment> _function_1 = (Fragment fragment) -> {
      boolean _matched = false;
      if (fragment instanceof Generator) {
        _matched=true;
        units.add(this.createGenerator(((Generator)fragment)));
      }
      if (!_matched) {
        if (fragment instanceof Weaver) {
          AspectModel _aspectModel = ((Weaver)fragment).getAspectModel();
          if ((_aspectModel instanceof Generator)) {
            _matched=true;
            units.add(this.createGenerator(((Weaver)fragment)));
            AspectModel _aspectModel_1 = ((Weaver)fragment).getAspectModel();
            this.addUniqueType(result.getAllProcessors(), ((Generator) _aspectModel_1).getReference());
          }
        }
      }
      if (!_matched) {
        if (fragment instanceof Weaver) {
          AspectModel _aspectModel = ((Weaver)fragment).getAspectModel();
          boolean _equals = Objects.equal(_aspectModel, null);
          if (_equals) {
            _matched=true;
            units.add(this.createWeaver(((Weaver)fragment)));
          }
        }
      }
      this.addUniqueType(result.getAllProcessors(), fragment.getReference());
    };
    input.getFragments().forEach(_function_1);
    Group group = this.createGroup(input.getModels());
    result.getGroups().add(group);
    while ((units.size() > 0)) {
      {
        for (int i = 0; (i < units.size()); i++) {
          {
            final Unit unit = units.get(i);
            boolean _matchGroup = this.matchGroup(unit, group);
            if (_matchGroup) {
              units.remove(i);
              group.getUnits().add(unit);
              i--;
            }
          }
        }
        int _size = units.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          group = this.createGroup(group);
          result.getGroups().add(group);
        }
      }
    }
    System.out.println("start");
    final Consumer<Unit> _function_2 = (Unit unit) -> {
      this.print(unit);
    };
    units.forEach(_function_2);
    final Consumer<Group> _function_3 = (Group it) -> {
      this.print(it);
      final Consumer<Unit> _function_4 = (Unit unit) -> {
        this.print(unit);
      };
      it.getUnits().forEach(_function_4);
    };
    result.getGroups().forEach(_function_3);
    return result;
  }
  
  private void print(final Group group) {
    System.out.println("group");
    final Function1<TraceModel, String> _function = (TraceModel it) -> {
      return this.determineTraceModel(it).getName();
    };
    String _join = IterableExtensions.join(ListExtensions.<TraceModel, String>map(group.getSourceTraceModels(), _function), ", ");
    String _plus = ("\tread " + _join);
    System.out.println(_plus);
  }
  
  private void print(final Unit unit) {
    final Fragment processor = unit.getFragment();
    boolean _matched = false;
    if (processor instanceof Generator) {
      _matched=true;
      String _qualifiedName = ((Generator)processor).getReference().getQualifiedName();
      String _plus = ("\tG " + _qualifiedName);
      System.out.print(_plus);
      TargetTraceModel _targetTraceModel = ((Generator)processor).getTargetTraceModel();
      boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
      if (_notEquals) {
        String _name = this.determineTraceModel(((Generator)processor).getTargetTraceModel()).getName();
        String _plus_1 = (" write " + _name);
        System.out.print(_plus_1);
      }
      EList<TraceModelReference> _sourceTraceModels = ((Generator)processor).getSourceTraceModels();
      boolean _notEquals_1 = (!Objects.equal(_sourceTraceModels, null));
      if (_notEquals_1) {
        final Function1<TraceModelReference, String> _function = (TraceModelReference it) -> {
          return this.determineTraceModel(it).getName();
        };
        String _join = IterableExtensions.join(ListExtensions.<TraceModelReference, String>map(((Generator)processor).getSourceTraceModels(), _function), ", ");
        String _plus_2 = (" read " + _join);
        System.out.print(_plus_2);
      }
      System.out.println();
    }
    if (!_matched) {
      if (processor instanceof Weaver) {
        _matched=true;
        String _qualifiedName = ((Weaver)processor).getReference().getQualifiedName();
        String _plus = ("\tW " + _qualifiedName);
        System.out.println(_plus);
      }
    }
  }
  
  /**
   * Check if the given group provides the necessary inputs for the unit.
   */
  private boolean matchGroup(final Unit unit, final Group group) {
    return (IterableExtensions.<Model>forall(unit.getSourceModels(), ((Function1<Model, Boolean>) (Model unitMM) -> {
      final Function1<Model, Boolean> _function = (Model it) -> {
        return Boolean.valueOf(it.equals(unitMM));
      };
      return Boolean.valueOf(IterableExtensions.<Model>exists(group.getSourceModels(), _function));
    })) && 
      IterableExtensions.<TraceModel>forall(unit.getSourceTraceModels(), ((Function1<TraceModel, Boolean>) (TraceModel unitTR) -> {
        final Function1<TraceModel, Boolean> _function = (TraceModel it) -> {
          return Boolean.valueOf(it.equals(unitTR));
        };
        return Boolean.valueOf(IterableExtensions.<TraceModel>exists(group.getSourceTraceModels(), _function));
      })));
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
        final Consumer<Model> _function_1 = (Model it) -> {
          group.getSourceModels().add(it);
        };
        sequence.getModels().forEach(_function_1);
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
    group.getSourceModels().addAll(oldGroup.getSourceModels());
    group.getSourceTraceModels().addAll(oldGroup.getSourceTraceModels());
    final Consumer<Unit> _function = (Unit unit) -> {
      this.addUnique(group.getSourceModels(), unit.getTargetModel());
      TraceModel _targetTraceModel = unit.getTargetTraceModel();
      boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
      if (_notEquals) {
        this.addUnique(group.getSourceTraceModels(), unit.getTargetTraceModel());
      }
    };
    oldGroup.getUnits().forEach(_function);
    return group;
  }
  
  /**
   * create a unit node for a generator.
   */
  private Unit createGenerator(final Generator generator) {
    final Unit result = BoxingFactory.eINSTANCE.createUnit();
    result.setFragment(generator);
    Model _reference = generator.getSourceModel().getReference();
    boolean _notEquals = (!Objects.equal(_reference, null));
    if (_notEquals) {
      result.getSourceModels().add(generator.getSourceModel().getReference());
    }
    final Consumer<SourceModelSelector> _function = (SourceModelSelector model) -> {
      this.addUnique(result.getSourceModels(), model.getReference());
    };
    generator.getSourceAuxModels().forEach(_function);
    this.addAllUnique(result.getSourceTraceModels(), generator.getSourceTraceModels());
    result.setTargetModel(generator.getTargetModel().getReference());
    TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
    boolean _notEquals_1 = (!Objects.equal(_targetTraceModel, null));
    if (_notEquals_1) {
      result.setTargetTraceModel(this.determineTraceModel(generator.getTargetTraceModel()));
    } else {
      result.setTargetTraceModel(null);
    }
    JvmType _reference_1 = generator.getReference();
    if ((_reference_1 instanceof JvmGenericType)) {
      JvmType _reference_2 = generator.getReference();
      final JvmGenericType type = ((JvmGenericType) _reference_2);
      result.setInputTypeReference(ArchitectureTyping.determineGeneratorInputType(type));
      result.setOutputTypeReference(ArchitectureTyping.determineGeneratorOutputType(type));
      result.setAuxiliaryInputTypeMap(ArchitectureTyping.determineGeneratorAuxTypes(type));
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
    result.getSourceModels().add(generator.getSourceModel().getReference());
    final Consumer<SourceModelSelector> _function = (SourceModelSelector model) -> {
      this.addUnique(result.getSourceModels(), model.getReference());
    };
    generator.getSourceAuxModels().forEach(_function);
    this.addAllUnique(result.getSourceTraceModels(), generator.getSourceTraceModels());
    result.setTargetModel(ArchitectureTyping.resolveWeaverSourceModel(weaver).getReference());
    this.addUnique(result.getSourceModels(), result.getTargetModel());
    TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
    boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
    if (_notEquals) {
      result.setTargetTraceModel(this.determineTraceModel(generator.getTargetTraceModel()));
    } else {
      result.setTargetTraceModel(null);
    }
    JvmType _reference = generator.getReference();
    if ((_reference instanceof JvmGenericType)) {
      JvmType _reference_1 = generator.getReference();
      final JvmGenericType type = ((JvmGenericType) _reference_1);
      result.setInputTypeReference(ArchitectureTyping.determineGeneratorInputType(type));
      result.setOutputTypeReference(ArchitectureTyping.determineGeneratorOutputType(type));
      result.setAuxiliaryInputTypeMap(ArchitectureTyping.determineGeneratorAuxTypes(type));
    }
    return result;
  }
  
  /**
   * create a unit node for a weaver.
   */
  private Unit createWeaver(final Weaver weaver) {
    final Unit result = BoxingFactory.eINSTANCE.createUnit();
    result.setFragment(weaver);
    result.getSourceModels().add(weaver.getSourceModel().getReference());
    AspectModel _aspectModel = weaver.getAspectModel();
    result.getSourceModels().add(((TargetModel) _aspectModel).getReference());
    result.setTargetModel(ArchitectureTyping.resolveWeaverSourceModel(weaver).getReference());
    result.setTargetTraceModel(null);
    return result;
  }
  
  /**
   * Determine the trace model.
   */
  private TraceModel determineTraceModel(final TargetTraceModel model) {
    TraceModel _switchResult = null;
    boolean _matched = false;
    if (model instanceof TraceModel) {
      _matched=true;
      _switchResult = ((TraceModel)model);
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
      this.addUnique(list, it.getTraceModel());
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
