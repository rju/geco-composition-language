/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.AdviceModel;
import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.SeparatePointcutAdviceModel;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Separate Pointcut Advice Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.SeparatePointcutAdviceModelImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.SeparatePointcutAdviceModelImpl#getAdvice <em>Advice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeparatePointcutAdviceModelImpl extends AspectModelImpl implements SeparatePointcutAdviceModel
{
  /**
   * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcut()
   * @generated
   * @ordered
   */
  protected TargetModelNodeType pointcut;

  /**
   * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvice()
   * @generated
   * @ordered
   */
  protected AdviceModel advice;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeparatePointcutAdviceModelImpl()
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
    return ArchitecturePackage.Literals.SEPARATE_POINTCUT_ADVICE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetModelNodeType getPointcut()
  {
    return pointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointcut(TargetModelNodeType newPointcut, NotificationChain msgs)
  {
    TargetModelNodeType oldPointcut = pointcut;
    pointcut = newPointcut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT, oldPointcut, newPointcut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointcut(TargetModelNodeType newPointcut)
  {
    if (newPointcut != pointcut)
    {
      NotificationChain msgs = null;
      if (pointcut != null)
        msgs = ((InternalEObject)pointcut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT, null, msgs);
      if (newPointcut != null)
        msgs = ((InternalEObject)newPointcut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT, null, msgs);
      msgs = basicSetPointcut(newPointcut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT, newPointcut, newPointcut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdviceModel getAdvice()
  {
    return advice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdvice(AdviceModel newAdvice, NotificationChain msgs)
  {
    AdviceModel oldAdvice = advice;
    advice = newAdvice;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE, oldAdvice, newAdvice);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdvice(AdviceModel newAdvice)
  {
    if (newAdvice != advice)
    {
      NotificationChain msgs = null;
      if (advice != null)
        msgs = ((InternalEObject)advice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE, null, msgs);
      if (newAdvice != null)
        msgs = ((InternalEObject)newAdvice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE, null, msgs);
      msgs = basicSetAdvice(newAdvice, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE, newAdvice, newAdvice));
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
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT:
        return basicSetPointcut(null, msgs);
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE:
        return basicSetAdvice(null, msgs);
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
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT:
        return getPointcut();
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE:
        return getAdvice();
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
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT:
        setPointcut((TargetModelNodeType)newValue);
        return;
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE:
        setAdvice((AdviceModel)newValue);
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
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT:
        setPointcut((TargetModelNodeType)null);
        return;
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE:
        setAdvice((AdviceModel)null);
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
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__POINTCUT:
        return pointcut != null;
      case ArchitecturePackage.SEPARATE_POINTCUT_ADVICE_MODEL__ADVICE:
        return advice != null;
    }
    return super.eIsSet(featureID);
  }

} //SeparatePointcutAdviceModelImpl
