/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelModifier;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getSelector <em>Selector</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getModelDeclaration()
 * @model
 * @generated
 */
public interface ModelDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' reference.
	 * @see #setSelector(ModelNodeType)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getModelDeclaration_Selector()
	 * @model required="true"
	 * @generated
	 */
	ModelNodeType getSelector();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getSelector <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(ModelNodeType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getModelDeclaration_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.ModelModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
	 * @see #setModifier(ModelModifier)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getModelDeclaration_Modifier()
	 * @model required="true"
	 * @generated
	 */
	ModelModifier getModifier();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ModelModifier value);

} // ModelDeclaration
