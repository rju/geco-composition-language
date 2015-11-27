/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getAllProcessors <em>All Processors</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxingModelImpl extends MinimalEObjectImpl.Container implements BoxingModel {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected GecoModel derivedFrom;

	/**
	 * The cached value of the '{@link #getAllProcessors() <em>All Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmType> allProcessors;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDeclaration> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxingPackage.Literals.BOXING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, BoxingPackage.BOXING_MODEL__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GecoModel getDerivedFrom() {
		if (derivedFrom != null && derivedFrom.eIsProxy()) {
			InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
			derivedFrom = (GecoModel)eResolveProxy(oldDerivedFrom);
			if (derivedFrom != oldDerivedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.BOXING_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
			}
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GecoModel basicGetDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(GecoModel newDerivedFrom) {
		GecoModel oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.BOXING_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmType> getAllProcessors() {
		if (allProcessors == null) {
			allProcessors = new EObjectResolvingEList<JvmType>(JvmType.class, this, BoxingPackage.BOXING_MODEL__ALL_PROCESSORS);
		}
		return allProcessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDeclaration> getModels() {
		if (models == null) {
			models = new EObjectResolvingEList<ModelDeclaration>(ModelDeclaration.class, this, BoxingPackage.BOXING_MODEL__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BoxingPackage.BOXING_MODEL__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoxingPackage.BOXING_MODEL__GROUPS:
				return getGroups();
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				if (resolve) return getDerivedFrom();
				return basicGetDerivedFrom();
			case BoxingPackage.BOXING_MODEL__ALL_PROCESSORS:
				return getAllProcessors();
			case BoxingPackage.BOXING_MODEL__MODELS:
				return getModels();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BoxingPackage.BOXING_MODEL__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				setDerivedFrom((GecoModel)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__ALL_PROCESSORS:
				getAllProcessors().clear();
				getAllProcessors().addAll((Collection<? extends JvmType>)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends ModelDeclaration>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BoxingPackage.BOXING_MODEL__GROUPS:
				getGroups().clear();
				return;
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				setDerivedFrom((GecoModel)null);
				return;
			case BoxingPackage.BOXING_MODEL__ALL_PROCESSORS:
				getAllProcessors().clear();
				return;
			case BoxingPackage.BOXING_MODEL__MODELS:
				getModels().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BoxingPackage.BOXING_MODEL__GROUPS:
				return groups != null && !groups.isEmpty();
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				return derivedFrom != null;
			case BoxingPackage.BOXING_MODEL__ALL_PROCESSORS:
				return allProcessors != null && !allProcessors.isEmpty();
			case BoxingPackage.BOXING_MODEL__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoxingModelImpl
