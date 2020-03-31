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

import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral
import de.cau.cs.se.geco.architecture.architecture.CompareExpression
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral
import de.cau.cs.se.geco.architecture.architecture.InstanceOf
import de.cau.cs.se.geco.architecture.architecture.IntLiteral
import de.cau.cs.se.geco.architecture.architecture.Literal
import de.cau.cs.se.geco.architecture.architecture.LogicOperator
import de.cau.cs.se.geco.architecture.architecture.ModelType
import de.cau.cs.se.geco.architecture.architecture.Negation
import de.cau.cs.se.geco.architecture.architecture.NodeProperty
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector
import de.cau.cs.se.geco.architecture.architecture.StringLiteral

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*

class SelectorQuery {
	/**
	 * Process a node type selector query. If no property is set only add an instance of type to the model list.
	 * If the property has a list type iterate over the property (one more for each).
	 * If the property has a flat type only add the single value.
	 */
	def createSelectorQuery(ModelType type, String modelName) {
		if (type.property === null)
			'''«modelName».add(it)'''
		else if (type.property.property.resolveType.isListType) {
			'''it.«type.property.property.simpleName»().forEach[«type.property.createPropertyQuery(modelName)»]'''			
		} else { 
			'''«modelName».add(it.«type.property.property.simpleName»)'''
		}
			
	}
	
	/**
	 * Create an initialization section for an auxiliary model collection.
	 */
	def createSourceAuxModel(SourceModelSelector sourceAuxModel, int i) {
		if (sourceAuxModel.property === null) {
			'''val aux«i» = «sourceAuxModel.reference.name»«sourceAuxModel.constraint.createConstraintFilter»''' 
		} else { 
			'''
				val aux«i» = new ArrayList<«sourceAuxModel.resolveType.qualifiedName»>()
				«sourceAuxModel.reference.name».forEach[it.«sourceAuxModel.property.createPropertyQuery('''aux«i»''')»]
			'''
		}
	}
	
	
		
	/**
	 * Check if the given property value instance has a sub property. If not,
	 * just add the value, else create a for each loop for list properties or a single
	 * value add for non list types.
	 */
	private def CharSequence createPropertyQuery(NodeProperty property, String modelName) {
		if (property.subProperty === null)
			'''«modelName».add(it)'''
		else if (property.property.resolveType.isListType) {
			'''it.«property.property.simpleName»().forEach[«property.subProperty.createPropertyQuery(modelName)»]'''
		} else {
			'''«modelName».add(it.«property.subProperty.property.simpleName»)'''
		}
	}
	
	/** --------------------- */
	
	/**
	 * Create a constraint filter for a query if a filter is defined.
	 */
	def createConstraintFilter(ConstraintExpression expression) {
		if (expression === null)
			''''''
		else if (expression instanceof InstanceOf)
			'''.filter(«expression.type.qualifiedName»)'''
		else
			'''.filter[«expression.createConstraint»]'''
	}
	
	/** constraint computation */
	private def dispatch CharSequence createConstraint(Negation expression) '''!«expression.constraint»'''
	
	private def dispatch CharSequence createConstraint(Literal expression) {
		switch(expression) {
			ArrayLiteral: '{' + expression.literals.map[it.createConstraint] + '}'
			BooleanLiteral: expression.value
			FloatLiteral: expression.value
			IntLiteral: expression.value.toString
			StringLiteral: '"' + expression + '"'
		}
	}
	
	private def dispatch CharSequence createConstraint(NodeProperty expression) '''«expression.property.simpleName»'''
	
	private def dispatch CharSequence createConstraint(InstanceOf expression) 
		'''it instanceof «expression.type.qualifiedName»'''
	
	private def dispatch CharSequence createConstraint(ConstraintExpression expression) {
		'''(«expression.left.createConstraint» «expression.operator.createOperator» «expression.right.createConstraint»)'''
	}
	
	private def createOperator(LogicOperator operator) {
		switch(operator) {
			case AND: '&&'
			case OR: '||'
		}
	}
	
	private def dispatch CharSequence createConstraint(CompareExpression expression) {
		'''(«expression.left.createConstraint» «expression.comparator.literal» «expression.right.createConstraint»)'''
	}
	
		
	

}