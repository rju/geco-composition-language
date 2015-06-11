/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Merger#getMerger <em>Merger</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Merger#getAspectModel <em>Aspect Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMerger()
 * @model
 * @generated
 */
public interface Merger extends Connection
{
  /**
   * Returns the value of the '<em><b>Merger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Merger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Merger</em>' containment reference.
   * @see #setMerger(JvmTypeReference)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMerger_Merger()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getMerger();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Merger#getMerger <em>Merger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Merger</em>' containment reference.
   * @see #getMerger()
   * @generated
   */
  void setMerger(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Aspect Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspect Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspect Model</em>' containment reference.
   * @see #setAspectModel(TargetModelNodeType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMerger_AspectModel()
   * @model containment="true"
   * @generated
   */
  TargetModelNodeType getAspectModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Merger#getAspectModel <em>Aspect Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspect Model</em>' containment reference.
   * @see #getAspectModel()
   * @generated
   */
  void setAspectModel(TargetModelNodeType value);

} // Merger
