/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.NodeType#getEclass <em>Eclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeType()
 * @model
 * @generated
 */
public interface NodeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Eclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eclass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eclass</em>' attribute.
   * @see #setEclass(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeType_Eclass()
   * @model
   * @generated
   */
  String getEclass();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.NodeType#getEclass <em>Eclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eclass</em>' attribute.
   * @see #getEclass()
   * @generated
   */
  void setEclass(String value);

} // NodeType
