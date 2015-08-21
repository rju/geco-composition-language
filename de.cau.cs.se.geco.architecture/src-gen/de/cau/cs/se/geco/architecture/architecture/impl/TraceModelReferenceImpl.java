/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelReferenceImpl#getTraceModel <em>Trace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceModelReferenceImpl extends TargetTraceModelImpl implements TraceModelReference
{
  /**
   * The cached value of the '{@link #getTraceModel() <em>Trace Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraceModel()
   * @generated
   * @ordered
   */
  protected TraceModel traceModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceModelReferenceImpl()
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
    return ArchitecturePackage.Literals.TRACE_MODEL_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceModel getTraceModel()
  {
    if (traceModel != null && traceModel.eIsProxy())
    {
      InternalEObject oldTraceModel = (InternalEObject)traceModel;
      traceModel = (TraceModel)eResolveProxy(oldTraceModel);
      if (traceModel != oldTraceModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.TRACE_MODEL_REFERENCE__TRACE_MODEL, oldTraceModel, traceModel));
      }
    }
    return traceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceModel basicGetTraceModel()
  {
    return traceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraceModel(TraceModel newTraceModel)
  {
    TraceModel oldTraceModel = traceModel;
    traceModel = newTraceModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TRACE_MODEL_REFERENCE__TRACE_MODEL, oldTraceModel, traceModel));
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
      case ArchitecturePackage.TRACE_MODEL_REFERENCE__TRACE_MODEL:
        if (resolve) return getTraceModel();
        return basicGetTraceModel();
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
      case ArchitecturePackage.TRACE_MODEL_REFERENCE__TRACE_MODEL:
        setTraceModel((TraceModel)newValue);
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
      case ArchitecturePackage.TRACE_MODEL_REFERENCE__TRACE_MODEL:
        setTraceModel((TraceModel)null);
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
      case ArchitecturePackage.TRACE_MODEL_REFERENCE__TRACE_MODEL:
        return traceModel != null;
    }
    return super.eIsSet(featureID);
  }

} //TraceModelReferenceImpl
