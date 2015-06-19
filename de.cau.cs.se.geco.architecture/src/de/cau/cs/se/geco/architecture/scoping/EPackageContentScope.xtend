package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import java.util.Collection
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EClass
import java.util.Iterator
import org.eclipse.xtext.resource.EObjectDescription
import java.util.List
import org.eclipse.emf.ecore.EPackage

class EPackageContentScope implements IScope {
	
	val Iterator<EClass> classes
	
	
	/**
	 * Create a new EPackageContentScope in the context of a resource set.
	 * 
	 * @param resourceSet the resource set where the packages should be searched for. 
	 */	
	new (Resource resource) {
		this.classes = resource.allContents.filter(EClass)
	}
		
	override getAllElements() {
		System.out.println("EPackageContentScope.getAllElements()")
		val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
		this.classes.forEach[EObjectDescription.create(it.createQualifiedName, it)]
		return result
	}
	
	private def createQualifiedName(EClass clazz) {
		QualifiedName.create(clazz.createFullyQualifiedName)
	}
		
	private def List<String> createFullyQualifiedName(EClass clazz) {
		val List<String> name = clazz.EPackage.createFullyQualifiedName
		name.add(clazz.name)
		return name 
	}
	
	private def List<String> createFullyQualifiedName(EPackage pack) {
		val name = if (pack.eContainer instanceof EPackage)
			 (pack.eContainer as EPackage).createFullyQualifiedName
		else
			new ArrayList<String>()
		
		name.add(pack.name)
		return name
	}
	
	override getElements(QualifiedName name) {
		if (name.lastSegment == '*') {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		} else {
			val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
			this.classes.filter[it.createQualifiedName.compareTo(name)==0].forEach[
				result.add(EObjectDescription.create(name, it))
			]
			return result
		}
	}
	
	override getElements(EObject object) {
		if (object instanceof EClass) {
			val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
			this.classes.filter[it.name.compareTo((object as EClass).name)==0].forEach[
				result.add(EObjectDescription.create(name, it))
			]
			return result
		} else {
			new ArrayList<IEObjectDescription>()
		}
	}
	
	override getSingleElement(QualifiedName name) {
		val clazz = this.classes.findFirst[it.createQualifiedName.compareTo(name) == 0]
		if (clazz != null)
			return EObjectDescription.create(name, clazz)
		else
			return null
	}
	
	override getSingleElement(EObject object) {
		if (object instanceof EClass) {
			val name = (object as EClass).createQualifiedName
			val clazz = this.classes.findFirst[it.createQualifiedName.compareTo(name) == 0]
			if (clazz != null)
				return EObjectDescription.create(name, clazz)
			else
				return null
		} else
			return null
	}
	
}