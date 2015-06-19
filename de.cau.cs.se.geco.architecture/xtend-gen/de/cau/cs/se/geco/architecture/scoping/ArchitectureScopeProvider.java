package de.cau.cs.se.geco.architecture.scoping;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.scoping.JvmMemberType;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider;

@SuppressWarnings("all")
public class ArchitectureScopeProvider implements IDelegatingScopeProvider {
  @Inject
  @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
  private IScopeProvider delegate;
  
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (context instanceof NodeProperty) {
        String _name = reference.getName();
        boolean _equals = _name.equals("property");
        if (_equals) {
          _matched=true;
          EObject _eContainer = ((NodeProperty)context).eContainer();
          _switchResult = this.createPropertyScope(_eContainer, reference);
        }
      }
    }
    if (!_matched) {
      if (context instanceof Generator) {
        String _name = reference.getName();
        boolean _equals = _name.equals("generator");
        if (_equals) {
          _matched=true;
          EObject _eContainer = ((Generator)context).eContainer();
          _switchResult = this.createJvmTypeScope(_eContainer);
        }
      }
    }
    if (!_matched) {
      IScope _xblockexpression = null;
      {
        System.out.println((((">> " + context) + " ") + reference));
        _xblockexpression = this.delegate.getScope(context, reference);
      }
      _switchResult = _xblockexpression;
    }
    return _switchResult;
  }
  
  private IScope createJvmTypeScope(final EObject container) {
    IScope _xifexpression = null;
    if ((container instanceof Model)) {
      final ArrayList<JvmType> result = new ArrayList<JvmType>();
      EList<Import> _imports = ((Model) container).getImports();
      final Consumer<Import> _function = new Consumer<Import>() {
        public void accept(final Import it) {
          JvmType _importedNamespace = it.getImportedNamespace();
          result.add(_importedNamespace);
        }
      };
      _imports.forEach(_function);
      return Scopes.scopeFor(result);
    } else {
      IScope _xifexpression_1 = null;
      if ((container instanceof Weaver)) {
        EObject _eContainer = ((Weaver)container).eContainer();
        _xifexpression_1 = this.createJvmTypeScope(_eContainer);
      } else {
        Class<? extends EObject> _class = container.getClass();
        String _name = _class.getName();
        String _plus = ("Illegal nesting of generator inside a " + _name);
        throw new UnsupportedOperationException(_plus);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private IScope createPropertyScope(final EObject container, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (container instanceof ModelNodeType) {
        _matched=true;
        RegisteredPackage _target = ((ModelNodeType)container).getTarget();
        JvmType _registeredPackage = _target.getRegisteredPackage();
        _switchResult = this.createJvmDeclaredTypeScope(_registeredPackage, reference);
      }
    }
    if (!_matched) {
      if (container instanceof NodeProperty) {
        _matched=true;
        _switchResult = IScope.NULLSCOPE;
      }
    }
    if (!_matched) {
      _switchResult = IScope.NULLSCOPE;
    }
    return _switchResult;
  }
  
  private IScope createJvmDeclaredTypeScope(final JvmType type, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof JvmDeclaredType) {
        _matched=true;
        _switchResult = new JvmMemberType(((JvmDeclaredType)type));
      }
    }
    if (!_matched) {
      _switchResult = IScope.NULLSCOPE;
    }
    return _switchResult;
  }
  
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
}
