/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.ModelSequence;
import de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass;

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
 * An implementation of the model object '<em><b>Geco Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl#getRegisteredRootClass <em>Registered Root Class</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl#getModels <em>Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GecoModelImpl extends MinimalEObjectImpl.Container implements GecoModel
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
   * The cached value of the '{@link #getRegisteredRootClass() <em>Registered Root Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegisteredRootClass()
   * @generated
   * @ordered
   */
  protected EList<RegisteredRootClass> registeredRootClass;

  /**
   * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
  protected EList<ModelSequence> models;

  /**
   * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFragments()
   * @generated
   * @ordered
   */
  protected EList<Fragment> fragments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GecoModelImpl()
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
    return ArchitecturePackage.Literals.GECO_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.GECO_MODEL__NAME, oldName, name));
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
      imports = new EObjectContainmentEList<Import>(Import.class, this, ArchitecturePackage.GECO_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RegisteredRootClass> getRegisteredRootClass()
  {
    if (registeredRootClass == null)
    {
      registeredRootClass = new EObjectContainmentEList<RegisteredRootClass>(RegisteredRootClass.class, this, ArchitecturePackage.GECO_MODEL__REGISTERED_ROOT_CLASS);
    }
    return registeredRootClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelSequence> getModels()
  {
    if (models == null)
    {
      models = new EObjectContainmentEList<ModelSequence>(ModelSequence.class, this, ArchitecturePackage.GECO_MODEL__MODELS);
    }
    return models;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fragment> getFragments()
  {
    if (fragments == null)
    {
      fragments = new EObjectContainmentEList<Fragment>(Fragment.class, this, ArchitecturePackage.GECO_MODEL__FRAGMENTS);
    }
    return fragments;
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
      case ArchitecturePackage.GECO_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.GECO_MODEL__REGISTERED_ROOT_CLASS:
        return ((InternalEList<?>)getRegisteredRootClass()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.GECO_MODEL__MODELS:
        return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.GECO_MODEL__FRAGMENTS:
        return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
      case ArchitecturePackage.GECO_MODEL__NAME:
        return getName();
      case ArchitecturePackage.GECO_MODEL__IMPORTS:
        return getImports();
      case ArchitecturePackage.GECO_MODEL__REGISTERED_ROOT_CLASS:
        return getRegisteredRootClass();
      case ArchitecturePackage.GECO_MODEL__MODELS:
        return getModels();
      case ArchitecturePackage.GECO_MODEL__FRAGMENTS:
        return getFragments();
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
      case ArchitecturePackage.GECO_MODEL__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.GECO_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case ArchitecturePackage.GECO_MODEL__REGISTERED_ROOT_CLASS:
        getRegisteredRootClass().clear();
        getRegisteredRootClass().addAll((Collection<? extends RegisteredRootClass>)newValue);
        return;
      case ArchitecturePackage.GECO_MODEL__MODELS:
        getModels().clear();
        getModels().addAll((Collection<? extends ModelSequence>)newValue);
        return;
      case ArchitecturePackage.GECO_MODEL__FRAGMENTS:
        getFragments().clear();
        getFragments().addAll((Collection<? extends Fragment>)newValue);
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
      case ArchitecturePackage.GECO_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.GECO_MODEL__IMPORTS:
        getImports().clear();
        return;
      case ArchitecturePackage.GECO_MODEL__REGISTERED_ROOT_CLASS:
        getRegisteredRootClass().clear();
        return;
      case ArchitecturePackage.GECO_MODEL__MODELS:
        getModels().clear();
        return;
      case ArchitecturePackage.GECO_MODEL__FRAGMENTS:
        getFragments().clear();
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
      case ArchitecturePackage.GECO_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.GECO_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ArchitecturePackage.GECO_MODEL__REGISTERED_ROOT_CLASS:
        return registeredRootClass != null && !registeredRootClass.isEmpty();
      case ArchitecturePackage.GECO_MODEL__MODELS:
        return models != null && !models.isEmpty();
      case ArchitecturePackage.GECO_MODEL__FRAGMENTS:
        return fragments != null && !fragments.isEmpty();
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

} //GecoModelImpl
