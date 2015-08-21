/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getSourceTraceModels <em>Source Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getProcessor <em>Processor</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetModel <em>Target Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetTraceModel <em>Target Trace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
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
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getUnit_SourceTraceModels()
	 * @model
	 * @generated
	 */
	EList<TraceModel> getSourceTraceModels();

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getUnit_SourceModels()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<Metamodel> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getUnit_Processor()
	 * @model required="true"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Model</em>' reference.
	 * @see #setTargetModel(Metamodel)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getUnit_TargetModel()
	 * @model required="true"
	 * @generated
	 */
	Metamodel getTargetModel();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetModel <em>Target Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model</em>' reference.
	 * @see #getTargetModel()
	 * @generated
	 */
	void setTargetModel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Target Trace Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Trace Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Trace Model</em>' reference.
	 * @see #setTargetTraceModel(TraceModel)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getUnit_TargetTraceModel()
	 * @model
	 * @generated
	 */
	TraceModel getTargetTraceModel();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetTraceModel <em>Target Trace Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Trace Model</em>' reference.
	 * @see #getTargetTraceModel()
	 * @generated
	 */
	void setTargetTraceModel(TraceModel value);

} // Unit
