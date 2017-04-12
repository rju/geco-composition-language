package de.cau.cs.se.geco.architecture.graph;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.LineStyle;
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.CombinedModel;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelSequence;
import de.cau.cs.se.geco.architecture.architecture.SeparateModels;
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModel;
import de.cau.cs.se.geco.architecture.architecture.TargetTraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.framework.IWeaverSeparatePointcut;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.elk.graph.KEdge;
import org.eclipse.elk.graph.KNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelDiagramSynthesis extends AbstractDiagramSynthesis<GecoModel> {
  @Inject
  @Extension
  private KNodeExtensions _kNodeExtensions;
  
  @Inject
  @Extension
  private KEdgeExtensions _kEdgeExtensions;
  
  @Inject
  @Extension
  private KPortExtensions _kPortExtensions;
  
  @Inject
  @Extension
  private KLabelExtensions _kLabelExtensions;
  
  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;
  
  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;
  
  @Inject
  @Extension
  private KPolylineExtensions _kPolylineExtensions;
  
  @Inject
  @Extension
  private KColorExtensions _kColorExtensions;
  
  /**
   * changes in visualization
   */
  private final static String TRACE_MODEL_VISIBLE_NAME = "Trace models visible";
  
  private final static String TRACE_MODEL_VISIBLE_NO = "No";
  
  private final static String TRACE_MODEL_VISIBLE_YES = "Yes";
  
  /**
   * changes in edge routing
   */
  private final static String ROUTING_NAME = "Edge Routing";
  
  private final static String ROUTING_POLYLINE = "polyline";
  
  private final static String ROUTING_ORTHOGONAL = "orthogonal";
  
  private final static String ROUTING_SPLINES = "splines";
  
  private final static String SPACING_NAME = "Spacing";
  
  /**
   * The filter option definition that allows users to customize the constructed class diagrams.
   */
  private final static SynthesisOption TRACE_MODEL_VISIBLE = SynthesisOption.createChoiceOption(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_NAME, 
    ImmutableList.<String>of(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_YES, ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_NO), ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_YES);
  
  private final static SynthesisOption ROUTING = SynthesisOption.createChoiceOption(ModelDiagramSynthesis.ROUTING_NAME, 
    ImmutableList.<String>of(ModelDiagramSynthesis.ROUTING_POLYLINE, ModelDiagramSynthesis.ROUTING_ORTHOGONAL, ModelDiagramSynthesis.ROUTING_SPLINES), ModelDiagramSynthesis.ROUTING_POLYLINE);
  
  private final static SynthesisOption SPACING = SynthesisOption.<Float>createRangeOption(ModelDiagramSynthesis.SPACING_NAME, Float.valueOf(5f), Float.valueOf(200f), Float.valueOf(50f));
  
  private final static int GENERATOR_IN = 0;
  
  private final static int GENERATOR_OUT = 1;
  
  private final static int GENERATOR_TR_IN = 2;
  
  private final static int GENERATOR_TR_OUT = 3;
  
  private final static int WEAVER_IN = 0;
  
  private final static int WEAVER_OUT = 1;
  
  private final static int WEAVER_ASPECT = 2;
  
  private final static int WEAVER_POINTCUT = 3;
  
  private final static int TRACE_MODEL_IN = 0;
  
  private final static int TRACE_MODEL_OUT = 1;
  
  private final static int MODEL_IN = 0;
  
  private final static int MODEL_OUT = 1;
  
  private final Map<Weaver, KNode> weaverNodes = new HashMap<Weaver, KNode>();
  
  private final Map<Generator, KNode> generatorNodes = new HashMap<Generator, KNode>();
  
  private final Map<Weaver, KNode> targetWeaverModelNodes = new HashMap<Weaver, KNode>();
  
  private final Map<Generator, KNode> targetGeneratorModelNodes = new HashMap<Generator, KNode>();
  
  private final Map<Model, KNode> modelNodes = new HashMap<Model, KNode>();
  
  private final Map<TraceModel, KNode> traceModelNodes = new HashMap<TraceModel, KNode>();
  
  /**
   * {@inheritDoc}<br>
   * <br>
   * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
   */
  @Override
  public List<SynthesisOption> getDisplayedSynthesisOptions() {
    return ImmutableList.<SynthesisOption>of(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE, ModelDiagramSynthesis.ROUTING, ModelDiagramSynthesis.SPACING);
  }
  
  @Override
  public KNode transform(final GecoModel model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field SPACING_BORDER is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field DIRECTION is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field EDGE_ROUTING is undefined for the type Class<LayeredOptions>");
  }
  
  /**
   * Create connection between models and weaver
   */
  private void createEdgesForWeaver(final Weaver weaver, final KNode weaverNode) {
    this.createSourceBaseModelEdgeForWeaver(weaver, weaverNode);
    this.createTargetBaseModelEdgeForWeaver(weaver, weaverNode);
    AspectModel _aspectModel = weaver.getAspectModel();
    boolean _matched = false;
    if (_aspectModel instanceof CombinedModel) {
      _matched=true;
      AspectModel _aspectModel_1 = weaver.getAspectModel();
      this.createAdviceModelEdgeForWeaver(((CombinedModel) _aspectModel_1), weaverNode);
    }
    if (!_matched) {
      if (_aspectModel instanceof SeparateModels) {
        _matched=true;
        AspectModel _aspectModel_1 = weaver.getAspectModel();
        this.createPointcutModelEdgeForWeaver(((SeparateModels) _aspectModel_1), weaverNode);
      }
    }
  }
  
  /**
   * edge to the source base model of the weaver.
   */
  private KEdge createSourceBaseModelEdgeForWeaver(final Weaver weaver, final KNode weaverNode) {
    KEdge _xblockexpression = null;
    {
      KNode _xifexpression = null;
      SourceModelSelector _sourceModel = weaver.getSourceModel();
      boolean _notEquals = (!Objects.equal(_sourceModel, null));
      if (_notEquals) {
        _xifexpression = this.modelNodes.get(weaver.getSourceModel().getReference());
      } else {
        _xifexpression = this.targetWeaverModelNodes.get(ArchitectureTyping.predecessingWeaver(weaver));
      }
      final KNode sourceModelNode = _xifexpression;
      KEdge _drawConnectionNoArrow = this.drawConnectionNoArrow(sourceModelNode, weaverNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function = (KEdge it) -> {
        it.setSourcePort(sourceModelNode.getPorts().get(ModelDiagramSynthesis.MODEL_OUT));
        it.setTargetPort(weaverNode.getPorts().get(ModelDiagramSynthesis.WEAVER_IN));
      };
      _xblockexpression = ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionNoArrow, _function);
    }
    return _xblockexpression;
  }
  
  /**
   * edge to the source base model of the weaver.
   */
  private KEdge createTargetBaseModelEdgeForWeaver(final Weaver weaver, final KNode weaverNode) {
    KEdge _xblockexpression = null;
    {
      KNode _xifexpression = null;
      TargetModel _targetModel = weaver.getTargetModel();
      boolean _notEquals = (!Objects.equal(_targetModel, null));
      if (_notEquals) {
        _xifexpression = this.modelNodes.get(weaver.getTargetModel().getReference());
      } else {
        _xifexpression = this.targetWeaverModelNodes.get(weaver);
      }
      final KNode targetModelNode = _xifexpression;
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(weaverNode, targetModelNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function = (KEdge it) -> {
        it.setSourcePort(weaverNode.getPorts().get(ModelDiagramSynthesis.WEAVER_OUT));
        it.setTargetPort(targetModelNode.getPorts().get(ModelDiagramSynthesis.MODEL_IN));
      };
      _xblockexpression = ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
    }
    return _xblockexpression;
  }
  
  /**
   * create an edge between weaver and advice or aspect model.
   */
  private KEdge createAdviceModelEdgeForWeaver(final CombinedModel adviceModel, final KNode weaverNode) {
    KEdge _xblockexpression = null;
    {
      KNode _switchResult = null;
      boolean _matched = false;
      if (adviceModel instanceof TargetModel) {
        _matched=true;
        _switchResult = this.modelNodes.get(((TargetModel)adviceModel).getReference());
      }
      if (!_matched) {
        if (adviceModel instanceof Generator) {
          _matched=true;
          _switchResult = this.targetGeneratorModelNodes.get(adviceModel);
        }
      }
      final KNode aspectModelNode = _switchResult;
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(aspectModelNode, weaverNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function = (KEdge it) -> {
        it.setSourcePort(aspectModelNode.getPorts().get(ModelDiagramSynthesis.MODEL_OUT));
        it.setTargetPort(weaverNode.getPorts().get(ModelDiagramSynthesis.WEAVER_ASPECT));
      };
      _xblockexpression = ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
    }
    return _xblockexpression;
  }
  
  /**
   * create an edge between weaver and advice or aspect model.
   */
  private KEdge createPointcutModelEdgeForWeaver(final SeparateModels separatePointcutAdviceModel, final KNode weaverNode) {
    KEdge _xblockexpression = null;
    {
      final KNode pointcutModelNode = this.modelNodes.get(separatePointcutAdviceModel.getPointcut().getReference());
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(pointcutModelNode, weaverNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function = (KEdge it) -> {
        it.setSourcePort(pointcutModelNode.getPorts().get(ModelDiagramSynthesis.MODEL_OUT));
        it.setTargetPort(weaverNode.getPorts().get(ModelDiagramSynthesis.WEAVER_POINTCUT));
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
      _xblockexpression = this.createAdviceModelEdgeForWeaver(separatePointcutAdviceModel.getAdvice(), weaverNode);
    }
    return _xblockexpression;
  }
  
  /**
   * Create edges between the generator and the models.
   */
  private void createEdgesForGenerator(final KNode root, final Generator generator, final KNode generatorNode) {
    try {
      KNode _xifexpression = null;
      Model _reference = generator.getSourceModel().getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        _xifexpression = this.modelNodes.get(generator.getSourceModel().getReference());
      } else {
        KNode _xblockexpression = null;
        {
          final KNode anonymousModelNode = this.drawModelRectangle(this._kNodeExtensions.createNode(), "", "empty");
          EList<KNode> _children = root.getChildren();
          _children.add(anonymousModelNode);
          _xblockexpression = anonymousModelNode;
        }
        _xifexpression = _xblockexpression;
      }
      final KNode sourceModelNode = _xifexpression;
      KNode _xifexpression_1 = null;
      TargetModel _targetModel = generator.getTargetModel();
      boolean _notEquals_1 = (!Objects.equal(_targetModel, null));
      if (_notEquals_1) {
        _xifexpression_1 = this.modelNodes.get(generator.getTargetModel().getReference());
      } else {
        KNode _xifexpression_2 = null;
        EObject _eContainer = generator.eContainer();
        if ((_eContainer instanceof Weaver)) {
          _xifexpression_2 = this.targetGeneratorModelNodes.get(generator);
        } else {
          throw new Exception("Broken model.");
        }
        _xifexpression_1 = _xifexpression_2;
      }
      final KNode targetModelNode = _xifexpression_1;
      boolean _equals = this.getObjectValue(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE).equals(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_YES);
      if (_equals) {
        final Consumer<TraceModelReference> _function = (TraceModelReference traceModel) -> {
          final KNode traceModelNode = this.traceModelNodes.get(traceModel.getTraceModel());
          KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(traceModelNode, generatorNode, LineStyle.DASH);
          final Procedure1<KEdge> _function_1 = (KEdge it) -> {
            it.setSourcePort(traceModelNode.getPorts().get(ModelDiagramSynthesis.TRACE_MODEL_OUT));
            it.setTargetPort(generatorNode.getPorts().get(ModelDiagramSynthesis.GENERATOR_TR_IN));
          };
          ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function_1);
        };
        generator.getSourceTraceModels().forEach(_function);
      }
      KEdge _drawConnectionNoArrow = this.drawConnectionNoArrow(sourceModelNode, generatorNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function_1 = (KEdge it) -> {
        it.setSourcePort(sourceModelNode.getPorts().get(ModelDiagramSynthesis.MODEL_OUT));
        it.setTargetPort(generatorNode.getPorts().get(ModelDiagramSynthesis.GENERATOR_IN));
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionNoArrow, _function_1);
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(generatorNode, targetModelNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function_2 = (KEdge it) -> {
        it.setSourcePort(generatorNode.getPorts().get(ModelDiagramSynthesis.GENERATOR_OUT));
        it.setTargetPort(targetModelNode.getPorts().get(ModelDiagramSynthesis.MODEL_IN));
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Create all weaver nodes.
   */
  private void createAllWeavers(final EList<Fragment> fragments, final KNode parent) {
    final Consumer<Weaver> _function = (Weaver weaver) -> {
      final KNode weaverNode = this.drawWeaver(weaver);
      this.weaverNodes.put(weaver, weaverNode);
      EList<KNode> _children = parent.getChildren();
      _children.add(weaverNode);
      this.createSublevelGenerator(weaver.getAspectModel(), parent);
      TargetModel _targetModel = weaver.getTargetModel();
      boolean _equals = Objects.equal(_targetModel, null);
      if (_equals) {
        final KNode anonymousModelNode = this.createAnonymousModel(weaver);
        this.targetWeaverModelNodes.put(weaver, anonymousModelNode);
        EList<KNode> _children_1 = parent.getChildren();
        _children_1.add(anonymousModelNode);
      }
    };
    Iterables.<Weaver>filter(fragments, Weaver.class).forEach(_function);
  }
  
  /**
   * Check if the aspect or advice model are in fact generators.
   */
  private void createSublevelGenerator(final AspectModel aspectModel, final KNode parent) {
    boolean _matched = false;
    if (aspectModel instanceof Generator) {
      _matched=true;
      this.createSublevelGenerator(((Generator)aspectModel), parent);
    }
    if (!_matched) {
      if (aspectModel instanceof SeparateModels) {
        _matched=true;
        this.createSublevelGenerator(((SeparateModels)aspectModel).getAdvice(), parent);
      }
    }
  }
  
  /**
   * Create a sublevel generator which is used as privder of an
   * aspect model of a weaver.
   */
  private void createSublevelGenerator(final Generator generator, final KNode parent) {
    final KNode generatorNode = this.drawGenerator(generator);
    final KNode anonymousModelNode = this.createAnonymousModel(generator);
    this.targetGeneratorModelNodes.put(generator, anonymousModelNode);
    this.generatorNodes.put(generator, generatorNode);
    if (((!Objects.equal(generator.getTargetTraceModel(), null)) && this.getObjectValue(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE).equals(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_YES))) {
      KNode _switchResult = null;
      TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
      boolean _matched = false;
      if (_targetTraceModel instanceof TraceModel) {
        _matched=true;
        TargetTraceModel _targetTraceModel_1 = generator.getTargetTraceModel();
        _switchResult = this.createTraceModel(((TraceModel) _targetTraceModel_1), parent);
      }
      if (!_matched) {
        if (_targetTraceModel instanceof TraceModelReference) {
          _matched=true;
          TargetTraceModel _targetTraceModel_1 = generator.getTargetTraceModel();
          _switchResult = this.traceModelNodes.get(((TraceModelReference) _targetTraceModel_1).getTraceModel());
        }
      }
      final KNode traceModelNode = _switchResult;
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(generatorNode, traceModelNode, LineStyle.DASH);
      final Procedure1<KEdge> _function = (KEdge it) -> {
        it.setSourcePort(generatorNode.getPorts().get(ModelDiagramSynthesis.GENERATOR_TR_OUT));
        it.setTargetPort(traceModelNode.getPorts().get(ModelDiagramSynthesis.TRACE_MODEL_IN));
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
    }
    EList<KNode> _children = parent.getChildren();
    _children.add(generatorNode);
    EList<KNode> _children_1 = parent.getChildren();
    _children_1.add(anonymousModelNode);
  }
  
  /**
   * Create all generators which are directly declared in the model.
   */
  public void createAllToplevelGenerators(final EList<Fragment> fragments, final KNode parent) {
    final Consumer<Generator> _function = (Generator generator) -> {
      final KNode generatorNode = this.drawGenerator(generator);
      this.generatorNodes.put(generator, generatorNode);
      this.handleTraceModel(generator, parent);
      EList<KNode> _children = parent.getChildren();
      _children.add(generatorNode);
    };
    Iterables.<Generator>filter(fragments, Generator.class).forEach(_function);
  }
  
  /**
   * Create a tracemodel if one is required.
   */
  public void handleTraceModel(final Generator generator, final KNode parent) {
    TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
    boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
    if (_notEquals) {
      TargetTraceModel _targetTraceModel_1 = generator.getTargetTraceModel();
      if ((_targetTraceModel_1 instanceof TraceModel)) {
        TargetTraceModel _targetTraceModel_2 = generator.getTargetTraceModel();
        final KNode traceModelNode = this.createTraceModel(((TraceModel) _targetTraceModel_2), parent);
        EList<KNode> _children = parent.getChildren();
        _children.add(traceModelNode);
      }
    }
  }
  
  /**
   * Create all explicit defined models.
   */
  public void createNamedModels(final EList<ModelSequence> models, final KNode parent) {
    final Consumer<ModelSequence> _function = (ModelSequence seq) -> {
      final Consumer<Model> _function_1 = (Model model) -> {
        final KNode modelNode = this.createModel(model, seq);
        this.modelNodes.put(model, modelNode);
        EList<KNode> _children = parent.getChildren();
        _children.add(modelNode);
      };
      seq.getModels().forEach(_function_1);
    };
    models.forEach(_function);
  }
  
  /**
   * Create trace model node.
   */
  private KNode createTraceModel(final TraceModel traceModel, final KNode parent) {
    final KNode traceModelNode = this.drawTraceModel(traceModel);
    EList<KNode> _children = parent.getChildren();
    _children.add(traceModelNode);
    this.traceModelNodes.put(traceModel, traceModelNode);
    return traceModelNode;
  }
  
  /**
   * Create an anonymous target model for a generator. This happens
   * when the output is not specified and a weaver is used instead.
   * 
   * @param generator the generator.
   */
  private KNode _createAnonymousModel(final Generator generator) {
    KNode _xblockexpression = null;
    {
      final String instanceName = "";
      String _xifexpression = null;
      TargetModel _targetModel = generator.getTargetModel();
      boolean _notEquals = (!Objects.equal(_targetModel, null));
      if (_notEquals) {
        _xifexpression = ArchitectureTyping.resolveType(generator.getTargetModel().getReference()).getSimpleName();
      } else {
        String _xifexpression_1 = null;
        JvmType _reference = generator.getReference();
        if ((_reference instanceof JvmGenericType)) {
          String _xblockexpression_1 = null;
          {
            JvmType _reference_1 = generator.getReference();
            final EList<JvmTypeReference> superTypes = ((JvmGenericType) _reference_1).getSuperTypes();
            final Function1<JvmTypeReference, Boolean> _function = (JvmTypeReference it) -> {
              String _simpleName = it.getSimpleName();
              String _simpleName_1 = IGenerator.class.getSimpleName();
              String _plus = (_simpleName_1 + "<");
              return Boolean.valueOf(_simpleName.startsWith(_plus));
            };
            final JvmTypeReference interfaceType = IterableExtensions.<JvmTypeReference>findFirst(superTypes, _function);
            String _xifexpression_2 = null;
            boolean _notEquals_1 = (!Objects.equal(interfaceType, null));
            if (_notEquals_1) {
              String _switchResult = null;
              boolean _matched = false;
              if (interfaceType instanceof JvmParameterizedTypeReference) {
                _matched=true;
                _switchResult = ((JvmParameterizedTypeReference)interfaceType).getArguments().get(1).getSimpleName();
              }
              if (!_matched) {
                _switchResult = "ERROR";
              }
              _xifexpression_2 = _switchResult;
            }
            _xblockexpression_1 = _xifexpression_2;
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          _xifexpression_1 = "JVM ERROR";
        }
        _xifexpression = _xifexpression_1;
      }
      final String className = _xifexpression;
      _xblockexpression = this.drawModelRectangle(this._kNodeExtensions.createNode(), instanceName, className);
    }
    return _xblockexpression;
  }
  
  /**
   * Create an anonymous source model for a weaver.
   */
  private KNode _createAnonymousModel(final Weaver weaver) {
    KNode _xblockexpression = null;
    {
      final SourceModelSelector sourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      final String instanceName = sourceModel.getReference().getName();
      String _xifexpression = null;
      TargetModel _targetModel = weaver.getTargetModel();
      boolean _notEquals = (!Objects.equal(_targetModel, null));
      if (_notEquals) {
        String _xifexpression_1 = null;
        Model _reference = weaver.getTargetModel().getReference();
        boolean _notEquals_1 = (!Objects.equal(_reference, null));
        if (_notEquals_1) {
          _xifexpression_1 = ArchitectureTyping.resolveType(weaver.getTargetModel().getReference()).getSimpleName();
        } else {
          _xifexpression_1 = ArchitectureTyping.resolveType(sourceModel).getSimpleName();
        }
        _xifexpression = _xifexpression_1;
      } else {
        _xifexpression = ArchitectureTyping.resolveType(sourceModel).getSimpleName();
      }
      final String className = _xifexpression;
      _xblockexpression = this.drawModelRectangle(this._kNodeExtensions.createNode(), instanceName, className);
    }
    return _xblockexpression;
  }
  
  /**
   * Create a model node for a given model and type.
   */
  private KNode createModel(final Model model, final ModelSequence sequence) {
    return this.drawModelRectangle(this.<KNode>associateWith(this._kNodeExtensions.createNode(model), model), 
      model.getName(), ArchitectureTyping.resolveType(sequence.getType()).getSimpleName());
  }
  
  /**
   * Draw a model
   */
  private KNode drawModelRectangle(final KNode node, final String instanceName, final String className) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PORT_CONSTRAINTS is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>");
  }
  
  /**
   * Create an edge between a model and a generator or weaver.
   */
  private KEdge drawConnectionWithArrow(final KNode source, final KNode target, final LineStyle lineStyle) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      it.setSource(source);
      it.setTarget(target);
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        this._kPolylineExtensions.addHeadArrowDecorator(it_1);
        this._kRenderingExtensions.setLineWidth(it_1, 2);
        this._kRenderingExtensions.setLineStyle(it_1, lineStyle);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }
  
  /**
   * Create an edge between a model and the weaver or generator.
   * Input only for main model.
   */
  private KEdge drawConnectionNoArrow(final KNode source, final KNode target, final LineStyle lineStyle) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      it.setSource(source);
      it.setTarget(target);
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        this._kRenderingExtensions.setLineWidth(it_1, 2);
        this._kRenderingExtensions.setLineStyle(it_1, lineStyle);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }
  
  private KNode drawWeaver(final Weaver weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PORT_CONSTRAINTS is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field NODE_LABELS_PLACEMENT is undefined for the type Class<LayeredOptions>");
  }
  
  private boolean hasSeparatePointcut(final Weaver weaver) {
    boolean _xifexpression = false;
    JvmType _reference = weaver.getReference();
    if ((_reference instanceof JvmGenericType)) {
      JvmType _reference_1 = weaver.getReference();
      final Function1<JvmTypeReference, Boolean> _function = (JvmTypeReference it) -> {
        return Boolean.valueOf(it.getType().getQualifiedName().equals(IWeaverSeparatePointcut.class.getCanonicalName()));
      };
      _xifexpression = IterableExtensions.<JvmTypeReference>exists(((JvmGenericType) _reference_1).getSuperTypes(), _function);
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
  
  /**
   * Create generator node and its connections.
   */
  private KNode drawGenerator(final Generator generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PORT_CONSTRAINTS is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>");
  }
  
  /**
   * Draw a trace model
   */
  private KNode drawTraceModel(final TraceModel traceModel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PORT_CONSTRAINTS is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>"
      + "\nThe method or field PORT_SIDE is undefined for the type Class<LayeredOptions>");
  }
  
  private String getName(final Generator generator) {
    return generator.getReference().getSimpleName();
  }
  
  private String getName(final Weaver weaver) {
    return weaver.getReference().getSimpleName();
  }
  
  private KNode createAnonymousModel(final Fragment generator) {
    if (generator instanceof Generator) {
      return _createAnonymousModel((Generator)generator);
    } else if (generator instanceof Weaver) {
      return _createAnonymousModel((Weaver)generator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(generator).toString());
    }
  }
}
