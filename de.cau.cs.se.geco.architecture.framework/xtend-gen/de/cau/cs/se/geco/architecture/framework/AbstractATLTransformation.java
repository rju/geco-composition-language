package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import org.eclipse.emf.ecore.EObject;

/**
 * The AbstractATLTransformation must be subclassed and the
 * concrete subclass must have a constructor with zero parameters
 * which initializes transformationDir and transformationModule by
 * invoking the super constructor.
 * 
 * The present implementation has the limitation that the input
 * object must be contained in a resource and must be (most likely)
 * the root class of that resource.
 * 
 * See http://victorguana.blogspot.de/2015/02/running-atl-emftvm-transformations.html
 * for more details.
 * 
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public abstract class AbstractATLTransformation<S extends EObject, T extends EObject> implements IGenerator<S, T> {
  private final String transformationDir;
  
  private final String transformationModule;
  
  public AbstractATLTransformation(final String transformationDir, final String transformationModule) {
    this.transformationDir = transformationDir;
    this.transformationModule = transformationModule;
  }
  
  @Override
  public T generate(final S input) {
    throw new Error("Unresolved compilation problems:"
      + "\nExecEnv cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nModuleResolver cannot be resolved to a type."
      + "\nTimingData cannot be resolved to a type."
      + "\nThe method or field EmftvmFactory is undefined"
      + "\nThe method or field EmftvmFactory is undefined"
      + "\nThe method or field EmftvmFactory is undefined"
      + "\nDefaultModuleResolver cannot be resolved."
      + "\nTimingData cannot be resolved."
      + "\neINSTANCE cannot be resolved"
      + "\ncreateExecEnv cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateModel cannot be resolved"
      + "\nsetResource cannot be resolved"
      + "\nregisterInputModel cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateModel cannot be resolved"
      + "\nsetResource cannot be resolved"
      + "\nregisterOutputModel cannot be resolved"
      + "\nloadModule cannot be resolved"
      + "\nfinishLoading cannot be resolved"
      + "\nrun cannot be resolved"
      + "\nfinish cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nget cannot be resolved");
  }
}
