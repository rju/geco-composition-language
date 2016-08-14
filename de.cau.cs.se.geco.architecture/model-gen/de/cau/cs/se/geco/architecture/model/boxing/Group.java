/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getUnits <em>Units</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceTraceModels <em>Source Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceModels <em>Source Models</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_Units()
	 * @model transient="true"
	 * @generated
	 */
	EList<Unit> getUnits();

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getSubGroups();

	/**
	 * Returns the value of the '<em><b>Source Trace Models</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.TraceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Trace Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Trace Models</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_SourceTraceModels()
	 * @model
	 * @generated
	 */
	EList<TraceModel> getSourceTraceModels();

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_SourceModels()
	 * @model transient="true"
	 * @generated
	 */
	EList<Model> getSourceModels();

} // Group
