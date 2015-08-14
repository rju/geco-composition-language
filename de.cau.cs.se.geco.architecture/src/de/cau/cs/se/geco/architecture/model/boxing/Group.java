/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
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
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getWriteTraceModels <em>Write Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getReadTraceModels <em>Read Trace Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_SourceModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceModelNodeSelector> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_Transformations()
	 * @model transient="true"
	 * @generated
	 */
	EList<Processor> getTransformations();

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
	 * Returns the value of the '<em><b>Write Trace Models</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.TraceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Trace Models</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Trace Models</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_WriteTraceModels()
	 * @model
	 * @generated
	 */
	EList<TraceModel> getWriteTraceModels();

	/**
	 * Returns the value of the '<em><b>Read Trace Models</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.TraceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Trace Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Trace Models</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGroup_ReadTraceModels()
	 * @model
	 * @generated
	 */
	EList<TraceModel> getReadTraceModels();

} // Group
