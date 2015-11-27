/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separate Pointcut Advice Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SeparatePointcutAdviceModel#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.SeparatePointcutAdviceModel#getAdvice <em>Advice</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSeparatePointcutAdviceModel()
 * @model
 * @generated
 */
public interface SeparatePointcutAdviceModel extends AspectModel
{
  /**
   * Returns the value of the '<em><b>Pointcut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcut</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointcut</em>' containment reference.
   * @see #setPointcut(TargetModelNodeType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSeparatePointcutAdviceModel_Pointcut()
   * @model containment="true"
   * @generated
   */
  TargetModelNodeType getPointcut();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SeparatePointcutAdviceModel#getPointcut <em>Pointcut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointcut</em>' containment reference.
   * @see #getPointcut()
   * @generated
   */
  void setPointcut(TargetModelNodeType value);

  /**
   * Returns the value of the '<em><b>Advice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advice</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advice</em>' containment reference.
   * @see #setAdvice(AdviceModel)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSeparatePointcutAdviceModel_Advice()
   * @model containment="true"
   * @generated
   */
  AdviceModel getAdvice();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.SeparatePointcutAdviceModel#getAdvice <em>Advice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Advice</em>' containment reference.
   * @see #getAdvice()
   * @generated
   */
  void setAdvice(AdviceModel value);

} // SeparatePointcutAdviceModel
