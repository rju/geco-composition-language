package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.collect.Iterables;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This scope comprises of a set of feature names of an EObject descendant,
 * which are represented in Java as either get* or is* following Java
 * coding conventions.
 */
@SuppressWarnings("all")
public class JvmMemberTypeScope implements IScope {
  private final Map<JvmOperation, IEObjectDescription> fields = new HashMap<JvmOperation, IEObjectDescription>();
  
  public JvmMemberTypeScope(final JvmDeclaredType type) {
    EList<JvmMember> _members = type.getMembers();
    Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Function1<JvmOperation, Boolean> _function = (JvmOperation it) -> {
      boolean _or = false;
      String _simpleName = it.getSimpleName();
      boolean _startsWith = _simpleName.startsWith("get");
      if (_startsWith) {
        _or = true;
      } else {
        String _simpleName_1 = it.getSimpleName();
        boolean _startsWith_1 = _simpleName_1.startsWith("is");
        _or = _startsWith_1;
      }
      return Boolean.valueOf(_or);
    };
    Iterable<JvmOperation> _filter_1 = IterableExtensions.<JvmOperation>filter(_filter, _function);
    final Consumer<JvmOperation> _function_1 = (JvmOperation it) -> {
      String _createName = this.createName(it);
      IEObjectDescription _create = EObjectDescription.create(_createName, it);
      this.fields.put(it, _create);
    };
    _filter_1.forEach(_function_1);
  }
  
  private String createName(final JvmOperation operation) {
    String _simpleName = operation.getSimpleName();
    String _replaceFirst = _simpleName.replaceFirst("get", "");
    return StringExtensions.toFirstLower(_replaceFirst);
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    return this.fields.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function2<JvmOperation, IEObjectDescription, Boolean> _function = (JvmOperation object, IEObjectDescription description) -> {
      String _createName = this.createName(object);
      String _string = name.toString();
      return Boolean.valueOf(_createName.equals(_string));
    };
    Map<JvmOperation, IEObjectDescription> _filter = MapExtensions.<JvmOperation, IEObjectDescription>filter(this.fields, _function);
    return _filter.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    final Function2<JvmOperation, IEObjectDescription, Boolean> _function = (JvmOperation op, IEObjectDescription description) -> {
      return Boolean.valueOf(op.equals(object));
    };
    Map<JvmOperation, IEObjectDescription> _filter = MapExtensions.<JvmOperation, IEObjectDescription>filter(this.fields, _function);
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
