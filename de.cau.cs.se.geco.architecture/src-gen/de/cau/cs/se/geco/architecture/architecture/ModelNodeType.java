/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelNodeType()
 * @model
 * @generated
 */
public interface ModelNodeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(RegisteredPackage)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelNodeType_Target()
   * @model
   * @generated
   */
  RegisteredPackage getTarget();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(RegisteredPackage value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(NodeProperty)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelNodeType_Property()
   * @model containment="true"
   * @generated
   */
  NodeProperty getProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(NodeProperty value);

} // ModelNodeType
