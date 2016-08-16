package de.cau.cs.se.geco.architecture.scoping;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.QualifiedName;
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
  
  public JvmImportTypeScope(final /* Iterable<Import> */Object list) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field importedNamespace is undefined for the type Object"
      + "\nThe method or field importedNamespace is undefined for the type Object"
      + "\nThe method or field importedNamespace is undefined for the type Object"
      + "\nsimpleName cannot be resolved");
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    return this.imports.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function2<JvmType, IEObjectDescription, Boolean> _function = (JvmType type, IEObjectDescription description) -> {
      String _simpleName = type.getSimpleName();
      String _string = name.toString();
      return Boolean.valueOf(_simpleName.equals(_string));
    };
    Map<JvmType, IEObjectDescription> _filter = MapExtensions.<JvmType, IEObjectDescription>filter(this.imports, _function);
    return _filter.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    final Function2<JvmType, IEObjectDescription, Boolean> _function = (JvmType type, IEObjectDescription description) -> {
      return Boolean.valueOf(type.equals(object));
    };
    Map<JvmType, IEObjectDescription> _filter = MapExtensions.<JvmType, IEObjectDescription>filter(this.imports, _function);
    return _filter.values();
  }
  
  @Override
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    Iterable<IEObjectDescription> _elements = this.getElements(name);
    return IterableExtensions.<IEObjectDescription>last(_elements);
  }
  
  @Override
  public IEObjectDescription getSingleElement(final EObject object) {
    Iterable<IEObjectDescription> _elements = this.getElements(object);
    return IterableExtensions.<IEObjectDescription>last(_elements);
  }
}
