/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator#getAND <em>AND</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator#getOR <em>OR</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getLogicOperator()
 * @model
 * @generated
 */
public interface LogicOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>AND</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AND</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AND</em>' attribute.
   * @see #setAND(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getLogicOperator_AND()
   * @model
   * @generated
   */
  String getAND();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator#getAND <em>AND</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AND</em>' attribute.
   * @see #getAND()
   * @generated
   */
  void setAND(String value);

  /**
   * Returns the value of the '<em><b>OR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>OR</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>OR</em>' attribute.
   * @see #setOR(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getLogicOperator_OR()
   * @model
   * @generated
   */
  String getOR();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator#getOR <em>OR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OR</em>' attribute.
   * @see #getOR()
   * @generated
   */
  void setOR(String value);

} // LogicOperator
