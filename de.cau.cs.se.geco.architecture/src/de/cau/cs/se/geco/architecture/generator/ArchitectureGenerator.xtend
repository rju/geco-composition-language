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
package de.cau.cs.se.geco.architecture.generator

import de.cau.cs.se.geco.architecture.architecture.GecoModel
import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.cau.cs.se.geco.architecture.generator.boxing.GenerateBoxingModel
import de.cau.cs.se.geco.architecture.generator.code.GenerateGecoCode

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ArchitectureGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext contex) {
		val model = resource.allContents.filter(GecoModel).last
		val className = resource.URI.trimFileExtension.lastSegment
		val path = model.name.replace('.', File.separator)
		val generateBoxingModel = new GenerateBoxingModel()
		val generateGecoCode = new GenerateGecoCode(className)
		
		val boxingModel = generateBoxingModel.generate(model)
		val textOutput = generateGecoCode.generate(boxingModel)
		
		fsa.generateFile('''«path»«File.separator»«className».xtend''', textOutput)
	}
		

}
