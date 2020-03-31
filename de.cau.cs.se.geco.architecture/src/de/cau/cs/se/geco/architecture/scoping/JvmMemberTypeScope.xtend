/***************************************************************************
 * Copyright (C) 2016 Reiner Jung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
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
import java.util.List
import org.eclipse.xtext.common.types.JvmMember

/**
 * This scope comprises of a set of feature names of an EObject descendant,
 * which are represented in Java as either get* or is* following Java
 * coding conventions. 
 */
class JvmMemberTypeScope implements IScope {
	
	val Map<JvmOperation, IEObjectDescription> fields = new HashMap<JvmOperation, IEObjectDescription>
	
	new(JvmDeclaredType type) {
		type.members.findMembers("get")
		type.members.findMembers("is")
	}
	
	private def void findMembers(List<JvmMember> members, String prefix) {
		members.filter(JvmOperation).filter[
			it.simpleName.startsWith(prefix)
		].forEach[
			fields.put(it, EObjectDescription.create(it.createName(prefix), it))
		]
	}
	
	private def String createName(JvmOperation operation, String prefix) {
		operation.simpleName.replaceFirst(prefix, "").toFirstLower
	}
	
	override getAllElements() {
		fields.values
	}
	
	override getElements(QualifiedName name) {
		fields.filter[object, description | 
			object.createName("get").equals(name.toString) ||
			object.createName("is").equals(name.toString)
		].values
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