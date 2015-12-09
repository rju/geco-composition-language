package de.cau.cs.se.geco.architecture.generator.code

import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.ModelModifier
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector
import de.cau.cs.se.geco.architecture.architecture.TargetModel
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import de.cau.cs.se.geco.architecture.model.boxing.Group
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration
import de.cau.cs.se.geco.architecture.model.boxing.Unit
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmType

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*

class GenerateGecoCode implements IGenerator<BoxingModel, CharSequence>{
	
	@Inject extension SelectorQuery
	@Inject extension NameResolver
	
	String className
	
	new(String className) {
		this.className = className
	}
	
	override generate(BoxingModel input) '''
		package «input.derivedFrom.name»

		import java.util.ArrayList
		import java.util.Collection
		import java.util.List
		
		import org.eclipse.emf.common.util.URI
		import org.eclipse.emf.ecore.EObject
		
		
		
		«input.derivedFrom.imports.map[it.createImport].join»
						
		class «className» {
			
			val URI uri
		
			/** instantiate all generators. */
			«input.allProcessors.map[it.createField].join»
			
			/** define collections for models used as in put. */
			«input.models.map[it.createCollectionForMetamodel].join»
			
			new(URI uri) {
				this.uri = uri
			}
			
			def void execute(Collection<EObject> models) {
				/** separate input models in collections for specific source model types. */
				«input.models.filter[it.modifier == ModelModifier.INPUT].map[it.createCollectionInitalization].join»
				
				/** main generation groups. */
				«input.groups.indexed.map[createMainGroupCall(it.key)].join("\n")»
			}
			
			«input.groups.indexed.map[it.value.createMainGroup(it.key)].join("\n")»
		}
	'''
			
	/**
	 * Create an import rule.
	 */
	private def CharSequence createImport(Import node) '''
		import «node.importedNamespace.qualifiedName»
	'''
	
	/**
	 * Create a field for an generator and instantiate it.
	 */
	private def CharSequence createField(JvmType type) '''
		val «type.instanceName» = new «type.simpleName»()
	'''
	
	/**
	 * Create collections for models declared with the metamodel expression in GECO.
	 * These are used in the class property declaration area.
	 */
	private def createCollectionForMetamodel(ModelDeclaration declaration) {
		if (declaration.isCollectionType) '''
			val «declaration.model.name» = new ArrayList<«declaration.selector.resolveType.determineElementType.qualifiedName»>()
		''' else '''
			var «declaration.selector.resolveType.determineElementType.qualifiedName» «declaration.model.name» = null
		'''
		
	}
	
	/**
	 * Create initialization for collections used to traverse the input models and fill the proper collections.
	 */
	private def createCollectionInitalization(ModelDeclaration declaration) '''
		val «declaration.model.collectionName» = models.filter(«declaration.selector.target.importedNamespace.qualifiedName»)
		«declaration.model.collectionName».forEach[«declaration.selector.createSelectorQuery(declaration.model.name)»]
	'''
	

	
	/**
	 * Create call to a group execution method.
	 */
	private def createMainGroupCall(int i) '''executeGroup«i»()'''
		
	/**
	 * Create a group execution method.
	 */
	private def createMainGroup(Group group, int i) '''
		/** 
		 * 
		 * «group.sourceModels.map['@param ' + it.name].join("\n")»
		 */
		private def executeGroup«i»() {
			«group.units.map[it.createUnitExecution].join»
		}
	'''
	
	/**
	 * Create code for a single execution unit.
	 */
	private def createUnitExecution(Unit unit) {
		val processor = unit.fragment
		switch (processor) {
			Generator: processor.createGeneratorExecution(unit)
			Weaver case processor.aspectModel instanceof Generator: processor.createWeaverGeneratorExecution(unit)
			Weaver case processor.aspectModel instanceof TargetModel: processor.createWeaverExecution(unit)
		}
	}
	
	/**
	 * Create code for the execution of a generator which is not
	 * directly connected to a weaver.
	 */
	private def createGeneratorExecution(Generator generator, Unit unit) '''
		«generator.sourceAuxModels.createSourceAuxModels»
		«generator.sourceModel.createSourceModelNesting(generator, unit)»
	'''	
				
	// TODO Note the source model reference is rubbish. Semantics of weaver 
	// must be improved and collection as input must be handled
	private def createWeaverGeneratorExecution(Weaver weaver, Unit unit) '''
		{
			«(weaver.aspectModel as Generator).sourceAuxModels.createSourceAuxModels»
			«(weaver.aspectModel as Generator).sourceModel.createSourceModelNesting(weaver, unit)»
		}
	'''
	
