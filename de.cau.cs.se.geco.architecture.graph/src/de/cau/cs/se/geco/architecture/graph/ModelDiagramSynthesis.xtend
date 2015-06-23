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
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator

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
    
    val Map<Weaver,KNode> weaverNodes = new HashMap<Weaver,KNode>()
    val Map<Generator,KNode> generatorNodes = new HashMap<Generator,KNode>()
    val Map<Weaver,KNode> targetWeaverModelNodes = new HashMap<Weaver,KNode>()
    val Map<Generator,KNode> targetGeneratorModelNodes = new HashMap<Generator,KNode>()
    val Map<Metamodel,KNode> metamodelNodes = new HashMap<Metamodel,KNode>()
    
    /*
    		val sourceModelNode = this.metamodelNodes.get(generator.sourceModel.reference)
		createModelEdgeNoArrow(sourceModelNode, generatorNode)
		createModelEdge(generatorNode, targetModelNode)
    */
    
    override KNode transform(Model model) {
        val root = model.createNode().associateWith(model);
        
        root => [
        	it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization")
            it.addLayoutParam(LayoutOptions::SPACING, 75f)
            it.addLayoutParam(LayoutOptions::DIRECTION, Direction::RIGHT)

			model.metamodels.forEach[seq | seq.metamodels.forEach[metamodel | 
				val metaModelNode = metamodel.createMetamodel(seq)
				metamodelNodes.put(metamodel, metaModelNode)
				it.children += metaModelNode
			]]
			
            model.connections.filter(Generator).forEach[generator | 
            	val generatorNode = generator.createGenerator
            	generatorNodes.put(generator, generatorNode)
            	it.children += generatorNode
            ]
            model.connections.filter(Weaver).forEach[weaver |
            	val weaverNode = weaver.createWeaver 
            	weaverNodes.put(weaver, weaverNode)
            	it.children += weaverNode
            	if (weaver.aspectModel instanceof Generator) {
            		val generator = (weaver.aspectModel as Generator)
            		val generatorNode = generator.createGenerator
            		val anonymousMetamodelNode = generator.createAnonymousMetamodel
            		targetGeneratorModelNodes.put(generator, anonymousMetamodelNode)
            		generatorNodes.put(generator, generatorNode)
            		it.children += generatorNode
            		it.children += anonymousMetamodelNode
            	}
            ]
        ]
        
        generatorNodes.forEach[generator, generatorNode |
        	val sourceModelNode = metamodelNodes.get(generator.sourceModel.reference)
        	val targetModelNode = if (generator.targetModel.reference != null) {
        		metamodelNodes.get(generator.targetModel.reference)
        	} else {
        		if (generator.eContainer instanceof Weaver) {
        			targetGeneratorModelNodes.get(generator)
        		} else {
        			throw new Exception("Broken model.")
        		}
        	}
        	createConnectionNoArrow(sourceModelNode, generatorNode)
        	createConnectionWithArrow(generatorNode, targetModelNode)
        ]
        return root;
    }
	
	/**
	 * When a generator is declared as an aspect model source, its
	 * target meta-model is not explicitly specified. Therefore,
	 * an anonymous metamodel is placed in the graph instead
	 */
	private def dispatch KNode createAnonymousMetamodel(Generator generator) {
		val instanceName = "anonyoums" 
		val className = if (generator.targetModel.reference != null)
			generator.targetModel.reference.resolveType.simpleName
		else
			generator.generator.simpleName
			
		createMetamodel(createNode(), instanceName, className)
	}
	
	private def dispatch KNode createAnonymousMetamodel(Weaver weaver) {
		val instanceName = weaver.resolveWeaverSourceModel.name
		val className = if (weaver.targetModel != null)
			if (weaver.targetModel.reference != null)
				weaver.targetModel.reference.resolveType.simpleName
			else
				weaver.resolveWeaverSourceModel.resolveType.simpleName
		else
			weaver.resolveWeaverSourceModel.resolveType.simpleName
		
		createMetamodel(createNode(), instanceName, className)
	}
	
	private def KNode createMetamodel(Metamodel metamodel, MetamodelSequence sequence) {
		createMetamodel(metamodel.createNode().associateWith(metamodel), 
			metamodel.name, sequence.type.resolveType.simpleName
		) 
	}
	
	private def KNode createMetamodel(KNode node, String instanceName, String className) {
		node => [
			it.addRectangle => [
				it.lineWidth = 2
				it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
                it.shadow = "black".color
                it.setGridPlacement(2).from(LEFT, 2, 0, TOP, 2, 0).to(RIGHT, 2, 0, BOTTOM, 2, 0)
                it.addText(instanceName + " : " + className)
			]
		]
	}
	
	/**
	 * Create an edge between a model and a generator or weaver.
	 */
	private def KEdge createConnectionWithArrow(KNode source, KNode target) {
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
	private def KEdge createConnectionNoArrow(KNode source, KNode target) {
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
//		
//		if (weaver.sourceModel == null) { /** chaining weavers. */
//			createModelEdgeNoArrow(targetWeaverModelNodes.get(weaver.predecessingWeaver), weaverNode)
//		} else { /** dedicated named input model. */
//			createModelEdgeNoArrow(this.connectionNodes.get(weaver.resolveWeaverSourceModel), weaverNode)
//		}
//
		return weaverNode
	}
	
	/**
	 * Create generator node and its connections.
	 */
	private def KNode createGenerator(Generator generator) {
		val generatorNode = generator.createNode().associateWith(generator) => [
			it.addText(generator.name)
		]
				
		return generatorNode
	}
	
	private def String getName(Generator generator) {
		return generator.generator.simpleName
	}
    
    private def String getName(Weaver weaver) {
		return weaver.weaver.simpleName
	}
}
