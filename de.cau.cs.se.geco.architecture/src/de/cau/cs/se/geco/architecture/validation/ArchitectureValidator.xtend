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
package de.cau.cs.se.geco.architecture.validation

import org.eclipse.xtext.validation.Check
import de.cau.cs.se.geco.architecture.architecture.Weaver
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.framework.IWeaver
import de.cau.cs.se.geco.architecture.framework.IWeaverSeparatePointcut

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ArchitectureValidator extends AbstractArchitectureValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					ArchitecturePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkWeaverSourceModelType(Weaver weaver) {
		val weaverJvmType = weaver.reference
		switch(weaverJvmType) {
			JvmGenericType: {
				val match = weaverJvmType.superTypes.filter[
					it.type.qualifiedName.equals(IWeaver.canonicalName) ||
					it.type.qualifiedName.equals(IWeaverSeparatePointcut.canonicalName)
				]
				if (match.size > 0) {
					if (match.get(0) instanceof JvmParameterizedTypeReference) {
						val iface = match.get(0) as JvmParameterizedTypeReference
						val baseTypeReference = iface.arguments.get(0)
						// TODO val aspectTypeReference = iface.arguments.get(1)
						val sourceModelTypeReference = weaver.resolveWeaverSourceModel.resolveType
						if (!sourceModelTypeReference.isSubTypeOf(baseTypeReference)) {
							if (!sourceModelTypeReference.determineElementType.resolveType.isSubTypeOf(baseTypeReference)) {
								error('Source model type ' + sourceModelTypeReference.qualifiedName + 
										' does not match weaver base type ' + baseTypeReference.qualifiedName, 
										ArchitecturePackage.Literals.FRAGMENT__SOURCE_MODEL)
							}
						}
					}
				} else {
					error('Weaver expected, but ' + weaverJvmType.qualifiedName + ' found.', 
								ArchitecturePackage.Literals.FRAGMENT__REFERENCE)
				}
			}
			default: error('Weaver expected, but illegal type found. Please check for build failures.', 
								ArchitecturePackage.Literals.FRAGMENT__REFERENCE)
		}		
	}
	
	@Check
	def checkGeneratorSourceModelType(Generator generator) {
		val generatorJvmType = generator.reference
		switch(generatorJvmType) {
			JvmGenericType: {
				val match = generatorJvmType.superTypes.filter[it.type.simpleName.equals("IGenerator")]
				if (match.size > 0) {
					if (match.get(0) instanceof JvmParameterizedTypeReference) {
						val inputTypeReference = generatorJvmType.determineGeneratorInputType
						
						val sourceModelTypeReference = generator.sourceModel.resolveType
						/** check whether the sourceModel is equal or subtype to inputType */
						if (sourceModelTypeReference !== null) {
							if (!sourceModelTypeReference.isSubTypeOf(inputTypeReference)) {
								if (!sourceModelTypeReference.determineElementType.resolveType.isSubTypeOf(inputTypeReference)) {
									error('Source model type ' + sourceModelTypeReference.determineElementType.qualifiedName + 
										' does not match generator source type ' + inputTypeReference.qualifiedName, 
									ArchitecturePackage.Literals.FRAGMENT__SOURCE_MODEL)
								}
							}
						}
						
						val outputTypeReference = generatorJvmType.determineGeneratorOutputType
						if (generator.targetModel !== null) {
							val targetModelTypeReference = generator.targetModel.resolveType
							if (!outputTypeReference.isSubTypeOf(targetModelTypeReference))
								error('Target model type ' + sourceModelTypeReference.qualifiedName + 
										' does not match generator target type ' + inputTypeReference.qualifiedName, 
									ArchitecturePackage.Literals.FRAGMENT__TARGET_MODEL)
						}
					} else {
						error('Generator expected, but illegal type found. Please check for build failures.', 
								ArchitecturePackage.Literals.FRAGMENT__REFERENCE)
					}
				} else {
					error('Generator expected, but illegal type found. Please check for build failures.', 
						ArchitecturePackage.Literals.FRAGMENT__REFERENCE)
				}
			}
			default: error('Generator expected, but illegal type found. Please check for build failures.', 
						ArchitecturePackage.Literals.FRAGMENT__REFERENCE)
		}
	}
	
}
