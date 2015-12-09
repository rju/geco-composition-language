package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.collect.Iterables;
import java.util.HashMap;
import java.util.List;
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
    this.findMembers(_members, "get");
    EList<JvmMember> _members_1 = type.getMembers();
    this.findMembers(_members_1, "is");
  }
  
  private void findMembers(final List<JvmMember> members, final String prefix) {
    Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(members, JvmOperation.class);
    final Function1<JvmOperation, Boolean> _function = (JvmOperation it) -> {
      String _simpleName = it.getSimpleName();
      return Boolean.valueOf(_simpleName.startsWith(prefix));
    };
    Iterable<JvmOperation> _filter_1 = IterableExtensions.<JvmOperation>filter(_filter, _function);
    final Consumer<JvmOperation> _function_1 = (JvmOperation it) -> {
      String _createName = this.createName(it, prefix);
      IEObjectDescription _create = EObjectDescription.create(_createName, it);
      this.fields.put(it, _create);
    };
    _filter_1.forEach(_function_1);
  }
  
  private String createName(final JvmOperation operation, final String prefix) {
    String _simpleName = operation.getSimpleName();
    String _replaceFirst = _simpleName.replaceFirst(prefix, "");
    return StringExtensions.toFirstLower(_replaceFirst);
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    return this.fields.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function2<JvmOperation, IEObjectDescription, Boolean> _function = (JvmOperation object, IEObjectDescription description) -> {
      boolean _or = false;
      String _createName = this.createName(object, "get");
      String _string = name.toString();
      boolean _equals = _createName.equals(_string);
      if (_equals) {
        _or = true;
      } else {
        String _createName_1 = this.createName(object, "is");
        String _string_1 = name.toString();
        boolean _equals_1 = _createName_1.equals(_string_1);
        _or = _equals_1;
      }
      return Boolean.valueOf(_or);
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
