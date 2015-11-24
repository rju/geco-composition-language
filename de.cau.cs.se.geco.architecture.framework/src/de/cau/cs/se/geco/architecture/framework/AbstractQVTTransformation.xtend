package de.cau.cs.se.geco.architecture.framework

import de.cau.cs.se.geco.architecture.framework.IGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import org.eclipse.m2m.qvt.oml.TransformationExecutor
import org.eclipse.m2m.qvt.oml.BasicModelExtent
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl
import org.eclipse.emf.common.util.Diagnostic

/**
 * The AbstractQVTTransformation must be subclassed and the
 * concrete subclass must have a constructor with zero parameter
 * which initializes transformationURI by invoking the super
 * constructor.
 * 
 * The implementation is based on the invocation example
 * see http://wiki.eclipse.org/QVTOML/Examples/InvokeInJava
 * 
 * @author Reiner Jung
 */
abstract class AbstractQVTTransformation<S extends EObject, T extends EObject> implements IGenerator<S, T> {
	
	val URI transformationURI
	
	new(URI transformationURI) {
		this.transformationURI = transformationURI
	}
	
	override generate(S input) {
		val executor = new TransformationExecutor(transformationURI)
				
		// create the input extent with its initial contents
		val inputModel = new BasicModelExtent()
		inputModel.add(input)
				
		// create an empty extent to catch the output
		val outputModel = new BasicModelExtent()
		
		// setup the execution environment details -> 
		// configuration properties, logger, monitor object etc.
		val context = new ExecutionContextImpl()
		context.setConfigProperty("keepModeling", true)
		
		// run the transformation assigned to the executor with the given 
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		val result = executor.execute(context, inputModel, outputModel)
		
		if(result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			return outputModel.getContents().get(0) as T
		} else
			return null
	}
	
}