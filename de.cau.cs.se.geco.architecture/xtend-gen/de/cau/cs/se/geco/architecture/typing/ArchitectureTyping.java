package de.cau.cs.se.geco.architecture.typing;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ArchitectureTyping {
  public static JvmType resolveType(final ModelNodeType type) {
    JvmType _xifexpression = null;
    NodeProperty _property = type.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      RegisteredPackage _target = type.getTarget();
      _xifexpression = _target.getImportedNamespace();
    } else {
      NodeProperty _property_1 = type.getProperty();
      _xifexpression = ArchitectureTyping.resolveType(_property_1);
    }
    return _xifexpression;
  }
  
  public static JvmType resolveType(final NodeProperty property) {
    JvmType _xifexpression = null;
    NodeProperty _subProperty = property.getSubProperty();
    boolean _equals = Objects.equal(_subProperty, null);
    if (_equals) {
      JvmMember _property = property.getProperty();
      _xifexpression = ArchitectureTyping.resolveType(_property);
    } else {
      NodeProperty _subProperty_1 = property.getSubProperty();
      _xifexpression = ArchitectureTyping.resolveType(_subProperty_1);
    }
    return _xifexpression;
  }
  
  public static JvmType resolveType(final JvmMember member) {
    JvmType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (member instanceof JvmOperation) {
        _matched=true;
        JvmTypeReference _returnType = ((JvmOperation)member).getReturnType();
        _switchResult = ArchitectureTyping.resolveType(_returnType);
      }
    }
    if (!_matched) {
      if (member instanceof JvmAnnotationType) {
        _matched=true;
        _switchResult = ((JvmType)member);
      }
    }
    if (!_matched) {
      Class<? extends JvmMember> _class = member.getClass();
      String _plus = ("Resolve type error. " + _class);
      String _plus_1 = (_plus + " is not supported.");
      throw new UnsupportedOperationException(_plus_1);
    }
    return _switchResult;
  }
  
  public static JvmType resolveType(final JvmTypeReference typeReference) {
    JvmType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (typeReference instanceof JvmParameterizedTypeReference) {
        _matched=true;
        EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference)typeReference).getArguments();
        JvmTypeReference _last = IterableExtensions.<JvmTypeReference>last(_arguments);
        _switchResult = _last.getType();
      }
    }
    if (!_matched) {
      _switchResult = typeReference.getType();
    }
    return _switchResult;
  }
  
  public static JvmType resolveType(final Metamodel metamodel) {
    EObject _eContainer = metamodel.eContainer();
    ModelNodeType _type = ((MetamodelSequence) _eContainer).getType();
    return ArchitectureTyping.resolveType(_type);
  }
  
  /**
   * Resolve the source model reference of the weaver instance.
   */
  public static Metamodel resolveWeaverSourceModel(final Weaver weaver) {
    Metamodel _xifexpression = null;
    SourceModelNodeSelector _sourceModel = weaver.getSourceModel();
    boolean _notEquals = (!Objects.equal(_sourceModel, null));
    if (_notEquals) {
      SourceModelNodeSelector _sourceModel_1 = weaver.getSourceModel();
      _xifexpression = _sourceModel_1.getReference();
    } else {
      Weaver _predecessingWeaver = ArchitectureTyping.predecessingWeaver(weaver);
      Metamodel _resolveWeaverSourceModel = null;
      if (_predecessingWeaver!=null) {
        _resolveWeaverSourceModel=ArchitectureTyping.resolveWeaverSourceModel(_predecessingWeaver);
      }
      _xifexpression = _resolveWeaverSourceModel;
    }
    return _xifexpression;
  }
  
  /**
   * Returns the predecessing weaver of the given weaver or null on error.
   */
  public static Weaver predecessingWeaver(final Weaver weaver) {
    EObject _eContainer = weaver.eContainer();
    final EList<Connection> connections = ((Model) _eContainer).getConnections();
    final int index = connections.lastIndexOf(weaver);
    if ((index > 0)) {
      int i = 1;
      while ((((index - i) >= 0) && (!(connections.get((index - i)) instanceof Weaver)))) {
        i++;
      }
      if ((i <= index)) {
        Connection _get = connections.get((index - i));
        return ((Weaver) _get);
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
}
