package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import java.util.List;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

/**
 * The AbstractQVTTransformation must be subclassed and the
 * concrete subclass must have a constructor with zero parameter
 * which initializes transformationURI by invoking the super
 * constructor.
 * 
 * The implementation is based on the invocation example
 * see http://wiki.eclipse.org/QVTOML/Examples/InvokeInJava
 * 
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public abstract class AbstractQVTTransformation<S extends EObject, T extends EObject> implements IGenerator<S, T> {
  private final URI transformationURI;
  
  public AbstractQVTTransformation(final URI transformationURI) {
    this.transformationURI = transformationURI;
  }
  
  @Override
  public T generate(final S input) {
    final TransformationExecutor executor = new TransformationExecutor(this.transformationURI);
    final BasicModelExtent inputModel = new BasicModelExtent();
    inputModel.add(input);
    final BasicModelExtent outputModel = new BasicModelExtent();
    final ExecutionContextImpl context = new ExecutionContextImpl();
    context.setConfigProperty("keepModeling", Boolean.valueOf(true));
    final ExecutionDiagnostic result = executor.execute(context, inputModel, outputModel);
    int _severity = result.getSeverity();
    boolean _equals = (_severity == Diagnostic.OK);
    if (_equals) {
      List<EObject> _contents = outputModel.getContents();
      EObject _get = _contents.get(0);
      return ((T) _get);
    } else {
      return null;
    }
  }
}
