/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weaver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Weaver#getAspectModel <em>Aspect Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getWeaver()
 * @model
 * @generated
 */
public interface Weaver extends Connection
{
  /**
   * Returns the value of the '<em><b>Aspect Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspect Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspect Model</em>' containment reference.
   * @see #setAspectModel(AspectModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getWeaver_AspectModel()
   * @model containment="true"
   * @generated
   */
  AspectModel getAspectModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Weaver#getAspectModel <em>Aspect Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspect Model</em>' containment reference.
   * @see #getAspectModel()
   * @generated
   */
  void setAspectModel(AspectModel value);

} // Weaver
