/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(JvmType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getFragment_Reference()
   * @model
   * @generated
   */
  JvmType getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(JvmType value);

  /**
   * Returns the value of the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Model</em>' containment reference.
   * @see #setSourceModel(SourceModelNodeSelector)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getFragment_SourceModel()
   * @model containment="true"
   * @generated
   */
  SourceModelNodeSelector getSourceModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getSourceModel <em>Source Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Model</em>' containment reference.
   * @see #getSourceModel()
   * @generated
   */
  void setSourceModel(SourceModelNodeSelector value);

  /**
   * Returns the value of the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Model</em>' containment reference.
   * @see #setTargetModel(TargetModelNodeType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getFragment_TargetModel()
   * @model containment="true"
   * @generated
   */
  TargetModelNodeType getTargetModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getTargetModel <em>Target Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Model</em>' containment reference.
   * @see #getTargetModel()
   * @generated
   */
  void setTargetModel(TargetModelNodeType value);

} // Fragment
