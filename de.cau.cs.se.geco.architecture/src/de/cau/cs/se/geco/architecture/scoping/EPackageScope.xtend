/***************************************************************************
 * Copyright 2015 GECO
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
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

/**
 * Scope for EPackages in a resource set.
 * 
 * @author Reiner Jung
 */
class EPackageScope implements IScope {
	
	val Collection<IEObjectDescription> descriptors =  new ArrayList<IEObjectDescription>()
	val Collection<EPackage> packages =  new ArrayList<EPackage>()

	/**
	 * Create a new EPackageScope in the context of a resource set.
	 * 
	 * @param resourceSet the resource set where the packages should be searched for. 
	 */
	new (ResourceSet resourceSet) {
		System.out.println("set " + resourceSet)
		System.out.println("set content " + resourceSet.resources)
		resourceSet.resources.forEach[resource | 
			System.out.println("resource " + resource)
			resource.contents.filter(EPackage).forEach[
				System.out.println("package " + it)
				descriptors.add(EObjectDescription.create(it.name, it))
				packages.add(it)
			] 
		]
	}

	override IEObjectDescription getSingleElement(QualifiedName name) {
		return descriptors.findFirst[it.name.equals(name)]
	}

	override Iterable<IEObjectDescription> getElements(QualifiedName name) {
		System.out.println("EPackageScope.getElements(name) " + name)
		val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
		result.add(this.getSingleElement(name))
		return result
	}

	override IEObjectDescription getSingleElement(EObject object) {
		System.out.println("EPackageScope.getSingleElement(object) " + object)
		return descriptors.findFirst[it.getEObjectOrProxy().equals(object)]
	}

	override Iterable<IEObjectDescription> getElements(EObject object) {
		System.out.println("EPackageScope.getElements(object) " + object)
		val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
		result.add(this.getSingleElement(object))
		return result
	}

	override Iterable<IEObjectDescription> getAllElements() {
		System.out.println("EPackageScope.getAllElements()")
		return descriptors
	}
	
}
