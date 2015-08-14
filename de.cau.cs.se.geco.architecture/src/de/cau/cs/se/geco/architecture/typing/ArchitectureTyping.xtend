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
import java.util.Iterator
import de.cau.cs.se.geco.architecture.architecture.Processor
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
import de.cau.cs.se.geco.architecture.architecture.Typeof
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint
import de.cau.cs.se.geco.architecture.architecture.BasicConstraint
import de.cau.cs.se.geco.architecture.architecture.Negation

class ArchitectureTyping {
	
	def static JvmType resolveType(ModelNodeType type) {
		if (type.property == null)
			type.target.importedNamespace
		else
			type.property.resolveType
	}
	
	def static JvmType resolveType(NodeProperty property) {
		if (property.subProperty == null) {
			property.property.resolveType
		} else
			property.subProperty.resolveType
	}
	
	def static JvmType resolveType(JvmMember member) {
		switch(member) {
			JvmOperation: member.returnType.resolveType
			JvmAnnotationType: member
			default:
				throw new UnsupportedOperationException("Resolve type error. " + member.class + " is not supported.")
		}
	}
	
	def static JvmType resolveType(JvmTypeReference typeReference) {
		switch (typeReference) {
				JvmParameterizedTypeReference: typeReference.arguments.last.type
				default: typeReference.type
		}
	}
	
	def static JvmType resolveType(Metamodel metamodel) {
		(metamodel.eContainer as MetamodelSequence).type.resolveType
	}
	
	/**
	 * Resolve type of a source model node selector.
	 */
	def static JvmType resolveType(SourceModelNodeSelector selector) {
		val baseType = selector.reference.resolveType
		val type = selector.constraint.findTypeOf
		if (type != null)
			type
		else
			baseType
	}
	
	private def dispatch static JvmType findTypeOf(ConstraintExpression expression) {
		val result = expression.left.findTypeOf
		if (result == null)
			if (expression.right != null)
				return expression.right.findTypeOf
			else
				return null
		else
			return result
	}
	
	private def dispatch static JvmType findTypeOf(ParenthesisConstraint expression) {
		expression.constraint.findTypeOf
	}
	
	private def dispatch static JvmType findTypeOf(Typeof expression) {
		expression.type
	}
	
	private def dispatch static JvmType findTypeOf(Negation expression) {
		expression.constraint.findTypeOf
	}
	
	private def dispatch static JvmType findTypeOf(BasicConstraint expression) {
		null
	}
	
	/**
	 * Resolve the source model reference of the weaver instance.
	 */
	def static Metamodel resolveWeaverSourceModel(Weaver weaver) {
		if (weaver.sourceModel != null)
			weaver.sourceModel.reference
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