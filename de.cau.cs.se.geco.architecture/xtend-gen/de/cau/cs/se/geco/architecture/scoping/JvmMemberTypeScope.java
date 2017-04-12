package de.cau.cs.se.geco.architecture.scoping;

import com.google.common.collect.Iterables;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
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
    this.findMembers(type.getMembers(), "get");
    this.findMembers(type.getMembers(), "is");
  }
  
  private void findMembers(final List<JvmMember> members, final String prefix) {
    final Function1<JvmOperation, Boolean> _function = (JvmOperation it) -> {
      return Boolean.valueOf(it.getSimpleName().startsWith(prefix));
    };
    final Consumer<JvmOperation> _function_1 = (JvmOperation it) -> {
      this.fields.put(it, EObjectDescription.create(this.createName(it, prefix), it));
    };
    IterableExtensions.<JvmOperation>filter(Iterables.<JvmOperation>filter(members, JvmOperation.class), _function).forEach(_function_1);
  }
  
  private String createName(final JvmOperation operation, final String prefix) {
    return StringExtensions.toFirstLower(operation.getSimpleName().replaceFirst(prefix, ""));
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    return this.fields.values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final Function2<JvmOperation, IEObjectDescription, Boolean> _function = (JvmOperation object, IEObjectDescription description) -> {
      return Boolean.valueOf((this.createName(object, "get").equals(name.toString()) || 
        this.createName(object, "is").equals(name.toString())));
    };
    return MapExtensions.<JvmOperation, IEObjectDescription>filter(this.fields, _function).values();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    final Function2<JvmOperation, IEObjectDescription, Boolean> _function = (JvmOperation op, IEObjectDescription description) -> {
      return Boolean.valueOf(op.equals(object));
    };
    return MapExtensions.<JvmOperation, IEObjectDescription>filter(this.fields, _function).values();
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
