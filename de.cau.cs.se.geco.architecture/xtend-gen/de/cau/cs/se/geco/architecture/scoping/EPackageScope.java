/**
 * Copyright 2015 GECO
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
package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Scope for EPackages in a resource set.
 * 
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class EPackageScope implements IScope {
  private final Collection<IEObjectDescription> descriptors = new ArrayList<IEObjectDescription>();
  
  private final Collection<EPackage> packages = new ArrayList<EPackage>();
  
  /**
   * Create a new EPackageScope in the context of a resource set.
   * 
   * @param resourceSet the resource set where the packages should be searched for.
   */
  public EPackageScope(final ResourceSet resourceSet) {
    System.out.println(("set " + resourceSet));
    EList<Resource> _resources = resourceSet.getResources();
    String _plus = ("set content " + _resources);
    System.out.println(_plus);
    EList<Resource> _resources_1 = resourceSet.getResources();
    final Consumer<Resource> _function = new Consumer<Resource>() {
      public void accept(final Resource resource) {
        System.out.println(("resource " + resource));
        EList<EObject> _contents = resource.getContents();
        Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
        final Consumer<EPackage> _function = new Consumer<EPackage>() {
          public void accept(final EPackage it) {
            System.out.println(("package " + it));
            String _name = it.getName();
            IEObjectDescription _create = EObjectDescription.create(_name, it);
            EPackageScope.this.descriptors.add(_create);
            EPackageScope.this.packages.add(it);
          }
        };
        _filter.forEach(_function);
      }
    };
    _resources_1.forEach(_function);
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        QualifiedName _name = it.getName();
        return Boolean.valueOf(_name.equals(name));
      }
    };
    return IterableExtensions.<IEObjectDescription>findFirst(this.descriptors, _function);
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    System.out.println(("EPackageScope.getElements(name) " + name));
    final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    IEObjectDescription _singleElement = this.getSingleElement(name);
    result.add(_singleElement);
    return result;
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    System.out.println(("EPackageScope.getSingleElement(object) " + object));
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        EObject _eObjectOrProxy = it.getEObjectOrProxy();
        return Boolean.valueOf(_eObjectOrProxy.equals(object));
      }
    };
    return IterableExtensions.<IEObjectDescription>findFirst(this.descriptors, _function);
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    System.out.println(("EPackageScope.getElements(object) " + object));
    final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    IEObjectDescription _singleElement = this.getSingleElement(object);
    result.add(_singleElement);
    return result;
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("EPackageScope.getAllElements()");
    return this.descriptors;
  }
}