	/**
	 * Create nested loops for a generator call.
	 */
	private def createSourceModelNesting(SourceModelSelector sourceModel, Weaver weaver, Unit unit) {
		if (sourceModel.reference == null) {
			weaver.createWeaverCall(unit, 'null')
		} else {
			if (sourceModel.resolveType.isSubTypeOf(unit.inputTypeReference))
				weaver.createWeaverCall(unit, sourceModel.reference.name)
			else
				'''
				«sourceModel.reference.name»«sourceModel.constraint.createConstraintFilter».forEach[
					«sourceModel.property.createSourceModelNesting(weaver, unit, 'it')»
				]'''
		}
	}
	
	/**
	 * Create nested loops for a generator call.
	 */
	private def CharSequence createSourceModelNesting(NodeProperty node, Weaver weaver, Unit unit, String modelVarName) {
		if (node == null)
			weaver.createWeaverCall(unit, modelVarName)
		else
			if (node.resolveType.isSubTypeOf(unit.inputTypeReference))
				weaver.createWeaverCall(unit, modelVarName)
			else
				'''
				«node.property.simpleName»«node.constraint.createConstraintFilter».forEach[
					«node.subProperty.createSourceModelNesting(weaver, unit, 'it')»
				]''' 
	}
	
	// TODO you cannot weave into a collection. Therefore, semantics for collection weaving must be determined
	private def createWeaverCall(Weaver weaver, Unit unit, String varModelName) '''
		«(weaver.aspectModel as Generator).createGeneratorCall(varModelName)»
		«weaver.createWeaverInvocation(unit)»'''
	
	private def createWeaverInvocation(Weaver weaver, Unit unit) {
		if (unit.inputTypeReference.isListType) {
			'''aspectModel.forEach[«weaver.reference.instanceName».weave(«weaver.resolveWeaverSourceModel.valueReference»,it)]'''
		} else {
			'''«weaver.reference.instanceName».weave(«weaver.resolveWeaverSourceModel.valueReference»,aspectModel)'''
		}
	}
		
	private def valueReference(SourceModelSelector selector) '''«selector.reference.name»«selector.property?.valueReference»'''
	
	// TODO this is insufficient for collections.
	private def CharSequence valueReference(NodeProperty property) '''.«property.property.simpleName»«property.subProperty?.valueReference»'''
	
	
	private def createWeaverExecution(Weaver weaver, Unit unit) '''
	'''
	
	/**
	 * Prepare collections for auxiliary input.
	 */
	private def createSourceAuxModels(EList<SourceModelSelector> sourceAuxModels) '''
		«sourceAuxModels.indexed.map[it.value.createSourceAuxModel(it.key)].join»
	'''
			
	

	/**
	 * Create a generator invocation.
	 */
	private def createGeneratorCall(Generator generator, String modelVarName) {
		'''«generator.createTargetModel» «generator.reference.instanceName».generate(«modelVarName»)'''
	}
	
	/**
	 * Create reference to target model. += is for pre-existing collections and = for aspect models
	 * which are automatically woven into a model.
	 */
	private def createTargetModel(Generator generator) {
		if (generator.targetModel != null) {
			if (generator.targetModel.reference.isCollectionType) 
				'''«generator.targetModel.reference.name» += '''
			else
				'''«generator.targetModel.reference.name» = ''' 
		} else
			'''val aspectModel = '''
	}
		
	/**
	 * Create nested loops for a generator call.
	 */
	private def createSourceModelNesting(SourceModelSelector sourceModel, Generator generator, Unit unit) {
		if (sourceModel.reference == null) {
			generator.createGeneratorCall('null')
		} else {
			if (sourceModel.resolveType.isSubTypeOf(unit.inputTypeReference))
				generator.createGeneratorCall(sourceModel.reference.name)
			else
				'''
				«sourceModel.reference.name»«sourceModel.constraint.createConstraintFilter».forEach[
					«sourceModel.property.createSourceModelNesting(generator, unit, 'it')»
				]'''
		}
	}
			
	/**
	 * Create nested loops for a generator call.
	 */
	private def CharSequence createSourceModelNesting(NodeProperty node, Generator generator, Unit unit, String modelVarName) {
		if (node == null)
			generator.createGeneratorCall(modelVarName)
		else
			if (node.resolveType.isSubTypeOf(unit.inputTypeReference))
				generator.createGeneratorCall(modelVarName)
			else
				'''
				«node.property.simpleName»«node.constraint.createConstraintFilter».forEach[
					«node.subProperty.createSourceModelNesting(generator, unit, 'it')»
				]''' 
	}

		
}