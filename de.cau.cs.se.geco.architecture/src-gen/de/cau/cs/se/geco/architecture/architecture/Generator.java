/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Generator#getGenerator <em>Generator</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Generator#getWriteTraceModel <em>Write Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Generator#getReadTraceModels <em>Read Trace Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends Connection, AspectModel
{
  /**
   * Returns the value of the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generator</em>' reference.
   * @see #setGenerator(GeneratorImport)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator_Generator()
   * @model
   * @generated
   */
  GeneratorImport getGenerator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getGenerator <em>Generator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generator</em>' reference.
   * @see #getGenerator()
   * @generated
   */
  void setGenerator(GeneratorImport value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator_WriteTraceModel()
   * @model containment="true"
   * @generated
   */
  TraceModel getWriteTraceModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getWriteTraceModel <em>Write Trace Model</em>}' containment reference.
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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getGenerator_ReadTraceModels()
   * @model
   * @generated
   */
  EList<TraceModel> getReadTraceModels();

} // Generator
