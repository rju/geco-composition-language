package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.xtext.xbase.lib.Exceptions;

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
@SuppressWarnings("all")
public abstract class AbstractATLTransformation<S extends EObject, T extends EObject> implements IGenerator<S, T> {
  private final String transformationDir;
  
  private final String transformationModule;
  
  public AbstractATLTransformation(final String transformationDir, final String transformationModule) {
    this.transformationDir = transformationDir;
    this.transformationModule = transformationModule;
  }
  
  @Override
  public T generate(final S input) {
    final ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
    final ResourceSet rs = new ResourceSetImpl();
    final Metamodel inMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
    env.registerMetaModel(AbstractATLTransformation.IN_METAMODEL_NAME, inMetamodel);
    final Metamodel outMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
    env.registerMetaModel(AbstractATLTransformation.OUT_METAMODEL_NAME, outMetamodel);
    Resource.Factory.Registry _resourceFactoryRegistry = rs.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Resource.Factory.Registry _resourceFactoryRegistry_1 = rs.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap_1 = _resourceFactoryRegistry_1.getExtensionToFactoryMap();
    EMFTVMResourceFactoryImpl _eMFTVMResourceFactoryImpl = new EMFTVMResourceFactoryImpl();
    _extensionToFactoryMap_1.put("emftvm", _eMFTVMResourceFactoryImpl);
    final Model inModel = EmftvmFactory.eINSTANCE.createModel();
    Resource _eResource = ((EObject) input).eResource();
    inModel.setResource(_eResource);
    env.registerInputModel("IN", inModel);
    final Model outModel = EmftvmFactory.eINSTANCE.createModel();
    final Object result = null;
    outModel.setResource(((Resource)result));
    env.registerOutputModel("OUT", outModel);
    final DefaultModuleResolver mr = new DefaultModuleResolver(this.transformationDir, rs);
    final TimingData td = new TimingData();
    td.finishLoading();
    env.run(td);
    td.finish();
    try {
      Resource _resource = outModel.getResource();
      Map<Object, Object> _emptyMap = Collections.<Object, Object>emptyMap();
      _resource.save(_emptyMap);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return ((T)result);
  }
}
