/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Merger;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.MergerImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.MergerImpl#getAspectModel <em>Aspect Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergerImpl extends ConnectionImpl implements Merger
{
  /**
   * The cached value of the '{@link #getMerger() <em>Merger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMerger()
   * @generated
   * @ordered
   */
  protected JvmTypeReference merger;

  /**
   * The cached value of the '{@link #getAspectModel() <em>Aspect Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAspectModel()
   * @generated
   * @ordered
   */
  protected TargetModelNodeType aspectModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MergerImpl()
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
    return ArchitecturePackage.Literals.MERGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getMerger()
  {
    return merger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMerger(JvmTypeReference newMerger, NotificationChain msgs)
  {
    JvmTypeReference oldMerger = merger;
    merger = newMerger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MERGER__MERGER, oldMerger, newMerger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMerger(JvmTypeReference newMerger)
  {
    if (newMerger != merger)
    {
      NotificationChain msgs = null;
      if (merger != null)
        msgs = ((InternalEObject)merger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.MERGER__MERGER, null, msgs);
      if (newMerger != null)
        msgs = ((InternalEObject)newMerger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.MERGER__MERGER, null, msgs);
      msgs = basicSetMerger(newMerger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MERGER__MERGER, newMerger, newMerger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetModelNodeType getAspectModel()
  {
    return aspectModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAspectModel(TargetModelNodeType newAspectModel, NotificationChain msgs)
  {
    TargetModelNodeType oldAspectModel = aspectModel;
    aspectModel = newAspectModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MERGER__ASPECT_MODEL, oldAspectModel, newAspectModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAspectModel(TargetModelNodeType newAspectModel)
  {
    if (newAspectModel != aspectModel)
    {
      NotificationChain msgs = null;
      if (aspectModel != null)
        msgs = ((InternalEObject)aspectModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.MERGER__ASPECT_MODEL, null, msgs);
      if (newAspectModel != null)
        msgs = ((InternalEObject)newAspectModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.MERGER__ASPECT_MODEL, null, msgs);
      msgs = basicSetAspectModel(newAspectModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MERGER__ASPECT_MODEL, newAspectModel, newAspectModel));
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
      case ArchitecturePackage.MERGER__MERGER:
        return basicSetMerger(null, msgs);
      case ArchitecturePackage.MERGER__ASPECT_MODEL:
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
      case ArchitecturePackage.MERGER__MERGER:
        return getMerger();
      case ArchitecturePackage.MERGER__ASPECT_MODEL:
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
      case ArchitecturePackage.MERGER__MERGER:
        setMerger((JvmTypeReference)newValue);
        return;
      case ArchitecturePackage.MERGER__ASPECT_MODEL:
        setAspectModel((TargetModelNodeType)newValue);
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
      case ArchitecturePackage.MERGER__MERGER:
        setMerger((JvmTypeReference)null);
        return;
      case ArchitecturePackage.MERGER__ASPECT_MODEL:
        setAspectModel((TargetModelNodeType)null);
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
      case ArchitecturePackage.MERGER__MERGER:
        return merger != null;
      case ArchitecturePackage.MERGER__ASPECT_MODEL:
        return aspectModel != null;
    }
    return super.eIsSet(featureID);
  }

} //MergerImpl
