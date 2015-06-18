package de.cau.cs.se.geco.architecture.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.ArrayList
import java.util.List
import java.util.Iterator
import org.eclipse.xtext.resource.EObjectDescription
import de.cau.cs.se.geco.architecture.architecture.Import

class JvmScope implements IScope {
			
	List<IEObjectDescription> objectDescriptions
	
	Iterator<? extends Import> imports
		
	new(Resource resource, Class<? extends Import> type) {
		this.objectDescriptions = new ArrayList<IEObjectDescription>()
		this.imports = resource.allContents.filter(type)
		this.imports.forEach[
			objectDescriptions.add(EObjectDescription.create(it.importedNamespace.split('\\.').last, it))
		]
	}
	
	override getAllElements() {
		return objectDescriptions
	}
	
	override getElements(QualifiedName name) {
		objectDescriptions.filter[it.name.equals(name)]
	}
	
	override getElements(EObject object) {
		val elements = this.imports.filter[it.equals(object)]
		objectDescriptions.filter[elements.exists[element | it.name.equals(element)]]
	}
	
	override getSingleElement(QualifiedName name) {
		objectDescriptions.findFirst[it.name.equals(name)]
	}
	
	override getSingleElement(EObject object) {
		val element = this.imports.findFirst[it.equals(object)]
		if (element != null)
			EObjectDescription.create(element.importedNamespace, element)
		else
			null
	}
	
}