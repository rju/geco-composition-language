/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.architecture.WeaverImport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weaver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl#getWeaver <em>Weaver</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl#getAspectModel <em>Aspect Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaverImpl extends ConnectionImpl implements Weaver
{
  /**
   * The cached value of the '{@link #getWeaver() <em>Weaver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeaver()
   * @generated
   * @ordered
   */
  protected WeaverImport weaver;

  /**
   * The cached value of the '{@link #getAspectModel() <em>Aspect Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAspectModel()
   * @generated
   * @ordered
   */
  protected AspectModel aspectModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeaverImpl()
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
    return ArchitecturePackage.Literals.WEAVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaverImport getWeaver()
  {
    if (weaver != null && weaver.eIsProxy())
    {
      InternalEObject oldWeaver = (InternalEObject)weaver;
      weaver = (WeaverImport)eResolveProxy(oldWeaver);
      if (weaver != oldWeaver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.WEAVER__WEAVER, oldWeaver, weaver));
      }
    }
    return weaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaverImport basicGetWeaver()
  {
    return weaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeaver(WeaverImport newWeaver)
  {
    WeaverImport oldWeaver = weaver;
    weaver = newWeaver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.WEAVER__WEAVER, oldWeaver, weaver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectModel getAspectModel()
  {
    return aspectModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAspectModel(AspectModel newAspectModel, NotificationChain msgs)
  {
    AspectModel oldAspectModel = aspectModel;
    aspectModel = newAspectModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.WEAVER__ASPECT_MODEL, oldAspectModel, newAspectModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAspectModel(AspectModel newAspectModel)
  {
    if (newAspectModel != aspectModel)
    {
      NotificationChain msgs = null;
      if (aspectModel != null)
        msgs = ((InternalEObject)aspectModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.WEAVER__ASPECT_MODEL, null, msgs);
      if (newAspectModel != null)
        msgs = ((InternalEObject)newAspectModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.WEAVER__ASPECT_MODEL, null, msgs);
      msgs = basicSetAspectModel(newAspectModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.WEAVER__ASPECT_MODEL, newAspectModel, newAspectModel));
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
      case ArchitecturePackage.WEAVER__ASPECT_MODEL:
        return basicSetAspectModel(null, msgs);
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
      case ArchitecturePackage.WEAVER__WEAVER:
        if (resolve) return getWeaver();
        return basicGetWeaver();
      case ArchitecturePackage.WEAVER__ASPECT_MODEL:
        return getAspectModel();
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
      case ArchitecturePackage.WEAVER__WEAVER:
        setWeaver((WeaverImport)newValue);
        return;
      case ArchitecturePackage.WEAVER__ASPECT_MODEL:
        setAspectModel((AspectModel)newValue);
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
      case ArchitecturePackage.WEAVER__WEAVER:
        setWeaver((WeaverImport)null);
        return;
      case ArchitecturePackage.WEAVER__ASPECT_MODEL:
        setAspectModel((AspectModel)null);
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
      case ArchitecturePackage.WEAVER__WEAVER:
        return weaver != null;
      case ArchitecturePackage.WEAVER__ASPECT_MODEL:
        return aspectModel != null;
    }
    return super.eIsSet(featureID);
  }

} //WeaverImpl
