package de.cau.cs.se.geco.architecture.scoping;

import de.cau.cs.se.geco.architecture.architecture.Import;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;

/**
 * This scope defines a set of names based on the imported generators or
 * weavers.
 */
@SuppressWarnings("all")
public class JvmImportTypeScope implements IScope {
  private final Map<JvmType, IEObjectDescription> imports = new HashMap<JvmType, IEObjectDescription>();
  
  public JvmImportTypeScope(final Iterable<Import> list) {
    final Consumer<Import> _function = new Consumer<Import>() {
      public void accept(final Import it) {
        JvmType _importedNamespace = it.getImportedNamespace();
        JvmType _importedNamespace_1 = it.getImportedNamespace();
        String _simpleName = _importedNamespace_1.getSimpleName();
        JvmType _importedNamespace_2 = it.getImportedNamespace();
        IEObjectDescription _create = EObjectDescription.create(_simpleName, _importedNamespace_2);
        JvmImportTypeScope.this.imports.put(_importedNamespace, _create);
      }
    };
    list.forEach(_function);
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    return this.imports.values();
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function2<JvmType, IEObjectDescription, Boolean> _function = new Function2<JvmType, IEObjectDescription, Boolean>() {
      public Boolean apply(final JvmType type, final IEObjectDescription description) {
        String _simpleName = type.getSimpleName();
        String _string = name.toString();
        return Boolean.valueOf(_simpleName.equals(_string));
      }
    };
    Map<JvmType, IEObjectDescription> _filter = MapExtensions.<JvmType, IEObjectDescription>filter(this.imports, _function);
    return _filter.values();
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    final Function2<JvmType, IEObjectDescription, Boolean> _function = new Function2<JvmType, IEObjectDescription, Boolean>() {
      public Boolean apply(final JvmType type, final IEObjectDescription description) {
        return Boolean.valueOf(type.equals(object));
      }
    };
    Map<JvmType, IEObjectDescription> _filter = MapExtensions.<JvmType, IEObjectDescription>filter(this.imports, _function);
    return _filter.values();
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    Iterable<IEObjectDescription> _elements = this.getElements(name);
    return IterableExtensions.<IEObjectDescription>last(_elements);
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    Iterable<IEObjectDescription> _elements = this.getElements(object);
    return IterableExtensions.<IEObjectDescription>last(_elements);
  }
}
