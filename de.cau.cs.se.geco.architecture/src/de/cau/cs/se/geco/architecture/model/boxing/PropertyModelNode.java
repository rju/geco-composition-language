/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.NodeProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Model Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode#getDeclaredNodeProperty <em>Declared Node Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getPropertyModelNode()
 * @model
 * @generated
 */
public interface PropertyModelNode extends BoxingModelNode {
	/**
	 * Returns the value of the '<em><b>Declared Node Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Node Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Node Property</em>' reference.
	 * @see #setDeclaredNodeProperty(NodeProperty)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getPropertyModelNode_DeclaredNodeProperty()
	 * @model required="true"
	 * @generated
	 */
	NodeProperty getDeclaredNodeProperty();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode#getDeclaredNodeProperty <em>Declared Node Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Node Property</em>' reference.
	 * @see #getDeclaredNodeProperty()
	 * @generated
	 */
	void setDeclaredNodeProperty(NodeProperty value);

} // PropertyModelNode
