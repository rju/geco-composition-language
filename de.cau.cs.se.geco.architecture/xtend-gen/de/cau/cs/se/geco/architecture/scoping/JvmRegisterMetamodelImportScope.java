package de.cau.cs.se.geco.architecture.scoping;

import java.util.ArrayList;
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
  private String packageName;
  
  private IJvmTypeProvider typeProvider;
  
  public JvmRegisterMetamodelImportScope(final JvmType type, final ResourceSet resourceSet, final IJvmTypeProvider.Factory typeProviderFactory) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof JvmDeclaredType) {
      _matched=true;
      _switchResult = ((JvmDeclaredType)type).getPackageName();
    }
    if (!_matched) {
      _switchResult = "nop";
    }
    this.packageName = _switchResult;
    this.typeProvider = typeProviderFactory.findOrCreateTypeProvider(resourceSet);
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    return new ArrayList<IEObjectDescription>();
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    final ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    String _string = name.toString();
    String _plus = ((this.packageName + ".") + _string);
    final JvmType type = this.typeProvider.findTypeByName(_plus);
    if ((type != null)) {
      result.add(EObjectDescription.create(IterableExtensions.<String>last(name.getSegments()), type));
    }
    return result;
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    return new ArrayList<IEObjectDescription>();
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
