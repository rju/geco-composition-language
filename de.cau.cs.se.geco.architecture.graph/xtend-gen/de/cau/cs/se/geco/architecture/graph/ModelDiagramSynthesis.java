package de.cau.cs.se.geco.architecture.graph;

import com.google.common.collect.ImmutableList;
import de.cau.cs.kieler.klighd.KlighdConstants;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KGridPlacement;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KRectangle;
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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.elk.alg.layered.properties.LayeredOptions;
import org.eclipse.elk.core.options.PortConstraints;
import org.eclipse.elk.core.options.PortSide;
import org.eclipse.elk.graph.KEdge;
import org.eclipse.elk.graph.KNode;
import org.eclipse.elk.graph.KPort;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelDiagramSynthesis /* extends /* AbstractDiagramSynthesis<GecoModel> */  */{
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
  @Override
  public List<SynthesisOption> getDisplayedSynthesisOptions() {
    return ImmutableList.<SynthesisOption>of(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE, ModelDiagramSynthesis.ROUTING, ModelDiagramSynthesis.SPACING);
  }
  
  @Override
  public KNode transform(final /* GecoModel */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from KGraphElement to KNode"
      + "\nThe field ModelDiagramSynthesis.generatorNodes refers to the missing type Generator"
      + "\nThe method createEdgesForGenerator(KNode, Generator, KNode) from the type ModelDiagramSynthesis refers to the missing type Generator"
      + "\nThe field ModelDiagramSynthesis.weaverNodes refers to the missing type Weaver"
      + "\nThe method createEdgesForWeaver(Weaver, KNode) from the type ModelDiagramSynthesis refers to the missing type Weaver"
      + "\ncreateNode cannot be resolved"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nmodels cannot be resolved"
      + "\ncreateNamedModels cannot be resolved"
      + "\nfragments cannot be resolved"
      + "\ncreateAllToplevelGenerators cannot be resolved"
      + "\nfragments cannot be resolved"
      + "\ncreateAllWeavers cannot be resolved");
  }
  
  /**
   * Create connection between models and weaver
   */
  private void createEdgesForWeaver(final /* Weaver */Object weaver, final KNode weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nCombinedModel cannot be resolved to a type."
      + "\nCombinedModel cannot be resolved to a type."
      + "\nSeparateModels cannot be resolved to a type."
      + "\nSeparateModels cannot be resolved to a type."
      + "\nThe method createSourceBaseModelEdgeForWeaver(Weaver, KNode) from the type ModelDiagramSynthesis refers to the missing type Weaver"
      + "\nThe method createTargetBaseModelEdgeForWeaver(Weaver, KNode) from the type ModelDiagramSynthesis refers to the missing type Weaver"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method createAdviceModelEdgeForWeaver(CombinedModel, KNode) from the type ModelDiagramSynthesis refers to the missing type CombinedModel"
      + "\nThe method createPointcutModelEdgeForWeaver(SeparateModels, KNode) from the type ModelDiagramSynthesis refers to the missing type SeparateModels"
      + "\naspectModel cannot be resolved"
      + "\naspectModel cannot be resolved"
      + "\naspectModel cannot be resolved");
  }
  
  /**
   * edge to the source base model of the weaver.
   */
  private KEdge createSourceBaseModelEdgeForWeaver(final /* Weaver */Object weaver, final KNode weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nThe field ModelDiagramSynthesis.targetWeaverModelNodes refers to the missing type Weaver"
      + "\nsourceModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\npredecessingWeaver cannot be resolved");
  }
  
  /**
   * edge to the source base model of the weaver.
   */
  private KEdge createTargetBaseModelEdgeForWeaver(final /* Weaver */Object weaver, final KNode weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nThe field ModelDiagramSynthesis.targetWeaverModelNodes refers to the missing type Weaver"
      + "\ntargetModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved");
  }
  
  /**
   * create an edge between weaver and advice or aspect model.
   */
  private KEdge createAdviceModelEdgeForWeaver(final /* CombinedModel */Object adviceModel, final KNode weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nTargetModel cannot be resolved to a type."
      + "\nGenerator cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nThe field ModelDiagramSynthesis.targetGeneratorModelNodes refers to the missing type Generator"
      + "\nreference cannot be resolved");
  }
  
  /**
   * create an edge between weaver and advice or aspect model.
   */
  private KEdge createPointcutModelEdgeForWeaver(final /* SeparateModels */Object separatePointcutAdviceModel, final KNode weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nThe method createAdviceModelEdgeForWeaver(CombinedModel, KNode) from the type ModelDiagramSynthesis refers to the missing type CombinedModel"
      + "\npointcut cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nadvice cannot be resolved");
  }
  
  /**
   * Create edges between the generator and the models.
   */
  private void createEdgesForGenerator(final KNode root, final /* Generator */Object generator, final KNode generatorNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nWeaver cannot be resolved to a type."
      + "\nThe method or field traceModel is undefined for the type Object"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nThe field ModelDiagramSynthesis.targetGeneratorModelNodes refers to the missing type Generator"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe field ModelDiagramSynthesis.traceModelNodes refers to the missing type TraceModel"
      + "\nsourceModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nsourceTraceModels cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Create all weaver nodes.
   */
  private void createAllWeavers(final /* EList<Fragment> */Object fragments, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Weaver is undefined"
      + "\nThe method or field aspectModel is undefined for the type Object"
      + "\nThe method or field targetModel is undefined for the type Object"
      + "\nThe method drawWeaver(Weaver) from the type ModelDiagramSynthesis refers to the missing type Weaver"
      + "\nThe field ModelDiagramSynthesis.weaverNodes refers to the missing type Weaver"
      + "\nThe method createAnonymousModel(Generator) from the type ModelDiagramSynthesis refers to the missing type Generator"
      + "\nThe field ModelDiagramSynthesis.targetWeaverModelNodes refers to the missing type Weaver"
      + "\ncreateSublevelGenerator cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  /**
   * Check if the aspect or advice model are in fact generators.
   */
  private void createSublevelGenerator(final /* AspectModel */Object aspectModel, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nGenerator cannot be resolved to a type."
      + "\nSeparateModels cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ncreateSublevelGenerator cannot be resolved"
      + "\nadvice cannot be resolved"
      + "\ncreateSublevelGenerator cannot be resolved");
  }
  
  /**
   * Create a sublevel generator which is used as privder of an
   * aspect model of a weaver.
   */
  private void createSublevelGenerator(final /* Generator */Object generator, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nTraceModel cannot be resolved to a type."
      + "\nTraceModel cannot be resolved to a type."
      + "\nTraceModelReference cannot be resolved to a type."
      + "\nTraceModelReference cannot be resolved to a type."
      + "\nThe field ModelDiagramSynthesis.targetGeneratorModelNodes refers to the missing type Generator"
      + "\nThe field ModelDiagramSynthesis.generatorNodes refers to the missing type Generator"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe field ModelDiagramSynthesis.traceModelNodes refers to the missing type TraceModel"
      + "\ndrawGenerator cannot be resolved"
      + "\ncreateAnonymousModel cannot be resolved"
      + "\ntargetTraceModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntargetTraceModel cannot be resolved"
      + "\ntargetTraceModel cannot be resolved"
      + "\ncreateTraceModel cannot be resolved"
      + "\ntargetTraceModel cannot be resolved"
      + "\ntraceModel cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved"
      + "\nports cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  /**
   * Create all generators which are directly declared in the model.
   */
  public void createAllToplevelGenerators(final /* EList<Fragment> */Object fragments, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Generator is undefined"
      + "\nThe method drawGenerator(Generator) from the type ModelDiagramSynthesis refers to the missing type Generator"
      + "\nThe field ModelDiagramSynthesis.generatorNodes refers to the missing type Generator"
      + "\nThe method handleTraceModel(Generator, KNode) from the type ModelDiagramSynthesis refers to the missing type Generator");
  }
  
  /**
   * Create a tracemodel if one is required.
   */
  public void handleTraceModel(final /* Generator */Object generator, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nTraceModel cannot be resolved to a type."
      + "\nTraceModel cannot be resolved to a type."
      + "\ntargetTraceModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetTraceModel cannot be resolved"
      + "\ntargetTraceModel cannot be resolved"
      + "\ncreateTraceModel cannot be resolved");
  }
  
  /**
   * Create all explicit defined models.
   */
  public void createNamedModels(final /* EList<ModelSequence> */Object models, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field models is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method createModel(Model, ModelSequence) from the type ModelDiagramSynthesis refers to the missing type Model"
      + "\nThe field ModelDiagramSynthesis.modelNodes refers to the missing type Model"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Create trace model node.
   */
  private KNode createTraceModel(final /* TraceModel */Object traceModel, final KNode parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method drawTraceModel(TraceModel) from the type ModelDiagramSynthesis refers to the missing type TraceModel"
      + "\nThe field ModelDiagramSynthesis.traceModelNodes refers to the missing type TraceModel");
  }
  
  /**
   * Create an anonymous target model for a generator. This happens
   * when the output is not specified and a weaver is used instead.
   * 
   * @param generator the generator.
   */
  private KNode _createAnonymousModel(final /* Generator */Object generator) {
    throw new Error("Unresolved compilation problems:"
      + "\ntargetModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nreference cannot be resolved");
  }
  
  /**
   * Create an anonymous source model for a weaver.
   */
  private KNode _createAnonymousModel(final /* Weaver */Object weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nresolveWeaverSourceModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  /**
   * Create a model node for a given model and type.
   */
  private KNode createModel(final /* Model */Object model, final /* ModelSequence */Object sequence) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateNode cannot be resolved"
      + "\nassociateWith cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  /**
   * Draw a model
   */
  private KNode drawModelRectangle(final KNode node, final String instanceName, final String className) {
    final Procedure1<KNode> _function = (KNode it) -> {
      this.<KNode, PortConstraints>setLayoutOption(it, LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
      EList<KPort> _ports = it.getPorts();
      KPort _createPort = this._kPortExtensions.createPort();
      final Procedure1<KPort> _function_1 = (KPort it_1) -> {
        this._kPortExtensions.setPortSize(it_1, 2, 2);
        this.<KPort, PortSide>setLayoutOption(it_1, LayeredOptions.PORT_SIDE, PortSide.WEST);
        KRectangle _addRectangle = this._kRenderingExtensions.addRectangle(it_1);
        KColor _color = this._kColorExtensions.getColor("black");
        KRectangle _setBackground = this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
        this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
        this._kLabelExtensions.addInsidePortLabel(it_1, "in", 8, KlighdConstants.DEFAULT_FONT_NAME);
      };
      KPort _doubleArrow = ObjectExtensions.<KPort>operator_doubleArrow(_createPort, _function_1);
      _ports.add(_doubleArrow);
      EList<KPort> _ports_1 = it.getPorts();
      KPort _createPort_1 = this._kPortExtensions.createPort();
      final Procedure1<KPort> _function_2 = (KPort it_1) -> {
        this._kPortExtensions.setPortSize(it_1, 2, 2);
        this.<KPort, PortSide>setLayoutOption(it_1, LayeredOptions.PORT_SIDE, PortSide.EAST);
        KRectangle _addRectangle = this._kRenderingExtensions.addRectangle(it_1);
        KColor _color = this._kColorExtensions.getColor("black");
        KRectangle _setBackground = this._kRenderingExtensions.<KRectangle>setBackground(_addRectangle, _color);
        this._kRenderingExtensions.setLineJoin(_setBackground, LineJoin.JOIN_ROUND);
        this._kLabelExtensions.addInsidePortLabel(it_1, "out", 8, KlighdConstants.DEFAULT_FONT_NAME);
      };
      KPort _doubleArrow_1 = ObjectExtensions.<KPort>operator_doubleArrow(_createPort_1, _function_2);
      _ports_1.add(_doubleArrow_1);
      KRectangle _addRectangle = this._kRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_3 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setLineWidth(it_1, 2);
        KColor _color = this._kColorExtensions.getColor("white");
        KColor _color_1 = this._kColorExtensions.getColor("LemonChiffon");
        this._kRenderingExtensions.<KRectangle>setBackgroundGradient(it_1, _color, _color_1, 0);
        KColor _color_2 = this._kColorExtensions.getColor("black");
        this._kRenderingExtensions.setShadow(it_1, _color_2);
        KGridPlacement _setGridPlacement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KGridPlacement _from = this._kRenderingExtensions.from(_setGridPlacement, this._kRenderingExtensions.LEFT, 15, 0, this._kRenderingExtensions.TOP, 15, 0);
        this._kRenderingExtensions.to(_from, this._kRenderingExtensions.RIGHT, 15, 0, this._kRenderingExtensions.BOTTOM, 15, 0);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, ((instanceName + " : ") + className));
        final Procedure1<KText> _function_4 = (KText it_2) -> {
          this._kRenderingExtensions.setFontBold(it_2, true);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_4);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_3);
    };
    return ObjectExtensions.<KNode>operator_doubleArrow(node, _function);
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
  
  private KNode drawWeaver(final /* Weaver */Object weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\ncreateNode cannot be resolved"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nhasSeparatePointcut cannot be resolved"
      + "\nhasSeparatePointcut cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private boolean hasSeparatePointcut(final /* Weaver */Object weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\nreference cannot be resolved");
  }
  
  /**
   * Create generator node and its connections.
   */
  private KNode drawGenerator(final /* Generator */Object generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\ncreateNode cannot be resolved"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Draw a trace model
   */
  private KNode drawTraceModel(final /* TraceModel */Object traceModel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field sourceNodes is undefined for the type Object"
      + "\nThe method or field type is undefined for the type Object"
      + "\nThe method or field targetNodes is undefined for the type Object"
      + "\nThe method or field type is undefined for the type Object"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nThe method or field ports is undefined for the type KGraphElement"
      + "\nnodeSetRelations cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\njoin cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncreateNode cannot be resolved"
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private String getName(final /* Generator */Object generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  private String getName(final /* Weaver */Object weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  private KNode createAnonymousModel(final Generator generator) {
    if (generator != null) {
      return _createAnonymousModel(generator); else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(generator).toString());
      }
    }
  }
  