/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.MetamodelLocation;
import de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity;
import de.cau.cs.se.geco.architecture.architecture.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl#getTargetInstanceMultiplicity <em>Target Instance Multiplicity</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl#isIsText <em>Is Text</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetImpl extends MetamodelImpl implements Target
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
   * The default value of the '{@link #getTargetInstanceMultiplicity() <em>Target Instance Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetInstanceMultiplicity()
   * @generated
   * @ordered
   */
  protected static final ModelMultiplicity TARGET_INSTANCE_MULTIPLICITY_EDEFAULT = ModelMultiplicity.SINGLE;

  /**
   * The cached value of the '{@link #getTargetInstanceMultiplicity() <em>Target Instance Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetInstanceMultiplicity()
   * @generated
   * @ordered
   */
  protected ModelMultiplicity targetInstanceMultiplicity = TARGET_INSTANCE_MULTIPLICITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected MetamodelLocation location;

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
  protected TargetImpl()
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
    return ArchitecturePackage.Literals.TARGET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMultiplicity getTargetInstanceMultiplicity()
  {
    return targetInstanceMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetInstanceMultiplicity(ModelMultiplicity newTargetInstanceMultiplicity)
  {
    ModelMultiplicity oldTargetInstanceMultiplicity = targetInstanceMultiplicity;
    targetInstanceMultiplicity = newTargetInstanceMultiplicity == null ? TARGET_INSTANCE_MULTIPLICITY_EDEFAULT : newTargetInstanceMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET__TARGET_INSTANCE_MULTIPLICITY, oldTargetInstanceMultiplicity, targetInstanceMultiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelLocation getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(MetamodelLocation newLocation, NotificationChain msgs)
  {
    MetamodelLocation oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET__LOCATION, oldLocation, newLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(MetamodelLocation newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.TARGET__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.TARGET__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET__LOCATION, newLocation, newLocation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET__IS_TEXT, oldIsText, isText));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArchitecturePackage.TARGET__LOCATION:
        return basicSetLocation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ArchitecturePackage.TARGET__NAME:
        return getName();
      case ArchitecturePackage.TARGET__TARGET_INSTANCE_MULTIPLICITY:
        return getTargetInstanceMultiplicity();
      case ArchitecturePackage.TARGET__LOCATION:
        return getLocation();
      case ArchitecturePackage.TARGET__IS_TEXT:
        return isIsText();
      case ArchitecturePackage.TARGET__EXTENSION:
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
      case ArchitecturePackage.TARGET__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.TARGET__TARGET_INSTANCE_MULTIPLICITY:
        setTargetInstanceMultiplicity((ModelMultiplicity)newValue);
        return;
      case ArchitecturePackage.TARGET__LOCATION:
        setLocation((MetamodelLocation)newValue);
        return;
      case ArchitecturePackage.TARGET__IS_TEXT:
        setIsText((Boolean)newValue);
        return;
      case ArchitecturePackage.TARGET__EXTENSION:
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
      case ArchitecturePackage.TARGET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.TARGET__TARGET_INSTANCE_MULTIPLICITY:
        setTargetInstanceMultiplicity(TARGET_INSTANCE_MULTIPLICITY_EDEFAULT);
        return;
      case ArchitecturePackage.TARGET__LOCATION:
        setLocation((MetamodelLocation)null);
        return;
      case ArchitecturePackage.TARGET__IS_TEXT:
        setIsText(IS_TEXT_EDEFAULT);
        return;
      case ArchitecturePackage.TARGET__EXTENSION:
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
      case ArchitecturePackage.TARGET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.TARGET__TARGET_INSTANCE_MULTIPLICITY:
        return targetInstanceMultiplicity != TARGET_INSTANCE_MULTIPLICITY_EDEFAULT;
      case ArchitecturePackage.TARGET__LOCATION:
        return location != null;
      case ArchitecturePackage.TARGET__IS_TEXT:
        return isText != IS_TEXT_EDEFAULT;
      case ArchitecturePackage.TARGET__EXTENSION:
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
    result.append(", targetInstanceMultiplicity: ");
    result.append(targetInstanceMultiplicity);
    result.append(", isText: ");
    result.append(isText);
    result.append(", extension: ");
    result.append(extension);
    result.append(')');
    return result.toString();
  }

} //TargetImpl
