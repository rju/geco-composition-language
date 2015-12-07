/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelType#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelType#getProperty <em>Property</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelType#isCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends EObject
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
   * @see #setTarget(RegisteredRootClass)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelType_Target()
   * @model
   * @generated
   */
  RegisteredRootClass getTarget();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelType#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(RegisteredRootClass value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelType_Property()
   * @model containment="true"
   * @generated
   */
  NodeProperty getProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelType#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(NodeProperty value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(boolean)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelType_Collection()
   * @model
   * @generated
   */
  boolean isCollection();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelType#isCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #isCollection()
   * @generated
   */
  void setCollection(boolean value);

} // ModelType
