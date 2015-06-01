/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.SourceMetamodel;
import de.cau.cs.se.geco.architecture.architecture.TargetMetamodel;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getWriteTraceModel <em>Write Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl#getReadTraceModels <em>Read Trace Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected SourceMetamodel source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected TargetMetamodel target;

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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__GENERATOR, oldGenerator, newGenerator);
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
        msgs = ((InternalEObject)generator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__GENERATOR, null, msgs);
      if (newGenerator != null)
        msgs = ((InternalEObject)newGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__GENERATOR, null, msgs);
      msgs = basicSetGenerator(newGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__GENERATOR, newGenerator, newGenerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceMetamodel getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (SourceMetamodel)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.CONNECTION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceMetamodel basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(SourceMetamodel newSource)
  {
    SourceMetamodel oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetMetamodel getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (TargetMetamodel)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.CONNECTION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetMetamodel basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(TargetMetamodel newTarget)
  {
    TargetMetamodel oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__TARGET, oldTarget, target));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL, oldWriteTraceModel, newWriteTraceModel);
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
        msgs = ((InternalEObject)writeTraceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL, null, msgs);
      if (newWriteTraceModel != null)
        msgs = ((InternalEObject)newWriteTraceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL, null, msgs);
      msgs = basicSetWriteTraceModel(newWriteTraceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL, newWriteTraceModel, newWriteTraceModel));
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
      readTraceModels = new EObjectResolvingEList<TraceModel>(TraceModel.class, this, ArchitecturePackage.CONNECTION__READ_TRACE_MODELS);
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
      case ArchitecturePackage.CONNECTION__GENERATOR:
        return basicSetGenerator(null, msgs);
      case ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL:
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
      case ArchitecturePackage.CONNECTION__GENERATOR:
        return getGenerator();
      case ArchitecturePackage.CONNECTION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case ArchitecturePackage.CONNECTION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL:
        return getWriteTraceModel();
      case ArchitecturePackage.CONNECTION__READ_TRACE_MODELS:
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
      case ArchitecturePackage.CONNECTION__GENERATOR:
        setGenerator((JvmTypeReference)newValue);
        return;
      case ArchitecturePackage.CONNECTION__SOURCE:
        setSource((SourceMetamodel)newValue);
        return;
      case ArchitecturePackage.CONNECTION__TARGET:
        setTarget((TargetMetamodel)newValue);
        return;
      case ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL:
        setWriteTraceModel((TraceModel)newValue);
        return;
      case ArchitecturePackage.CONNECTION__READ_TRACE_MODELS:
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
      case ArchitecturePackage.CONNECTION__GENERATOR:
        setGenerator((JvmTypeReference)null);
        return;
      case ArchitecturePackage.CONNECTION__SOURCE:
        setSource((SourceMetamodel)null);
        return;
      case ArchitecturePackage.CONNECTION__TARGET:
        setTarget((TargetMetamodel)null);
        return;
      case ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL:
        setWriteTraceModel((TraceModel)null);
        return;
      case ArchitecturePackage.CONNECTION__READ_TRACE_MODELS:
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
      case ArchitecturePackage.CONNECTION__GENERATOR:
        return generator != null;
      case ArchitecturePackage.CONNECTION__SOURCE:
        return source != null;
      case ArchitecturePackage.CONNECTION__TARGET:
        return target != null;
      case ArchitecturePackage.CONNECTION__WRITE_TRACE_MODEL:
        return writeTraceModel != null;
      case ArchitecturePackage.CONNECTION__READ_TRACE_MODELS:
        return readTraceModels != null && !readTraceModels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConnectionImpl
