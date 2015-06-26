/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Model Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode#getDeclaredModel <em>Declared Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getRootModelNode()
 * @model
 * @generated
 */
public interface RootModelNode extends BoxingModelNode {
	/**
	 * Returns the value of the '<em><b>Declared Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Model</em>' reference.
	 * @see #setDeclaredModel(RegisteredPackage)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getRootModelNode_DeclaredModel()
	 * @model required="true"
	 * @generated
	 */
	RegisteredPackage getDeclaredModel();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode#getDeclaredModel <em>Declared Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Model</em>' reference.
	 * @see #getDeclaredModel()
	 * @generated
	 */
	void setDeclaredModel(RegisteredPackage value);

} // RootModelNode
