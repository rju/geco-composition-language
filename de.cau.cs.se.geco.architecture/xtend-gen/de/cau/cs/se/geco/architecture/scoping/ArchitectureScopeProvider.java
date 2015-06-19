package de.cau.cs.se.geco.architecture.scoping;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.GeneratorImport;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.architecture.WeaverImport;
import de.cau.cs.se.geco.architecture.scoping.JvmScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
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
      if (context instanceof Weaver) {
        String _name = reference.getName();
        boolean _equals = _name.equals("weaver");
        if (_equals) {
          _matched=true;
          Resource _eResource = ((Weaver)context).eResource();
          _switchResult = new JvmScope(_eResource, WeaverImport.class);
        }
      }
    }
    if (!_matched) {
      if (context instanceof Generator) {
        String _name = reference.getName();
        boolean _equals = _name.equals("generator");
        if (_equals) {
          _matched=true;
          Resource _eResource = ((Generator)context).eResource();
          _switchResult = new JvmScope(_eResource, GeneratorImport.class);
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
  
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
}
