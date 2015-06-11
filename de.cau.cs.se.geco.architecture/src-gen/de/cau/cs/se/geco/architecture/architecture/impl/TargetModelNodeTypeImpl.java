/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Model Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl#isMultiply <em>Multiply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetModelNodeTypeImpl extends MinimalEObjectImpl.Container implements TargetModelNodeType
{
  /**
   * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeType()
   * @generated
   * @ordered
   */
  protected ModelNodeType nodeType;

  /**
   * The default value of the '{@link #isMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiply()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiply()
   * @generated
   * @ordered
   */
  protected boolean multiply = MULTIPLY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetModelNodeTypeImpl()
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
    return ArchitecturePackage.Literals.TARGET_MODEL_NODE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelNodeType getNodeType()
  {
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeType(ModelNodeType newNodeType, NotificationChain msgs)
  {
    ModelNodeType oldNodeType = nodeType;
    nodeType = newNodeType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE, oldNodeType, newNodeType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeType(ModelNodeType newNodeType)
  {
    if (newNodeType != nodeType)
    {
      NotificationChain msgs = null;
      if (nodeType != null)
        msgs = ((InternalEObject)nodeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE, null, msgs);
      if (newNodeType != null)
        msgs = ((InternalEObject)newNodeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE, null, msgs);
      msgs = basicSetNodeType(newNodeType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE, newNodeType, newNodeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiply()
  {
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiply(boolean newMultiply)
  {
    boolean oldMultiply = multiply;
    multiply = newMultiply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TARGET_MODEL_NODE_TYPE__MULTIPLY, oldMultiply, multiply));
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
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE:
        return basicSetNodeType(null, msgs);
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
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE:
        return getNodeType();
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__MULTIPLY:
        return isMultiply();
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
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE:
        setNodeType((ModelNodeType)newValue);
        return;
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__MULTIPLY:
        setMultiply((Boolean)newValue);
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
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE:
        setNodeType((ModelNodeType)null);
        return;
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__MULTIPLY:
        setMultiply(MULTIPLY_EDEFAULT);
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
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__NODE_TYPE:
        return nodeType != null;
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE__MULTIPLY:
        return multiply != MULTIPLY_EDEFAULT;
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
    result.append(" (multiply: ");
    result.append(multiply);
    result.append(')');
    return result.toString();
  }

} //TargetModelNodeTypeImpl
