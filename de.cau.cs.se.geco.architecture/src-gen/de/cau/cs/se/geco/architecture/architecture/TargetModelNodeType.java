/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#isMultiply <em>Multiply</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTargetModelNodeType()
 * @model
 * @generated
 */
public interface TargetModelNodeType extends AspectModel
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Metamodel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTargetModelNodeType_Reference()
   * @model
   * @generated
   */
  Metamodel getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Metamodel value);

  /**
   * Returns the value of the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiply</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiply</em>' attribute.
   * @see #setMultiply(boolean)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTargetModelNodeType_Multiply()
   * @model
   * @generated
   */
  boolean isMultiply();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#isMultiply <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiply</em>' attribute.
   * @see #isMultiply()
   * @generated
   */
  void setMultiply(boolean value);

} // TargetModelNodeType
