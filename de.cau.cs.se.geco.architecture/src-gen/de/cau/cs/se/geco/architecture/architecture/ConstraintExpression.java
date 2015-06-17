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
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getConstraint <em>Constraint</em>}</li>
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
   * @see #setLeft(ConstraintExpression)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression_Left()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConstraintExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(EObject)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression_Operator()
   * @model containment="true"
   * @generated
   */
  EObject getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(EObject value);

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

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(ConstraintExpression)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConstraintExpression_Constraint()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getConstraint();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(ConstraintExpression value);

} // ConstraintExpression
