package de.cau.cs.se.geco.architecture.typing

import org.eclipse.emf.ecore.EClass
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType
import de.cau.cs.se.geco.architecture.architecture.NodeProperty

class ArchitectureTyping {
	def static EClass resolveType(ModelNodeType type) {
		if (type.property == null)
			return type.type
		else
			return type.property.resolveType
	}
	
	def static EClass resolveType(NodeProperty property) {
		if (property.subProperty == null)
			return property.property.EReferenceType
		else
			return property.subProperty.resolveType
	} 
}