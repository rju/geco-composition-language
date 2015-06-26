/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Model;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel()
 * @model
 * @generated
 */
public interface BoxingModel extends GeneratorContainer {
	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_SourceModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RootModelNode> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_TargetModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RootModelNode> getTargetModels();

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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.model.boxing.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getBoxingModel_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

} // BoxingModel
