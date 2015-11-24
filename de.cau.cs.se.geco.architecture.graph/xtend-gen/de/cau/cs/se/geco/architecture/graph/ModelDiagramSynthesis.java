package de.cau.cs.se.geco.architecture.graph;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.KPort;
import de.cau.cs.kieler.core.krendering.KAreaPlacementData;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KGridPlacement;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.LineJoin;
import de.cau.cs.kieler.core.krendering.LineStyle;
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kiml.options.Direction;
import de.cau.cs.kieler.kiml.options.EdgeRouting;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.options.PortConstraints;
import de.cau.cs.kieler.kiml.options.PortSide;
import de.cau.cs.kieler.klighd.KlighdConstants;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation;
import de.cau.cs.se.geco.architecture.architecture.NodeType;
import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.TargetTraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.inject.Inject;
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
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelDiagramSynthesis extends AbstractDiagramSynthesis<Model> {
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
  
  @Extension
  private KRenderingFactory _kRenderingFactory = KRenderingFactory.eINSTANCE;
  
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
  
  private final static int TRACE_MODEL_IN = 0;
  
  private final static int TRACE_MODEL_OUT = 1;
  
  private final static int MODEL_IN = 0;
  
  private final static int MODEL_OUT = 1;
  
  private final Map<Weaver, KNode> weaverNodes = new HashMap<Weaver, KNode>();
  
  private final Map<Generator, KNode> generatorNodes = new HashMap<Generator, KNode>();
  
  private final Map<Weaver, KNode> targetWeaverModelNodes = new HashMap<Weaver, KNode>();
  
  private final Map<Generator, KNode> targetGeneratorModelNodes = new HashMap<Generator, KNode>();
  
  private final Map<Metamodel, KNode> metamodelNodes = new HashMap<Metamodel, KNode>();
  
  private final Map<TraceModel, KNode> traceModelNodes = new HashMap<TraceModel, KNode>();
  
  /**
   * {@inheritDoc}<br>
   * <br>
   * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
   */
  public List<SynthesisOption> getDisplayedSynthesisOptions() {
    return ImmutableList.<SynthesisOption>of(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE, ModelDiagramSynthesis.ROUTING, ModelDiagramSynthesis.SPACING);
  }
  
  public KNode transform(final Model model) {
    KNode _createNode = this._kNodeExtensions.createNode(model);
    final KNode root = this.<KNode>associateWith(_createNode, model);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this._kNodeExtensions.<String>addLayoutParam(it, LayoutOptions.ALGORITHM, "de.cau.cs.kieler.klay.layered");
        Object _objectValue = ModelDiagramSynthesis.this.getObjectValue(ModelDiagramSynthesis.SPACING);
        ModelDiagramSynthesis.this.<KNode, Float>setLayoutOption(it, LayoutOptions.SPACING, ((Float) _objectValue));
        ModelDiagramSynthesis.this.<KNode, Direction>setLayoutOption(it, LayoutOptions.DIRECTION, Direction.RIGHT);
        EdgeRouting _switchResult = null;
        Object _objectValue_1 = ModelDiagramSynthesis.this.getObjectValue(ModelDiagramSynthesis.ROUTING);
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_objectValue_1, ModelDiagramSynthesis.ROUTING_POLYLINE)) {
            _matched=true;
            _switchResult = EdgeRouting.POLYLINE;
          }
        }
        if (!_matched) {
          if (Objects.equal(_objectValue_1, ModelDiagramSynthesis.ROUTING_ORTHOGONAL)) {
            _matched=true;
            _switchResult = EdgeRouting.ORTHOGONAL;
          }
        }
        if (!_matched) {
          if (Objects.equal(_objectValue_1, ModelDiagramSynthesis.ROUTING_SPLINES)) {
            _matched=true;
            _switchResult = EdgeRouting.SPLINES;
          }
        }
        ModelDiagramSynthesis.this.<KNode, EdgeRouting>setLayoutOption(it, LayoutOptions.EDGE_ROUTING, _switchResult);
        EList<MetamodelSequence> _metamodels = model.getMetamodels();
        ModelDiagramSynthesis.this.createNamedMetaModels(_metamodels, it);
        EList<Processor> _processors = model.getProcessors();
        ModelDiagramSynthesis.this.createAllToplevelGenerators(_processors, it);
        EList<Processor> _processors_1 = model.getProcessors();
        ModelDiagramSynthesis.this.createAllWeavers(_processors_1, it);
        final BiConsumer<Generator, KNode> _function = new BiConsumer<Generator, KNode>() {
          public void accept(final Generator generator, final KNode generatorNode) {
            ModelDiagramSynthesis.this.createEdgesForGenerator(it, generator, generatorNode);
          }
        };
        ModelDiagramSynthesis.this.generatorNodes.forEach(_function);
        final BiConsumer<Weaver, KNode> _function_1 = new BiConsumer<Weaver, KNode>() {
          public void accept(final Weaver weaver, final KNode weaverNode) {
            ModelDiagramSynthesis.this.createEdgesForWeaver(it, weaver, weaverNode);
          }
        };
        ModelDiagramSynthesis.this.weaverNodes.forEach(_function_1);
      }
    };
    ObjectExtensions.<KNode>operator_doubleArrow(root, _function);
    return root;
  }
  
  /**
   * Create connection between models and weaver
   */
  public void createEdgesForWeaver(final KNode root, final Weaver weaver, final KNode weaverNode) {
    KNode _xifexpression = null;
    SourceModelNodeSelector _sourceModel = weaver.getSourceModel();
    boolean _notEquals = (!Objects.equal(_sourceModel, null));
    if (_notEquals) {
      SourceModelNodeSelector _sourceModel_1 = weaver.getSourceModel();
      Metamodel _reference = _sourceModel_1.getReference();
      _xifexpression = this.metamodelNodes.get(_reference);
    } else {
      Weaver _predecessingWeaver = ArchitectureTyping.predecessingWeaver(weaver);
      _xifexpression = this.targetWeaverModelNodes.get(_predecessingWeaver);
    }
    final KNode sourceModelNode = _xifexpression;
    KNode _xifexpression_1 = null;
    TargetModelNodeType _targetModel = weaver.getTargetModel();
    boolean _notEquals_1 = (!Objects.equal(_targetModel, null));
    if (_notEquals_1) {
      TargetModelNodeType _targetModel_1 = weaver.getTargetModel();
      Metamodel _reference_1 = _targetModel_1.getReference();
      _xifexpression_1 = this.metamodelNodes.get(_reference_1);
    } else {
      _xifexpression_1 = this.targetWeaverModelNodes.get(weaver);
    }
    final KNode targetModelNode = _xifexpression_1;
    KNode _xifexpression_2 = null;
    AspectModel _aspectModel = weaver.getAspectModel();
    if ((_aspectModel instanceof TargetModelNodeType)) {
      AspectModel _aspectModel_1 = weaver.getAspectModel();
      Metamodel _reference_2 = ((TargetModelNodeType) _aspectModel_1).getReference();
      _xifexpression_2 = this.metamodelNodes.get(_reference_2);
    } else {
      AspectModel _aspectModel_2 = weaver.getAspectModel();
      _xifexpression_2 = this.targetGeneratorModelNodes.get(((Generator) _aspectModel_2));
    }
    final KNode aspectModelNode = _xifexpression_2;
    KEdge _drawConnectionNoArrow = this.drawConnectionNoArrow(sourceModelNode, weaverNode, LineStyle.SOLID);
    final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        EList<KPort> _ports = sourceModelNode.getPorts();
        KPort _get = _ports.get(ModelDiagramSynthesis.MODEL_OUT);
        it.setSourcePort(_get);
        EList<KPort> _ports_1 = weaverNode.getPorts();
        KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.WEAVER_IN);
        it.setTargetPort(_get_1);
      }
    };
    ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionNoArrow, _function);
    KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(weaverNode, targetModelNode, LineStyle.SOLID);
    final Procedure1<KEdge> _function_1 = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        EList<KPort> _ports = weaverNode.getPorts();
        KPort _get = _ports.get(ModelDiagramSynthesis.WEAVER_OUT);
        it.setSourcePort(_get);
        EList<KPort> _ports_1 = targetModelNode.getPorts();
        KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.MODEL_IN);
        it.setTargetPort(_get_1);
      }
    };
    ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function_1);
    KEdge _drawConnectionWithArrow_1 = this.drawConnectionWithArrow(aspectModelNode, weaverNode, LineStyle.SOLID);
    final Procedure1<KEdge> _function_2 = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        EList<KPort> _ports = aspectModelNode.getPorts();
        KPort _get = _ports.get(ModelDiagramSynthesis.MODEL_OUT);
        it.setSourcePort(_get);
        EList<KPort> _ports_1 = weaverNode.getPorts();
        KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.WEAVER_ASPECT);
        it.setTargetPort(_get_1);
      }
    };
    ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow_1, _function_2);
  }
  
  /**
   * Create edges between the generator and the models.
   */
  private void createEdgesForGenerator(final KNode root, final Generator generator, final KNode generatorNode) {
    try {
      KNode _xifexpression = null;
      SourceModelNodeSelector _sourceModel = generator.getSourceModel();
      Metamodel _reference = _sourceModel.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        SourceModelNodeSelector _sourceModel_1 = generator.getSourceModel();
        Metamodel _reference_1 = _sourceModel_1.getReference();
        _xifexpression = this.metamodelNodes.get(_reference_1);
      } else {
        KNode _xblockexpression = null;
        {
          KNode _createNode = this._kNodeExtensions.createNode();
          final KNode anonymousMetamodelNode = this.drawMetamodelRectangle(_createNode, "", "empty");
          EList<KNode> _children = root.getChildren();
          _children.add(anonymousMetamodelNode);
          _xblockexpression = anonymousMetamodelNode;
        }
        _xifexpression = _xblockexpression;
      }
      final KNode sourceModelNode = _xifexpression;
      KNode _xifexpression_1 = null;
      TargetModelNodeType _targetModel = generator.getTargetModel();
      Metamodel _reference_2 = _targetModel.getReference();
      boolean _notEquals_1 = (!Objects.equal(_reference_2, null));
      if (_notEquals_1) {
        TargetModelNodeType _targetModel_1 = generator.getTargetModel();
        Metamodel _reference_3 = _targetModel_1.getReference();
        _xifexpression_1 = this.metamodelNodes.get(_reference_3);
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
      Object _objectValue = this.getObjectValue(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE);
      boolean _equals = _objectValue.equals(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_YES);
      if (_equals) {
        EList<TraceModelReference> _sourceTraceModels = generator.getSourceTraceModels();
        final Consumer<TraceModelReference> _function = new Consumer<TraceModelReference>() {
          public void accept(final TraceModelReference traceModel) {
            TraceModel _traceModel = traceModel.getTraceModel();
            final KNode traceModelNode = ModelDiagramSynthesis.this.traceModelNodes.get(_traceModel);
            KEdge _drawConnectionWithArrow = ModelDiagramSynthesis.this.drawConnectionWithArrow(traceModelNode, generatorNode, LineStyle.DASH);
            final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
              public void apply(final KEdge it) {
                EList<KPort> _ports = traceModelNode.getPorts();
                KPort _get = _ports.get(ModelDiagramSynthesis.TRACE_MODEL_OUT);
                it.setSourcePort(_get);
                EList<KPort> _ports_1 = generatorNode.getPorts();
                KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.GENERATOR_TR_IN);
                it.setTargetPort(_get_1);
              }
            };
            ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
          }
        };
        _sourceTraceModels.forEach(_function);
      }
      KEdge _drawConnectionNoArrow = this.drawConnectionNoArrow(sourceModelNode, generatorNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function_1 = new Procedure1<KEdge>() {
        public void apply(final KEdge it) {
          EList<KPort> _ports = sourceModelNode.getPorts();
          KPort _get = _ports.get(ModelDiagramSynthesis.MODEL_OUT);
          it.setSourcePort(_get);
          EList<KPort> _ports_1 = generatorNode.getPorts();
          KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.GENERATOR_IN);
          it.setTargetPort(_get_1);
        }
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionNoArrow, _function_1);
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(generatorNode, targetModelNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function_2 = new Procedure1<KEdge>() {
        public void apply(final KEdge it) {
          EList<KPort> _ports = generatorNode.getPorts();
          KPort _get = _ports.get(ModelDiagramSynthesis.GENERATOR_OUT);
          it.setSourcePort(_get);
          EList<KPort> _ports_1 = targetModelNode.getPorts();
          KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.MODEL_IN);
          it.setTargetPort(_get_1);
        }
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Create all weaver nodes.
   */
  public void createAllWeavers(final EList<Processor> processors, final KNode parent) {
    Iterable<Weaver> _filter = Iterables.<Weaver>filter(processors, Weaver.class);
    final Consumer<Weaver> _function = new Consumer<Weaver>() {
      public void accept(final Weaver weaver) {
        final KNode weaverNode = ModelDiagramSynthesis.this.drawWeaver(weaver);
        ModelDiagramSynthesis.this.weaverNodes.put(weaver, weaverNode);
        EList<KNode> _children = parent.getChildren();
        _children.add(weaverNode);
        AspectModel _aspectModel = weaver.getAspectModel();
        if ((_aspectModel instanceof Generator)) {
          AspectModel _aspectModel_1 = weaver.getAspectModel();
          ModelDiagramSynthesis.this.createSublevelGenerator(((Generator) _aspectModel_1), parent);
        }
        TargetModelNodeType _targetModel = weaver.getTargetModel();
        boolean _equals = Objects.equal(_targetModel, null);
        if (_equals) {
          final KNode anonymousMetamodelNode = ModelDiagramSynthesis.this.createAnonymousMetamodel(weaver);
          ModelDiagramSynthesis.this.targetWeaverModelNodes.put(weaver, anonymousMetamodelNode);
          EList<KNode> _children_1 = parent.getChildren();
          _children_1.add(anonymousMetamodelNode);
        }
      }
    };
    _filter.forEach(_function);
  }
  
  /**
   * Create a sublevel generator which is used as privder of an
   * aspect model of a weaver.
   */
  public void createSublevelGenerator(final Generator generator, final KNode parent) {
    final KNode generatorNode = this.drawGenerator(generator);
    final KNode anonymousMetamodelNode = this.createAnonymousMetamodel(generator);
    this.targetGeneratorModelNodes.put(generator, anonymousMetamodelNode);
    this.generatorNodes.put(generator, generatorNode);
    boolean _and = false;
    TargetTraceModel _targetTraceModel = generator.getTargetTraceModel();
    boolean _notEquals = (!Objects.equal(_targetTraceModel, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Object _objectValue = this.getObjectValue(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE);
      boolean _equals = _objectValue.equals(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE_YES);
      _and = _equals;
    }
    if (_and) {
      KNode _switchResult = null;
      TargetTraceModel _targetTraceModel_1 = generator.getTargetTraceModel();
      boolean _matched = false;
      if (!_matched) {
        if (_targetTraceModel_1 instanceof TraceModel) {
          _matched=true;
          TargetTraceModel _targetTraceModel_2 = generator.getTargetTraceModel();
          _switchResult = this.createTraceModel(((TraceModel) _targetTraceModel_2), parent);
        }
      }
      if (!_matched) {
        if (_targetTraceModel_1 instanceof TraceModelReference) {
          _matched=true;
          TargetTraceModel _targetTraceModel_2 = generator.getTargetTraceModel();
          TraceModel _traceModel = ((TraceModelReference) _targetTraceModel_2).getTraceModel();
          _switchResult = this.traceModelNodes.get(_traceModel);
        }
      }
      final KNode traceModelNode = _switchResult;
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(generatorNode, traceModelNode, LineStyle.DASH);
      final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
        public void apply(final KEdge it) {
          EList<KPort> _ports = generatorNode.getPorts();
          KPort _get = _ports.get(ModelDiagramSynthesis.GENERATOR_TR_OUT);
          it.setSourcePort(_get);
          EList<KPort> _ports_1 = traceModelNode.getPorts();
          KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.TRACE_MODEL_IN);
          it.setTargetPort(_get_1);
        }
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
    }
    EList<KNode> _children = parent.getChildren();
    _children.add(generatorNode);
    EList<KNode> _children_1 = parent.getChildren();
    _children_1.add(anonymousMetamodelNode);
  }
  
  /**
   * Create all generators which are directly declared in the model.
   */
  public void createAllToplevelGenerators(final EList<Processor> processors, final KNode parent) {
    Iterable<Generator> _filter = Iterables.<Generator>filter(processors, Generator.class);
    final Consumer<Generator> _function = new Consumer<Generator>() {
      public void accept(final Generator generator) {
        final KNode generatorNode = ModelDiagramSynthesis.this.drawGenerator(generator);
        ModelDiagramSynthesis.this.generatorNodes.put(generator, generatorNode);
        ModelDiagramSynthesis.this.handleTraceModel(generator, parent);
        EList<KNode> _children = parent.getChildren();
        _children.add(generatorNode);
      }
    };
    _filter.forEach(_function);
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
   * Create all explicit defined metamodels.
   */
  public void createNamedMetaModels(final EList<MetamodelSequence> metamodels, final KNode parent) {
    final Consumer<MetamodelSequence> _function = new Consumer<MetamodelSequence>() {
      public void accept(final MetamodelSequence seq) {
        EList<Metamodel> _metamodels = seq.getMetamodels();
        final Consumer<Metamodel> _function = new Consumer<Metamodel>() {
          public void accept(final Metamodel metamodel) {
            final KNode metaModelNode = ModelDiagramSynthesis.this.createMetamodel(metamodel, seq);
            ModelDiagramSynthesis.this.metamodelNodes.put(metamodel, metaModelNode);
            EList<KNode> _children = parent.getChildren();
            _children.add(metaModelNode);
          }
        };
        _metamodels.forEach(_function);
      }
    };
    metamodels.forEach(_function);
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
   * Create an anonymous target metamodel for a generator. This happens
   * when the output is not specified and a weaver is used instead.
   * 
   * @param generator the generator.
   */
  private KNode _createAnonymousMetamodel(final Generator generator) {
    KNode _xblockexpression = null;
    {
      final String instanceName = "";
      String _xifexpression = null;
      TargetModelNodeType _targetModel = generator.getTargetModel();
      Metamodel _reference = _targetModel.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        TargetModelNodeType _targetModel_1 = generator.getTargetModel();
        Metamodel _reference_1 = _targetModel_1.getReference();
        JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_reference_1);
        _xifexpression = _resolveType.getSimpleName();
      } else {
        String _xifexpression_1 = null;
        JvmType _reference_2 = generator.getReference();
        if ((_reference_2 instanceof JvmGenericType)) {
          String _xblockexpression_1 = null;
          {
            JvmType _reference_3 = generator.getReference();
            final EList<JvmTypeReference> superTypes = ((JvmGenericType) _reference_3).getSuperTypes();
            final Function1<JvmTypeReference, Boolean> _function = new Function1<JvmTypeReference, Boolean>() {
              public Boolean apply(final JvmTypeReference it) {
                String _simpleName = it.getSimpleName();
                String _simpleName_1 = IGenerator.class.getSimpleName();
                String _plus = (_simpleName_1 + "<");
                return Boolean.valueOf(_simpleName.startsWith(_plus));
              }
            };
            final JvmTypeReference interfaceType = IterableExtensions.<JvmTypeReference>findFirst(superTypes, _function);
            String _xifexpression_2 = null;
            boolean _notEquals_1 = (!Objects.equal(interfaceType, null));
            if (_notEquals_1) {
              String _switchResult = null;
              boolean _matched = false;
              if (!_matched) {
                if (interfaceType instanceof JvmParameterizedTypeReference) {
                  _matched=true;
                  EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference)interfaceType).getArguments();
                  JvmTypeReference _get = _arguments.get(1);
                  _switchResult = _get.getSimpleName();
                }
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
      KNode _createNode = this._kNodeExtensions.createNode();
      _xblockexpression = this.drawMetamodelRectangle(_createNode, instanceName, className);
    }
    return _xblockexpression;
  }
  
  /**
   * Create an anonymous source model for a weaver.
   */
  private KNode _createAnonymousMetamodel(final Weaver weaver) {
    KNode _xblockexpression = null;
    {
      final SourceModelNodeSelector sourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      Metamodel _reference = sourceModel.getReference();
      final String instanceName = _reference.getName();
      String _xifexpression = null;
      TargetModelNodeType _targetModel = weaver.getTargetModel();
      boolean _notEquals = (!Objects.equal(_targetModel, null));
      if (_notEquals) {
        String _xifexpression_1 = null;
        TargetModelNodeType _targetModel_1 = weaver.getTargetModel();
        Metamodel _reference_1 = _targetModel_1.getReference();
        boolean _notEquals_1 = (!Objects.equal(_reference_1, null));
        if (_notEquals_1) {
          TargetModelNodeType _targetModel_2 = weaver.getTargetModel();
          Metamodel _reference_2 = _targetModel_2.getReference();
          JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_reference_2);
          _xifexpression_1 = _resolveType.getSimpleName();
        } else {
          JvmTypeReference _resolveType_1 = ArchitectureTyping.resolveType(sourceModel);
          _xifexpression_1 = _resolveType_1.getSimpleName();
        }
        _xifexpression = _xifexpression_1;
      } else {
        JvmTypeReference _resolveType_2 = ArchitectureTyping.resolveType(sourceModel);
        _xifexpression = _resolveType_2.getSimpleName();
      }
      final String className = _xifexpression;
      KNode _createNode = this._kNodeExtensions.createNode();
      _xblockexpression = this.drawMetamodelRectangle(_createNode, instanceName, className);
    }
    return _xblockexpression;
  }
  
  /**
   * Create a metamodel node for a given metamodel and type.
   */
  private KNode createMetamodel(final Metamodel metamodel, final MetamodelSequence sequence) {
    KNode _createNode = this._kNodeExtensions.createNode(metamodel);
    KNode _associateWith = this.<KNode>associateWith(_createNode, metamodel);
    String _name = metamodel.getName();
    ModelNodeType _type = sequence.getType();
    JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_type);
    String _simpleName = _resolveType.getSimpleName();
    return this.drawMetamodelRectangle(_associateWith, _name, _simpleName);
  }
  
  /**
   * Draw a metamodel
   */
  private KNode drawMetamodelRectangle(final KNode node, final String instanceName, final String className) {
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        EList<KPort> _ports = it.getPorts();
        KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.WEST);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "in", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow = ObjectExtensions.<KPort>operator_doubleArrow(_createPort, _function);
        _ports.add(_doubleArrow);
        EList<KPort> _ports_1 = it.getPorts();
        KPort _createPort_1 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function_1 = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.EAST);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "out", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_1 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_1, _function_1);
        _ports_1.add(_doubleArrow_1);
        KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
        final Procedure1<KRectangle> _function_2 = new Procedure1<KRectangle>() {
          public void apply(final KRectangle it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 2);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("white");
            KColor _color_1 = ModelDiagramSynthesis.this._kColorExtensions.getColor("LemonChiffon");
            ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackgroundGradient(it, _color, _color_1, 0);
            KColor _color_2 = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            ModelDiagramSynthesis.this._kRenderingExtensions.setShadow(it, _color_2);
            KGridPlacement _setGridPlacement = ModelDiagramSynthesis.this._kContainerRenderingExtensions.setGridPlacement(it, 1);
            KGridPlacement _from = ModelDiagramSynthesis.this._kRenderingExtensions.from(_setGridPlacement, ModelDiagramSynthesis.this._kRenderingExtensions.LEFT, 15, 0, ModelDiagramSynthesis.this._kRenderingExtensions.TOP, 15, 0);
            ModelDiagramSynthesis.this._kRenderingExtensions.to(_from, ModelDiagramSynthesis.this._kRenderingExtensions.RIGHT, 15, 0, ModelDiagramSynthesis.this._kRenderingExtensions.BOTTOM, 15, 0);
            KText _addText = ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, ((instanceName + " : ") + className));
            final Procedure1<KText> _function = new Procedure1<KText>() {
              public void apply(final KText it) {
                ModelDiagramSynthesis.this._kRenderingExtensions.setFontBold(it, true);
              }
            };
            ObjectExtensions.<KText>operator_doubleArrow(_addText, _function);
          }
        };
        ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_2);
      }
    };
    return ObjectExtensions.<KNode>operator_doubleArrow(node, _function);
  }
  
  /**
   * Create an edge between a model and a generator or weaver.
   */
  private KEdge drawConnectionWithArrow(final KNode source, final KNode target, final LineStyle lineStyle) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        it.setSource(source);
        it.setTarget(target);
        KPolyline _addPolyline = ModelDiagramSynthesis.this._kEdgeExtensions.addPolyline(it);
        final Procedure1<KPolyline> _function = new Procedure1<KPolyline>() {
          public void apply(final KPolyline it) {
            ModelDiagramSynthesis.this._kPolylineExtensions.addHeadArrowDecorator(it);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 2);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineStyle(it, lineStyle);
          }
        };
        ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function);
      }
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }
  
  /**
   * Create an edge between a model and the weaver or generator.
   * Input only for main model.
   */
  private KEdge drawConnectionNoArrow(final KNode source, final KNode target, final LineStyle lineStyle) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        it.setSource(source);
        it.setTarget(target);
        KPolyline _addPolyline = ModelDiagramSynthesis.this._kEdgeExtensions.addPolyline(it);
        final Procedure1<KPolyline> _function = new Procedure1<KPolyline>() {
          public void apply(final KPolyline it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 2);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineStyle(it, lineStyle);
          }
        };
        ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function);
      }
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }
  
  private KNode drawWeaver(final Weaver weaver) {
    KNode _createNode = this._kNodeExtensions.createNode(weaver);
    KNode _associateWith = this.<KNode>associateWith(_createNode, weaver);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        EList<KPort> _ports = it.getPorts();
        KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.WEST);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "in", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow = ObjectExtensions.<KPort>operator_doubleArrow(_createPort, _function);
        _ports.add(_doubleArrow);
        EList<KPort> _ports_1 = it.getPorts();
        KPort _createPort_1 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function_1 = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.EAST);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "out", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_1 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_1, _function_1);
        _ports_1.add(_doubleArrow_1);
        EList<KPort> _ports_2 = it.getPorts();
        KPort _createPort_2 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function_2 = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.SOUTH);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "aspect", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_2 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_2, _function_2);
        _ports_2.add(_doubleArrow_2);
        String _name = ModelDiagramSynthesis.this.getName(weaver);
        KText _addText = ModelDiagramSynthesis.this._kRenderingExtensions.addText(it, _name);
        final Procedure1<KText> _function_3 = new Procedure1<KText>() {
          public void apply(final KText it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setFontBold(it, true);
          }
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
      }
    };
    final KNode weaverNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    return weaverNode;
  }
  
  /**
   * Create generator node and its connections.
   */
  private KNode drawGenerator(final Generator generator) {
    KNode _createNode = this._kNodeExtensions.createNode(generator);
    KNode _associateWith = this.<KNode>associateWith(_createNode, generator);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        EList<KPort> _ports = it.getPorts();
        KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.WEST);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "in", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow = ObjectExtensions.<KPort>operator_doubleArrow(_createPort, _function);
        _ports.add(_doubleArrow);
        EList<KPort> _ports_1 = it.getPorts();
        KPort _createPort_1 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function_1 = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.EAST);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "out", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_1 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_1, _function_1);
        _ports_1.add(_doubleArrow_1);
        EList<KPort> _ports_2 = it.getPorts();
        KPort _createPort_2 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function_2 = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.SOUTH);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "tr in", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_2 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_2, _function_2);
        _ports_2.add(_doubleArrow_2);
        EList<KPort> _ports_3 = it.getPorts();
        KPort _createPort_3 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function_3 = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.NORTH);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "tr out", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_3 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_3, _function_3);
        _ports_3.add(_doubleArrow_3);
        String _name = ModelDiagramSynthesis.this.getName(generator);
        KText _addText = ModelDiagramSynthesis.this._kRenderingExtensions.addText(it, _name);
        final Procedure1<KText> _function_4 = new Procedure1<KText>() {
          public void apply(final KText it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setFontBold(it, true);
            KAreaPlacementData _setAreaPlacementData = ModelDiagramSynthesis.this._kRenderingExtensions.setAreaPlacementData(it);
            KAreaPlacementData _from = ModelDiagramSynthesis.this._kRenderingExtensions.from(_setAreaPlacementData, ModelDiagramSynthesis.this._kRenderingExtensions.LEFT, 10, 0, ModelDiagramSynthesis.this._kRenderingExtensions.TOP, 10, 0);
            ModelDiagramSynthesis.this._kRenderingExtensions.to(_from, ModelDiagramSynthesis.this._kRenderingExtensions.RIGHT, 10, 0, ModelDiagramSynthesis.this._kRenderingExtensions.BOTTOM, 10, 0);
          }
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_4);
      }
    };
    final KNode generatorNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    return generatorNode;
  }
  
  /**
   * Draw a trace model
   */
  private KNode drawTraceModel(final TraceModel traceModel) {
    KNode _xblockexpression = null;
    {
      EList<NodeSetRelation> _nodeSetRelations = traceModel.getNodeSetRelations();
      final Function1<NodeSetRelation, String> _function = new Function1<NodeSetRelation, String>() {
        public String apply(final NodeSetRelation it) {
          EList<NodeType> _sourceNodes = it.getSourceNodes();
          final Function1<NodeType, String> _function = new Function1<NodeType, String>() {
            public String apply(final NodeType it) {
              JvmType _type = it.getType();
              return _type.getSimpleName();
            }
          };
          List<String> _map = ListExtensions.<NodeType, String>map(_sourceNodes, _function);
          String _join = IterableExtensions.join(_map, ",");
          String _plus = ("(" + _join);
          String _plus_1 = (_plus + ":");
          EList<NodeType> _targetNodes = it.getTargetNodes();
          final Function1<NodeType, String> _function_1 = new Function1<NodeType, String>() {
            public String apply(final NodeType it) {
              JvmType _type = it.getType();
              return _type.getSimpleName();
            }
          };
          List<String> _map_1 = ListExtensions.<NodeType, String>map(_targetNodes, _function_1);
          String _join_1 = IterableExtensions.join(_map_1, ",");
          String _plus_2 = (_plus_1 + _join_1);
          return (_plus_2 + ")");
        }
      };
      List<String> _map = ListExtensions.<NodeSetRelation, String>map(_nodeSetRelations, _function);
      final String contentLabel = IterableExtensions.join(_map, " ");
      KNode _createNode = this._kNodeExtensions.createNode(traceModel);
      KNode _associateWith = this.<KNode>associateWith(_createNode, traceModel);
      final Procedure1<KNode> _function_1 = new Procedure1<KNode>() {
        public void apply(final KNode it) {
          ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
          EList<KPort> _ports = it.getPorts();
          KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
          final Procedure1<KPort> _function = new Procedure1<KPort>() {
            public void apply(final KPort it) {
              ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
              ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.SOUTH);
              KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
              KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
              KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
              ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
              ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "in", 8, KlighdConstants.DEFAULT_FONT_NAME);
            }
          };
          KPort _doubleArrow = ObjectExtensions.<KPort>operator_doubleArrow(_createPort, _function);
          _ports.add(_doubleArrow);
          EList<KPort> _ports_1 = it.getPorts();
          KPort _createPort_1 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
          final Procedure1<KPort> _function_1 = new Procedure1<KPort>() {
            public void apply(final KPort it) {
              ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
              ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayoutOptions.PORT_SIDE, PortSide.NORTH);
              KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
              KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
              KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
              ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
              ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "out", 8, KlighdConstants.DEFAULT_FONT_NAME);
            }
          };
          KPort _doubleArrow_1 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_1, _function_1);
          _ports_1.add(_doubleArrow_1);
          KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
          final Procedure1<KRectangle> _function_2 = new Procedure1<KRectangle>() {
            public void apply(final KRectangle it) {
              ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 2);
              KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("lightblue");
              KColor _color_1 = ModelDiagramSynthesis.this._kColorExtensions.getColor("white");
              ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackgroundGradient(it, _color, _color_1, 0);
              KColor _color_2 = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
              ModelDiagramSynthesis.this._kRenderingExtensions.setShadow(it, _color_2);
              KGridPlacement _setGridPlacement = ModelDiagramSynthesis.this._kContainerRenderingExtensions.setGridPlacement(it, 1);
              KGridPlacement _from = ModelDiagramSynthesis.this._kRenderingExtensions.from(_setGridPlacement, ModelDiagramSynthesis.this._kRenderingExtensions.LEFT, 10, 0, ModelDiagramSynthesis.this._kRenderingExtensions.TOP, 10, 0);
              ModelDiagramSynthesis.this._kRenderingExtensions.to(_from, ModelDiagramSynthesis.this._kRenderingExtensions.RIGHT, 10, 0, ModelDiagramSynthesis.this._kRenderingExtensions.BOTTOM, 10, 0);
              String _name = traceModel.getName();
              KText _addText = ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, _name);
              final Procedure1<KText> _function = new Procedure1<KText>() {
                public void apply(final KText it) {
                  ModelDiagramSynthesis.this._kRenderingExtensions.setFontBold(it, true);
                }
              };
              ObjectExtensions.<KText>operator_doubleArrow(_addText, _function);
              KPolyline _addHorizontalLine = ModelDiagramSynthesis.this._kContainerRenderingExtensions.addHorizontalLine(it, 3);
              final Procedure1<KPolyline> _function_1 = new Procedure1<KPolyline>() {
                public void apply(final KPolyline it) {
                  ModelDiagramSynthesis.this._kRenderingExtensions.setLineStyle(it, LineStyle.DASH);
                  ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 1);
                }
              };
              ObjectExtensions.<KPolyline>operator_doubleArrow(_addHorizontalLine, _function_1);
              ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, contentLabel);
            }
          };
          ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_2);
        }
      };
      _xblockexpression = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function_1);
    }
    return _xblockexpression;
  }
  
  private String getName(final Generator generator) {
    JvmType _reference = generator.getReference();
    String _simpleName = _reference.getSimpleName();
    return ("G " + _simpleName);
  }
  
  private String getName(final Weaver weaver) {
    JvmType _reference = weaver.getReference();
    String _simpleName = _reference.getSimpleName();
    return ("W " + _simpleName);
  }
  
  private KNode createAnonymousMetamodel(final Processor generator) {
    if (generator instanceof Generator) {
      return _createAnonymousMetamodel((Generator)generator);
    } else if (generator instanceof Weaver) {
      return _createAnonymousMetamodel((Weaver)generator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(generator).toString());
    }
  }
}
