package de.cau.cs.se.geco.architecture.graph

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.LineJoin
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.se.geco.architecture.architecture.AspectModel
import de.cau.cs.se.geco.architecture.architecture.CombinedModel
import de.cau.cs.se.geco.architecture.architecture.Fragment
import de.cau.cs.se.geco.architecture.architecture.GecoModel
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.ModelSequence
import de.cau.cs.se.geco.architecture.architecture.SeparateModels
import de.cau.cs.se.geco.architecture.architecture.TargetModel
import de.cau.cs.se.geco.architecture.architecture.TraceModel
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.framework.IWeaverSeparatePointcut
import java.util.HashMap
import java.util.Map
import javax.inject.Inject
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.NodeLabelPlacement
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
//import org.eclipse.elk.alg.layered.properties.LayeredOptions

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import org.eclipse.elk.alg.layered.options.LayeredOptions

class ModelDiagramSynthesis extends AbstractDiagramSynthesis<GecoModel> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    // extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    /** changes in visualization */
    private static val TRACE_MODEL_VISIBLE_NAME = "Trace models visible"
    private static val TRACE_MODEL_VISIBLE_NO = "No"
    private static val TRACE_MODEL_VISIBLE_YES = "Yes"
        
    /** changes in edge routing */
    private static val ROUTING_NAME = "Edge Routing"
    private static val ROUTING_POLYLINE = "polyline"
    private static val ROUTING_ORTHOGONAL = "orthogonal"
    private static val ROUTING_SPLINES = "splines"
    
    private static val SPACING_NAME = "Spacing"
    
    /**
     * The filter option definition that allows users to customize the constructed class diagrams.
     */
    private static val SynthesisOption TRACE_MODEL_VISIBLE = SynthesisOption::createChoiceOption(TRACE_MODEL_VISIBLE_NAME,
       ImmutableList::of(TRACE_MODEL_VISIBLE_YES, TRACE_MODEL_VISIBLE_NO), TRACE_MODEL_VISIBLE_YES)
              
    private static val SynthesisOption ROUTING = SynthesisOption::createChoiceOption(ROUTING_NAME,
       ImmutableList::of(ROUTING_POLYLINE, ROUTING_ORTHOGONAL, ROUTING_SPLINES), ROUTING_POLYLINE)
       
   	private static val SynthesisOption SPACING = SynthesisOption::createRangeOption(SPACING_NAME, 5f, 200f, 50f)
    
    private static val GENERATOR_IN = 0
    private static val GENERATOR_OUT = 1
    private static val GENERATOR_TR_IN = 2
    private static val GENERATOR_TR_OUT = 3
    
    private static val WEAVER_IN = 0
    private static val WEAVER_OUT = 1
    private static val WEAVER_ASPECT = 2
    private static val WEAVER_POINTCUT = 3
    
    private static val TRACE_MODEL_IN = 0
    private static val TRACE_MODEL_OUT = 1
    
    private static val MODEL_IN = 0
    private static val MODEL_OUT = 1
        
    val Map<Weaver,KNode> weaverNodes = new HashMap<Weaver,KNode>()
    val Map<Generator,KNode> generatorNodes = new HashMap<Generator,KNode>()
    val Map<Weaver,KNode> targetWeaverModelNodes = new HashMap<Weaver,KNode>()
    val Map<Generator,KNode> targetGeneratorModelNodes = new HashMap<Generator,KNode>()
    val Map<Model,KNode> modelNodes = new HashMap<Model,KNode>()
	val Map<TraceModel,KNode> traceModelNodes = new HashMap<TraceModel,KNode>()
	
	/**
     * {@inheritDoc}<br>
     * <br>
     * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
     */
    override public getDisplayedSynthesisOptions() {
        return ImmutableList::of(TRACE_MODEL_VISIBLE, ROUTING, SPACING)
    }
       
    override KNode transform(GecoModel model) {
        val root = model.createNode().associateWith(model);
        
        root => [
//        	it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered") // obsolete
            it.setLayoutOption(LayeredOptions.DIRECTION, Direction::RIGHT)
            it.setLayoutOption(LayeredOptions::EDGE_ROUTING, switch(ROUTING.objectValue) {
            	case ROUTING_POLYLINE: EdgeRouting::POLYLINE
            	case ROUTING_ORTHOGONAL: EdgeRouting::ORTHOGONAL
            	case ROUTING_SPLINES: EdgeRouting::SPLINES
            })
                        
			model.models.createNamedModels(it)
            model.fragments.createAllToplevelGenerators(it)
            model.fragments.createAllWeavers(it)
            
            generatorNodes.forEach[generator, generatorNode | it.createEdgesForGenerator(generator, generatorNode)]
            weaverNodes.forEach[weaver, weaverNode | createEdgesForWeaver(weaver, weaverNode)]    	
        ]
                
        return root;
    }
	
	/**
	 * Create connection between models and weaver
	 */
	private def void createEdgesForWeaver(Weaver weaver, KNode weaverNode) {
		/** source base model node */
		createSourceBaseModelEdgeForWeaver(weaver, weaverNode)
    	
 		/** target base model node */
 		createTargetBaseModelEdgeForWeaver(weaver, weaverNode)
    		
    	/** advice/aspect model node */
    	switch (weaver.aspectModel) {
    		CombinedModel : createAdviceModelEdgeForWeaver(weaver.aspectModel as CombinedModel, weaverNode)
    		SeparateModels : 
    			createPointcutModelEdgeForWeaver(weaver.aspectModel as SeparateModels, weaverNode)
    	}
    	
	}
		
	/**
	 * edge to the source base model of the weaver.
	 */
	private def createSourceBaseModelEdgeForWeaver(Weaver weaver, KNode weaverNode) {
		val sourceModelNode = if (weaver.sourceModel !== null) {
    		modelNodes.get(weaver.sourceModel.reference)
    	} else {
    		targetWeaverModelNodes.get(weaver.predecessingWeaver)
    	}
    	
    	drawConnectionNoArrow(sourceModelNode, weaverNode, LineStyle.SOLID) => [
    		it.sourcePort = sourceModelNode.ports.get(MODEL_OUT)
    		it.targetPort = weaverNode.ports.get(WEAVER_IN)
    	]	
	}
	
	/**
	 * edge to the source base model of the weaver.
	 */
	private def createTargetBaseModelEdgeForWeaver(Weaver weaver, KNode weaverNode) {
		val targetModelNode = if (weaver.targetModel !== null) {
    		modelNodes.get(weaver.targetModel.reference)
    	} else {
    		targetWeaverModelNodes.get(weaver)
    	}
    	
    	drawConnectionWithArrow(weaverNode, targetModelNode, LineStyle.SOLID) => [
    		it.sourcePort = weaverNode.ports.get(WEAVER_OUT)
    		it.targetPort = targetModelNode.ports.get(MODEL_IN)
    	]    
	}
	
	/**
	 * create an edge between weaver and advice or aspect model.
	 */
	private def createAdviceModelEdgeForWeaver(CombinedModel adviceModel, KNode weaverNode) {
    	val aspectModelNode = switch(adviceModel) {
    		TargetModel : modelNodes.get(adviceModel.reference)
    		Generator: targetGeneratorModelNodes.get(adviceModel)
    	}
    	    	
    	drawConnectionWithArrow(aspectModelNode, weaverNode, LineStyle.SOLID) => [
    		it.sourcePort = aspectModelNode.ports.get(MODEL_OUT)
    		it.targetPort = weaverNode.ports.get(WEAVER_ASPECT)
    	]
    	
	}
	
	/**
	 * create an edge between weaver and advice or aspect model.
	 */
	private def createPointcutModelEdgeForWeaver(SeparateModels separatePointcutAdviceModel, KNode weaverNode) {
   		val pointcutModelNode = modelNodes.get(separatePointcutAdviceModel.pointcut.reference)
    	
	    drawConnectionWithArrow(pointcutModelNode, weaverNode, LineStyle.SOLID) => [
	    	it.sourcePort = pointcutModelNode.ports.get(MODEL_OUT)
	    	it.targetPort = weaverNode.ports.get(WEAVER_POINTCUT)
	    ]
	    
	    createAdviceModelEdgeForWeaver(separatePointcutAdviceModel.advice, weaverNode)
	}
	
	
	/**
	 * Create edges between the generator and the models.
	 */
	private def void createEdgesForGenerator(KNode root, Generator generator, KNode generatorNode) {
    	val sourceModelNode = if (generator.sourceModel.reference !== null) {
    		modelNodes.get(generator.sourceModel.reference)
    	} else {
    		val anonymousModelNode = drawModelRectangle(createNode(), "", "empty")
    		root.children += anonymousModelNode
    		anonymousModelNode
    	}
    	val targetModelNode = if (generator.targetModel !== null) {
    		modelNodes.get(generator.targetModel.reference)
    	} else {
    		if (generator.eContainer instanceof Weaver) {
    			targetGeneratorModelNodes.get(generator)
    		} else {
    			throw new Exception("Broken model.")
    		}
    	}
    	if (TRACE_MODEL_VISIBLE.objectValue.equals(TRACE_MODEL_VISIBLE_YES)) {
	    	generator.sourceTraceModels.forEach[traceModel |
	    		val traceModelNode = traceModelNodes.get(traceModel.traceModel)
	    		drawConnectionWithArrow(traceModelNode, generatorNode, LineStyle.DASH) => [
	    			sourcePort = traceModelNode.ports.get(TRACE_MODEL_OUT)
	    			targetPort = generatorNode.ports.get(GENERATOR_TR_IN)
	    		]
	    	]
    	}
    	
    	drawConnectionNoArrow(sourceModelNode, generatorNode, LineStyle.SOLID) => [
    		it.sourcePort = sourceModelNode.ports.get(MODEL_OUT)
    		it.targetPort = generatorNode.ports.get(GENERATOR_IN)
    	]
    	drawConnectionWithArrow(generatorNode, targetModelNode, LineStyle.SOLID) => [
    		it.sourcePort = generatorNode.ports.get(GENERATOR_OUT)
    		it.targetPort = targetModelNode.ports.get(MODEL_IN)
    	]
	}
	
	/**
	 * Create all weaver nodes.
	 */
	private def void createAllWeavers(EList<Fragment> fragments, KNode parent) {
		fragments.filter(Weaver).forEach[weaver |
        	val weaverNode = weaver.drawWeaver 
        	weaverNodes.put(weaver, weaverNode)
        	parent.children += weaverNode
        	weaver.aspectModel.createSublevelGenerator(parent)
        	if (weaver.targetModel === null) {
        		val anonymousModelNode = weaver.createAnonymousModel
        		targetWeaverModelNodes.put(weaver, anonymousModelNode)
        		parent.children += anonymousModelNode
        	}
        		
        ]
	}
	
	/**
	 * Check if the aspect or advice model are in fact generators.
	 */
	private def void createSublevelGenerator(AspectModel aspectModel, KNode parent) {
		switch (aspectModel) {
			Generator: aspectModel.createSublevelGenerator(parent)
			SeparateModels : aspectModel.advice.createSublevelGenerator(parent)
		}        		
	}
	
	/**
	 * Create a sublevel generator which is used as privder of an
	 * aspect model of a weaver.
	 */
	private def void createSublevelGenerator(Generator generator, KNode parent) {
		/**
		 * When a generator is declared as an aspect model source, its
		 * target model is not explicitly specified. Therefore,
		 * an anonymous model is placed in the graph instead
		 */
		val generatorNode = generator.drawGenerator
		val anonymousModelNode = generator.createAnonymousModel
		targetGeneratorModelNodes.put(generator, anonymousModelNode)
		generatorNodes.put(generator, generatorNode)
		
		/** create trace model and write edge. */
		if (generator.targetTraceModel !== null && TRACE_MODEL_VISIBLE.objectValue.equals(TRACE_MODEL_VISIBLE_YES)) {
			val traceModelNode = switch(generator.targetTraceModel) {
				TraceModel: (generator.targetTraceModel as TraceModel).createTraceModel(parent)
				TraceModelReference: traceModelNodes.get((generator.targetTraceModel as TraceModelReference).traceModel)
			}
			
			drawConnectionWithArrow(generatorNode, traceModelNode , LineStyle.DASH) => [
				it.sourcePort = generatorNode.ports.get(GENERATOR_TR_OUT) 
				it.targetPort = traceModelNode.ports.get(TRACE_MODEL_IN) 	
			]
		}
		
		parent.children += generatorNode
		parent.children += anonymousModelNode
	}
	
	/**
	 * Create all generators which are directly declared in the model.
	 */
	def void createAllToplevelGenerators(EList<Fragment> fragments, KNode parent) {
		fragments.filter(Generator).forEach[generator | 
        	val generatorNode = generator.drawGenerator
        	generatorNodes.put(generator, generatorNode)
        	generator.handleTraceModel(parent)
        	
        	parent.children += generatorNode
        ]
	}
	
	/**
	 * Create a tracemodel if one is required.
	 */
	def void handleTraceModel(Generator generator, KNode parent) {
		if (generator.targetTraceModel !== null) {
			if (generator.targetTraceModel instanceof TraceModel) {
				val traceModelNode = (generator.targetTraceModel as TraceModel).createTraceModel(parent)
				
        		parent.children += traceModelNode
			} 
        }
	}
	
	/**
	 * Create all explicit defined models.
	 */
	def void createNamedModels(EList<ModelSequence> models, KNode parent) {
		models.forEach[seq | 
			seq.models.forEach[model | 
				val modelNode = model.createModel(seq)
				modelNodes.put(model, modelNode)
				parent.children += modelNode
			]
		]
	}
	
    /**
     * Create trace model node.
     */
    private def KNode createTraceModel(TraceModel traceModel, KNode parent) {
    	val traceModelNode = drawTraceModel(traceModel)
		parent.children += traceModelNode
		traceModelNodes.put(traceModel, traceModelNode)
		
		return traceModelNode
    }
    	
	/**
	 * Create an anonymous target model for a generator. This happens
	 * when the output is not specified and a weaver is used instead.
	 * 
	 * @param generator the generator.
	 */
	private def dispatch KNode createAnonymousModel(Generator generator) {
		val instanceName = "" 
		val className = if (generator.targetModel !== null)
			generator.targetModel.reference.resolveType.simpleName
		else {
			if (generator.reference instanceof JvmGenericType) {
				val superTypes = (generator.reference as JvmGenericType).superTypes
				val interfaceType = superTypes.findFirst[it.simpleName.startsWith(IGenerator.simpleName + '<')]
				if (interfaceType !== null) {
					switch (interfaceType) {
						JvmParameterizedTypeReference: interfaceType.arguments.get(1).simpleName
						default: 'ERROR'
					}
				}
			} else {
				'JVM ERROR'
			}	
		} 
			
		drawModelRectangle(createNode(), instanceName, className)
	}
	
	/**
	 * Create an anonymous source model for a weaver.
	 */
	private def dispatch KNode createAnonymousModel(Weaver weaver) {
		val sourceModel = weaver.resolveWeaverSourceModel
		val instanceName = sourceModel.reference.name
		val className = if (weaver.targetModel !== null)
			if (weaver.targetModel.reference !== null)
				weaver.targetModel.reference.resolveType.simpleName
			else
				sourceModel.resolveType.simpleName
		else
			sourceModel.resolveType.simpleName
		
		drawModelRectangle(createNode(), instanceName, className)
	}
	
	/**
	 * Create a model node for a given model and type.
	 */
	private def KNode createModel(Model model, ModelSequence sequence) {
		drawModelRectangle(model.createNode().associateWith(model), 
			model.name, sequence.type.resolveType.simpleName
		) 
	}
	
	/**
	 * Draw a model
	 */
	private def KNode drawModelRectangle(KNode node, String instanceName, String className) {
		node => [
			it.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			
			it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.EAST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		
			it.addRectangle => [
				it.lineWidth = 2
				it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
                it.shadow = "black".color
                it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)
                it.addText(instanceName + " : " + className) => [
                	it.fontBold = true
                ]
			]
		]
	}
	
	/**
	 * Create an edge between a model and a generator or weaver.
	 */
	private def KEdge drawConnectionWithArrow(KNode source, KNode target, LineStyle lineStyle) {
		createEdge() => [
			it.source = source
            it.target = target

            it.addPolyline => [
            	it.addHeadArrowDecorator
            	it.lineWidth = 2
            	it.lineStyle = lineStyle
            ]
		]
	}
	
	/**
	 * Create an edge between a model and the weaver or generator.
	 * Input only for main model.
	 */
	private def KEdge drawConnectionNoArrow(KNode source, KNode target, LineStyle lineStyle) {
		createEdge() => [
			it.source = source
            it.target = target
                                         
            it.addPolyline => [
            	it.lineWidth = 2
            	it.lineStyle = lineStyle
            ]
		]
	}
	
	private def KNode drawWeaver(Weaver weaver) {
		val weaverNode = weaver.createNode().associateWith(weaver) => [
			it.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			
			it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.EAST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.SOUTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel(if (weaver.hasSeparatePointcut) "advice" else "aspect", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		if (weaver.hasSeparatePointcut) {
	    		it.ports.add(createPort() => [
	    			it.setPortSize(2,2)
	    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.SOUTH)
	    			it.setLayoutOption(LayeredOptions.NODE_LABELS_PLACEMENT,  NodeLabelPlacement.insideBottomLeft)
	    			
	    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
	                
	                // last but not least add a label exhibiting the ports name
	                it.addInsidePortLabel("pointcut", 8, KlighdConstants.DEFAULT_FONT_NAME)
	    		])
	    	}
	    	it.addRoundedRectangle(5,5) => [
				it.lineWidth = 0
				it.setBackground("white".color)
                it.shadow = "black".color
                it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)
                it.addText(weaver.name) => [
               		it.fontBold = true
            	]
			]		
        ]

		return weaverNode
	}
	
	private def hasSeparatePointcut(Weaver weaver) {
		if (weaver.reference instanceof JvmGenericType) {
			(weaver.reference as JvmGenericType).superTypes.exists[
				it.type.qualifiedName.equals(IWeaverSeparatePointcut.canonicalName)
			]
		} else
			false
	}
	
	/**
	 * Create generator node and its connections.
	 */
	private def KNode drawGenerator(Generator generator) {
		val generatorNode = generator.createNode().associateWith(generator) => [
			it.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
    		
			it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.EAST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.SOUTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("tr in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.NORTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("tr out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		
            it.addRoundedRectangle(5,5) => [
				it.lineWidth = 0
				it.setBackground("lightgray".color)
                it.shadow = "black".color
                it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)
                it.addText(generator.name) => [
               		it.fontBold = true
            	]
			]
		]
				
		return generatorNode
	}
	
	/**
     * Draw a trace model 
     */
    private def KNode drawTraceModel(TraceModel traceModel) {
    	val contentLabel = traceModel.nodeSetRelations.map[
    		'(' + it.sourceNodes.map[it.type.simpleName].join(',') + ":" +
    		it.targetNodes.map[it.type.simpleName].join(',') + ')'
    	].join(' ')
    	traceModel.createNode().associateWith(traceModel) => [
    		it.setLayoutOption(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.SOUTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.NORTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
			it.addRectangle => [
				it.lineWidth = 2
				it.setBackgroundGradient("lightblue".color, "white".color, 0)
                it.shadow = "black".color
                it.setGridPlacement(1).from(LEFT, 10, 0, TOP, 10, 0).to(RIGHT, 10, 0, BOTTOM, 10, 0)
                it.addText(traceModel.name) => [
                	it.fontBold = true
                ]
                it.addHorizontalLine(3) => [
                	it.lineStyle = LineStyle.DASH
                	it.lineWidth = 1
                ]
				it.addText(contentLabel)
			]
		]
    }
	
	private def String getName(Generator generator) {
		return generator.reference.simpleName
	}
    
    private def String getName(Weaver weaver) {
		return weaver.reference.simpleName
	}
}
