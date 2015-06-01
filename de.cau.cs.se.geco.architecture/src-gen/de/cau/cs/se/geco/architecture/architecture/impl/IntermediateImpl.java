/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Intermediate;
import de.cau.cs.se.geco.architecture.architecture.MetamodelLocation;
import de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl#getSourceInstanceMultiplicity <em>Source Instance Multiplicity</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl#getTargetInstanceMultiplicity <em>Target Instance Multiplicity</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntermediateImpl extends MetamodelImpl implements Intermediate
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
   * The default value of the '{@link #getSourceInstanceMultiplicity() <em>Source Instance Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceInstanceMultiplicity()
   * @generated
   * @ordered
   */
  protected static final ModelMultiplicity SOURCE_INSTANCE_MULTIPLICITY_EDEFAULT = ModelMultiplicity.SINGLE;

  /**
   * The cached value of the '{@link #getSourceInstanceMultiplicity() <em>Source Instance Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceInstanceMultiplicity()
   * @generated
   * @ordered
   */
  protected ModelMultiplicity sourceInstanceMultiplicity = SOURCE_INSTANCE_MULTIPLICITY_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntermediateImpl()
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
    return ArchitecturePackage.Literals.INTERMEDIATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTERMEDIATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMultiplicity getSourceInstanceMultiplicity()
  {
    return sourceInstanceMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceInstanceMultiplicity(ModelMultiplicity newSourceInstanceMultiplicity)
  {
    ModelMultiplicity oldSourceInstanceMultiplicity = sourceInstanceMultiplicity;
    sourceInstanceMultiplicity = newSourceInstanceMultiplicity == null ? SOURCE_INSTANCE_MULTIPLICITY_EDEFAULT : newSourceInstanceMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY, oldSourceInstanceMultiplicity, sourceInstanceMultiplicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY, oldTargetInstanceMultiplicity, targetInstanceMultiplicity));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTERMEDIATE__LOCATION, oldLocation, newLocation);
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
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.INTERMEDIATE__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.INTERMEDIATE__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTERMEDIATE__LOCATION, newLocation, newLocation));
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
      case ArchitecturePackage.INTERMEDIATE__LOCATION:
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
      case ArchitecturePackage.INTERMEDIATE__NAME:
        return getName();
      case ArchitecturePackage.INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY:
        return getSourceInstanceMultiplicity();
      case ArchitecturePackage.INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY:
        return getTargetInstanceMultiplicity();
      case ArchitecturePackage.INTERMEDIATE__LOCATION:
        return getLocation();
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
      case ArchitecturePackage.INTERMEDIATE__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY:
        setSourceInstanceMultiplicity((ModelMultiplicity)newValue);
        return;
      case ArchitecturePackage.INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY:
        setTargetInstanceMultiplicity((ModelMultiplicity)newValue);
        return;
      case ArchitecturePackage.INTERMEDIATE__LOCATION:
        setLocation((MetamodelLocation)newValue);
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
      case ArchitecturePackage.INTERMEDIATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY:
        setSourceInstanceMultiplicity(SOURCE_INSTANCE_MULTIPLICITY_EDEFAULT);
        return;
      case ArchitecturePackage.INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY:
        setTargetInstanceMultiplicity(TARGET_INSTANCE_MULTIPLICITY_EDEFAULT);
        return;
      case ArchitecturePackage.INTERMEDIATE__LOCATION:
        setLocation((MetamodelLocation)null);
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
      case ArchitecturePackage.INTERMEDIATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY:
        return sourceInstanceMultiplicity != SOURCE_INSTANCE_MULTIPLICITY_EDEFAULT;
      case ArchitecturePackage.INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY:
        return targetInstanceMultiplicity != TARGET_INSTANCE_MULTIPLICITY_EDEFAULT;
      case ArchitecturePackage.INTERMEDIATE__LOCATION:
        return location != null;
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
    result.append(", sourceInstanceMultiplicity: ");
    result.append(sourceInstanceMultiplicity);
    result.append(", targetInstanceMultiplicity: ");
    result.append(targetInstanceMultiplicity);
    result.append(')');
    return result.toString();
  }

} //IntermediateImpl
