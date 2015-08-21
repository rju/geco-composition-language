/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getAllProcessors <em>All Processors</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel()
 * @model
 * @generated
 */
public interface BoxingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference.
	 * @see #setDerivedFrom(Model)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_DerivedFrom()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Model getDerivedFrom();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getDerivedFrom <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(Model value);

	/**
	 * Returns the value of the '<em><b>All Processors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Processors</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_AllProcessors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<JvmType> getAllProcessors();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_Models()
	 * @model
	 * @generated
	 */
	EList<ModelDeclaration> getModels();

} // BoxingModel
