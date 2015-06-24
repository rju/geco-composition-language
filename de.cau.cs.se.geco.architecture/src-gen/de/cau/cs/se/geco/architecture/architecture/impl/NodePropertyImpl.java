/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodePropertyImpl extends OperandImpl implements NodeProperty
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected JvmMember property;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected ConstraintExpression constraint;

  /**
   * The cached value of the '{@link #getSubProperty() <em>Sub Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubProperty()
   * @generated
   * @ordered
   */
  protected NodeProperty subProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodePropertyImpl()
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
    return ArchitecturePackage.Literals.NODE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmMember getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (JvmMember)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.NODE_PROPERTY__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmMember basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(JvmMember newProperty)
  {
    JvmMember oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.NODE_PROPERTY__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpression getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(ConstraintExpression newConstraint, NotificationChain msgs)
  {
    ConstraintExpression oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.NODE_PROPERTY__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(ConstraintExpression newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.NODE_PROPERTY__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.NODE_PROPERTY__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.NODE_PROPERTY__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeProperty getSubProperty()
  {
    return subProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubProperty(NodeProperty newSubProperty, NotificationChain msgs)
  {
    NodeProperty oldSubProperty = subProperty;
    subProperty = newSubProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY, oldSubProperty, newSubProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubProperty(NodeProperty newSubProperty)
  {
    if (newSubProperty != subProperty)
    {
      NotificationChain msgs = null;
      if (subProperty != null)
        msgs = ((InternalEObject)subProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY, null, msgs);
      if (newSubProperty != null)
        msgs = ((InternalEObject)newSubProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY, null, msgs);
      msgs = basicSetSubProperty(newSubProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY, newSubProperty, newSubProperty));
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
      case ArchitecturePackage.NODE_PROPERTY__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY:
        return basicSetSubProperty(null, msgs);
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
      case ArchitecturePackage.NODE_PROPERTY__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case ArchitecturePackage.NODE_PROPERTY__CONSTRAINT:
        return getConstraint();
      case ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY:
        return getSubProperty();
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
      case ArchitecturePackage.NODE_PROPERTY__PROPERTY:
        setProperty((JvmMember)newValue);
        return;
      case ArchitecturePackage.NODE_PROPERTY__CONSTRAINT:
        setConstraint((ConstraintExpression)newValue);
        return;
      case ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY:
        setSubProperty((NodeProperty)newValue);
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
      case ArchitecturePackage.NODE_PROPERTY__PROPERTY:
        setProperty((JvmMember)null);
        return;
      case ArchitecturePackage.NODE_PROPERTY__CONSTRAINT:
        setConstraint((ConstraintExpression)null);
        return;
      case ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY:
        setSubProperty((NodeProperty)null);
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
      case ArchitecturePackage.NODE_PROPERTY__PROPERTY:
        return property != null;
      case ArchitecturePackage.NODE_PROPERTY__CONSTRAINT:
        return constraint != null;
      case ArchitecturePackage.NODE_PROPERTY__SUB_PROPERTY:
        return subProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //NodePropertyImpl
