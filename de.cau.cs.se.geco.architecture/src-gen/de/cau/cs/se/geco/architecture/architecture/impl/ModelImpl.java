/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getRegisteredPackages <em>Registered Packages</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getMetamodels <em>Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getRegisteredPackages() <em>Registered Packages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegisteredPackages()
   * @generated
   * @ordered
   */
  protected XImportSection registeredPackages;

  /**
   * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnections()
   * @generated
   * @ordered
   */
  protected EList<Connection> connections;

  /**
   * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodels()
   * @generated
   * @ordered
   */
  protected EList<MetamodelSequence> metamodels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return ArchitecturePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, ArchitecturePackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XImportSection getRegisteredPackages()
  {
    return registeredPackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegisteredPackages(XImportSection newRegisteredPackages, NotificationChain msgs)
  {
    XImportSection oldRegisteredPackages = registeredPackages;
    registeredPackages = newRegisteredPackages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MODEL__REGISTERED_PACKAGES, oldRegisteredPackages, newRegisteredPackages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegisteredPackages(XImportSection newRegisteredPackages)
  {
    if (newRegisteredPackages != registeredPackages)
    {
      NotificationChain msgs = null;
      if (registeredPackages != null)
        msgs = ((InternalEObject)registeredPackages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.MODEL__REGISTERED_PACKAGES, null, msgs);
      if (newRegisteredPackages != null)
        msgs = ((InternalEObject)newRegisteredPackages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturePackage.MODEL__REGISTERED_PACKAGES, null, msgs);
      msgs = basicSetRegisteredPackages(newRegisteredPackages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.MODEL__REGISTERED_PACKAGES, newRegisteredPackages, newRegisteredPackages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Connection> getConnections()
  {
    if (connections == null)
    {
      connections = new EObjectContainmentEList<Connection>(Connection.class, this, ArchitecturePackage.MODEL__CONNECTIONS);
    }
    return connections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelSequence> getMetamodels()
  {
    if (metamodels == null)
    {
      metamodels = new EObjectContainmentEList<MetamodelSequence>(MetamodelSequence.class, this, ArchitecturePackage.MODEL__METAMODELS);
    }
    return metamodels;
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
      case ArchitecturePackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.MODEL__REGISTERED_PACKAGES:
        return basicSetRegisteredPackages(null, msgs);
      case ArchitecturePackage.MODEL__CONNECTIONS:
        return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.MODEL__METAMODELS:
        return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
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
      case ArchitecturePackage.MODEL__NAME:
        return getName();
      case ArchitecturePackage.MODEL__IMPORTS:
        return getImports();
      case ArchitecturePackage.MODEL__REGISTERED_PACKAGES:
        return getRegisteredPackages();
      case ArchitecturePackage.MODEL__CONNECTIONS:
        return getConnections();
      case ArchitecturePackage.MODEL__METAMODELS:
        return getMetamodels();
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
      case ArchitecturePackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case ArchitecturePackage.MODEL__REGISTERED_PACKAGES:
        setRegisteredPackages((XImportSection)newValue);
        return;
      case ArchitecturePackage.MODEL__CONNECTIONS:
        getConnections().clear();
        getConnections().addAll((Collection<? extends Connection>)newValue);
        return;
      case ArchitecturePackage.MODEL__METAMODELS:
        getMetamodels().clear();
        getMetamodels().addAll((Collection<? extends MetamodelSequence>)newValue);
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
      case ArchitecturePackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case ArchitecturePackage.MODEL__REGISTERED_PACKAGES:
        setRegisteredPackages((XImportSection)null);
        return;
      case ArchitecturePackage.MODEL__CONNECTIONS:
        getConnections().clear();
        return;
      case ArchitecturePackage.MODEL__METAMODELS:
        getMetamodels().clear();
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
      case ArchitecturePackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ArchitecturePackage.MODEL__REGISTERED_PACKAGES:
        return registeredPackages != null;
      case ArchitecturePackage.MODEL__CONNECTIONS:
        return connections != null && !connections.isEmpty();
      case ArchitecturePackage.MODEL__METAMODELS:
        return metamodels != null && !metamodels.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
