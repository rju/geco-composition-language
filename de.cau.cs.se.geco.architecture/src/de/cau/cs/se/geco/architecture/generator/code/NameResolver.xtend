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