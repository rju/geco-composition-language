/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Target#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Target#getTargetInstanceMultiplicity <em>Target Instance Multiplicity</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Target#getLocation <em>Location</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Target#isIsText <em>Is Text</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Target#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTarget()
 * @model
 * @generated
 */
public interface Target extends Metamodel, TargetMetamodel
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTarget_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Target#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Instance Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Instance Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Instance Multiplicity</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
   * @see #setTargetInstanceMultiplicity(ModelMultiplicity)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTarget_TargetInstanceMultiplicity()
   * @model
   * @generated
   */
  ModelMultiplicity getTargetInstanceMultiplicity();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Target#getTargetInstanceMultiplicity <em>Target Instance Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Instance Multiplicity</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
   * @see #getTargetInstanceMultiplicity()
   * @generated
   */
  void setTargetInstanceMultiplicity(ModelMultiplicity value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(MetamodelLocation)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTarget_Location()
   * @model containment="true"
   * @generated
   */
  MetamodelLocation getLocation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Target#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(MetamodelLocation value);

  /**
   * Returns the value of the '<em><b>Is Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Text</em>' attribute.
   * @see #setIsText(boolean)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTarget_IsText()
   * @model
   * @generated
   */
  boolean isIsText();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Target#isIsText <em>Is Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Text</em>' attribute.
   * @see #isIsText()
   * @generated
   */
  void setIsText(boolean value);

  /**
   * Returns the value of the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' attribute.
   * @see #setExtension(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getTarget_Extension()
   * @model
   * @generated
   */
  String getExtension();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Target#getExtension <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' attribute.
   * @see #getExtension()
   * @generated
   */
  void setExtension(String value);

} // Target
