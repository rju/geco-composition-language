package de.cau.cs.se.geco.architecture.typing

import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.ModelSequence
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.GecoModel
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint
import de.cau.cs.se.geco.architecture.architecture.BasicConstraint
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVoid
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.common.types.TypesFactory
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType

class ArchitectureTyping {
	
	
	def dispatch static JvmTypeReference resolveType(SourceModelNodeSelector selector) {
		if (selector.property != null)
			return selector.property.resolveType
		else {
			val genericTypeReference = selector.reference?.resolveType
			if (selector.constraint != null) {
				if (selector.constraint instanceof Typeof) {
					if (genericTypeReference.isListType) {
						val paramTypeReference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference
						paramTypeReference.type = genericTypeReference.type
						paramTypeReference.arguments.add((selector.constraint as Typeof).resolveType)
						return paramTypeReference
					} else
						return (selector.constraint as Typeof).resolveType
				} else
					return genericTypeReference
			} else
				return genericTypeReference
		}
	}
	
	def dispatch static JvmTypeReference resolveType(Model model) {
		(model.eContainer as ModelSequence).type.resolveType
	}
	
	def dispatch static JvmTypeReference resolveType(ModelNodeType type) {
		val result = if (type.property == null)
			type.target.importedNamespace.resolveType
		else
			type.property.resolveType
			
		if (type.collection) {
			val list = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference
			val listType = TypesFactory.eINSTANCE.createJvmGenericType
			listType.packageName = "java.lang"
			listType.simpleName = "Collection"
			
			list.type = listType
			list.arguments.add(result)
			return list
		} else
			return result
	}
	
	def dispatch static JvmTypeReference resolveType(JvmType type) {
		val reference = TypesFactory.eINSTANCE.createJvmAnyTypeReference
		reference.type = type
		return reference
	} 
	
	def dispatch static JvmTypeReference resolveType(NodeProperty property) {
		if (property.subProperty == null) {
			property.property.resolveType
		} else
			property.subProperty.resolveType
	}
	
	def dispatch static JvmTypeReference resolveType(TargetModelNodeType type) {
		type.reference?.resolveType
	}
	
	def dispatch static JvmTypeReference resolveType(JvmOperation operation) {
		operation.returnType
	}
	
	
	/**
	 * Evaluate type of an ConstraintExpression.
	 */
	def dispatch static JvmTypeReference resolveType(ConstraintExpression expression) {
		val result = expression.left.resolveType
		if (result == null)
			if (expression.right != null)
				return expression.right.resolveType
			else
				return null
		else
			return result
	}
	
	/**
	 * Evaluate type of an ParenthesisConstraint.
	 */
	def dispatch static JvmTypeReference resolveType(ParenthesisConstraint expression) {
		expression.constraint.resolveType
	}
	
	/**
	 * Evaluate type of an Typeof.
	 */
	def dispatch static JvmTypeReference resolveType(Typeof expression) {
		expression.type.resolveType
	}
	
	/**
	 * Evaluate type of an Negation.
	 */
	def dispatch static JvmTypeReference resolveType(Negation expression) {
		expression.constraint.resolveType
	}
		
	/**
	 * Evaluate type of an BasicConstraint.
	 */
	def dispatch static JvmTypeReference resolveType(BasicConstraint expression) {
		throw new UnsupportedOperationException("BasicConstraint cannot be handled in resolveType")
	}

	def dispatch static JvmTypeReference resolveType(EObject operation) {
		throw new UnsupportedOperationException("resolve type reference for " + operation.class.name + " not supported")
	} 
	
	
	def static boolean isSubTypeOf(JvmTypeReference type, JvmTypeReference matchingType) {
		if (type.type instanceof JvmGenericType && matchingType.type instanceof JvmGenericType) {
			if (type.eIsProxy)
				type.type.hashCode
			val left = type.type as JvmGenericType
			val right = matchingType.type as JvmGenericType
			
			if (left.isSubTypeOf(right)) {
				if (type instanceof JvmParameterizedTypeReference && matchingType instanceof JvmParameterizedTypeReference) {
					val leftArg = (type as JvmParameterizedTypeReference).arguments
					val rightArg = (matchingType as JvmParameterizedTypeReference).arguments
					if (leftArg.size == rightArg.size) {
						var result = true
						for(var i=0;i<leftArg.size;i++) {
							if (!leftArg.get(i).isSubTypeOf(rightArg.get(i)))
								result = false
						}
						
						return result
					}
				} else
					return true
			}
			
			return false
		} else
			return false
		
	}

