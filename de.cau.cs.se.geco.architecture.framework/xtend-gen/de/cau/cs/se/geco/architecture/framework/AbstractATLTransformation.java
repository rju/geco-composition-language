package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class AbstractATLTransformation<S extends EObject, T extends Object> implements IGenerator<S, T> {
  public final static String IN_METAMODEL_NAME = "Composed";
  
  public final static String OUT_METAMODEL_NAME = "Simple";
  
  private String transformationDir;
  
  @Override
  public T generate(final S input) {
    throw new Error("Unresolved compilation problems:"
      + "\nExecEnv cannot be resolved to a type."
      + "\nThe method or field EmftvmFactory is undefined for the type AbstractATLTransformation"
      + "\nThe method or field EmftvmFactory is undefined for the type AbstractATLTransformation"
      + "\nThe method or field EmftvmFactory is undefined for the type AbstractATLTransformation"
      + "\nEMFTVMResourceFactoryImpl cannot be resolved."
      + "\nThe method or field EmftvmFactory is undefined for the type AbstractATLTransformation"
      + "\nThe method or field EmftvmFactory is undefined for the type AbstractATLTransformation"
      + "\nDefaultModuleResolver cannot be resolved."
      + "\nTimingData cannot be resolved."
      + "\neINSTANCE cannot be resolved"
      + "\ncreateExecEnv cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateMetamodel cannot be resolved"
      + "\nregisterMetaModel cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateMetamodel cannot be resolved"
      + "\nregisterMetaModel cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateModel cannot be resolved"
      + "\nsetResource cannot be resolved"
      + "\nregisterInputModel cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateModel cannot be resolved"
      + "\nsetResource cannot be resolved"
      + "\nregisterOutputModel cannot be resolved"
      + "\nfinishLoading cannot be resolved"
      + "\nrun cannot be resolved"
      + "\nfinish cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\nsave cannot be resolved");
  }
}
