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
    
    override KNode transform(Model model) {
        val root = model.createNode().associateWith(model);
        
        root => [
        	it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization")
            it.addLayoutParam(LayoutOptions::SPACING, 75f)
            it.addLayoutParam(LayoutOptions::DIRECTION, Direction::UP)

			model.metamodels.forEach[seq | seq.metamodels.forEach[metamodel | it.children += metamodel.createMetamodel(seq)]]
			
            model.connections.filter(Generator).forEach[generator | it.children += generator.createGenerator(it.children, null)]
            model.connections.filter(Weaver).forEach[weaver |
            	val weaveNode = weaver.createWeaver 
            	it.children += weaveNode
            	if (weaver.aspectModel instanceof Generator) {
            		val modelNode = (weaver.aspectModel as Generator).createAnonymousMetamodel
            		it.children += modelNode
            		it.children += (weaver.aspectModel as Generator).createGenerator(it.children, modelNode)
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
	def KNode createAnonymousMetamodel(Generator generator) {
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
	
	private def KEdge createModelEdge(KNode source, KNode target) {
		createEdge() => [
			it.source = source
            it.target = target
            it.addPolyline()
		]
	}
	
	private def KNode createWeaver(Weaver weaver) {
		weaver.createNode().associateWith(weaver) => [
			it.addText(weaver.name)
		]
	}
	
	private def KNode createGenerator(Generator generator, EList<KNode> nodes, KNode anonymousTargetNode) {
		val generatorNode = generator.createNode().associateWith(generator) => [
			it.addText(generator.name)
		]
		
		val sourceModelNode = nodes.findFirst[
			it.data.filter(Metamodel).filter[
				System.out.println("==> " + it)
				it.equals(generator.sourceModel.reference)
			].size>0
		]
		createModelEdge(sourceModelNode, generatorNode)
		
		if (generator.targetModel != null) {
			val targetModelNode = nodes.findFirst[it.data.filter(Metamodel).filter[it.equals(generator.targetModel.reference)].size>0]
			createModelEdge(generatorNode, targetModelNode)
		} else {
			createModelEdge(generatorNode, anonymousTargetNode)
		}
		
		return generatorNode
	}
	
	private def String getName(Generator generator) {
		return generator.generator.importedNamespace.split('\\.').last
	}
    
    private def String getName(Weaver weaver) {
		return weaver.weaver.importedNamespace.split('\\.').last
	}
}
