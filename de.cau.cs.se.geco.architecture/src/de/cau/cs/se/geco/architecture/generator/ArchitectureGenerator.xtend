/*
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.cau.cs.se.geco.architecture.architecture.Model
import java.util.Iterator
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.Connection
import de.cau.cs.se.geco.architecture.architecture.Generator
import java.io.File
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.Literal
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral
import de.cau.cs.se.geco.architecture.architecture.IntLiteral
import de.cau.cs.se.geco.architecture.architecture.StringLiteral
import org.eclipse.emf.ecore.EObject
import de.cau.cs.se.geco.architecture.architecture.LogicOperator
import de.cau.cs.se.geco.architecture.architecture.CompareExpression
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import de.cau.cs.se.geco.architecture.architecture.AspectModel
import de.cau.cs.se.geco.architecture.framework.AbstractRequireTraceModelGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ArchitectureGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val fileName = resource.URI.trimFileExtension.lastSegment
		fsa.generateFile('''«resource.allContents.filter(Model).last.name.replace('.', File.separator)»«File.separator»«fileName».xtend''', 
			createGeneratorExecution(resource.allContents.filter(Model).last, fileName)
		)
	}
	
	private def CharSequence createGeneratorExecution(Model model, String className) '''
		package de.menges.nexgen

		import java.util.ArrayList
		import java.util.Collection
		import java.util.List
		import org.eclipse.emf.common.util.URI
		
		«model.imports.map[it.createImport].join»
				
		class «model.name».«className» {
		
			«model.connections.map[it.createField].join»
			
			new(URI uri) {
				this.uri = uri
			}
			
			def void execute(Collection<EObject> models) {
				«model.connections.map[it.createExecution].join('\n')»
			}
		}
	'''
	
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
	
	private def CharSequence createField(Connection connection) '''
		val «connection.instanceName» = new «connection.reference.simpleName»()
	''' 
	
	private def dispatch CharSequence createExecution(Generator generator) {
		if (generator.sourceModel.reference == null) '''
			val «generator.targetModel.reference.name» = «generator.instanceName».generate(null)'''
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
		if (((weaver.aspectModel as Generator).reference as JvmGenericType).isSingleOutput) {
			'''«weaver.instanceName».weave(«weaver.resolveWeaverSourceModel.createSourceModelReference», «weaver.aspectModel.createAspectModelReference»'''
		} else {
			
		}
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
		'''«generator.instanceName».generate(SOURCE)'''
	}
	
	private def CharSequence createSourceModelReference(Metamodel metamodel) {
		'''«metamodel.name»'''
	}
	
	
	private def boolean isSingleOutput(JvmGenericType type) {
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
	private def createGenerator(Generator generator) '''«generator.instanceName»(it)'''
	
	private def getInstanceName(Connection connection) {
		connection.reference.simpleName.toFirstLower
	}
}
