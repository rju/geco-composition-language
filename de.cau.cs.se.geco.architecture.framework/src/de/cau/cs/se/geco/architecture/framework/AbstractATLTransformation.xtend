package de.cau.cs.se.geco.architecture.framework

import de.cau.cs.se.geco.architecture.framework.IGenerator

class AbstractATLTransformation<S,T> implements IGenerator<S, T> { 
	
	override generate(S input) {
		
		// create stuff
		val emfFactory = new EMFModelFactory()
		val xmiFactory = new XMIResourceFactoryImpl()
		
		EMFExtractor extractor = new EMFExtractor();
		EMFInjector emfInjector = new EMFInjector();
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// load model
		EMFReferenceModel hdlMetaModel = (EMFReferenceModel) emfFactory.newReferenceModel();
		emfInjector.inject(hdlMetaModel, resourceSet.getResource(URI.createFileURI("org.xtext.hal/model/generated/Hdl.ecore"), true));
		EMFModel hdlData = (EMFModel) emfFactory.newModel(hdlMetaModel);
		
		EMFReferenceModel palMetaModel = (EMFReferenceModel) emfFactory.newReferenceModel();
		emfInjector.inject(palMetaModel, resourceSet.getResource(URI.createFileURI("org.xtext.hal/model/Pal.ecore"), true));
		EMFModel palData = (EMFModel) emfFactory.newModel(palMetaModel);
		palData.setIsTarget(true);
		
		// load xtext content, convert to xmi
		Resource xmiResource = xmiFactory.createResource(URI.createURI("org.xtext.hal/model/generated/Hdl.xmi"));
		xmiResource.getContents().addAll(hdlModel.getContents());
		emfInjector.inject(hdlData, xmiResource);
		
		// ATL transformation
		InputStream asm = new FileInputStream("org.xtext.hal/model/Pal.asm");
		EMFVMLauncher launcher = new EMFVMLauncher();
		
		HashMap<String,Object> options = new HashMap<String,Object>();
		options.put("showSummary", "true");
		options.put("step", "true");
		
		launcher.initialize(Collections.<String, Object> emptyMap());
		launcher.addInModel(hdlData, "IN", "hdl");
		launcher.addOutModel(palData, "OUT", "pal");
		launcher.launch(ILauncher.DEBUG_MODE, new NullProgressMonitor(), options, asm);
		
		// get output
		Resource t_palData = palData.getResource();
		t_palData.setURI(URI.createURI("palData.xmi")); // Exception in thread "main" java.lang.NullPointerException
		t_palData.save(null);


	}
	
}