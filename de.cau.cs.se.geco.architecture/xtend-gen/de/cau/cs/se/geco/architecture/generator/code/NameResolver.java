package de.cau.cs.se.geco.architecture.generator.code;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class NameResolver {
  /**
   * Name of internal collections for models for a specific metamodel.
   */
  public CharSequence collectionName(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create the name of an unnamed instance based on its type.
   */
  public String getInstanceName(final JvmType type) {
    String _simpleName = type.getSimpleName();
    return StringExtensions.toFirstLower(_simpleName);
  }
}
