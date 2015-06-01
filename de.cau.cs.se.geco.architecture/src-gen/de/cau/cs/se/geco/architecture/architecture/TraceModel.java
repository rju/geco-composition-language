/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TraceModel#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TraceModel#getNodeSetRelations <em>Node Set Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTraceModel()
 * @model
 * @generated
 */
public interface TraceModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTraceModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.TraceModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Node Set Relations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.NodeSetRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Set Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Set Relations</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTraceModel_NodeSetRelations()
   * @model containment="true"
   * @generated
   */
  EList<NodeSetRelation> getNodeSetRelations();

} // TraceModel
