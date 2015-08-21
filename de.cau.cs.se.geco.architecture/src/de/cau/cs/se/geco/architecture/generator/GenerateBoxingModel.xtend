package de.cau.cs.se.geco.architecture.generator

import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
import de.cau.cs.se.geco.architecture.architecture.TraceModel
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import de.cau.cs.se.geco.architecture.model.boxing.Group
import de.cau.cs.se.geco.architecture.model.boxing.Unit
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.architecture.MetamodelModifier
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping
import org.eclipse.xtext.common.types.JvmType
import de.cau.cs.se.geco.architecture.architecture.TargetTraceModel

class GenerateBoxingModel implements IGenerator<Model, BoxingModel> {
	
	override generate(Model input) {
		val result = BoxingFactory.eINSTANCE.createBoxingModel
		result.derivedFrom = input
		
		/** collect all models. */
		input.metamodels.forEach[sequence |
			sequence.metamodels.forEach [metamodel |
				val model = BoxingFactory.eINSTANCE.createModelDeclaration
				model.selector = sequence.type
				model.metamodel = metamodel
				model.modifier = sequence.modifier
				result.models.add(model)
			]
		]
		
		/** collect all processors. */
		val units = new ArrayList<Unit>()
		input.processors.forEach[processor | 
			switch (processor) {
				Generator : units.add(createGenerator(processor))
				Weaver case (processor.aspectModel instanceof Generator): {
					units.add(createGenerator(processor))
					result.allProcessors.addUniqueType((processor.aspectModel as Generator).reference)
				}
				Weaver case (processor.aspectModel == null): units.add(createWeaver(processor))
			}
			result.allProcessors.addUniqueType(processor.reference)
		]

		/** Define groups. */
		var group = createGroup(input.metamodels)
		result.groups.add(group)
		
		/** loop for all processing units (generator, weaver, generator+weaver). */
		while(units.size > 0) {
			for (var i=0;i<units.size;i++) {
				val unit = units.get(i)
				if (unit.matchGroup(group)) {
					units.remove(i)
					group.units.add(unit)
					i--
				}
			}
			/** check if units are still unassigned. */
			if (units.size > 0) {
				group = createGroup(group)
				result.groups.add(group)
			}
		}
		
		System.out.println("start")
		units.forEach[unit | unit.print]
		result.groups.forEach[
			it.print
			it.units.forEach[unit | unit.print]
		]
		
		return result
	}
		
	private def void print(Group group) {
		System.out.println("group")
		System.out.println("\tread " + group.sourceTraceModels.map[it.determineTraceModel.name].join(", "))
	}
	
	private def void print(Unit unit) {
		val processor = unit.processor
		switch(processor) {
			Generator: {
				System.out.print("\tG " + processor.reference.qualifiedName)
				if (processor.targetTraceModel != null) {
					System.out.print(" write " + processor.targetTraceModel.determineTraceModel.name)
				}
				if (processor.sourceTraceModels != null) {
					System.out.print(" read " + processor.sourceTraceModels.map[it.determineTraceModel.name].join(", "))
				}
				System.out.println()
			}
			Weaver: System.out.println("\tW " + processor.reference.qualifiedName)
		}
		
	}
	
	/**
	 * Check if the given group provides the necessary inputs for the unit.
	 */
	private def boolean matchGroup(Unit unit, Group group) {
		return
			unit.sourceModels.forall[unitMM | group.sourceModels.exists[it.equals(unitMM)]] &&
			unit.sourceTraceModels.forall[unitTR | group.sourceTraceModels.exists[it.equals(unitTR)]] 
	}
	
	
	/**
	 * Create a new group based on a sequence of free metamodels.
	 */
	private def createGroup(EList<MetamodelSequence> metamodels) {
		val group = BoxingFactory.eINSTANCE.createGroup
		/** Determine all free inputs. */
		metamodels.forEach[sequence |
			if (sequence.modifier == MetamodelModifier.INPUT)
				sequence.metamodels.forEach[metamodel | group.sourceModels.add(metamodel)]
		]
		
		return group
	}
	
