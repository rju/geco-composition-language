/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#isMultiply <em>Multiply</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTargetModelNodeType()
 * @model
 * @generated
 */
public interface TargetModelNodeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Node Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Type</em>' containment reference.
   * @see #setNodeType(ModelNodeType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTargetModelNodeType_NodeType()
   * @model containment="true"
   * @generated
   */
  ModelNodeType getNodeType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getNodeType <em>Node Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Type</em>' containment reference.
   * @see #getNodeType()
   * @generated
   */
  void setNodeType(ModelNodeType value);

  /**
   * Returns the value of the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiply</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiply</em>' attribute.
   * @see #setMultiply(boolean)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTargetModelNodeType_Multiply()
   * @model
   * @generated
   */
  boolean isMultiply();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#isMultiply <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiply</em>' attribute.
   * @see #isMultiply()
   * @generated
   */
  void setMultiply(boolean value);

} // TargetModelNodeType
