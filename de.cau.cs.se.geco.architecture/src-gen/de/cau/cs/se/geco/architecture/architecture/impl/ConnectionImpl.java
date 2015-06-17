/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection
{
  /**
   * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceModel()
   * @generated
   * @ordered
   */
  protected SourceModelNodeSelector sourceModel;

  /**
   * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetModel()
   * @generated
   * @ordered
   */
  protected TargetModelNodeType targetModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionImpl()
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
    return ArchitecturePackage.Literals.CONNECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceModelNodeSelector getSourceModel()
  {
    return sourceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceModel(SourceModelNodeSelector newSourceModel, NotificationChain msgs)
  {
    SourceModelNodeSelector oldSourceModel = sourceModel;
    sourceModel = newSourceModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__SOURCE_MODEL, oldSourceModel, newSourceModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceModel(SourceModelNodeSelector newSourceModel)
  {
    if (newSourceModel != sourceModel)
    {
      NotificationChain msgs = null;
      if (sourceModel != null)
        msgs = ((InternalEObject)sourceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__SOURCE_MODEL, null, msgs);
      if (newSourceModel != null)
        msgs = ((InternalEObject)newSourceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__SOURCE_MODEL, null, msgs);
      msgs = basicSetSourceModel(newSourceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__SOURCE_MODEL, newSourceModel, newSourceModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetModelNodeType getTargetModel()
  {
    return targetModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetModel(TargetModelNodeType newTargetModel, NotificationChain msgs)
  {
    TargetModelNodeType oldTargetModel = targetModel;
    targetModel = newTargetModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__TARGET_MODEL, oldTargetModel, newTargetModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetModel(TargetModelNodeType newTargetModel)
  {
    if (newTargetModel != targetModel)
    {
      NotificationChain msgs = null;
      if (targetModel != null)
        msgs = ((InternalEObject)targetModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__TARGET_MODEL, null, msgs);
      if (newTargetModel != null)
        msgs = ((InternalEObject)newTargetModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__TARGET_MODEL, null, msgs);
      msgs = basicSetTargetModel(newTargetModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__TARGET_MODEL, newTargetModel, newTargetModel));
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
      case ArchitecturePackage.CONNECTION__SOURCE_MODEL:
        return basicSetSourceModel(null, msgs);
      case ArchitecturePackage.CONNECTION__TARGET_MODEL:
        return basicSetTargetModel(null, msgs);
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
      case ArchitecturePackage.CONNECTION__SOURCE_MODEL:
        return getSourceModel();
      case ArchitecturePackage.CONNECTION__TARGET_MODEL:
        return getTargetModel();
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
      case ArchitecturePackage.CONNECTION__SOURCE_MODEL:
        setSourceModel((SourceModelNodeSelector)newValue);
        return;
      case ArchitecturePackage.CONNECTION__TARGET_MODEL:
        setTargetModel((TargetModelNodeType)newValue);
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
      case ArchitecturePackage.CONNECTION__SOURCE_MODEL:
        setSourceModel((SourceModelNodeSelector)null);
        return;
      case ArchitecturePackage.CONNECTION__TARGET_MODEL:
        setTargetModel((TargetModelNodeType)null);
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
      case ArchitecturePackage.CONNECTION__SOURCE_MODEL:
        return sourceModel != null;
      case ArchitecturePackage.CONNECTION__TARGET_MODEL:
        return targetModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectionImpl
