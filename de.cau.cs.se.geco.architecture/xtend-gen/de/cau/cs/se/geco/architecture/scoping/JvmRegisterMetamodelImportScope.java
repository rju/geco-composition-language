package de.cau.cs.se.geco.architecture.scoping;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JvmRegisterMetamodelImportScope implements IScope {
  private IJvmTypeProvider typeProvider;
  
  private String packageName;
  
  public JvmRegisterMetamodelImportScope(final JvmType type, final ResourceSet resourceSet, final IJvmTypeProvider.Factory typeProviderFactory) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof JvmDeclaredType) {
        _matched=true;
        _switchResult = ((JvmDeclaredType)type).getPackageName();
      }
    }
    if (!_matched) {
      _switchResult = "nop";
    }
    this.packageName = _switchResult;
    IJvmTypeProvider _findOrCreateTypeProvider = typeProviderFactory.findOrCreateTypeProvider(resourceSet);
    this.typeProvider = _findOrCreateTypeProvider;
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    return new ArrayList<IEObjectDescription>();
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    List<String> _segments = name.getSegments();
    String _last = IterableExtensions.<String>last(_segments);
    String _string = name.toString();
    String _plus = ((this.packageName + ".") + _string);
    JvmType _findTypeByName = this.typeProvider.findTypeByName(_plus);
    IEObjectDescription _create = EObjectDescription.create(_last, _findTypeByName);
    result.add(_create);
    return result;
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    return new ArrayList<IEObjectDescription>();
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
