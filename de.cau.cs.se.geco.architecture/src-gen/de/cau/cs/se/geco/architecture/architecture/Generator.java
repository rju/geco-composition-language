/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Generator#getSourceAuxModels <em>Source Aux Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Generator#getTargetTraceModel <em>Target Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Generator#getSourceTraceModels <em>Source Trace Models</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends Fragment, AdviceModel
{
  /**
   * Returns the value of the '<em><b>Source Aux Models</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Aux Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Aux Models</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator_SourceAuxModels()
   * @model containment="true"
   * @generated
   */
  EList<SourceModelNodeSelector> getSourceAuxModels();

  /**
   * Returns the value of the '<em><b>Target Trace Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Trace Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Trace Model</em>' containment reference.
   * @see #setTargetTraceModel(TargetTraceModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator_TargetTraceModel()
   * @model containment="true"
   * @generated
   */
  TargetTraceModel getTargetTraceModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getTargetTraceModel <em>Target Trace Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Trace Model</em>' containment reference.
   * @see #getTargetTraceModel()
   * @generated
   */
  void setTargetTraceModel(TargetTraceModel value);

  /**
   * Returns the value of the '<em><b>Source Trace Models</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.TraceModelReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Trace Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Trace Models</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator_SourceTraceModels()
   * @model containment="true"
   * @generated
   */
  EList<TraceModelReference> getSourceTraceModels();

} // Generator
