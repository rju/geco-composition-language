package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.Map
import java.util.HashMap
import org.eclipse.xtext.resource.EObjectDescription

/**
 * This scope comprises of a set of feature names of an EObject descendant,
 * which are represented in Java as either get* or is* following Java
 * coding conventions. 
 */
class JvmMemberTypeScope implements IScope {
	
	val Map<JvmOperation, IEObjectDescription> fields = new HashMap<JvmOperation, IEObjectDescription>
	
	new(JvmDeclaredType type) {
		type.members.filter(JvmOperation).filter[
			it.simpleName.startsWith("get") ||
			it.simpleName.startsWith("is")
		].forEach[
			fields.put(it, EObjectDescription.create(it.createName, it))
		]
	}
	
	private def String createName(JvmOperation operation) {
		operation.simpleName.replaceFirst("get", "").toFirstLower
	}
	
	override getAllElements() {
		fields.values
	}
	
	override getElements(QualifiedName name) {
		fields.filter[object, description | object.createName.equals(name.toString)].values
	}
	
	override getElements(EObject object) {
		fields.filter[op, description | op.equals(object)].values
	}
	
	override getSingleElement(QualifiedName name) {
		getElements(name).last
	}
	
	override getSingleElement(EObject object) {
		getElements(object).last
	}	
}