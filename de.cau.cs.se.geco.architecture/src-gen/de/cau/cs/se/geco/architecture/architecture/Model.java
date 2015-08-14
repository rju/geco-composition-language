/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Model#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Model#getRegisteredPackages <em>Registered Packages</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Model#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Model#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Registered Packages</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.RegisteredPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Registered Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Registered Packages</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModel_RegisteredPackages()
   * @model containment="true"
   * @generated
   */
  EList<RegisteredPackage> getRegisteredPackages();

  /**
   * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodels</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModel_Metamodels()
   * @model containment="true"
   * @generated
   */
  EList<MetamodelSequence> getMetamodels();

  /**
   * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Processor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processors</em>' containment reference list.
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getModel_Processors()
   * @model containment="true"
   * @generated
   */
  EList<Processor> getProcessors();

} // Model
