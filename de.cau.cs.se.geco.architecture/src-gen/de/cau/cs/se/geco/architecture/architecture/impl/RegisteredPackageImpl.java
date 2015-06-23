/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registered Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl#isIsText <em>Is Text</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegisteredPackageImpl extends MinimalEObjectImpl.Container implements RegisteredPackage
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected JvmType importedNamespace;

  /**
   * The default value of the '{@link #isIsText() <em>Is Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsText()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsText() <em>Is Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsText()
   * @generated
   * @ordered
   */
  protected boolean isText = IS_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected static final String EXTENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected String extension = EXTENSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegisteredPackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchitecturePackage.Literals.REGISTERED_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.REGISTERED_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getImportedNamespace()
  {
    if (importedNamespace != null && importedNamespace.eIsProxy())
    {
      InternalEObject oldImportedNamespace = (InternalEObject)importedNamespace;
      importedNamespace = (JvmType)eResolveProxy(oldImportedNamespace);
      if (importedNamespace != oldImportedNamespace)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.REGISTERED_PACKAGE__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
      }
    }
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(JvmType newImportedNamespace)
  {
    JvmType oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.REGISTERED_PACKAGE__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsText()
  {
    return isText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsText(boolean newIsText)
  {
    boolean oldIsText = isText;
    isText = newIsText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.REGISTERED_PACKAGE__IS_TEXT, oldIsText, isText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(String newExtension)
  {
    String oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.REGISTERED_PACKAGE__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchitecturePackage.REGISTERED_PACKAGE__NAME:
        return getName();
      case ArchitecturePackage.REGISTERED_PACKAGE__IMPORTED_NAMESPACE:
        if (resolve) return getImportedNamespace();
        return basicGetImportedNamespace();
      case ArchitecturePackage.REGISTERED_PACKAGE__IS_TEXT:
        return isIsText();
      case ArchitecturePackage.REGISTERED_PACKAGE__EXTENSION:
        return getExtension();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.REGISTERED_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.REGISTERED_PACKAGE__IMPORTED_NAMESPACE:
        setImportedNamespace((JvmType)newValue);
        return;
      case ArchitecturePackage.REGISTERED_PACKAGE__IS_TEXT:
        setIsText((Boolean)newValue);
        return;
      case ArchitecturePackage.REGISTERED_PACKAGE__EXTENSION:
        setExtension((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.REGISTERED_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.REGISTERED_PACKAGE__IMPORTED_NAMESPACE:
        setImportedNamespace((JvmType)null);
        return;
      case ArchitecturePackage.REGISTERED_PACKAGE__IS_TEXT:
        setIsText(IS_TEXT_EDEFAULT);
        return;
      case ArchitecturePackage.REGISTERED_PACKAGE__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.REGISTERED_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.REGISTERED_PACKAGE__IMPORTED_NAMESPACE:
        return importedNamespace != null;
      case ArchitecturePackage.REGISTERED_PACKAGE__IS_TEXT:
        return isText != IS_TEXT_EDEFAULT;
      case ArchitecturePackage.REGISTERED_PACKAGE__EXTENSION:
        return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isText: ");
    result.append(isText);
    result.append(", extension: ");
    result.append(extension);
    result.append(')');
    return result.toString();
  }

} //RegisteredPackageImpl
