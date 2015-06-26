/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModelNode()
 * @model abstract="true"
 * @generated
 */
public interface BoxingModelNode extends GeneratorContainer {

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModelNode_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyModelNode> getModels();
} // BoxingModelNode
