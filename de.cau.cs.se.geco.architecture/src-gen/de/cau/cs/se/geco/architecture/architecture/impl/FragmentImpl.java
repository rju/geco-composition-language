/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.SourceModelSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentImpl extends MinimalEObjectImpl.Container implements Fragment
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected JvmType reference;

  /**
   * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceModel()
   * @generated
   * @ordered
   */
  protected SourceModelSelector sourceModel;

  /**
   * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetModel()
   * @generated
   * @ordered
   */
  protected TargetModel targetModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FragmentImpl()
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
    return ArchitecturePackage.Literals.FRAGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (JvmType)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.FRAGMENT__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(JvmType newReference)
  {
    JvmType oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FRAGMENT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceModelSelector getSourceModel()
  {
    return sourceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceModel(SourceModelSelector newSourceModel, NotificationChain msgs)
  {
    SourceModelSelector oldSourceModel = sourceModel;
    sourceModel = newSourceModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FRAGMENT__SOURCE_MODEL, oldSourceModel, newSourceModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceModel(SourceModelSelector newSourceModel)
  {
    if (newSourceModel != sourceModel)
    {
      NotificationChain msgs = null;
      if (sourceModel != null)
        msgs = ((InternalEObject)sourceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.FRAGMENT__SOURCE_MODEL, null, msgs);
      if (newSourceModel != null)
        msgs = ((InternalEObject)newSourceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.FRAGMENT__SOURCE_MODEL, null, msgs);
      msgs = basicSetSourceModel(newSourceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FRAGMENT__SOURCE_MODEL, newSourceModel, newSourceModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetModel getTargetModel()
  {
    return targetModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetModel(TargetModel newTargetModel, NotificationChain msgs)
  {
    TargetModel oldTargetModel = targetModel;
    targetModel = newTargetModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FRAGMENT__TARGET_MODEL, oldTargetModel, newTargetModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetModel(TargetModel newTargetModel)
  {
    if (newTargetModel != targetModel)
    {
      NotificationChain msgs = null;
      if (targetModel != null)
        msgs = ((InternalEObject)targetModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.FRAGMENT__TARGET_MODEL, null, msgs);
      if (newTargetModel != null)
        msgs = ((InternalEObject)newTargetModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.FRAGMENT__TARGET_MODEL, null, msgs);
      msgs = basicSetTargetModel(newTargetModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FRAGMENT__TARGET_MODEL, newTargetModel, newTargetModel));
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
      case ArchitecturePackage.FRAGMENT__SOURCE_MODEL:
        return basicSetSourceModel(null, msgs);
      case ArchitecturePackage.FRAGMENT__TARGET_MODEL:
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
      case ArchitecturePackage.FRAGMENT__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case ArchitecturePackage.FRAGMENT__SOURCE_MODEL:
        return getSourceModel();
      case ArchitecturePackage.FRAGMENT__TARGET_MODEL:
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
      case ArchitecturePackage.FRAGMENT__REFERENCE:
        setReference((JvmType)newValue);
        return;
      case ArchitecturePackage.FRAGMENT__SOURCE_MODEL:
        setSourceModel((SourceModelSelector)newValue);
        return;
      case ArchitecturePackage.FRAGMENT__TARGET_MODEL:
        setTargetModel((TargetModel)newValue);
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
      case ArchitecturePackage.FRAGMENT__REFERENCE:
        setReference((JvmType)null);
        return;
      case ArchitecturePackage.FRAGMENT__SOURCE_MODEL:
        setSourceModel((SourceModelSelector)null);
        return;
      case ArchitecturePackage.FRAGMENT__TARGET_MODEL:
        setTargetModel((TargetModel)null);
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
      case ArchitecturePackage.FRAGMENT__REFERENCE:
        return reference != null;
      case ArchitecturePackage.FRAGMENT__SOURCE_MODEL:
        return sourceModel != null;
      case ArchitecturePackage.FRAGMENT__TARGET_MODEL:
        return targetModel != null;
    }
    return super.eIsSet(featureID);
  }

} //FragmentImpl
