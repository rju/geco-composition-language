/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode;

import de.cau.cs.se.geco.architecture.model.boxing.Transformation;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoxingModelImpl extends MinimalEObjectImpl.Container implements BoxingModel {
	/**
	 * The cached value of the '{@link #getInvocations() <em>Invocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator> invocations;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<RootModelNode> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<RootModelNode> targetModels;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected Model derivedFrom;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

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
	public EList<Generator> getInvocations() {
		if (invocations == null) {
			invocations = new EObjectResolvingEList<Generator>(Generator.class, this, BoxingPackage.BOXING_MODEL__INVOCATIONS);
		}
		return invocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootModelNode> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentEList<RootModelNode>(RootModelNode.class, this, BoxingPackage.BOXING_MODEL__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootModelNode> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentEList<RootModelNode>(RootModelNode.class, this, BoxingPackage.BOXING_MODEL__TARGET_MODELS);
		}
		return targetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getDerivedFrom() {
		if (derivedFrom != null && derivedFrom.eIsProxy()) {
			InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
			derivedFrom = (Model)eResolveProxy(oldDerivedFrom);
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
	public Model basicGetDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(Model newDerivedFrom) {
		Model oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.BOXING_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, BoxingPackage.BOXING_MODEL__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BoxingPackage.BOXING_MODEL__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case BoxingPackage.BOXING_MODEL__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
			case BoxingPackage.BOXING_MODEL__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
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
			case BoxingPackage.BOXING_MODEL__INVOCATIONS:
				return getInvocations();
			case BoxingPackage.BOXING_MODEL__SOURCE_MODELS:
				return getSourceModels();
			case BoxingPackage.BOXING_MODEL__TARGET_MODELS:
				return getTargetModels();
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				if (resolve) return getDerivedFrom();
				return basicGetDerivedFrom();
			case BoxingPackage.BOXING_MODEL__TRANSFORMATIONS:
				return getTransformations();
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
			case BoxingPackage.BOXING_MODEL__INVOCATIONS:
				getInvocations().clear();
				getInvocations().addAll((Collection<? extends Generator>)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends RootModelNode>)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends RootModelNode>)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				setDerivedFrom((Model)newValue);
				return;
			case BoxingPackage.BOXING_MODEL__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Transformation>)newValue);
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
			case BoxingPackage.BOXING_MODEL__INVOCATIONS:
				getInvocations().clear();
				return;
			case BoxingPackage.BOXING_MODEL__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case BoxingPackage.BOXING_MODEL__TARGET_MODELS:
				getTargetModels().clear();
				return;
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				setDerivedFrom((Model)null);
				return;
			case BoxingPackage.BOXING_MODEL__TRANSFORMATIONS:
				getTransformations().clear();
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
			case BoxingPackage.BOXING_MODEL__INVOCATIONS:
				return invocations != null && !invocations.isEmpty();
			case BoxingPackage.BOXING_MODEL__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case BoxingPackage.BOXING_MODEL__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
			case BoxingPackage.BOXING_MODEL__DERIVED_FROM:
				return derivedFrom != null;
			case BoxingPackage.BOXING_MODEL__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoxingModelImpl
