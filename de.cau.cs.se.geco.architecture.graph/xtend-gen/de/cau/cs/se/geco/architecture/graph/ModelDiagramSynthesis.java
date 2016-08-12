package de.cau.cs.se.geco.architecture.graph;

import com.google.common.collect.ImmutableList;
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
import com.google.common.collect.Iterables;
import de.cau.cs.kieler.klighd.KlighdConstants;
=======
>>>>>>> minor
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KGridPlacement;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KRectangle;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.LineJoin;
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
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.IWeaverSeparatePointcut;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.elk.alg.layered.properties.LayeredOptions;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.options.EdgeRouting;
import org.eclipse.elk.core.options.NodeLabelPlacement;
import org.eclipse.elk.core.options.PortConstraints;
import org.eclipse.elk.core.options.PortSide;
import org.eclipse.elk.graph.KEdge;
import org.eclipse.elk.graph.KNode;
import org.eclipse.elk.graph.KPort;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelDiagramSynthesis extends AbstractDiagramSynthesis<GecoModel> {
  @Inject
  @Extension
  private /* KNodeExtensions */Object _kNodeExtensions;
  
  @Inject
  @Extension
  private /* KEdgeExtensions */Object _kEdgeExtensions;
  
  @Inject
  @Extension
  private /* KPortExtensions */Object _kPortExtensions;
  
  @Inject
  @Extension
  private /* KLabelExtensions */Object _kLabelExtensions;
  
  @Inject
  @Extension
  private /* KRenderingExtensions */Object _kRenderingExtensions;
  
  @Inject
  @Extension
  private /* KContainerRenderingExtensions */Object _kContainerRenderingExtensions;
  
  @Inject
  @Extension
  private /* KPolylineExtensions */Object _kPolylineExtensions;
  
  @Inject
  @Extension
  private /* KColorExtensions */Object _kColorExtensions;
  
  @Extension
  private /* KRenderingFactory */Object _kRenderingFactory /* Skipped initializer because of errors */;
  
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
  
  private final /* Map<Weaver, KNode> */Object weaverNodes /* Skipped initializer because of errors */;
  
  private final /* Map<Generator, KNode> */Object generatorNodes /* Skipped initializer because of errors */;
  
  private final /* Map<Weaver, KNode> */Object targetWeaverModelNodes /* Skipped initializer because of errors */;
  
  private final /* Map<Generator, KNode> */Object targetGeneratorModelNodes /* Skipped initializer because of errors */;
  
  private final /* Map<Model, KNode> */Object modelNodes /* Skipped initializer because of errors */;
  
  private final /* Map<TraceModel, KNode> */Object traceModelNodes /* Skipped initializer because of errors */;
  
  /**
   * {@inheritDoc}<br>
   * <br>
   * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
   */
  public List<SynthesisOption> getDisplayedSynthesisOptions() {
    return ImmutableList.<SynthesisOption>of(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE, ModelDiagramSynthesis.ROUTING, ModelDiagramSynthesis.SPACING);
  }
  
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  public KNode transform(final GecoModel model) {
    KNode _createNode = this._kNodeExtensions.createNode(model);
    final KNode root = this.<KNode>associateWith(_createNode, model);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        Object _objectValue = ModelDiagramSynthesis.this.getObjectValue(ModelDiagramSynthesis.SPACING);
        ModelDiagramSynthesis.this.<KNode, Float>setLayoutOption(it, LayeredOptions.SPACING_BORDER, ((Float) _objectValue));
        ModelDiagramSynthesis.this.<KNode, Direction>setLayoutOption(it, LayeredOptions.DIRECTION, Direction.RIGHT);
        EdgeRouting _switchResult = null;
        Object _objectValue_1 = ModelDiagramSynthesis.this.getObjectValue(ModelDiagramSynthesis.ROUTING);
        boolean _matched = false;
        if (Objects.equal(_objectValue_1, ModelDiagramSynthesis.ROUTING_POLYLINE)) {
          _matched=true;
          _switchResult = EdgeRouting.POLYLINE;
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
        ModelDiagramSynthesis.this.<KNode, EdgeRouting>setLayoutOption(it, LayeredOptions.EDGE_ROUTING, _switchResult);
        EList<ModelSequence> _models = model.getModels();
        ModelDiagramSynthesis.this.createNamedModels(_models, it);
        EList<Fragment> _fragments = model.getFragments();
        ModelDiagramSynthesis.this.createAllToplevelGenerators(_fragments, it);
        EList<Fragment> _fragments_1 = model.getFragments();
        ModelDiagramSynthesis.this.createAllWeavers(_fragments_1, it);
        final BiConsumer<Generator, KNode> _function = new BiConsumer<Generator, KNode>() {
          public void accept(final Generator generator, final KNode generatorNode) {
            ModelDiagramSynthesis.this.createEdgesForGenerator(it, generator, generatorNode);
          }
        };
        ModelDiagramSynthesis.this.generatorNodes.forEach(_function);
        final BiConsumer<Weaver, KNode> _function_1 = new BiConsumer<Weaver, KNode>() {
          public void accept(final Weaver weaver, final KNode weaverNode) {
            ModelDiagramSynthesis.this.createEdgesForWeaver(weaver, weaverNode);
          }
        };
        ModelDiagramSynthesis.this.weaverNodes.forEach(_function_1);
      }
    };
    ObjectExtensions.<KNode>operator_doubleArrow(root, _function);
    return root;
=======
  public /* KNode */Object transform(final GecoModel model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type GecoModel"
      + "\nThe method addLayoutParam(Object, String) is undefined for the type KGraphElement"
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nDirection cannot be resolved to a type."
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nEdgeRouting cannot be resolved to a type."
      + "\nEdgeRouting cannot be resolved to a type."
      + "\nEdgeRouting cannot be resolved to a type."
      + "\nThe method createNamedModels(EList<ModelSequence>, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe method createAllToplevelGenerators(EList<Fragment>, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe method createAllWeavers(EList<Fragment>, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.generatorNodes refers to the missing type KNode"
      + "\nThe method createEdgesForGenerator(KNode, Generator, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.weaverNodes refers to the missing type KNode"
      + "\nThe method createEdgesForWeaver(Weaver, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nALGORITHM cannot be resolved"
      + "\nSPACING cannot be resolved"
      + "\nDIRECTION cannot be resolved"
      + "\nRIGHT cannot be resolved"
      + "\nEDGE_ROUTING cannot be resolved"
      + "\nPOLYLINE cannot be resolved"
      + "\nORTHOGONAL cannot be resolved"
      + "\nSPLINES cannot be resolved");
>>>>>>> minor
  }
  
  /**
   * Create connection between models and weaver
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
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
=======
  private void createEdgesForWeaver(final Weaver weaver, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createSourceBaseModelEdgeForWeaver(Weaver, KNode) from the type ModelDiagramSynthesis refers to the missing type Object"
      + "\nThe method createTargetBaseModelEdgeForWeaver(Weaver, KNode) from the type ModelDiagramSynthesis refers to the missing type Object"
      + "\nThe method createAdviceModelEdgeForWeaver(CombinedModel, KNode) from the type ModelDiagramSynthesis refers to the missing type Object"
      + "\nThe method createPointcutModelEdgeForWeaver(SeparateModels, KNode) from the type ModelDiagramSynthesis refers to the missing type Object");
>>>>>>> minor
  }
  
  /**
   * edge to the source base model of the weaver.
   */
  private Object createSourceBaseModelEdgeForWeaver(final Weaver weaver, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.targetWeaverModelNodes refers to the missing type KNode"
      + "\nThe method drawConnectionNoArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nSOLID cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  /**
   * edge to the source base model of the weaver.
   */
  private Object createTargetBaseModelEdgeForWeaver(final Weaver weaver, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.targetWeaverModelNodes refers to the missing type KNode"
      + "\nThe method drawConnectionWithArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nSOLID cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  /**
   * create an edge between weaver and advice or aspect model.
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  private KEdge createAdviceModelEdgeForWeaver(final CombinedModel adviceModel, final KNode weaverNode) {
    KEdge _xblockexpression = null;
    {
      KNode _switchResult = null;
      boolean _matched = false;
      if (adviceModel instanceof TargetModel) {
        _matched=true;
        Model _reference = ((TargetModel)adviceModel).getReference();
        _switchResult = this.modelNodes.get(_reference);
      }
      if (!_matched) {
        if (adviceModel instanceof Generator) {
          _matched=true;
          _switchResult = this.targetGeneratorModelNodes.get(adviceModel);
        }
      }
      final KNode aspectModelNode = _switchResult;
      KEdge _drawConnectionWithArrow = this.drawConnectionWithArrow(aspectModelNode, weaverNode, LineStyle.SOLID);
      final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
        public void apply(final KEdge it) {
          EList<KPort> _ports = aspectModelNode.getPorts();
          KPort _get = _ports.get(ModelDiagramSynthesis.MODEL_OUT);
          it.setSourcePort(_get);
          EList<KPort> _ports_1 = weaverNode.getPorts();
          KPort _get_1 = _ports_1.get(ModelDiagramSynthesis.WEAVER_ASPECT);
          it.setTargetPort(_get_1);
        }
      };
      _xblockexpression = ObjectExtensions.<KEdge>operator_doubleArrow(_drawConnectionWithArrow, _function);
    }
    return _xblockexpression;
=======
  private Object createAdviceModelEdgeForWeaver(final CombinedModel adviceModel, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.targetGeneratorModelNodes refers to the missing type KNode"
      + "\nThe method drawConnectionWithArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nSOLID cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved");
>>>>>>> minor
  }
  
  /**
   * create an edge between weaver and advice or aspect model.
   */
  private Object createPointcutModelEdgeForWeaver(final SeparateModels separatePointcutAdviceModel, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nThe method drawConnectionWithArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nThe method createAdviceModelEdgeForWeaver(CombinedModel, KNode) from the type ModelDiagramSynthesis refers to the missing type Object"
      + "\nSOLID cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  /**
   * Create edges between the generator and the models.
   */
  private void createEdgesForGenerator(final /* KNode */Object root, final Generator generator, final /* KNode */Object generatorNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined"
      + "\nThe method targetPort(Object) is undefined"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nThe method drawModelRectangle(KNode, String, String) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.targetGeneratorModelNodes refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.traceModelNodes refers to the missing type KNode"
      + "\nThe method drawConnectionWithArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nThe method drawConnectionNoArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nThe method drawConnectionWithArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nDASH cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nSOLID cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nSOLID cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  /**
   * Create all weaver nodes.
   */
  private void createAllWeavers(final EList<Fragment> fragments, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method drawWeaver(Weaver) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.weaverNodes refers to the missing type KNode"
      + "\nThe method createSublevelGenerator(AspectModel, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe method createAnonymousModel(Fragment) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.targetWeaverModelNodes refers to the missing type KNode"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Check if the aspect or advice model are in fact generators.
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  private void createSublevelGenerator(final AspectModel aspectModel, final KNode parent) {
    boolean _matched = false;
    if (aspectModel instanceof Generator) {
      _matched=true;
      this.createSublevelGenerator(((Generator)aspectModel), parent);
    }
    if (!_matched) {
      if (aspectModel instanceof SeparateModels) {
        _matched=true;
        CombinedModel _advice = ((SeparateModels)aspectModel).getAdvice();
        this.createSublevelGenerator(_advice, parent);
      }
    }
=======
  private void createSublevelGenerator(final AspectModel aspectModel, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createSublevelGenerator(AspectModel, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe method createSublevelGenerator(AspectModel, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode");
>>>>>>> minor
  }
  
  /**
   * Create a sublevel generator which is used as privder of an
   * aspect model of a weaver.
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
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
          TraceModel _traceModel = ((TraceModelReference) _targetTraceModel_1).getTraceModel();
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
    _children_1.add(anonymousModelNode);
=======
  private void createSublevelGenerator(final Generator generator, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nThe method drawGenerator(Generator) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe method createAnonymousModel(Fragment) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.targetGeneratorModelNodes refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.generatorNodes refers to the missing type KNode"
      + "\nThe method createTraceModel(TraceModel, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.traceModelNodes refers to the missing type KNode"
      + "\nThe method drawConnectionWithArrow(KNode, KNode, LineStyle) from the type ModelDiagramSynthesis refers to the missing type KEdge"
      + "\nDASH cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
>>>>>>> minor
  }
  
  /**
   * Create all generators which are directly declared in the model.
   */
  public void createAllToplevelGenerators(final EList<Fragment> fragments, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method drawGenerator(Generator) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.generatorNodes refers to the missing type KNode"
      + "\nThe method handleTraceModel(Generator, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create a tracemodel if one is required.
   */
  public void handleTraceModel(final Generator generator, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createTraceModel(TraceModel, KNode) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create all explicit defined models.
   */
  public void createNamedModels(final EList<ModelSequence> models, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createModel(Model, ModelSequence) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type KNode"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create trace model node.
   */
  private /* KNode */Object createTraceModel(final TraceModel traceModel, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method drawTraceModel(TraceModel) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nThe field ModelDiagramSynthesis.traceModelNodes refers to the missing type KNode"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create an anonymous target model for a generator. This happens
   * when the output is not specified and a weaver is used instead.
   * 
   * @param generator the generator.
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  private KNode _createAnonymousModel(final Generator generator) {
    KNode _xblockexpression = null;
    {
      final String instanceName = "";
      String _xifexpression = null;
      TargetModel _targetModel = generator.getTargetModel();
      boolean _notEquals = (!Objects.equal(_targetModel, null));
      if (_notEquals) {
        TargetModel _targetModel_1 = generator.getTargetModel();
        Model _reference = _targetModel_1.getReference();
        JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_reference);
        _xifexpression = _resolveType.getSimpleName();
      } else {
        String _xifexpression_1 = null;
        JvmType _reference_1 = generator.getReference();
        if ((_reference_1 instanceof JvmGenericType)) {
          String _xblockexpression_1 = null;
          {
            JvmType _reference_2 = generator.getReference();
            final EList<JvmTypeReference> superTypes = ((JvmGenericType) _reference_2).getSuperTypes();
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
              if (interfaceType instanceof JvmParameterizedTypeReference) {
                _matched=true;
                EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference)interfaceType).getArguments();
                JvmTypeReference _get = _arguments.get(1);
                _switchResult = _get.getSimpleName();
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
      _xblockexpression = this.drawModelRectangle(_createNode, instanceName, className);
    }
    return _xblockexpression;
=======
  private /* KNode */Object _createAnonymousModel(final Generator generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined"
      + "\nThe method drawModelRectangle(KNode, String, String) from the type ModelDiagramSynthesis refers to the missing type KNode");
>>>>>>> minor
  }
  
  /**
   * Create an anonymous source model for a weaver.
   */
  private /* KNode */Object _createAnonymousModel(final Weaver weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined"
      + "\nThe method drawModelRectangle(KNode, String, String) from the type ModelDiagramSynthesis refers to the missing type KNode");
  }
  
  /**
   * Create a model node for a given model and type.
   */
  private /* KNode */Object createModel(final Model model, final ModelSequence sequence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type Model"
      + "\nThe method drawModelRectangle(KNode, String, String) from the type ModelDiagramSynthesis refers to the missing type KNode"
      + "\nassociateWith cannot be resolved");
  }
  
  /**
   * Draw a model
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  private KNode drawModelRectangle(final KNode node, final String instanceName, final String className) {
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        EList<KPort> _ports = it.getPorts();
        KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.WEST);
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
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.EAST);
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
=======
  private /* KNode */Object drawModelRectangle(final /* KNode */Object node, final String instanceName, final String className) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method setBackgroundGradient(Object, Object, int) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method shadow(Object) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method setGridPlacement(int) is undefined for the type Object"
      + "\nThe method or field LEFT is undefined"
      + "\nThe method or field TOP is undefined"
      + "\nThe method or field RIGHT is undefined"
      + "\nThe method or field BOTTOM is undefined"
      + "\nThe method addText(String) is undefined for the type Object"
      + "\nThe method fontBold(boolean) is undefined for the type Object"
      + "\n=> cannot be resolved"
      + "\nPORT_CONSTRAINTS cannot be resolved"
      + "\nFIXED_SIDE cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nWEST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nEAST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved");
>>>>>>> minor
  }
  
  /**
   * Create an edge between a model and a generator or weaver.
   */
  private /* KEdge */Object drawConnectionWithArrow(final /* KNode */Object source, final /* KNode */Object target, final /* LineStyle */Object lineStyle) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createEdge() is undefined"
      + "\nThe method source(KNode) is undefined for the type Object"
      + "\nThe method target(KNode) is undefined for the type Object"
      + "\nThe method or field addPolyline is undefined for the type Object"
      + "\nThe method or field addHeadArrowDecorator is undefined for the type Object"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method lineStyle(LineStyle) is undefined for the type Object"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved");
  }
  
  /**
   * Create an edge between a model and the weaver or generator.
   * Input only for main model.
   */
  private /* KEdge */Object drawConnectionNoArrow(final /* KNode */Object source, final /* KNode */Object target, final /* LineStyle */Object lineStyle) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createEdge() is undefined"
      + "\nThe method source(KNode) is undefined for the type Object"
      + "\nThe method target(KNode) is undefined for the type Object"
      + "\nThe method or field addPolyline is undefined for the type Object"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method lineStyle(LineStyle) is undefined for the type Object"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved");
  }
  
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  private KNode drawWeaver(final Weaver weaver) {
    KNode _createNode = this._kNodeExtensions.createNode(weaver);
    KNode _associateWith = this.<KNode>associateWith(_createNode, weaver);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        EList<KPort> _ports = it.getPorts();
        KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.WEST);
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
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.EAST);
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
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.SOUTH);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            String _xifexpression = null;
            boolean _hasSeparatePointcut = ModelDiagramSynthesis.this.hasSeparatePointcut(weaver);
            if (_hasSeparatePointcut) {
              _xifexpression = "advice";
            } else {
              _xifexpression = "aspect";
            }
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, _xifexpression, 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_2 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_2, _function_2);
        _ports_2.add(_doubleArrow_2);
        boolean _hasSeparatePointcut = ModelDiagramSynthesis.this.hasSeparatePointcut(weaver);
        if (_hasSeparatePointcut) {
          EList<KPort> _ports_3 = it.getPorts();
          KPort _createPort_3 = ModelDiagramSynthesis.this._kPortExtensions.createPort();
          final Procedure1<KPort> _function_3 = new Procedure1<KPort>() {
            public void apply(final KPort it) {
              ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
              ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.SOUTH);
              EnumSet<NodeLabelPlacement> _insideBottomLeft = NodeLabelPlacement.insideBottomLeft();
              ModelDiagramSynthesis.this.<KPort, EnumSet<NodeLabelPlacement>>setLayoutOption(it, LayeredOptions.NODE_LABELS_PLACEMENT, _insideBottomLeft);
              KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
              KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
              KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
              ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
              ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "pointcut", 8, KlighdConstants.DEFAULT_FONT_NAME);
            }
          };
          KPort _doubleArrow_3 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_3, _function_3);
          _ports_3.add(_doubleArrow_3);
        }
        KRoundedRectangle _addRoundedRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRoundedRectangle(it, 5, 5);
        final Procedure1<KRoundedRectangle> _function_4 = new Procedure1<KRoundedRectangle>() {
          public void apply(final KRoundedRectangle it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 0);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("white");
            ModelDiagramSynthesis.this._kRenderingExtensions.<KRoundedRectangle>setBackground(it, _color);
            KColor _color_1 = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            ModelDiagramSynthesis.this._kRenderingExtensions.setShadow(it, _color_1);
            KGridPlacement _setGridPlacement = ModelDiagramSynthesis.this._kContainerRenderingExtensions.setGridPlacement(it, 1);
            KGridPlacement _from = ModelDiagramSynthesis.this._kRenderingExtensions.from(_setGridPlacement, ModelDiagramSynthesis.this._kRenderingExtensions.LEFT, 15, 0, ModelDiagramSynthesis.this._kRenderingExtensions.TOP, 15, 0);
            ModelDiagramSynthesis.this._kRenderingExtensions.to(_from, ModelDiagramSynthesis.this._kRenderingExtensions.RIGHT, 15, 0, ModelDiagramSynthesis.this._kRenderingExtensions.BOTTOM, 15, 0);
            String _name = ModelDiagramSynthesis.this.getName(weaver);
            KText _addText = ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, _name);
            final Procedure1<KText> _function = new Procedure1<KText>() {
              public void apply(final KText it) {
                ModelDiagramSynthesis.this._kRenderingExtensions.setFontBold(it, true);
              }
            };
            ObjectExtensions.<KText>operator_doubleArrow(_addText, _function);
          }
        };
        ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function_4);
      }
    };
    final KNode weaverNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    return weaverNode;
=======
  private /* KNode */Object drawWeaver(final Weaver weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type Weaver"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field NodeLabelPlacement is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method addRoundedRectangle(int, int) is undefined for the type KGraphElement"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method setBackground(Object) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method shadow(Object) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method setGridPlacement(int) is undefined for the type Object"
      + "\nThe method or field LEFT is undefined"
      + "\nThe method or field TOP is undefined"
      + "\nThe method or field RIGHT is undefined"
      + "\nThe method or field BOTTOM is undefined"
      + "\nThe method addText(String) is undefined for the type Object"
      + "\nThe method fontBold(boolean) is undefined for the type Object"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_CONSTRAINTS cannot be resolved"
      + "\nFIXED_SIDE cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nWEST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nEAST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nNODE_LABEL_PLACEMENT cannot be resolved"
      + "\ninsideBottomLeft cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved");
>>>>>>> minor
  }
  
  private boolean hasSeparatePointcut(final Weaver weaver) {
    boolean _xifexpression = false;
    JvmType _reference = weaver.getReference();
    if ((_reference instanceof JvmGenericType)) {
      JvmType _reference_1 = weaver.getReference();
      EList<JvmTypeReference> _superTypes = ((JvmGenericType) _reference_1).getSuperTypes();
      final Function1<JvmTypeReference, Boolean> _function = new Function1<JvmTypeReference, Boolean>() {
        public Boolean apply(final JvmTypeReference it) {
          JvmType _type = it.getType();
          String _qualifiedName = _type.getQualifiedName();
          String _canonicalName = IWeaverSeparatePointcut.class.getCanonicalName();
          return Boolean.valueOf(_qualifiedName.equals(_canonicalName));
        }
      };
      _xifexpression = IterableExtensions.<JvmTypeReference>exists(_superTypes, _function);
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
  
  /**
   * Create generator node and its connections.
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
  private KNode drawGenerator(final Generator generator) {
    KNode _createNode = this._kNodeExtensions.createNode(generator);
    KNode _associateWith = this.<KNode>associateWith(_createNode, generator);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
        EList<KPort> _ports = it.getPorts();
        KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
        final Procedure1<KPort> _function = new Procedure1<KPort>() {
          public void apply(final KPort it) {
            ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.WEST);
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
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.EAST);
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
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.SOUTH);
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
            ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.NORTH);
            KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            KRectangle _setBackground = ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
            ModelDiagramSynthesis.this._kLabelExtensions.addInsidePortLabel(it, "tr out", 8, KlighdConstants.DEFAULT_FONT_NAME);
          }
        };
        KPort _doubleArrow_3 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_3, _function_3);
        _ports_3.add(_doubleArrow_3);
        KRoundedRectangle _addRoundedRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRoundedRectangle(it, 5, 5);
        final Procedure1<KRoundedRectangle> _function_4 = new Procedure1<KRoundedRectangle>() {
          public void apply(final KRoundedRectangle it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 0);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("lightgray");
            ModelDiagramSynthesis.this._kRenderingExtensions.<KRoundedRectangle>setBackground(it, _color);
            KColor _color_1 = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            ModelDiagramSynthesis.this._kRenderingExtensions.setShadow(it, _color_1);
            KGridPlacement _setGridPlacement = ModelDiagramSynthesis.this._kContainerRenderingExtensions.setGridPlacement(it, 1);
            KGridPlacement _from = ModelDiagramSynthesis.this._kRenderingExtensions.from(_setGridPlacement, ModelDiagramSynthesis.this._kRenderingExtensions.LEFT, 15, 0, ModelDiagramSynthesis.this._kRenderingExtensions.TOP, 15, 0);
            ModelDiagramSynthesis.this._kRenderingExtensions.to(_from, ModelDiagramSynthesis.this._kRenderingExtensions.RIGHT, 15, 0, ModelDiagramSynthesis.this._kRenderingExtensions.BOTTOM, 15, 0);
            String _name = ModelDiagramSynthesis.this.getName(generator);
            KText _addText = ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, _name);
            final Procedure1<KText> _function = new Procedure1<KText>() {
              public void apply(final KText it) {
                ModelDiagramSynthesis.this._kRenderingExtensions.setFontBold(it, true);
              }
            };
            ObjectExtensions.<KText>operator_doubleArrow(_addText, _function);
          }
        };
        ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function_4);
      }
    };
    final KNode generatorNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    return generatorNode;
=======
  private /* KNode */Object drawGenerator(final Generator generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type Generator"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method addRoundedRectangle(int, int) is undefined for the type KGraphElement"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method setBackground(Object) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method shadow(Object) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method setGridPlacement(int) is undefined for the type Object"
      + "\nThe method or field LEFT is undefined"
      + "\nThe method or field TOP is undefined"
      + "\nThe method or field RIGHT is undefined"
      + "\nThe method or field BOTTOM is undefined"
      + "\nThe method addText(String) is undefined for the type Object"
      + "\nThe method fontBold(boolean) is undefined for the type Object"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_CONSTRAINTS cannot be resolved"
      + "\nFIXED_SIDE cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nWEST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nEAST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nNORTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved");
>>>>>>> minor
  }
  
  /**
   * Draw a trace model
   */
<<<<<<< d225b2f9299e294719f06fd488bd8bc549d75843
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
          ModelDiagramSynthesis.this.<KNode, PortConstraints>setLayoutOption(it, LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
          EList<KPort> _ports = it.getPorts();
          KPort _createPort = ModelDiagramSynthesis.this._kPortExtensions.createPort();
          final Procedure1<KPort> _function = new Procedure1<KPort>() {
            public void apply(final KPort it) {
              ModelDiagramSynthesis.this._kPortExtensions.setPortSize(it, 2, 2);
              ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.SOUTH);
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
              ModelDiagramSynthesis.this.<KPort, PortSide>setLayoutOption(it, LayeredOptions.PORT_SIDE, PortSide.NORTH);
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
=======
  private /* KNode */Object drawTraceModel(final TraceModel traceModel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type TraceModel"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type KGraphElement"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, String) is undefined for the type KGraphElement"
      + "\nThe method or field addRectangle is undefined for the type KGraphElement"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method setBackgroundGradient(Object, Object, int) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method shadow(Object) is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method setGridPlacement(int) is undefined for the type Object"
      + "\nThe method or field LEFT is undefined"
      + "\nThe method or field TOP is undefined"
      + "\nThe method or field RIGHT is undefined"
      + "\nThe method or field BOTTOM is undefined"
      + "\nThe method addText(String) is undefined for the type Object"
      + "\nThe method fontBold(boolean) is undefined for the type Object"
      + "\nThe method addHorizontalLine(int) is undefined for the type Object"
      + "\nThe method lineStyle(Object) is undefined for the type Object"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method lineWidth(int) is undefined for the type Object"
      + "\nThe method addText(String) is undefined for the type Object"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_CONSTRAINTS cannot be resolved"
      + "\nFIXED_SIDE cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nNORTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nDASH cannot be resolved");
>>>>>>> minor
  }
  
  private String getName(final Generator generator) {
    JvmType _reference = generator.getReference();
    return _reference.getSimpleName();
  }
  
  private String getName(final Weaver weaver) {
    JvmType _reference = weaver.getReference();
    return _reference.getSimpleName();
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
