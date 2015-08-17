/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ProcessorImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ProcessorImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ProcessorImpl#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends MinimalEObjectImpl.Container implements Processor
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
  protected ProcessorImpl()
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
    return ArchitecturePackage.Literals.PROCESSOR;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.PROCESSOR__REFERENCE, oldReference, reference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PROCESSOR__REFERENCE, oldReference, reference));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PROCESSOR__SOURCE_MODEL, oldSourceModel, newSourceModel);
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
        msgs = ((InternalEObject)sourceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.PROCESSOR__SOURCE_MODEL, null, msgs);
      if (newSourceModel != null)
        msgs = ((InternalEObject)newSourceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.PROCESSOR__SOURCE_MODEL, null, msgs);
      msgs = basicSetSourceModel(newSourceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PROCESSOR__SOURCE_MODEL, newSourceModel, newSourceModel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PROCESSOR__TARGET_MODEL, oldTargetModel, newTargetModel);
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
        msgs = ((InternalEObject)targetModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.PROCESSOR__TARGET_MODEL, null, msgs);
      if (newTargetModel != null)
        msgs = ((InternalEObject)newTargetModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.PROCESSOR__TARGET_MODEL, null, msgs);
      msgs = basicSetTargetModel(newTargetModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PROCESSOR__TARGET_MODEL, newTargetModel, newTargetModel));
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
      case ArchitecturePackage.PROCESSOR__SOURCE_MODEL:
        return basicSetSourceModel(null, msgs);
      case ArchitecturePackage.PROCESSOR__TARGET_MODEL:
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
      case ArchitecturePackage.PROCESSOR__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case ArchitecturePackage.PROCESSOR__SOURCE_MODEL:
        return getSourceModel();
      case ArchitecturePackage.PROCESSOR__TARGET_MODEL:
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
      case ArchitecturePackage.PROCESSOR__REFERENCE:
        setReference((JvmType)newValue);
        return;
      case ArchitecturePackage.PROCESSOR__SOURCE_MODEL:
        setSourceModel((SourceModelNodeSelector)newValue);
        return;
      case ArchitecturePackage.PROCESSOR__TARGET_MODEL:
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
      case ArchitecturePackage.PROCESSOR__REFERENCE:
        setReference((JvmType)null);
        return;
      case ArchitecturePackage.PROCESSOR__SOURCE_MODEL:
        setSourceModel((SourceModelNodeSelector)null);
        return;
      case ArchitecturePackage.PROCESSOR__TARGET_MODEL:
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
      case ArchitecturePackage.PROCESSOR__REFERENCE:
        return reference != null;
      case ArchitecturePackage.PROCESSOR__SOURCE_MODEL:
        return sourceModel != null;
      case ArchitecturePackage.PROCESSOR__TARGET_MODEL:
        return targetModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessorImpl
