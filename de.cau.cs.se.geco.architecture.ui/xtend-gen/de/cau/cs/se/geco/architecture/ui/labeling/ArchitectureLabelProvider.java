/**
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.ui.labeling;

import com.google.inject.Inject;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.ModelSequence;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class ArchitectureLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ArchitectureLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final ModelSequence sequence) {
    ModelNodeType _type = sequence.getType();
    JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_type);
    return _resolveType.getSimpleName();
  }
  
  public String text(final Generator generator) {
    JvmType _reference = generator.getReference();
    String _simpleName = _reference.getSimpleName();
    return ("generator " + _simpleName);
  }
  
  public String text(final Weaver weaver) {
    JvmType _reference = weaver.getReference();
    String _simpleName = _reference.getSimpleName();
    return ("weaver " + _simpleName);
  }
}
