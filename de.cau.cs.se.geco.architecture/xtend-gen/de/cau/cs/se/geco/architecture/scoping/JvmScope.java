package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import de.cau.cs.se.geco.architecture.architecture.Import;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class JvmScope implements IScope {
  private List<IEObjectDescription> objectDescriptions;
  
  private Iterator<? extends Import> imports;
  
  public JvmScope(final Resource resource, final Class<? extends Import> type) {
    ArrayList<IEObjectDescription> _arrayList = new ArrayList<IEObjectDescription>();
    this.objectDescriptions = _arrayList;
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<? extends Import> _filter = Iterators.filter(_allContents, type);
    this.imports = _filter;
    final Procedure1<Import> _function = new Procedure1<Import>() {
      public void apply(final Import it) {
        String _importedNamespace = it.getImportedNamespace();
        String[] _split = _importedNamespace.split("\\.");
        String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
        IEObjectDescription _create = EObjectDescription.create(_last, it);
        JvmScope.this.objectDescriptions.add(_create);
      }
    };
    IteratorExtensions.forEach(this.imports, _function);
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    return this.objectDescriptions;
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        QualifiedName _name = it.getName();
        return Boolean.valueOf(_name.equals(name));
      }
    };
    return IterableExtensions.<IEObjectDescription>filter(this.objectDescriptions, _function);
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      final Function1<Import, Boolean> _function = new Function1<Import, Boolean>() {
        public Boolean apply(final Import it) {
          return Boolean.valueOf(it.equals(object));
        }
      };
      final Iterator<? extends Import> elements = IteratorExtensions.filter(this.imports, _function);
      final Function1<IEObjectDescription, Boolean> _function_1 = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription it) {
          final Function1<Import, Boolean> _function = new Function1<Import, Boolean>() {
            public Boolean apply(final Import element) {
              QualifiedName _name = it.getName();
              return Boolean.valueOf(_name.equals(element));
            }
          };
          return Boolean.valueOf(IteratorExtensions.exists(elements, _function));
        }
      };
      _xblockexpression = IterableExtensions.<IEObjectDescription>filter(this.objectDescriptions, _function_1);
    }
    return _xblockexpression;
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        QualifiedName _name = it.getName();
        return Boolean.valueOf(_name.equals(name));
      }
    };
    return IterableExtensions.<IEObjectDescription>findFirst(this.objectDescriptions, _function);
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    IEObjectDescription _xblockexpression = null;
    {
      final Function1<Import, Boolean> _function = new Function1<Import, Boolean>() {
        public Boolean apply(final Import it) {
          return Boolean.valueOf(it.equals(object));
        }
      };
      final Import element = IteratorExtensions.findFirst(this.imports, _function);
      IEObjectDescription _xifexpression = null;
      boolean _notEquals = (!Objects.equal(element, null));
      if (_notEquals) {
        String _importedNamespace = element.getImportedNamespace();
        _xifexpression = EObjectDescription.create(_importedNamespace, element);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
