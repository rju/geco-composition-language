/**
 * Copyright 2017 GECO Project
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
 */
package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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
 * 
 * @since 1.0
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
    final ResourceSet resourceSet = new ResourceSetImpl();
    URI _createURI = URI.createURI("internal://memory");
    final Resource outputResource = resourceSet.createResource(_createURI);
    final Model inModel = EmftvmFactory.eINSTANCE.createModel();
    Resource _eResource = ((EObject) input).eResource();
    inModel.setResource(_eResource);
    env.registerInputModel("IN", inModel);
    final Model outModel = EmftvmFactory.eINSTANCE.createModel();
    outModel.setResource(outputResource);
    env.registerOutputModel("OUT", outModel);
    final ModuleResolver moduleResolver = new DefaultModuleResolver(this.transformationDir, resourceSet);
    final TimingData timingData = new TimingData();
    env.loadModule(moduleResolver, this.transformationModule);
    timingData.finishLoading();
    env.run(timingData);
    timingData.finish();
    Resource _resource = outModel.getResource();
    EList<EObject> _contents = _resource.getContents();
    EObject _get = _contents.get(0);
    return ((T) _get);
  }
}
