/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Set Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.NodeSetRelation#getSourceNodes <em>Source Nodes</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.NodeSetRelation#getTargetNodes <em>Target Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeSetRelation()
 * @model
 * @generated
 */
public interface NodeSetRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Nodes</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeSetRelation_SourceNodes()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeReference> getSourceNodes();

  /**
   * Returns the value of the '<em><b>Target Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Nodes</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getNodeSetRelation_TargetNodes()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeReference> getTargetNodes();

} // NodeSetRelation
