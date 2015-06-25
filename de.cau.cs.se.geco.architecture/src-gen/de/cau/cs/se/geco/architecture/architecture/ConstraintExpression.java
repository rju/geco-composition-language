/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression()
 * @model
 * @generated
 */
public interface ConstraintExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(CompareExpression)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression_Left()
   * @model containment="true"
   * @generated
   */
  CompareExpression getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(CompareExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.LogicOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator
   * @see #setOperator(LogicOperator)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression_Operator()
   * @model
   * @generated
   */
  LogicOperator getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(LogicOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ConstraintExpression)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression_Right()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ConstraintExpression value);

} // ConstraintExpression
