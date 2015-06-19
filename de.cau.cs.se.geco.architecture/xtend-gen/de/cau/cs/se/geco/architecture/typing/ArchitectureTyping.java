package de.cau.cs.se.geco.architecture.typing;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

@SuppressWarnings("all")
public class ArchitectureTyping {
  public static EClass resolveType(final ModelNodeType type) {
    NodeProperty _property = type.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      return type.getType();
    } else {
      NodeProperty _property_1 = type.getProperty();
      return ArchitectureTyping.resolveType(_property_1);
    }
  }
  
  public static EClass resolveType(final NodeProperty property) {
    NodeProperty _subProperty = property.getSubProperty();
    boolean _equals = Objects.equal(_subProperty, null);
    if (_equals) {
      EReference _property = property.getProperty();
      return _property.getEReferenceType();
    } else {
      NodeProperty _subProperty_1 = property.getSubProperty();
      return ArchitectureTyping.resolveType(_subProperty_1);
    }
  }
  
  public static EClass resolveType(final Metamodel metamodel) {
    EObject _eContainer = metamodel.eContainer();
    ModelNodeType _type = ((MetamodelSequence) _eContainer).getType();
    return ArchitectureTyping.resolveType(_type);
  }
}
