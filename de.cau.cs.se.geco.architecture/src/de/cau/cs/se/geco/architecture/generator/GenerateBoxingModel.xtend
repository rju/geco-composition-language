package de.cau.cs.se.geco.architecture.generator

import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.TraceModel
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.WriteTraceModel
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import de.cau.cs.se.geco.architecture.model.boxing.Group
import java.util.ArrayList
import org.eclipse.emf.common.util.EList

class GenerateBoxingModel implements IGenerator<Model, BoxingModel> {
	
	override generate(Model input) {
		val result = BoxingFactory.eINSTANCE.createBoxingModel
		result.derivedFrom = input
				
		/** create initial boxes. */	
		val nullGroup = BoxingFactory.eINSTANCE.createGroup
		result.groups.add(nullGroup)
		val inputGroup = BoxingFactory.eINSTANCE.createGroup
		result.groups.add(inputGroup)
		val intermediateGroup = BoxingFactory.eINSTANCE.createGroup
		result.groups.add(intermediateGroup)

		/** collect all processors. */
		val generators = new ArrayList<Generator>()
		input.processors.forEach[processor | 
			switch (processor) {
				Generator : generators.add(processor)
				Weaver case (processor.aspectModel instanceof Generator): {
					generators.add(processor.aspectModel as Generator)
					result.allProcessors.add(processor.aspectModel as Generator)
				}
			}
			result.allProcessors.add(processor)
		]

		/** find all transformations which possess no input model, primary input model and intermediate input model. */
		generators.forEach[generator | 
			if (generator.sourceModel.reference == null)
				nullGroup.appendProcessor(generator)
			else {
				switch ((generator.sourceModel.reference.eContainer as MetamodelSequence).modifier) {
					case INPUT: inputGroup.appendProcessor(generator)
					case INTERMEDIATE: intermediateGroup.appendProcessor(generator)
					case OUTPUT: throw new UnsupportedOperationException("Target models are not allowed as source models. This exception indicates a broken and missing check.")
				}
					 
			}
			
		]
		
		/** resolve trace model dependencies. */
		for(var i=0; i<result.groups.size; i++) {
			val group = result.groups.get(i)
			val start = i
			for (var j=0; j<group.transformations.size; j++) {
				val processor = group.transformations.get(j)
				if (processor instanceof Generator) {
					val generator = processor as Generator
					if (generator.readTraceModels.exists[read | group.writeTraceModels.isReferencedBy(read)]) {
						/**
						 * find box with suitable read TR which is not the present group.
						 * If no group can be found, create on succeeding the present.
						 */
						var successor = result.groups.findSuccessor(start, generator.readTraceModels)
						group.transformations.remove(processor)
						j-- // do not advance
						successor.transformations.add(processor)
						/** recalculate present group read trace models. */
						group.readTraceModels.clear
						group.transformations.forEach[if (it instanceof Generator) {
							group.readTraceModels.addAllUnique((it as Generator).readTraceModels)
						}]
						/** recalculate present group write trace models. */
						group.writeTraceModels.clear
						group.transformations.forEach[if (it instanceof Generator) {
							if ((it as Generator).writeTraceModel != null)
								group.writeTraceModels.addUnique((it as Generator).writeTraceModel.determineTraceModel)
						}]
					}
				}
			}
		}
		
		/** resolve source target model dependencies. */
		
		/** compact boxes. */
		
		/** perform sub boxing. */
		
		return result
	}
	
	/**
	 * Find or create a group which matches the given readTraceModels list without being
	 * the present group or any group preceding the present group.
	 * If non is found a group is created.
	 */
	private def Group findSuccessor(EList<Group> groups, int start, EList<TraceModelReference> traceModelReferences) {
		var Group group = null
		for (var i=start+1; i<groups.size;i++) {
			group = groups.get(i)
			if (group.readTraceModels.match(traceModelReferences)) {
				return group
			}
		}

		group = BoxingFactory.eINSTANCE.createGroup
		group.readTraceModels.addAllUnique(traceModelReferences)
		groups.add(start+1,group)
		
		return group
	}
	
	private def boolean match(EList<TraceModel> models, EList<TraceModelReference> references) {
		references.forall[reference | models.exists[model | reference.traceModel.equals(model)]]
	}
	
	/**
	 * Returns true if the list of write trace models contain a trace model which is referenced
	 * by the the trace model reference.
	 */
	private def boolean isReferencedBy(EList<TraceModel> writeTraceModels, TraceModelReference traceModelReference) {
		writeTraceModels.exists[write | traceModelReference.traceModel.equals(write) ]
	}
	
	/**
	 * Add a generator to the groups list of processors and register read and write trace models.
	 */
	private def void appendProcessor(Group group, Generator generator) {
		group.transformations.add(generator)
		if (generator.writeTraceModel != null)
			group.writeTraceModels.addUnique(generator.writeTraceModel.determineTraceModel)
		group.readTraceModels.addAllUnique(generator.readTraceModels)
	}
	
	/**
	 * Determine the trace model.
	 */
	private def TraceModel determineTraceModel(WriteTraceModel model) {
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


	
}