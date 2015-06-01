/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getGenerator <em>Generator</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getWriteTraceModel <em>Write Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Connection#getReadTraceModels <em>Read Trace Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject
{
  /**
   * Returns the value of the '<em><b>Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generator</em>' containment reference.
   * @see #setGenerator(JvmTypeReference)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_Generator()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getGenerator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getGenerator <em>Generator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generator</em>' containment reference.
   * @see #getGenerator()
   * @generated
   */
  void setGenerator(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(SourceMetamodel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_Source()
   * @model
   * @generated
   */
  SourceMetamodel getSource();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(SourceMetamodel value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(TargetMetamodel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_Target()
   * @model
   * @generated
   */
  TargetMetamodel getTarget();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(TargetMetamodel value);

  /**
   * Returns the value of the '<em><b>Write Trace Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Write Trace Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Write Trace Model</em>' containment reference.
   * @see #setWriteTraceModel(TraceModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_WriteTraceModel()
   * @model containment="true"
   * @generated
   */
  TraceModel getWriteTraceModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getWriteTraceModel <em>Write Trace Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Write Trace Model</em>' containment reference.
   * @see #getWriteTraceModel()
   * @generated
   */
  void setWriteTraceModel(TraceModel value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getConnection_ReadTraceModels()
   * @model
   * @generated
   */
  EList<TraceModel> getReadTraceModels();

} // Connection
