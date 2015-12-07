package de.cau.cs.se.geco.architecture.generator

import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral
import de.cau.cs.se.geco.architecture.architecture.AspectModel
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral
import de.cau.cs.se.geco.architecture.architecture.CompareExpression
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.IntLiteral
import de.cau.cs.se.geco.architecture.architecture.Literal
import de.cau.cs.se.geco.architecture.architecture.LogicOperator
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.ModelType
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector
import de.cau.cs.se.geco.architecture.architecture.StringLiteral
import de.cau.cs.se.geco.architecture.architecture.TargetModel
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import org.eclipse.xtext.common.types.JvmType

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.Fragment
import de.cau.cs.se.geco.architecture.model.boxing.Group
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration
import de.cau.cs.se.geco.architecture.architecture.ModelModifier
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.model.boxing.Unit
import de.cau.cs.se.geco.architecture.architecture.ModelSequence
import org.eclipse.xtext.common.types.JvmOperation

class GenerateGecoCode implements IGenerator<BoxingModel, CharSequence>{
	
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
	 * Process a node type selector query. If no property is set only add an instance of type to the model list.
	 * If the property has a list type iterate over the property (one more for each).
	 * If the property has a flat type only add the single value.
	 */
	private def createSelectorQuery(ModelType type, String modelName) {
		if (type.property == null)
			'''«modelName».add(it)'''
		else if (type.property.property.resolveType.isListType) {
			'''it.«type.property.property.simpleName»().forEach[«type.property.createPropertyQuery(modelName)»]'''			
		} else { 
			'''«modelName».add(it.«type.property.property.simpleName»)'''
		}
			
	}
		
	/**
	 * Check if the given property value instance has a sub property. If not,
	 * just add the value, else create a for each loop for list properties or a single
	 * value add for non list types.
	 */
	private def CharSequence createPropertyQuery(NodeProperty property, String modelName) {
		if (property.subProperty == null)
			'''«modelName».add(it)'''
		else if (property.property.resolveType.isListType) {
			'''it.«property.property.simpleName»().forEach[«property.subProperty.createPropertyQuery(modelName)»]'''
		} else {
			'''«modelName».add(it.«property.subProperty.property.simpleName»)'''
		}
	}
	
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
	 * Create an initialization section for an auxiliary model collection.
	 */
	private def createSourceAuxModel(SourceModelSelector sourceAuxModel, int i) {
		if (sourceAuxModel.property == null) {
			'''val aux«i» = «sourceAuxModel.reference.name»«sourceAuxModel.constraint.createConstraintFilter»''' 
		} else { 
			'''
				val aux«i» = new ArrayList<«sourceAuxModel.resolveType.qualifiedName»>()
				«sourceAuxModel.reference.name».forEach[it.«sourceAuxModel.property.createPropertyQuery('''aux«i»''')»]
			'''
		}
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
		
	/* --------------------------------------------------- */
	
	/**
	 * Create a constraint filter for a query if a filter is defined.
	 */
	private def createConstraintFilter(ConstraintExpression expression) {
		if (expression == null)
			''''''
		else if (expression instanceof Typeof)
			'''.filter(«expression.type.qualifiedName»)'''
		else
			'''.filter[«expression.createConstraint»]'''
	}
	
	/** constraint computation */
	private def dispatch CharSequence createConstraint(Negation expression) '''!«expression.constraint»'''
	
	private def dispatch CharSequence createConstraint(Literal expression) {
		switch(expression) {
			ArrayLiteral: '{' + expression.literals.map[it.createConstraint] + '}'
			BooleanLiteral: expression.value
			FloatLiteral: expression.value
			IntLiteral: expression.value.toString
			StringLiteral: '"' + expression + '"'
		}
	}
	
	private def dispatch CharSequence createConstraint(NodeProperty expression) '''«expression.property.simpleName»'''
	
	private def dispatch CharSequence createConstraint(Typeof expression) 
		'''it instanceof «expression.type.qualifiedName»'''
	
	private def dispatch CharSequence createConstraint(ConstraintExpression expression) {
		'''(«expression.left.createConstraint» «expression.operator.createOperator» «expression.right.createConstraint»)'''
	}
	
	private def createOperator(LogicOperator operator) {
		switch(operator) {
			case AND: '&&'
			case OR: '||'
		}
	}
	
	private def dispatch CharSequence createConstraint(CompareExpression expression) {
		'''(«expression.left.createConstraint» «expression.comparator.literal» «expression.right.createConstraint»)'''
	}
	
		
	
	private def getInstanceName(JvmType type) {
		type.simpleName.toFirstLower
	}
	
	/**
	 * Name of internal collections for models for a specific metamodel.
	 */
	private def collectionName(Model model) '''«model.name»BaseCollection'''
		
}