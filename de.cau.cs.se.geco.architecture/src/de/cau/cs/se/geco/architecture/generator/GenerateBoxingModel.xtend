package de.cau.cs.se.geco.architecture.generator

import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Connection
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.model.boxing.Transformation
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmGenericType
import de.cau.cs.se.geco.architecture.framework.AbstractRequireTraceModelGenerator
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector

class GenerateBoxingModel implements IGenerator<Model, BoxingModel> {
	
	override generate(Model input) {
		val result = BoxingFactory.eINSTANCE.createBoxingModel		
		result.derivedFrom = input
		
		input.metamodels.forEach[
			if (it.isSourceModel(input.connections))
				it.type.createRootModel(result)
		]
		
		input.connections.forEach[connection |
			result.processConnection(connection)
		]
		
		return result
	}
	
	/**
	 * Process input models for weavers and adjunct generators.
	 */
	private def dispatch void processConnection(BoxingModel model, Generator generator) {
		model.transformations.addUniqueTransformation(createTransformation(generator.reference))
		
		val outerBoxingModel = model.sourceModels.findGeneratorSourceModel(generator.sourceModel.reference) 
		
		/** check if generator works on a property/submodel of a model */
		val innerBoxingModel = if (outerBoxingModel == null)
			model
		else if (generator.sourceModel.property != null) 
			outerBoxingModel.createGeneratorModels(generator.sourceModel)
		else
			outerBoxingModel
		
		innerBoxingModel.invocations.add(generator)
	}
	
	/**
	 * Process input models for weavers and adjunct generators.
	 */
	private def dispatch void processConnection(BoxingModel model, Weaver weaver) {
		model.transformations.addUniqueTransformation(createTransformation(weaver.reference))
		if (weaver.aspectModel instanceof Generator) {
			model.processConnection(weaver.aspectModel as Generator)
		}
	}
		
	private def BoxingModelNode createGeneratorModels(BoxingModelNode node, SourceModelNodeSelector selector) {
		// TODO add constraint handling as virtual box here
		if (selector.property == null) /** check if we really have an input model. */
			return node
		else
			return node.createGeneratorModels(selector.property)
	}
	
	private def BoxingModelNode createGeneratorModels(BoxingModelNode node, NodeProperty property) {
		val propertyNode = property.createPropertyModelNode
		node.models.add(propertyNode)
		if (property.subProperty != null)
			return propertyNode.createGeneratorModels(property.subProperty)
		else
			return propertyNode
	}
	
	
	/**
	 * Find the boxing model node which is referenced by the generators source model selector. 
	 */
	private def BoxingModelNode findGeneratorSourceModel(EList<RootModelNode> list, Metamodel metamodel) {
		if (metamodel != null) {
			val modelNodeType = (metamodel.eContainer as MetamodelSequence).type
			val result = list.findFirst[it.declaredModel == modelNodeType.target]
			if (modelNodeType.property != null) {
				return result.models.findGeneratorSourceModel(modelNodeType.property) 
			} else
				return result
		} else
			return null
	}
	
	/**
	 * Find the boxing model node which is referenced by the generators source model selector. 
	 * Property recursion part.
	 */
	private def BoxingModelNode findGeneratorSourceModel(EList<PropertyModelNode> list, NodeProperty property) {
		val result = list.findFirst[node | node.declaredNodeProperty.equals(property)]
		if (property.subProperty != null)
			return result.models.findGeneratorSourceModel(property.subProperty)
		else
			return result
	}
		
	private def createTransformation(JvmType type) {
		val result = BoxingFactory.eINSTANCE.createTransformation
		result.derivedFrom = type
		return result
	}
		
	private def void createRootModel(ModelNodeType type, BoxingModel model) {
		var rootModel = model.sourceModels.findFirst[it.declaredModel.equals(type.target)]
		if (rootModel == null) {
			rootModel = BoxingFactory.eINSTANCE.createRootModelNode
			rootModel.declaredModel = type.target
			model.sourceModels.add(rootModel)
		}
		
		if (type.property != null) {
			rootModel.models.add(type.property.createPropertyModelNode)
		}
	}
	
	private def PropertyModelNode createPropertyModelNode(NodeProperty property) {
		val propertyModel = BoxingFactory.eINSTANCE.createPropertyModelNode
		propertyModel.declaredNodeProperty = property
		
		return propertyModel
	}

	/** -- helper methods -- */

	private def void addUniqueTransformation(EList<Transformation> list, Transformation transformation) {
		if (!list.exists[it.derivedFrom.equals(transformation.derivedFrom)])
			list.add(transformation)
	}
	
	private def boolean isSourceModel(MetamodelSequence sequence, EList<Connection> connections) {
		return connections.filter(Generator).exists[generator |
			if (generator.sourceModel.reference != null) 
				sequence.metamodels.exists[generator.sourceModel.reference.equals(it)]
			else
				false
		] ||
		connections.filter(Weaver).exists[weaver | 
			if (weaver.aspectModel instanceof Generator) {
				sequence.metamodels.exists[(weaver.aspectModel as Generator).sourceModel.reference.equals(it)]
			} else
				false
		]
	}
	
	/**
	 * Check if a given generator produces a single or multiple output.
	 * 
	 * @param type JvmGenericType of the generator
	 * 
	 * @returns true if the generator produces a single output model else false
	 */
	private def boolean isSingleOutputGenerator(JvmGenericType type) {
		val generatorInterface = type.superTypes.findFirst[it.simpleName.startsWith(IGenerator.simpleName)]
		if (generatorInterface == null) { /** check for AbstractRequireTraceModelGenerator */
			val abstractGenerator = type.superTypes.findFirst[it.simpleName.startsWith(AbstractRequireTraceModelGenerator.simpleName)]
			val targetType = (abstractGenerator as JvmParameterizedTypeReference).arguments.get(1).type
			return (targetType.simpleName.startsWith("List") ||
					targetType.simpleName.startsWith("EList") ||
					targetType.simpleName.startsWith("Iterator"))
		} else {
			val targetType = (generatorInterface as JvmParameterizedTypeReference).arguments.get(1).type
			return (targetType.simpleName.startsWith("List") ||
					targetType.simpleName.startsWith("EList") ||
					targetType.simpleName.startsWith("Iterator"))
		}
	}
	
}