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
    final Consumer<Import> _function = (Import it) -> {
      this.imports.put(it.getImportedNamespace(), 
        EObjectDescription.create(it.getImportedNamespace().getSimpleName(), it.getImportedNamespace()));
    };
    list.forEach(_function);
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    return this.imports.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function2<JvmType, IEObjectDescription, Boolean> _function = (JvmType type, IEObjectDescription description) -> {
      return Boolean.valueOf(type.getSimpleName().equals(name.toString()));
    };
    return MapExtensions.<JvmType, IEObjectDescription>filter(this.imports, _function).values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    final Function2<JvmType, IEObjectDescription, Boolean> _function = (JvmType type, IEObjectDescription description) -> {
      return Boolean.valueOf(type.equals(object));
    };
    return MapExtensions.<JvmType, IEObjectDescription>filter(this.imports, _function).values();
  }
  
  @Override
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    return IterableExtensions.<IEObjectDescription>last(this.getElements(name));
  }
  
  @Override
  public IEObjectDescription getSingleElement(final EObject object) {
    return IterableExtensions.<IEObjectDescription>last(this.getElements(object));
  }
}
