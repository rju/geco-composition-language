package de.cau.cs.se.geco.architecture.typing

import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import de.cau.cs.se.geco.architecture.architecture.Metamodel
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.Model
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint
import de.cau.cs.se.geco.architecture.architecture.BasicConstraint
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.emf.ecore.EObject

class ArchitectureTyping {
	
	/**
	 * Resolve the type of given meta model node.
	 */
	
	def dispatch static JvmType resolveType(ModelNodeType type) {
		if (type.property == null)
			type.target.importedNamespace
		else
			type.property.resolveType
	}
	
	def dispatch static JvmType resolveType(NodeProperty property) {
		if (property.subProperty == null) {
			property.property.resolveType
		} else
			property.subProperty.resolveType
	}
	
	def dispatch static JvmType resolveType(JvmAnnotationType annotationType) {
		annotationType
	}
	
	def dispatch static JvmType resolveType(JvmOperation operation) {
		operation.returnType.type
	}
		
	def dispatch static JvmType resolveType(JvmTypeReference typeReference) {
		typeReference.type
	}
		
	// TODO add comment, fix run-time null pointer exception, appears when metamodel is renamed
	def dispatch static JvmType resolveType(Metamodel metamodel) {
		(metamodel.eContainer as MetamodelSequence).type.resolveType
	}
	
	/**
	 * Resolve type of a source model node selector.
	 */
	def dispatch static JvmType resolveType(SourceModelNodeSelector selector) {
		if (selector.property != null)
			return selector.property.resolveType
		else {
			val genericType = selector.reference.resolveType
			if (selector.constraint != null) {
				if (selector.constraint instanceof Typeof) {
					return (selector.constraint as Typeof).type
				} else
					return genericType
			} else
				return genericType
		}
	}
	
	/**
	 * Evaluate type of an ConstraintExpression.
	 */
	def dispatch static JvmType resolveType(ConstraintExpression expression) {
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
	def dispatch static JvmType resolveType(ParenthesisConstraint expression) {
		expression.constraint.resolveType
	}
	
	/**
	 * Evaluate type of an Typeof.
	 */
	def dispatch static JvmType resolveType(Typeof expression) {
		expression.type
	}
	
	/**
	 * Evaluate type of an Negation.
	 */
	def dispatch static JvmType resolveType(Negation expression) {
		expression.constraint.resolveType
	}
		
	/**
	 * Evaluate type of an BasicConstraint.
	 */
	def dispatch static JvmType resolveType(BasicConstraint expression) {
		throw new UnsupportedOperationException("BasicConstraint cannot be handled in resolveType")
	}
	
	def dispatch static resolveType(EObject object) {
		throw new UnsupportedOperationException(object.class + " cannot be handled in resolveType")
	}
	
	/**
	 * Determine the base type (in lists the element type, else the normal type).
	 */
	def static JvmType resolveBaseType(Metamodel metamodel) {
		(metamodel.eContainer as MetamodelSequence).type.resolveBaseType
	}
	
	def static JvmType resolveBaseType(ModelNodeType modelNodeType) {
		if (modelNodeType.property != null)
			modelNodeType.property.resolveBaseType
		else
			modelNodeType.target.importedNamespace
	}
	
	def static JvmType resolveBaseType(NodeProperty property) {
		if (property.subProperty == null) {
			val genericType = property.property.resolveBaseType
			if (property.constraint != null) {
				if (property.constraint instanceof Typeof) {
					return (property.constraint as Typeof).type
				} else
					return genericType
			} else
				return genericType
		} else
			property.subProperty.resolveBaseType
	}
	
	def static JvmType resolveBaseType(JvmMember member) {
		switch(member) {
			JvmOperation: member.returnType.resolveBaseType
			JvmAnnotationType: member
			default:
				throw new UnsupportedOperationException("Resolve type error. " + member.class + " is not supported.")
		}
	}
	
	/**
	 * Determine the base type of a type reference.
	 */
	def static JvmType resolveBaseType(JvmTypeReference typeReference) {
		switch (typeReference) {
				JvmParameterizedTypeReference: typeReference.arguments.last.type
				default: typeReference.type
		}
	}
	
	/**
	 * Check if a type is equal to or a subtype of matchingType.
	 */
	def static boolean isSubTypeOf(JvmGenericType type, JvmType matchingType) {
		if (type.equals(matchingType))
			return true
		else {
			type.superTypes.exists[(it.type as JvmGenericType).isSubTypeOf(matchingType)]		
		}
	}
			
	/**
	 * find out if the given type is a list or collection type.
	 * Note: This is an ugly implementation based on name matches.
	 */
	def static boolean isListType(JvmType type) {
		switch(type.qualifiedName) {
			case "java.lang.List",
			case "java.lang.Collection",
			case "org.eclipse.emf.common.util.EList" : true
			default: false
		}
	}
	
	/**
	 * Check if the given model declaration is a simple or collection type.
	 */
	def static boolean isCollectionType(ModelDeclaration declaration) {
		return declaration.selector.resolveType.isListType || 
			(declaration.metamodel.eContainer as MetamodelSequence).type.collection
	}
	
	def static boolean isCollectionType(Metamodel metamodel) {
		val nodeType = (metamodel.eContainer as MetamodelSequence).type
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
		val connections = (weaver.eContainer as Model).processors
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