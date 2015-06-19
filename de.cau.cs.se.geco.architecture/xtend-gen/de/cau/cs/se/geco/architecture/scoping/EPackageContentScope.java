package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EPackageContentScope implements IScope {
  private final Iterator<EClass> classes;
  
  /**
   * Create a new EPackageContentScope in the context of a resource set.
   * 
   * @param resourceSet the resource set where the packages should be searched for.
   */
  public EPackageContentScope(final Resource resource) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<EClass> _filter = Iterators.<EClass>filter(_allContents, EClass.class);
    this.classes = _filter;
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("EPackageContentScope.getAllElements()");
    final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    final Procedure1<EClass> _function = new Procedure1<EClass>() {
      public void apply(final EClass it) {
        QualifiedName _createQualifiedName = EPackageContentScope.this.createQualifiedName(it);
        EObjectDescription.create(_createQualifiedName, it);
      }
    };
    IteratorExtensions.<EClass>forEach(this.classes, _function);
    return result;
  }
  
  private QualifiedName createQualifiedName(final EClass clazz) {
    List<String> _createFullyQualifiedName = this.createFullyQualifiedName(clazz);
    return QualifiedName.create(_createFullyQualifiedName);
  }
  
  private List<String> createFullyQualifiedName(final EClass clazz) {
    EPackage _ePackage = clazz.getEPackage();
    final List<String> name = this.createFullyQualifiedName(_ePackage);
    String _name = clazz.getName();
    name.add(_name);
    return name;
  }
  
  private List<String> createFullyQualifiedName(final EPackage pack) {
    List<String> _xifexpression = null;
    EObject _eContainer = pack.eContainer();
    if ((_eContainer instanceof EPackage)) {
      EObject _eContainer_1 = pack.eContainer();
      _xifexpression = this.createFullyQualifiedName(((EPackage) _eContainer_1));
    } else {
      _xifexpression = new ArrayList<String>();
    }
    final List<String> name = _xifexpression;
    String _name = pack.getName();
    name.add(_name);
    return name;
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    String _lastSegment = name.getLastSegment();
    boolean _equals = Objects.equal(_lastSegment, "*");
    if (_equals) {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    } else {
      final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        public Boolean apply(final EClass it) {
          QualifiedName _createQualifiedName = EPackageContentScope.this.createQualifiedName(it);
          int _compareTo = _createQualifiedName.compareTo(name);
          return Boolean.valueOf((_compareTo == 0));
        }
      };
      Iterator<EClass> _filter = IteratorExtensions.<EClass>filter(this.classes, _function);
      final Procedure1<EClass> _function_1 = new Procedure1<EClass>() {
        public void apply(final EClass it) {
          IEObjectDescription _create = EObjectDescription.create(name, it);
          result.add(_create);
        }
      };
      IteratorExtensions.<EClass>forEach(_filter, _function_1);
      return result;
    }
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    ArrayList<IEObjectDescription> _xifexpression = null;
    if ((object instanceof EClass)) {
      final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        public Boolean apply(final EClass it) {
          String _name = it.getName();
          String _name_1 = ((EClass) object).getName();
          int _compareTo = _name.compareTo(_name_1);
          return Boolean.valueOf((_compareTo == 0));
        }
      };
      Iterator<EClass> _filter = IteratorExtensions.<EClass>filter(this.classes, _function);
      final Procedure1<EClass> _function_1 = new Procedure1<EClass>() {
        public void apply(final EClass it) {
          String _name = it.getName();
          IEObjectDescription _create = EObjectDescription.create(_name, it);
          result.add(_create);
        }
      };
      IteratorExtensions.<EClass>forEach(_filter, _function_1);
      return result;
    } else {
      _xifexpression = new ArrayList<IEObjectDescription>();
    }
    return _xifexpression;
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
      public Boolean apply(final EClass it) {
        QualifiedName _createQualifiedName = EPackageContentScope.this.createQualifiedName(it);
        int _compareTo = _createQualifiedName.compareTo(name);
        return Boolean.valueOf((_compareTo == 0));
      }
    };
    final EClass clazz = IteratorExtensions.<EClass>findFirst(this.classes, _function);
    boolean _notEquals = (!Objects.equal(clazz, null));
    if (_notEquals) {
      return EObjectDescription.create(name, clazz);
    } else {
      return null;
    }
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    if ((object instanceof EClass)) {
      final QualifiedName name = this.createQualifiedName(((EClass) object));
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        public Boolean apply(final EClass it) {
          QualifiedName _createQualifiedName = EPackageContentScope.this.createQualifiedName(it);
          int _compareTo = _createQualifiedName.compareTo(name);
          return Boolean.valueOf((_compareTo == 0));
        }
      };
      final EClass clazz = IteratorExtensions.<EClass>findFirst(this.classes, _function);
      boolean _notEquals = (!Objects.equal(clazz, null));
      if (_notEquals) {
        return EObjectDescription.create(name, clazz);
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
}
