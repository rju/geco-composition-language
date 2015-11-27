/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetTraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl#getSourceAuxModels <em>Source Aux Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl#getTargetTraceModel <em>Target Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl#getSourceTraceModels <em>Source Trace Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorImpl extends FragmentImpl implements Generator
{
  /**
   * The cached value of the '{@link #getSourceAuxModels() <em>Source Aux Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceAuxModels()
   * @generated
   * @ordered
   */
  protected EList<SourceModelNodeSelector> sourceAuxModels;

  /**
   * The cached value of the '{@link #getTargetTraceModel() <em>Target Trace Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetTraceModel()
   * @generated
   * @ordered
   */
  protected TargetTraceModel targetTraceModel;

  /**
   * The cached value of the '{@link #getSourceTraceModels() <em>Source Trace Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceTraceModels()
   * @generated
   * @ordered
   */
  protected EList<TraceModelReference> sourceTraceModels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneratorImpl()
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
    return ArchitecturePackage.Literals.GENERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SourceModelNodeSelector> getSourceAuxModels()
  {
    if (sourceAuxModels == null)
    {
      sourceAuxModels = new EObjectContainmentEList<SourceModelNodeSelector>(SourceModelNodeSelector.class, this, ArchitecturePackage.GENERATOR__SOURCE_AUX_MODELS);
    }
    return sourceAuxModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetTraceModel getTargetTraceModel()
  {
    return targetTraceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetTraceModel(TargetTraceModel newTargetTraceModel, NotificationChain msgs)
  {
    TargetTraceModel oldTargetTraceModel = targetTraceModel;
    targetTraceModel = newTargetTraceModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL, oldTargetTraceModel, newTargetTraceModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetTraceModel(TargetTraceModel newTargetTraceModel)
  {
    if (newTargetTraceModel != targetTraceModel)
    {
      NotificationChain msgs = null;
      if (targetTraceModel != null)
        msgs = ((InternalEObject)targetTraceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL, null, msgs);
      if (newTargetTraceModel != null)
        msgs = ((InternalEObject)newTargetTraceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL, null, msgs);
      msgs = basicSetTargetTraceModel(newTargetTraceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL, newTargetTraceModel, newTargetTraceModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TraceModelReference> getSourceTraceModels()
  {
    if (sourceTraceModels == null)
    {
      sourceTraceModels = new EObjectContainmentEList<TraceModelReference>(TraceModelReference.class, this, ArchitecturePackage.GENERATOR__SOURCE_TRACE_MODELS);
    }
    return sourceTraceModels;
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
      case ArchitecturePackage.GENERATOR__SOURCE_AUX_MODELS:
        return ((InternalEList<?>)getSourceAuxModels()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL:
        return basicSetTargetTraceModel(null, msgs);
      case ArchitecturePackage.GENERATOR__SOURCE_TRACE_MODELS:
        return ((InternalEList<?>)getSourceTraceModels()).basicRemove(otherEnd, msgs);
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
      case ArchitecturePackage.GENERATOR__SOURCE_AUX_MODELS:
        return getSourceAuxModels();
      case ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL:
        return getTargetTraceModel();
      case ArchitecturePackage.GENERATOR__SOURCE_TRACE_MODELS:
        return getSourceTraceModels();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.GENERATOR__SOURCE_AUX_MODELS:
        getSourceAuxModels().clear();
        getSourceAuxModels().addAll((Collection<? extends SourceModelNodeSelector>)newValue);
        return;
      case ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL:
        setTargetTraceModel((TargetTraceModel)newValue);
        return;
      case ArchitecturePackage.GENERATOR__SOURCE_TRACE_MODELS:
        getSourceTraceModels().clear();
        getSourceTraceModels().addAll((Collection<? extends TraceModelReference>)newValue);
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
      case ArchitecturePackage.GENERATOR__SOURCE_AUX_MODELS:
        getSourceAuxModels().clear();
        return;
      case ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL:
        setTargetTraceModel((TargetTraceModel)null);
        return;
      case ArchitecturePackage.GENERATOR__SOURCE_TRACE_MODELS:
        getSourceTraceModels().clear();
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
      case ArchitecturePackage.GENERATOR__SOURCE_AUX_MODELS:
        return sourceAuxModels != null && !sourceAuxModels.isEmpty();
      case ArchitecturePackage.GENERATOR__TARGET_TRACE_MODEL:
        return targetTraceModel != null;
      case ArchitecturePackage.GENERATOR__SOURCE_TRACE_MODELS:
        return sourceTraceModels != null && !sourceTraceModels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GeneratorImpl
