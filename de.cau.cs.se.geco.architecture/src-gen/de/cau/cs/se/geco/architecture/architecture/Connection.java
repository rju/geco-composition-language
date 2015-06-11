/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_SourceModel()
   * @model containment="true"
   * @generated
   */
  SourceModelNodeSelector getSourceModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getSourceModel <em>Source Model</em>}' containment reference.
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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_TargetModel()
   * @model containment="true"
   * @generated
   */
  TargetModelNodeType getTargetModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getTargetModel <em>Target Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Model</em>' containment reference.
   * @see #getTargetModel()
   * @generated
   */
  void setTargetModel(TargetModelNodeType value);

} // Connection
