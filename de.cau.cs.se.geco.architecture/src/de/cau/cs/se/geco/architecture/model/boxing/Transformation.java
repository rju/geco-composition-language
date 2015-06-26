/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.Transformation#getDerivedFrom <em>Derived From</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference.
	 * @see #setDerivedFrom(JvmType)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getTransformation_DerivedFrom()
	 * @model required="true"
	 * @generated
	 */
	JvmType getDerivedFrom();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.Transformation#getDerivedFrom <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(JvmType value);

} // Transformation
