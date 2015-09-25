/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getRegisteredPackages <em>Registered Packages</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
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
   * The cached value of the '{@link #getRegisteredPackages() <em>Registered Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegisteredPackages()
   * @generated
   * @ordered
   */
  protected EList<RegisteredPackage> registeredPackages;

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
   * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessors()
   * @generated
   * @ordered
   */
  protected EList<Processor> processors;

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
  public EList<RegisteredPackage> getRegisteredPackages()
  {
    if (registeredPackages == null)
    {
      registeredPackages = new EObjectContainmentEList<RegisteredPackage>(RegisteredPackage.class, this, ArchitecturePackage.MODEL__REGISTERED_PACKAGES);
    }
    return registeredPackages;
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
  public EList<Processor> getProcessors()
  {
    if (processors == null)
    {
      processors = new EObjectContainmentEList<Processor>(Processor.class, this, ArchitecturePackage.MODEL__PROCESSORS);
    }
    return processors;
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
        return ((InternalEList<?>)getRegisteredPackages()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.MODEL__METAMODELS:
        return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.MODEL__PROCESSORS:
        return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
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
      case ArchitecturePackage.MODEL__METAMODELS:
        return getMetamodels();
      case ArchitecturePackage.MODEL__PROCESSORS:
        return getProcessors();
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
        getRegisteredPackages().clear();
        getRegisteredPackages().addAll((Collection<? extends RegisteredPackage>)newValue);
        return;
      case ArchitecturePackage.MODEL__METAMODELS:
        getMetamodels().clear();
        getMetamodels().addAll((Collection<? extends MetamodelSequence>)newValue);
        return;
      case ArchitecturePackage.MODEL__PROCESSORS:
        getProcessors().clear();
        getProcessors().addAll((Collection<? extends Processor>)newValue);
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
        getRegisteredPackages().clear();
        return;
      case ArchitecturePackage.MODEL__METAMODELS:
        getMetamodels().clear();
        return;
      case ArchitecturePackage.MODEL__PROCESSORS:
        getProcessors().clear();
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
        return registeredPackages != null && !registeredPackages.isEmpty();
      case ArchitecturePackage.MODEL__METAMODELS:
        return metamodels != null && !metamodels.isEmpty();
      case ArchitecturePackage.MODEL__PROCESSORS:
        return processors != null && !processors.isEmpty();
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
