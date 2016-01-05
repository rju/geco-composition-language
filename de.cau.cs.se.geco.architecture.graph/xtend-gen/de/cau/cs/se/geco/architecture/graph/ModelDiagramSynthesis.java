package de.cau.cs.se.geco.architecture.graph;

import com.google.common.collect.ImmutableList;
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
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelDiagramSynthesis /* implements AbstractDiagramSynthesis<GecoModel>  */{
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
  private final static /* SynthesisOption */Object TRACE_MODEL_VISIBLE /* Skipped initializer because of errors */;
  
  private final static /* SynthesisOption */Object ROUTING /* Skipped initializer because of errors */;
  
  private final static /* SynthesisOption */Object SPACING /* Skipped initializer because of errors */;
  
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
  public /* ImmutableList<SynthesisOption> */Object getDisplayedSynthesisOptions() {
    return ImmutableList.<SynthesisOption>of(ModelDiagramSynthesis.TRACE_MODEL_VISIBLE, ModelDiagramSynthesis.ROUTING, ModelDiagramSynthesis.SPACING);
  }
  
  public /* KNode */Object transform(final GecoModel model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type GecoModel"
      + "\nThe method addLayoutParam(Object, String) is undefined for the type Object"
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nThe method setLayoutOption(Object, Float) is undefined for the type Object"
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nDirection cannot be resolved to a type."
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nLayoutOptions cannot be resolved to a type."
      + "\nEdgeRouting cannot be resolved to a type."
      + "\nEdgeRouting cannot be resolved to a type."
      + "\nEdgeRouting cannot be resolved to a type."
      + "\nassociateWith cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nALGORITHM cannot be resolved"
      + "\nSPACING cannot be resolved"
      + "\nobjectValue cannot be resolved"
      + "\nDIRECTION cannot be resolved"
      + "\nRIGHT cannot be resolved"
      + "\nEDGE_ROUTING cannot be resolved"
      + "\nobjectValue cannot be resolved"
      + "\nPOLYLINE cannot be resolved"
      + "\nORTHOGONAL cannot be resolved"
      + "\nSPLINES cannot be resolved");
  }
  
  /**
   * Create connection between models and weaver
   */
  private void createEdgesForWeaver(final Weaver weaver, final /* KNode */Object weaverNode) {
    this.createSourceBaseModelEdgeForWeaver(weaver, weaverNode);
    this.createTargetBaseModelEdgeForWeaver(weaver, weaverNode);
    AspectModel _aspectModel = weaver.getAspectModel();
    boolean _matched = false;
    if (!_matched) {
      if (_aspectModel instanceof CombinedModel) {
        _matched=true;
        AspectModel _aspectModel_1 = weaver.getAspectModel();
        this.createAdviceModelEdgeForWeaver(((CombinedModel) _aspectModel_1), weaverNode);
      }
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
  private Object createSourceBaseModelEdgeForWeaver(final Weaver weaver, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
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
  private Object createAdviceModelEdgeForWeaver(final CombinedModel adviceModel, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
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
  private Object createPointcutModelEdgeForWeaver(final SeparateModels separatePointcutAdviceModel, final /* KNode */Object weaverNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
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
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nobjectValue cannot be resolved"
      + "\nequals cannot be resolved"
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
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Check if the aspect or advice model are in fact generators.
   */
  private void createSublevelGenerator(final AspectModel aspectModel, final /* KNode */Object parent) {
    boolean _matched = false;
    if (!_matched) {
      if (aspectModel instanceof Generator) {
        _matched=true;
        this.createSublevelGenerator(aspectModel, parent);
      }
    }
    if (!_matched) {
      if (aspectModel instanceof SeparateModels) {
        _matched=true;
        CombinedModel _advice = ((SeparateModels)aspectModel).getAdvice();
        this.createSublevelGenerator(_advice, parent);
      }
    }
  }
  
  /**
   * Create a sublevel generator which is used as privder of an
   * aspect model of a weaver.
   */
  private void createSublevelGenerator(final Generator generator, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LineStyle is undefined"
      + "\nThe method sourcePort(Object) is undefined for the type Object"
      + "\nThe method targetPort(Object) is undefined for the type Object"
      + "\nobjectValue cannot be resolved"
      + "\nequals cannot be resolved"
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
  }
  
  /**
   * Create all generators which are directly declared in the model.
   */
  public void createAllToplevelGenerators(final EList<Fragment> fragments, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create a tracemodel if one is required.
   */
  public void handleTraceModel(final Generator generator, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create all explicit defined models.
   */
  public void createNamedModels(final EList<ModelSequence> models, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create trace model node.
   */
  private /* KNode */Object createTraceModel(final TraceModel traceModel, final /* KNode */Object parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  /**
   * Create an anonymous target model for a generator. This happens
   * when the output is not specified and a weaver is used instead.
   * 
   * @param generator the generator.
   */
  private /* KNode */Object _createAnonymousModel(final Generator generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined");
  }
  
  /**
   * Create an anonymous source model for a weaver.
   */
  private /* KNode */Object _createAnonymousModel(final Weaver weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined");
  }
  
  /**
   * Create a model node for a given model and type.
   */
  private /* KNode */Object createModel(final Model model, final ModelSequence sequence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type Model"
      + "\nassociateWith cannot be resolved");
  }
  
  /**
   * Draw a model
   */
  private /* KNode */Object drawModelRectangle(final /* KNode */Object node, final String instanceName, final String className) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
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
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nEAST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved");
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
  
  private /* KNode */Object drawWeaver(final Weaver weaver) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type Weaver"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field NodeLabelPlacement is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method addRoundedRectangle(int, int) is undefined for the type Object"
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
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nEAST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nNODE_LABEL_PLACEMENT cannot be resolved"
      + "\ninsideBottomLeft cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved");
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
  private /* KNode */Object drawGenerator(final Generator generator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type Generator"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method addRoundedRectangle(int, int) is undefined for the type Object"
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
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nEAST cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nSOUTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nNORTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved");
  }
  
  /**
   * Draw a trace model
   */
  private /* KNode */Object drawTraceModel(final TraceModel traceModel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNode() is undefined for the type TraceModel"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortConstraints is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field ports is undefined for the type Object"
      + "\nThe method createPort() is undefined"
      + "\nThe method setPortSize(int, int) is undefined for the type Object"
      + "\nThe method setLayoutOption(Object, Object) is undefined for the type Object"
      + "\nThe method or field LayoutOptions is undefined"
      + "\nThe method or field PortSide is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
      + "\nThe method or field color is undefined for the type String"
      + "\nThe method or field LineJoin is undefined"
      + "\nThe method addInsidePortLabel(String, int, Object) is undefined for the type Object"
      + "\nThe method or field KlighdConstants is undefined"
      + "\nThe method or field addRectangle is undefined for the type Object"
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
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nPORT_SIDE cannot be resolved"
      + "\nNORTH cannot be resolved"
      + "\nsetBackground cannot be resolved"
      + "\nlineJoin cannot be resolved"
      + "\nJOIN_ROUND cannot be resolved"
      + "\nDEFAULT_FONT_NAME cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nfrom cannot be resolved"
      + "\nto cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nDASH cannot be resolved");
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
