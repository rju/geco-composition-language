package de.cau.cs.se.geco.architecture.generator

import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.Connection
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Weaver
import org.eclipse.xtext.common.types.JvmGenericType
import de.cau.cs.se.geco.architecture.architecture.AspectModel
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
import de.cau.cs.se.geco.architecture.framework.AbstractRequireTraceModelGenerator
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.architecture.Literal
import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral
import de.cau.cs.se.geco.architecture.architecture.IntLiteral
import de.cau.cs.se.geco.architecture.architecture.StringLiteral
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.LogicOperator
import de.cau.cs.se.geco.architecture.architecture.CompareExpression

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import org.eclipse.xtext.common.types.JvmType
import de.cau.cs.se.geco.architecture.model.boxing.Transformation

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
		
		«input.derivedFrom.imports.map[it.createImport].join»
		
		val URI uri
				
		class «className» {
		
			«input.transformations.map[it.createField].join»
			
			new(URI uri) {
				this.uri = uri
			}
			
			def void execute(Collection<EObject> models) {
				«input.sourceModels.map[createRootModel].join('\n')»
			}
		}
	'''
	
	private def CharSequence createRootModel(RootModelNode rootModel) '''
		models.filter(«rootModel.declaredModel.importedNamespace.qualifiedName»).forEach[«rootModel.declaredModel.name.toFirstLower» |
			«rootModel.models.map[it.createPropertyModel(rootModel.declaredModel.name.toFirstLower)].join('\n')»
		]
	'''
	
	private def CharSequence createPropertyModel(PropertyModelNode propertyModel, String propertyName) '''
		«propertyName».«propertyModel.deriveName».forEach[«propertyModel.deriveName» |
			«propertyModel.models.map[it.createPropertyModel(propertyModel.deriveName)].join('\n')»
		]
	'''
	
	def String deriveName(PropertyModelNode propertyModel) {
		propertyModel.declaredNodeProperty.property.simpleName
	}
	
	private def CharSequence createMetamodels(MetamodelSequence sequence) '''
		«sequence.metamodels.map[it.createMetamodel(sequence.type)].join('\n')»
	'''
	
	private def CharSequence createMetamodel(Metamodel metamodel, ModelNodeType type) '''
		val «type.resolveType.qualifiedName» «metamodel.name» = «type.createModelNodeType»
	'''
	
	private def CharSequence createModelNodeType(ModelNodeType type) '''
		models.filter(«type.target.importedNamespace.qualifiedName»)«if (type.property != null) '.'»
	'''
			
	private def CharSequence createImport(Import node) '''
		import «node.importedNamespace.qualifiedName»
	'''
	
	private def CharSequence createField(Transformation transformation) '''
		val «transformation.derivedFrom.instanceName» = new «transformation.derivedFrom.simpleName»()
	'''
	
	/* --------------------------------------------------- */
	
	private def dispatch CharSequence createExecution(Generator generator) {
		if (generator.sourceModel.reference == null) '''
			val «generator.targetModel.reference.name» = «generator.reference.instanceName».generate(null)'''
		else '''
			«generator.sourceModel.createSourceModelQuery(generator.createGenerator)»
		'''
	}
			
	private def dispatch CharSequence createExecution(Weaver weaver) {
		switch (weaver.aspectModel) {
			Generator: weaver.createWeaverWithAspectGenerator
			TargetModelNodeType: weaver.createWeaverWithAspectModel
		}
	}
		
	private def CharSequence createWeaverWithAspectModel(Weaver weaver) ''''''
	
	private def CharSequence createWeaverWithAspectGenerator(Weaver weaver) {
		
	}
	
	private def CharSequence createAspectModelReference(AspectModel model) {
		switch (model) {
			Generator: model.createAspectModelReferenceGenerator
			TargetModelNodeType: model.createAspectModelReferenceTargetModel
		}
	}
	
	private def CharSequence createAspectModelReferenceTargetModel(TargetModelNodeType type) {
		'''«type.reference.name»'''
	}
	
	private def CharSequence createAspectModelReferenceGenerator(Generator generator) {
		'''«generator.reference.instanceName».generate(SOURCE)'''
	}
	
	private def CharSequence createSourceModelReference(Metamodel metamodel) {
		'''«metamodel.name»'''
	}
	
	
	
	
	private def createSourceModelQuery(SourceModelNodeSelector selector, CharSequence generator) {
		'''«selector.reference.name»«selector.constraint.createConstraint»'''
	}
	
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
	
	/**
	 * Create the invocation of a generator. 
	 */
	private def createGenerator(Generator generator) '''«generator.reference.instanceName»(it)'''
	
	private def getInstanceName(JvmType type) {
		type.simpleName.toFirstLower
	}
	
}