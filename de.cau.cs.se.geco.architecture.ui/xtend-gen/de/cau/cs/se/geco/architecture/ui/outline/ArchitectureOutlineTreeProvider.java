/**
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.ui.outline;

import de.cau.cs.se.geco.architecture.architecture.ModelType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class ArchitectureOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Override
  protected void createNode(final IOutlineNode parent, final EObject modelElement) {
    boolean _matched = false;
    if (modelElement instanceof ModelType) {
      _matched=true;
    }
    if (!_matched) {
      super.createNode(parent, modelElement);
    }
  }
}
