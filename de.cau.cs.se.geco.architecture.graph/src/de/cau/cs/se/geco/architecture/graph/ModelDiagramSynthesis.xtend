package de.cau.cs.se.geco.architecture.graph

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
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.Weaver
import javax.inject.Inject

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.kieler.core.kgraph.KEdge
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import java.util.Map
import java.util.HashMap
import de.cau.cs.se.geco.architecture.architecture.Connection

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
    
    val Map<EObject,KNode> nodes = new HashMap<EObject,KNode>()
    
    override KNode transform(Model model) {
        val root = model.createNode().associateWith(model);
        
        root => [
        	it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization")
            it.addLayoutParam(LayoutOptions::SPACING, 75f)
            it.addLayoutParam(LayoutOptions::DIRECTION, Direction::UP)

			model.metamodels.forEach[seq | seq.metamodels.forEach[metamodel | 
				val metaModelNode = metamodel.createMetamodel(seq)
				nodes.put(metamodel,metaModelNode)
				it.children += metaModelNode
			]]
			
            model.connections.filter(Generator).forEach[generator | 
            	val generatorNode = generator.createGenerator(this.nodes.get(generator.targetModel.reference))
            	nodes.put(generator, generatorNode)
            	it.children += generatorNode
            ]
            model.connections.filter(Weaver).forEach[weaver |
            	val weaverNode = weaver.createWeaver 
            	nodes.put(weaver, weaverNode)
            	it.children += weaverNode
            	if (weaver.aspectModel instanceof Generator) {
            		val generator = (weaver.aspectModel as Generator)
            		val modelNode = generator.createAnonymousMetamodel
            		val generatorNode = generator.createGenerator(modelNode)
            		nodes.put(generator, generatorNode)
            		
            		createModelEdge(modelNode, weaverNode)
            		
            		it.children += modelNode
            		it.children += generatorNode
            	}
            	if (weaver.targetModel == null) {
            		/** use implicit target model. */
            		val modelNode = weaver.createAnonymousMetamodel
            		createModelEdge(weaverNode, modelNode)
            		it.children += modelNode
            	} else {
            		createModelEdge(weaverNode, nodes.get(weaver.targetModel))
            	}
            ]
        ]      
        
        return root;
    }
	
	/**
	 * When a generator is declared as an aspect model source, its
	 * target meta-model is not explicitly specified. Therefore,
	 * an anonymous metamodel is placed in the graph instead
	 */
	def KNode createAnonymousMetamodel(Connection connection) {
		createNode() => [
			it.addRectangle => [
				it.lineWidth = 2
				it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
                it.shadow = "black".color
                it.setGridPlacement(2).from(LEFT, 2, 0, TOP, 2, 0).to(RIGHT, 2, 0, BOTTOM, 2, 0)
                it.addText(":" + "Use JDT")
			]
		]
	}
	
	private def KNode createMetamodel(Metamodel metamodel, MetamodelSequence sequence) {
		metamodel.createNode().associateWith(metamodel) => [
			it.addRectangle => [
				it.lineWidth = 2
				it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
                it.shadow = "black".color
                it.setGridPlacement(2).from(LEFT, 2, 0, TOP, 2, 0).to(RIGHT, 2, 0, BOTTOM, 2, 0)
                it.addText(metamodel.name + ":" + sequence.type.resolveType.name)
			]
		]
	}
	
	/**
	 * Create an edge between a model and a generator or weaver.
	 */
	private def KEdge createModelEdge(KNode source, KNode target) {
		createEdge() => [
			it.source = source
            it.target = target
            it.addPolyline.addHeadArrowDecorator
		]
	}
	
	/**
	 * Create an edge between a model and the weaver or generator.
	 * Input only for main model.
	 */
	private def KEdge createModelEdgeNoArrow(KNode source, KNode target) {
		createEdge() => [
			it.source = source
            it.target = target
            it.addPolyline
		]
	}
	
	private def KNode createWeaver(Weaver weaver) {
		val weaverNode = weaver.createNode().associateWith(weaver) => [
			it.addText(weaver.name)
		]
		
		val sourceModelNode = this.nodes.get(weaver.sourceModel.reference)
		createModelEdgeNoArrow(sourceModelNode, weaverNode)
		
		return weaverNode
	}
	
	/**
	 * Create generator node and its connections.
	 */
	private def KNode createGenerator(Generator generator, KNode targetModelNode) {
		val generatorNode = generator.createNode().associateWith(generator) => [
			it.addText(generator.name)
		]
		
		val sourceModelNode = this.nodes.get(generator.sourceModel.reference)
		createModelEdgeNoArrow(sourceModelNode, generatorNode)
		createModelEdge(generatorNode, targetModelNode)
		
		return generatorNode
	}
	
	private def String getName(Generator generator) {
		return generator.generator.importedNamespace.split('\\.').last
	}
    
    private def String getName(Weaver weaver) {
		return weaver.weaver.importedNamespace.split('\\.').last
	}
}
