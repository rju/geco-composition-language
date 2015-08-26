/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelModifier;
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
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getMetamodel <em>Metamodel</em>}</li>
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
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(Metamodel)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getModelDeclaration_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.MetamodelModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see de.cau.cs.se.geco.architecture.architecture.MetamodelModifier
	 * @see #setModifier(MetamodelModifier)
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getModelDeclaration_Modifier()
	 * @model required="true"
	 * @generated
	 */
	MetamodelModifier getModifier();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see de.cau.cs.se.geco.architecture.architecture.MetamodelModifier
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(MetamodelModifier value);

} // ModelDeclaration
