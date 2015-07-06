package de.cau.cs.se.geco.architecture.graph

import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.se.geco.architecture.architecture.Connection
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
import de.cau.cs.se.geco.architecture.architecture.TraceModel
import de.cau.cs.se.geco.architecture.architecture.Weaver
import java.util.HashMap
import java.util.Map
import javax.inject.Inject
import org.eclipse.emf.common.util.EList

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.LineJoin
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.EdgeType
import de.cau.cs.kieler.core.math.KVectorChain

class ModelDiagramSynthesis extends AbstractDiagramSynthesis<Model> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    private val GENERATOR_IN = 0
    private val GENERATOR_OUT = 1
    private val GENERATOR_TR_IN = 2
    private val GENERATOR_TR_OUT = 3
    
    private val WEAVER_IN = 0
    private val WEAVER_OUT = 1
    private val WEAVER_ASPECT = 2
    
    private val TRACE_MODEL_IN = 0
    private val TRACE_MODEL_OUT = 1
    
    private val MODEL_IN = 0
    private val MODEL_OUT = 1
    
    
    val Map<Weaver,KNode> weaverNodes = new HashMap<Weaver,KNode>()
    val Map<Generator,KNode> generatorNodes = new HashMap<Generator,KNode>()
    val Map<Weaver,KNode> targetWeaverModelNodes = new HashMap<Weaver,KNode>()
    val Map<Generator,KNode> targetGeneratorModelNodes = new HashMap<Generator,KNode>()
    val Map<Metamodel,KNode> metamodelNodes = new HashMap<Metamodel,KNode>()
	val Map<TraceModel,KNode> traceModelNodes = new HashMap<TraceModel,KNode>()
       
    override KNode transform(Model model) {
        val root = model.createNode().associateWith(model);
        
        root => [
        	it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
            it.addLayoutParam(LayoutOptions::SPACING, 25f)
            it.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT)
            it.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            
			model.metamodels.createNamedMetaModels(it)
            model.connections.createAllToplevelGenerators(it)
            model.connections.createAllWeavers(it)
            
            generatorNodes.forEach[generator, generatorNode | it.createEdgesForGenerator(generator, generatorNode)]
            weaverNodes.forEach[weaver, weaverNode | it.createEdgesForWeaver(weaver, weaverNode)]    	
        ]
                
        return root;
    }
	
	/**
	 * Create connection between models and weaver
	 */
	def void createEdgesForWeaver(KNode root, Weaver weaver, KNode weaverNode) {
		val sourceModelNode = if (weaver.sourceModel != null) {
    		metamodelNodes.get(weaver.sourceModel.reference)
    	} else {
    		targetWeaverModelNodes.get(weaver.predecessingWeaver)
    	}
    	val targetModelNode = if (weaver.targetModel != null) {
    		metamodelNodes.get(weaver.targetModel.reference)
    	} else {
    		targetWeaverModelNodes.get(weaver)
    	}
    	val aspectModelNode = if (weaver.aspectModel instanceof TargetModelNodeType) {
    		metamodelNodes.get((weaver.aspectModel as TargetModelNodeType).reference)
    	} else {
    		targetGeneratorModelNodes.get((weaver.aspectModel as Generator))
    	}
    	
    	drawConnectionNoArrow(sourceModelNode, weaverNode, LineStyle.SOLID) => [
    		it.sourcePort = sourceModelNode.ports.get(MODEL_OUT)
    		it.targetPort = weaverNode.ports.get(WEAVER_IN)
    	]
    	drawConnectionWithArrow(weaverNode, targetModelNode, LineStyle.SOLID) => [
    		it.sourcePort = weaverNode.ports.get(WEAVER_OUT)
    		it.targetPort = targetModelNode.ports.get(MODEL_IN)
    	]
    	drawConnectionWithArrow(aspectModelNode, weaverNode, LineStyle.SOLID) => [
    		it.sourcePort = aspectModelNode.ports.get(MODEL_OUT)
    		it.targetPort = weaverNode.ports.get(WEAVER_ASPECT)
    	]
	}
	
	/**
	 * Create edges between the generator and the models.
	 */
	private def void createEdgesForGenerator(KNode root, Generator generator, KNode generatorNode) {
    	val sourceModelNode = if (generator.sourceModel.reference !=null) {
    		metamodelNodes.get(generator.sourceModel.reference)
    	} else {
    		val anonymousMetamodelNode = drawMetamodelRectangle(createNode(), "", "empty")
    		root.children += anonymousMetamodelNode
    		anonymousMetamodelNode
    	}
    	val targetModelNode = if (generator.targetModel.reference != null) {
    		metamodelNodes.get(generator.targetModel.reference)
    	} else {
    		if (generator.eContainer instanceof Weaver) {
    			targetGeneratorModelNodes.get(generator)
    		} else {
    			throw new Exception("Broken model.")
    		}
    	}
    	generator.readTraceModels.forEach[traceModel |
    		val traceModelNode = traceModelNodes.get(traceModel.traceModel)
    		drawConnectionWithArrow(traceModelNode, generatorNode, LineStyle.DASH) => [
    			sourcePort = traceModelNode.ports.get(TRACE_MODEL_OUT)
    			targetPort = generatorNode.ports.get(GENERATOR_TR_IN)
    		]
    	]
    	
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
	def void createAllWeavers(EList<Connection> connections, KNode parent) {
		connections.filter(Weaver).forEach[weaver |
        	val weaverNode = weaver.drawWeaver 
        	weaverNodes.put(weaver, weaverNode)
        	parent.children += weaverNode
        	if (weaver.aspectModel instanceof Generator) 
        		(weaver.aspectModel as Generator).createSublevelGenerator(parent)
        	if (weaver.targetModel == null) {
        		val anonymousMetamodelNode = weaver.createAnonymousMetamodel
        		targetWeaverModelNodes.put(weaver, anonymousMetamodelNode)
        		parent.children += anonymousMetamodelNode
        	}
        		
        ]
	}
	
	/**
	 * Create a sublevel generator which is used as privder of an
	 * aspect model of a weaver.
	 */
	def void createSublevelGenerator(Generator generator, KNode parent) {
		/**
		 * When a generator is declared as an aspect model source, its
		 * target meta-model is not explicitly specified. Therefore,
		 * an anonymous metamodel is placed in the graph instead
		 */
		val generatorNode = generator.drawGenerator
		val anonymousMetamodelNode = generator.createAnonymousMetamodel
		targetGeneratorModelNodes.put(generator, anonymousMetamodelNode)
		generatorNodes.put(generator, generatorNode)
		
		/** create trace model and write edge. */
		if (generator.writeTraceModel != null) {
			val traceModelNode = switch(generator.writeTraceModel) {
				TraceModel: (generator.writeTraceModel as TraceModel).createTraceModel(parent)
				TraceModelReference: traceModelNodes.get((generator.writeTraceModel as TraceModelReference).traceModel)
			}
			
			drawConnectionWithArrow(generatorNode, traceModelNode , LineStyle.DASH) => [
				it.sourcePort = generatorNode.ports.get(GENERATOR_TR_OUT) 
				it.targetPort = traceModelNode.ports.get(TRACE_MODEL_IN) 	
			]
		}
		
		parent.children += generatorNode
		parent.children += anonymousMetamodelNode
	}
	
	/**
	 * Create all generators which are directly declared in the model.
	 */
	def void createAllToplevelGenerators(EList<Connection> connections, KNode parent) {
		connections.filter(Generator).forEach[generator | 
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
		if (generator.writeTraceModel != null) {
			if (generator.writeTraceModel instanceof TraceModel) {
				val traceModelNode = (generator.writeTraceModel as TraceModel).createTraceModel(parent)
				
        		parent.children += traceModelNode
			} 
        }
	}
	
	/**
	 * Create all explicit defined metamodels.
	 */
	def void createNamedMetaModels(EList<MetamodelSequence> metamodels, KNode parent) {
		metamodels.forEach[seq | seq.metamodels.forEach[metamodel | 
			val metaModelNode = metamodel.createMetamodel(seq)
			metamodelNodes.put(metamodel, metaModelNode)
			parent.children += metaModelNode
		]]
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
	 * Create an anonymous target metamodel for a generator. This happens
	 * when the output is not specified and a weaver is used instead.
	 * 
	 * @param generator the generator.
	 */
	private def dispatch KNode createAnonymousMetamodel(Generator generator) {
		val instanceName = "" 
		val className = if (generator.targetModel.reference != null)
			generator.targetModel.reference.resolveType.simpleName
		else
			generator.reference.simpleName
			
		drawMetamodelRectangle(createNode(), instanceName, className)
	}
	
	/**
	 * Create an anonymous source model for a weaver.
	 */
	private def dispatch KNode createAnonymousMetamodel(Weaver weaver) {
		val instanceName = weaver.resolveWeaverSourceModel.name
		val className = if (weaver.targetModel != null)
			if (weaver.targetModel.reference != null)
				weaver.targetModel.reference.resolveType.simpleName
			else
				weaver.resolveWeaverSourceModel.resolveType.simpleName
		else
			weaver.resolveWeaverSourceModel.resolveType.simpleName
		
		drawMetamodelRectangle(createNode(), instanceName, className)
	}
	
	/**
	 * Create a metamodel node for a given metamodel and type.
	 */
	private def KNode createMetamodel(Metamodel metamodel, MetamodelSequence sequence) {
		drawMetamodelRectangle(metamodel.createNode().associateWith(metamodel), 
			metamodel.name, sequence.type.resolveType.simpleName
		) 
	}
	
	/**
	 * Draw a metamodel
	 */
	private def KNode drawMetamodelRectangle(KNode node, String instanceName, String className) {
		node => [
			it.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			
			it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
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
			it.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			
			it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("aspect", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
			it.addText(weaver.name) => [
               	it.fontBold = true
            ]
		]

		return weaverNode
	}
	
	/**
	 * Create generator node and its connections.
	 */
	private def KNode drawGenerator(Generator generator) {
		val generatorNode = generator.createNode().associateWith(generator) => [
			it.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
    		
			it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.EAST)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("tr in", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.NORTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("tr out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
			it.addText(generator.name) => [
              	it.fontBold = true
              	it.setAreaPlacementData.from(LEFT, 10, 0, TOP, 10, 0).to(RIGHT, 10, 0, BOTTOM, 10, 0)
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
    		it.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.SOUTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("out", 8, KlighdConstants.DEFAULT_FONT_NAME)
    		])
    		it.ports.add(createPort() => [
    			it.setPortSize(2,2)
    			it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.NORTH)
    			it.addRectangle.setBackground("black".color).lineJoin=LineJoin.JOIN_ROUND
                
                // last but not least add a label exhibiting the ports name
                it.addInsidePortLabel("in", 8, KlighdConstants.DEFAULT_FONT_NAME)
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
		return "G " + generator.reference.simpleName
	}
    
    private def String getName(Weaver weaver) {
		return "W " + weaver.reference.simpleName
	}
}
