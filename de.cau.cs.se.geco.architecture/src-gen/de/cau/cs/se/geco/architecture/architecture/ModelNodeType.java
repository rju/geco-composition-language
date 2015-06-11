/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getType <em>Type</em>}</li>
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
   * @see #setTarget(Metamodel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelNodeType_Target()
   * @model
   * @generated
   */
  Metamodel getTarget();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Metamodel value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EClass)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelNodeType_Type()
   * @model
   * @generated
   */
  EClass getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EClass value);

} // ModelNodeType
