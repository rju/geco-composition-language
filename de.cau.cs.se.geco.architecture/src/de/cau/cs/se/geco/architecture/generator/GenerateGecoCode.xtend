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
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.StringLiteral
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import org.eclipse.xtext.common.types.JvmType

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.Processor
import de.cau.cs.se.geco.architecture.model.boxing.Group
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration
import de.cau.cs.se.geco.architecture.architecture.MetamodelModifier
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.model.boxing.Unit
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence

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
				«input.models.filter[it.modifier == MetamodelModifier.INPUT].map[it.createCollectionInitalization].join»
				
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
			val «declaration.metamodel.name» = new ArrayList<«declaration.selector.resolveBaseType.qualifiedName»>()
		''' else '''
			var «declaration.selector.resolveType.qualifiedName» «declaration.metamodel.name» = null
		'''
		
	}
	
	/**
	 * Create initialization for collections used to traverse the input models and fill the proper collections.
	 */
	private def createCollectionInitalization(ModelDeclaration declaration) '''
		val «declaration.metamodel.collectionName» = models.filter(«declaration.selector.target.importedNamespace.qualifiedName»)
		«declaration.metamodel.collectionName».forEach[«declaration.selector.createSelectorQuery(declaration.metamodel.name)»]
	'''
	
	/**
	 * Process a node type selector query. If no property is set only add an instance of type to the model list.
	 * If the property has a list type iterate over the property (one more for each).
	 * If the property has a flat type only add the single value.
	 */
	private def createSelectorQuery(ModelNodeType type, String modelName) {
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
		val processor = unit.processor
		switch (processor) {
			Generator: processor.createGeneratorExecution
			Weaver case processor.aspectModel instanceof Generator: processor.createWeaverGeneratorExecution
			Weaver case processor.aspectModel instanceof TargetModelNodeType: processor.createWeaverExecution
		}
	}
	
	/**
	 * Create code for the execution of a generator which is not
	 * directly connected to a weaver.
	 */
	private def createGeneratorExecution(Generator generator) '''
		«generator.sourceAuxModels.createSourceAuxModels»
		«generator.sourceModel.createSourceModelNesting(generator.createGeneratorCall)»
	'''	
				
	// TODO Note the source model reference is rubbish. Semantics of weaver 
	// must be improved and collection as input must be handled
	private def createWeaverGeneratorExecution(Weaver weaver) '''
		{
			«(weaver.aspectModel as Generator).sourceAuxModels.createSourceAuxModels»
			«(weaver.aspectModel as Generator).sourceModel.createSourceModelNesting(weaver.createWeaverCall)»
		}
	'''
	
	// TODO you cannot weave into a collection. Therefore, semantics for collection weaving must be determined
	private def createWeaverCall(Weaver weaver) '''
		«(weaver.aspectModel as Generator).createGeneratorCall»
		«weaver.reference.instanceName».weave(«weaver.resolveWeaverSourceModel.valueReference»,aspectModel)'''
	
	private def valueReference(SourceModelNodeSelector selector) '''«selector.reference.name»«selector.property?.valueReference»'''
	
	// TODO this is insufficient for collections.
	private def CharSequence valueReference(NodeProperty property) '''.«property.property.simpleName»«property.subProperty?.valueReference»'''
	
	
	private def createWeaverExecution(Weaver weaver) '''
	'''
	
	/**
	 * Prepare collections for auxiliary input.
	 */
	private def createSourceAuxModels(EList<SourceModelNodeSelector> sourceAuxModels) '''
		«sourceAuxModels.indexed.map[it.value.createSourceAuxModel(it.key)].join»
	'''
	
	/**
	 * Create an initialization section for an auxiliary model collection.
	 */
	private def createSourceAuxModel(SourceModelNodeSelector sourceAuxModel, int i) {
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
	private def createSourceModelNesting(SourceModelNodeSelector sourceModel, CharSequence generatorCall) {
		if (sourceModel.reference == null) {
			generatorCall
		} else {
			'''
				«sourceModel.reference.name»«sourceModel.constraint.createConstraintFilter».forEach[
					«sourceModel.property.createSourceModelNesting(generatorCall)»
				]'''
		}
	}
			
	/**
	 * Create nested loops for a generator call.
	 */
	private def CharSequence createSourceModelNesting(NodeProperty node, CharSequence generatorCall) {
		if (node == null)
			'''«generatorCall»'''
		else
			'''
				«node.property.simpleName»«node.constraint.createConstraintFilter».forEach[
					«node.subProperty.createSourceModelNesting(generatorCall)»
				]''' 
	}

	/**
	 * Create a generator invocation.
	 */
	private def createGeneratorCall(Generator generator) {
		val model = if (generator.sourceModel.reference == null) 'null' else 'it'
		'''«generator.createTargetModel» «generator.reference.instanceName».generate(«model»)'''
	}
	
	/**
	 * Create reference to target model. += is for pre-existing collections and = for aspect models
	 * which are automatically woven into a model.
	 */
	private def createTargetModel(Generator generator) {
		if (generator.targetModel.reference != null) {
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
	private def collectionName(Metamodel metamodel) '''«metamodel.name»BaseCollection'''
		
}