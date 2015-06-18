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
            
            model.connections.filter(Generator).forEach[generator | it.children += generator.createGenerator]
            model.connections.filter(Weaver).forEach[weaver | it.children += weaver.createWeaver]
            
            model.metamodels.forEach[seq | seq.metamodels.forEach[metamodel | it.children += metamodel.createMetamodel(seq)]]
        ]      
        
        return root;
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
	
	private def KNode createWeaver(Weaver weaver) {
		weaver.createNode().associateWith(weaver) => [
			it.addText(weaver.name)
		]
	}
	
	private def KNode createGenerator(Generator generator) {
		generator.createNode().associateWith(generator) => [
			it.addText(generator.name)
		]
	}
	
	private def String getName(Generator generator) {
		return generator.generator.importedNamespace.split('\\.').last
	}
    
    private def String getName(Weaver weaver) {
		return weaver.weaver.importedNamespace.split('\\.').last
	}
}
