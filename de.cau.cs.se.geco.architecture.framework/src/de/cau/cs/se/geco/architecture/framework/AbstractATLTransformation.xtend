package de.cau.cs.se.geco.architecture.framework

import de.cau.cs.se.geco.architecture.framework.IGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver
import org.eclipse.m2m.atl.emftvm.util.TimingData
import org.eclipse.m2m.atl.emftvm.Model
import org.eclipse.m2m.atl.emftvm.EmftvmFactory
import org.eclipse.m2m.atl.emftvm.ExecEnv

/**
 * The AbstractATLTransformation must be subclassed and the
 * concrete subclass must have a constructor with zero parameters
 * which initializes transformationDir and transformationModule by
 * invoking the super constructor.
 * 
 * The present implementation has the limitation that the input
 * object must be contained in a resource and must be (most likely)
 * the root class of that resource.
 * 
 * See http://victorguana.blogspot.de/2015/02/running-atl-emftvm-transformations.html
 * for more details.
 * 
 * @author Reiner Jung
 */
abstract class AbstractATLTransformation<S extends EObject,T extends EObject> implements IGenerator<S, T> { 
	
	val String transformationDir
	val String transformationModule
	
	new(String transformationDir, String transformationModule) {
		this.transformationDir = transformationDir
		this.transformationModule = transformationModule
	}

	override generate(S input) {
		val ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv()
		val ResourceSet resourceSet = new ResourceSetImpl()

		val outputResource = resourceSet.createResource(URI.createURI("internal://memory"))

		/** Load models */
		val Model inModel = EmftvmFactory.eINSTANCE.createModel()
		inModel.setResource((input as EObject).eResource)
		env.registerInputModel("IN", inModel)
		
		val Model outModel = EmftvmFactory.eINSTANCE.createModel()
		outModel.setResource(outputResource)
		env.registerOutputModel("OUT", outModel)
		
		/**
		 *  Load and run the transformation module
		 *  Point at the directory your transformations are stored, the ModuleResolver will 
		 *  look for the .emftvm file corresponding to the module you want to load and run
		 */
		val ModuleResolver moduleResolver = new DefaultModuleResolver(transformationDir, resourceSet)
		val TimingData timingData = new TimingData()
		env.loadModule(moduleResolver, transformationModule)
		timingData.finishLoading()
		env.run(timingData)
		timingData.finish()
		
		return outModel.getResource().contents.get(0) as T
	}
	
}