	/**
	 * Check if a type is equal to or a subtype of matchingType.
	 */
	def static boolean isSubTypeOf(JvmGenericType type, JvmType matchingType) {
		if (type.equals(matchingType))
			return true
		else {
			type.superTypes.exists[
				val superType = it.type
				switch(superType) {
					JvmGenericType: superType.isSubTypeOf(matchingType)
					JvmVoid: false
					default: false
				}
			]		
		}
	}
			
	/**
	 * find out if the given type is a list or collection type.
	 * Note: This is an ugly implementation based on name matches.
	 */
	def static boolean isListType(JvmTypeReference type) {
		val name = type.type.qualifiedName
		switch(name) {
			case null: {
				System.out.println("AnnotationType? " + type + " -- " + type.type)
				false
			}
			case "java.util.Collection",
			case "java.util.List",
			case "java.util.ArrayList",
			case "java.lang.Collection",
			case "org.eclipse.emf.common.util.EList" : true
			default: false
		}
	}
	
	/**
	 * Determine the base type of a reference. For any type this is the type
	 * where the reference points to. Except for list types where the first type
	 * argument defines the element type.
	 */
	def static JvmType determineElementType(JvmTypeReference reference) {
		switch(reference) {
			JvmParameterizedTypeReference: {
				if (reference.arguments.size == 1)
					reference.arguments.get(0).type
				else if (reference.arguments.size == 2)
					reference.arguments.get(1).type
			}
			default: reference.type
		}
	}
	
	/**
	 * Determine the output type reference of a generator.
	 */
	def static JvmTypeReference determineGeneratorOutputType(JvmGenericType type) {
		val member = type.members.filter(JvmOperation).findFirst[member |
			member.simpleName.equals("generate")
		]
		return member.returnType
	}
	
	/**
	 * Determine the input type reference of a generator.
	 */
	def static JvmTypeReference determineGeneratorInputType(JvmGenericType type) {
		val member = type.members.filter(JvmOperation).findFirst[member |
			member.simpleName.equals("generate")
		]
		
		if (member.parameters.size == 1)
			return member.parameters.get(0).parameterType
		else /** this indicates a malformed generator declaration. */
			return null
	}
	
	/**
	 * Determine the input type reference of a generator.
	 */
	def static Map<String, JvmTypeReference> determineGeneratorAuxTypes(JvmGenericType type) {
		val result = new HashMap<String, JvmTypeReference>
		type.members.filter(JvmOperation).forEach[member |
			 if (member.simpleName.startsWith("set")) {
			 	if (member.parameters.size == 1)
			 		result.put(member.simpleName.substring(3).toFirstLower, member.parameters.get(0).parameterType)
			 }
		]
		return result
	}
	
	
	
	/**
	 * Check if the given model declaration is a simple or collection type.
	 */
	def static boolean isCollectionType(ModelDeclaration declaration) {
		return declaration.selector.resolveType.isListType || 
			(declaration.model.eContainer as ModelSequence).type.collection
	}
	
	def static boolean isCollectionType(Model model) {
		val nodeType = (model.eContainer as ModelSequence).type
		return nodeType.resolveType.isListType || nodeType.collection
	}
	
	/**
	 * Resolve the source model reference of the weaver instance.
	 */
	def static SourceModelNodeSelector resolveWeaverSourceModel(Weaver weaver) {
		if (weaver.sourceModel != null)
			weaver.sourceModel
		else 
			weaver.predecessingWeaver?.resolveWeaverSourceModel
	}
	
	/**
	 * Returns the predecessing weaver of the given weaver or null on error.
	 */
	def static Weaver predecessingWeaver(Weaver weaver) {
		val connections = (weaver.eContainer as GecoModel).fragments
		val index = connections.lastIndexOf(weaver)
		if (index > 0) {
			var i = 1
			while (((index-i)>=0) && !(connections.get(index-i) instanceof Weaver)) {
				i++
			}
			if (i<=index)
				return connections.get(index-i) as Weaver
			else
				return null
		} else
			return null
	}
	
}