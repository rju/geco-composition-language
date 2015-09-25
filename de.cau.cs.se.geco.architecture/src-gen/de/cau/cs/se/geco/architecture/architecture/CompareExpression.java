/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.CompareExpression#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getCompareExpression()
 * @model
 * @generated
 */
public interface CompareExpression extends ConstraintExpression
{
  /**
   * Returns the value of the '<em><b>Comparator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.Comparator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparator</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator
   * @see #setComparator(Comparator)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getCompareExpression_Comparator()
   * @model
   * @generated
   */
  Comparator getComparator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.CompareExpression#getComparator <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparator</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator
   * @see #getComparator()
   * @generated
   */
  void setComparator(Comparator value);

} // CompareExpression
