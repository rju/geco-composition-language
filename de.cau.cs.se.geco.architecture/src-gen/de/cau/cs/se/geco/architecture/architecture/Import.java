/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' reference.
   * @see #setImportedNamespace(JvmType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getImport_ImportedNamespace()
   * @model
   * @generated
   */
  JvmType getImportedNamespace();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.Import#getImportedNamespace <em>Imported Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' reference.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(JvmType value);

} // Import
