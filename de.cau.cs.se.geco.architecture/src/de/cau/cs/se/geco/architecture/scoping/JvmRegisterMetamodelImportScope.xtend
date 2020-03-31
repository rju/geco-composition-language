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

import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.common.types.access.IJvmTypeProvider

class JvmRegisterMetamodelImportScope implements IScope {
	
	String packageName
	
	IJvmTypeProvider typeProvider
	
	new(JvmType type, ResourceSet resourceSet, IJvmTypeProvider.Factory typeProviderFactory) {
		this.packageName = switch (type) {
			JvmDeclaredType: type.packageName
			default: "nop"
		} 		
		this.typeProvider = typeProviderFactory.findOrCreateTypeProvider(resourceSet)
	}
	
	override getAllElements() {
		new ArrayList<IEObjectDescription>
	}
	
	override getElements(QualifiedName name) {
		val result = new ArrayList<IEObjectDescription>
		val type = typeProvider.findTypeByName(packageName + "." + name.toString)
		if (type !== null)
			result.add(EObjectDescription.create(name.segments.last, type))
		return result
	}
	
	override getElements(EObject object) {
		new ArrayList<IEObjectDescription>
	}
	
	override getSingleElement(QualifiedName name) {
		return this.getElements(name).last
	}
	
	override getSingleElement(EObject object) {
		return this.getElements(object).last
	}
	
}