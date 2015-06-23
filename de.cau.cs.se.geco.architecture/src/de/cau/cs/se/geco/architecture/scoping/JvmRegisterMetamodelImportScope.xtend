package de.cau.cs.se.geco.architecture.scoping

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.ArrayList
import org.eclipse.xtext.common.types.JvmDeclaredType

class JvmRegisterMetamodelImportScope implements IScope {
			
	IJvmTypeProvider typeProvider
	
	String packageName
	
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
		result.add(EObjectDescription.create(name.segments.last, typeProvider.findTypeByName(packageName + "." + name.toString)))
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