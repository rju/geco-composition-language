/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Model Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelSelector()
 * @model
 * @generated
 */
public interface SourceModelSelector extends EObject
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
   * @see #setReference(Model)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelSelector_Reference()
   * @model
   * @generated
   */
  Model getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Model value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelSelector_Constraint()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getConstraint();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(ConstraintExpression value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelSelector_Property()
   * @model containment="true"
   * @generated
   */
  NodeProperty getProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(NodeProperty value);

} // SourceModelSelector
