package de.cau.cs.se.geco.architecture.generator.code

import de.cau.cs.se.geco.architecture.architecture.Model
import org.eclipse.xtext.common.types.JvmType

class NameResolver {
	/**
	 * Name of internal collections for models for a specific metamodel.
	 */
	def collectionName(Model model) '''«model.name»BaseCollection'''

	/**
	 * Create the name of an unnamed instance based on its type. 
	 */
	def getInstanceName(JvmType type) {
		type.simpleName.toFirstLower
	}
}