	/**
	 * Create a new group based on the previous groups inputs and all outputs of its units.
	 */
	private def createGroup(Group oldGroup) {
		val group = BoxingFactory.eINSTANCE.createGroup
		group.sourceModels.addAll(oldGroup.sourceModels)
		group.sourceTraceModels.addAll(oldGroup.sourceTraceModels)
		oldGroup.units.forEach[unit | 
			group.sourceModels.addUnique(unit.targetModel)
			if (unit.targetTraceModel != null)
				group.sourceTraceModels.addUnique(unit.targetTraceModel)
		]
		
		return group
	}
	
	/**
	 * create a unit node for a generator.
	 */
	private def Unit createGenerator(Generator generator) {
		val result = BoxingFactory.eINSTANCE.createUnit
		
		result.processor = generator
		if (generator.sourceModel.reference != null)
			result.sourceModels.add(generator.sourceModel.reference)
		generator.sourceAuxModels.forEach[model | result.sourceModels.addUnique(model.reference)]
		result.sourceTraceModels.addAllUnique(generator.sourceTraceModels)
		result.targetModel = generator.targetModel.reference
		if (generator.targetTraceModel != null)
			result.targetTraceModel = generator.targetTraceModel.determineTraceModel
		else
			result.targetTraceModel = null
		
		return result
	}
	
	/**
	 * create a unit node for a weaver-generator combination.
	 */
	private def Unit createGenerator(Weaver weaver) {
		val result = BoxingFactory.eINSTANCE.createUnit
		
		result.processor = weaver
		val generator = weaver.aspectModel as Generator
		
		result.sourceModels.add(generator.sourceModel.reference)
		
		generator.sourceAuxModels.forEach[model | result.sourceModels.addUnique(model.reference)]
		
		result.sourceTraceModels.addAllUnique(generator.sourceTraceModels)
		result.targetModel = ArchitectureTyping.resolveWeaverSourceModel(weaver).reference
		result.sourceModels.addUnique(result.targetModel)
		if (generator.targetTraceModel != null)
			result.targetTraceModel = generator.targetTraceModel.determineTraceModel
		else
			result.targetTraceModel = null
		
		return result
	}
	
	/**
	 * create a unit node for a weaver.
	 */
	private def Unit createWeaver(Weaver weaver) {
		val result = BoxingFactory.eINSTANCE.createUnit
		
		result.processor = weaver
		result.sourceModels.add(weaver.sourceModel.reference)
		result.sourceModels.add((weaver.aspectModel as TargetModelNodeType).reference)
		result.targetModel = ArchitectureTyping.resolveWeaverSourceModel(weaver).reference
		result.targetTraceModel = null
		
		return result
	}
			
	/**
	 * Determine the trace model.
	 */
	private def TraceModel determineTraceModel(TargetTraceModel model) {
		switch (model) {
			TraceModel: model
			TraceModelReference: model.traceModel
			default: throw new UnsupportedOperationException("what???")
		}
	}
	
	/**
	 * Add a list of trace model to a trace model list. Check for each element if it is
	 * already in the list. If so do not add it again. 
	 */
	private def void addAllUnique(EList<TraceModel> list, EList<TraceModelReference> insert) {
		insert.forEach[list.addUnique(it.traceModel)]
	}
	
	/**
	 * Add a write trace model if it is not already in the list.
	 */
	private def void addUnique(EList<TraceModel> list, TraceModel model) {
		if (!list.contains(model))
			list.add(model)
	}
	
	/**
	 * Add a write trace model if it is not already in the list.
	 */
	private def void addUnique(EList<Metamodel> list, Metamodel model) {
		if (!list.contains(model))
			list.add(model)
	}

	/**
	 * Add a JvmType to a list if it is not already listed.
	 */
	private def void addUniqueType(EList<JvmType> list, JvmType type) {
		if (!list.contains(type))
			list.add(type)
	}
	
	
}