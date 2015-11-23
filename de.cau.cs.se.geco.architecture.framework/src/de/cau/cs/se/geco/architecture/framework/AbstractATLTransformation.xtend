package de.cau.cs.se.geco.architecture.framework

import de.cau.cs.se.geco.architecture.framework.IGenerator
import java.io.IOException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData
import org.eclipse.emf.ecore.util.ExtendedMetaData
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.m2m.atl.emftvm.EmftvmFactory
import org.eclipse.m2m.atl.emftvm.ExecEnv
import org.eclipse.m2m.atl.emftvm.Metamodel
import org.eclipse.m2m.atl.emftvm.Model
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver
import org.eclipse.m2m.atl.emftvm.util.TimingData

class AbstractATLTransformation<S extends EObject,T> implements IGenerator<S, T> { 
	
	public final static String IN_METAMODEL_NAME = "Composed"
	public final static String OUT_METAMODEL_NAME = "Simple"
	
	String transformationDir
	
	override generate(S input) {
		
		/* 
		 * Creates the execution environment where the transformation is going to be executed,
		 * you could use an execution pool if you want to run multiple transformations in parallel,
		 * but for the purpose of the example let's keep it simple.
		 */
		val ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv()
		val ResourceSet rs = new ResourceSetImpl()

		/*
		 * Load meta-models in the resource set we just created, the idea here is to make the meta-models
		 * available in the context of the execution environment, the ResourceSet is later passed to the
		 * ModuleResolver that is the actual class that will run the transformation.
		 * Notice that we use the nsUris to locate the metamodels in the package registry, we initialize them 
		 * from Ecore files that we registered lazily as shown below in e.g. registerInputMetamodel(...) 
		 */
		val inMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		//inMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
		env.registerMetaModel(IN_METAMODEL_NAME, inMetamodel);
		
		val outMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		//outMetamodel.setResource(rs.getResource(URI.createURI(outputMetamodelNsURI), true));
		env.registerMetaModel(OUT_METAMODEL_NAME, outMetamodel);
		
		/*
		 * Create and register resource factories to read/parse .xmi and .emftvm files,
		 * we need an .xmi parser because our in/output models are .xmi and our transformations are
		 * compiled using the ATL-EMFTV compiler that generates .emftvm files
		 */
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
		
		// Load models
		val inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource((input as EObject).eResource);
		env.registerInputModel("IN", inModel);
		
		val outModel = EmftvmFactory.eINSTANCE.createModel()
		val result = null
		outModel.setResource(result)
		env.registerOutputModel("OUT", outModel)
		
		/*
		 *  Load and run the transformation module
		 *  Point at the directory your transformations are stored, the ModuleResolver will 
		 *  look for the .emftvm file corresponding to the module you want to load and run
		 */
		val mr = new DefaultModuleResolver(transformationDir, rs)
		val td = new TimingData()
		//env.loadModule(mr, TRANSFORMATION_MODULE);
		td.finishLoading();
		env.run(td);
		td.finish();
			
		// Save models
		try {
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result
	}
	
}