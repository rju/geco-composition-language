/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getMetamodels <em>Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMetamodelSequence()
 * @model
 * @generated
 */
public interface MetamodelSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.MetamodelModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelModifier
   * @see #setModifier(MetamodelModifier)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMetamodelSequence_Modifier()
   * @model
   * @generated
   */
  MetamodelModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelModifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(MetamodelModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ModelNodeType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMetamodelSequence_Type()
   * @model containment="true"
   * @generated
   */
  ModelNodeType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ModelNodeType value);

  /**
   * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Metamodel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodels</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getMetamodelSequence_Metamodels()
   * @model containment="true"
   * @generated
   */
  EList<Metamodel> getMetamodels();

} // MetamodelSequence
