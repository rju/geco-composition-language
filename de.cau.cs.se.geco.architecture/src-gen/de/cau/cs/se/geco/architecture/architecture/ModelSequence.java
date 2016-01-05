/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelSequence()
 * @model
 * @generated
 */
public interface ModelSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.ModelModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
   * @see #setModifier(ModelModifier)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelSequence_Modifier()
   * @model
   * @generated
   */
  ModelModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(ModelModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ModelType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelSequence_Type()
   * @model containment="true"
   * @generated
   */
  ModelType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ModelType value);

  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModelSequence_Models()
   * @model containment="true"
   * @generated
   */
  EList<Model> getModels();

} // ModelSequence