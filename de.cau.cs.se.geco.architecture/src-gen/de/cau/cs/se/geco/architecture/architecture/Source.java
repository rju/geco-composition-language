/**
 */
package de.cau.cs.se.geco.architecture.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Source#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Source#getSourceInstanceMultiplicity <em>Source Instance Multiplicity</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Source#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSource()
 * @model
 * @generated
 */
public interface Source extends Metamodel, SourceMetamodel
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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Source#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source Instance Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Instance Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Instance Multiplicity</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
   * @see #setSourceInstanceMultiplicity(ModelMultiplicity)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSource_SourceInstanceMultiplicity()
   * @model
   * @generated
   */
  ModelMultiplicity getSourceInstanceMultiplicity();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Source#getSourceInstanceMultiplicity <em>Source Instance Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Instance Multiplicity</em>' attribute.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
   * @see #getSourceInstanceMultiplicity()
   * @generated
   */
  void setSourceInstanceMultiplicity(ModelMultiplicity value);

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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getSource_Location()
   * @model containment="true"
   * @generated
   */
  MetamodelLocation getLocation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Source#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(MetamodelLocation value);

} // Source
