/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl#getWriteTraceModel <em>Write Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl#getReadTraceModels <em>Read Trace Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorImpl extends ConnectionImpl implements Generator
{
  /**
   * The cached value of the '{@link #getGenerator() <em>Generator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerator()
   * @generated
   * @ordered
   */
  protected JvmTypeReference generator;

  /**
   * The cached value of the '{@link #getWriteTraceModel() <em>Write Trace Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriteTraceModel()
   * @generated
   * @ordered
   */
  protected TraceModel writeTraceModel;

  /**
   * The cached value of the '{@link #getReadTraceModels() <em>Read Trace Models</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadTraceModels()
   * @generated
   * @ordered
   */
  protected EList<TraceModel> readTraceModels;

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
  public JvmTypeReference getGenerator()
  {
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenerator(JvmTypeReference newGenerator, NotificationChain msgs)
  {
    JvmTypeReference oldGenerator = generator;
    generator = newGenerator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GENERATOR__GENERATOR, oldGenerator, newGenerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerator(JvmTypeReference newGenerator)
  {
    if (newGenerator != generator)
    {
      NotificationChain msgs = null;
      if (generator != null)
        msgs = ((InternalEObject)generator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.GENERATOR__GENERATOR, null, msgs);
      if (newGenerator != null)
        msgs = ((InternalEObject)newGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.GENERATOR__GENERATOR, null, msgs);
      msgs = basicSetGenerator(newGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GENERATOR__GENERATOR, newGenerator, newGenerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceModel getWriteTraceModel()
  {
    return writeTraceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWriteTraceModel(TraceModel newWriteTraceModel, NotificationChain msgs)
  {
    TraceModel oldWriteTraceModel = writeTraceModel;
    writeTraceModel = newWriteTraceModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL, oldWriteTraceModel, newWriteTraceModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWriteTraceModel(TraceModel newWriteTraceModel)
  {
    if (newWriteTraceModel != writeTraceModel)
    {
      NotificationChain msgs = null;
      if (writeTraceModel != null)
        msgs = ((InternalEObject)writeTraceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL, null, msgs);
      if (newWriteTraceModel != null)
        msgs = ((InternalEObject)newWriteTraceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL, null, msgs);
      msgs = basicSetWriteTraceModel(newWriteTraceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL, newWriteTraceModel, newWriteTraceModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TraceModel> getReadTraceModels()
  {
    if (readTraceModels == null)
    {
      readTraceModels = new EObjectResolvingEList<TraceModel>(TraceModel.class, this, ArchitecturePackage.GENERATOR__READ_TRACE_MODELS);
    }
    return readTraceModels;
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
      case ArchitecturePackage.GENERATOR__GENERATOR:
        return basicSetGenerator(null, msgs);
      case ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL:
        return basicSetWriteTraceModel(null, msgs);
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
      case ArchitecturePackage.GENERATOR__GENERATOR:
        return getGenerator();
      case ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL:
        return getWriteTraceModel();
      case ArchitecturePackage.GENERATOR__READ_TRACE_MODELS:
        return getReadTraceModels();
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
      case ArchitecturePackage.GENERATOR__GENERATOR:
        setGenerator((JvmTypeReference)newValue);
        return;
      case ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL:
        setWriteTraceModel((TraceModel)newValue);
        return;
      case ArchitecturePackage.GENERATOR__READ_TRACE_MODELS:
        getReadTraceModels().clear();
        getReadTraceModels().addAll((Collection<? extends TraceModel>)newValue);
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
      case ArchitecturePackage.GENERATOR__GENERATOR:
        setGenerator((JvmTypeReference)null);
        return;
      case ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL:
        setWriteTraceModel((TraceModel)null);
        return;
      case ArchitecturePackage.GENERATOR__READ_TRACE_MODELS:
        getReadTraceModels().clear();
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
      case ArchitecturePackage.GENERATOR__GENERATOR:
        return generator != null;
      case ArchitecturePackage.GENERATOR__WRITE_TRACE_MODEL:
        return writeTraceModel != null;
      case ArchitecturePackage.GENERATOR__READ_TRACE_MODELS:
        return readTraceModels != null && !readTraceModels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GeneratorImpl
