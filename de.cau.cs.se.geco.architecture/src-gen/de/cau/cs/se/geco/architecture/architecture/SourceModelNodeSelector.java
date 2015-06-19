/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Model Node Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelNodeSelector()
 * @model
 * @generated
 */
public interface SourceModelNodeSelector extends EObject
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
   * @see #setReference(Metamodel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelNodeSelector_Reference()
   * @model
   * @generated
   */
  Metamodel getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Metamodel value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(XExpression)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSourceModelNodeSelector_Property()
   * @model containment="true"
   * @generated
   */
  XExpression getProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(XExpression value);

} // SourceModelNodeSelector
