package de.cau.cs.se.geco.architecture.generator.code;

import de.cau.cs.se.geco.architecture.architecture.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class NameResolver {
  /**
   * Name of internal collections for models for a specific metamodel.
   */
  public CharSequence collectionName(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = model.getName();
    _builder.append(_name);
    _builder.append("BaseCollection");
    return _builder;
  }
  
  /**
   * Create the name of an unnamed instance based on its type.
   */
  public String getInstanceName(final JvmType type) {
    return StringExtensions.toFirstLower(type.getSimpleName());
  }
}
