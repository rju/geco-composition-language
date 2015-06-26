/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelNodeImpl#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelNodeImpl#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BoxingModelNodeImpl extends MinimalEObjectImpl.Container implements BoxingModelNode {
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
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyModelNode> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxingModelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxingPackage.Literals.BOXING_MODEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generator> getInvocations() {
		if (invocations == null) {
			invocations = new EObjectResolvingEList<Generator>(Generator.class, this, BoxingPackage.BOXING_MODEL_NODE__INVOCATIONS);
		}
		return invocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModelNode> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<PropertyModelNode>(PropertyModelNode.class, this, BoxingPackage.BOXING_MODEL_NODE__MODELS);
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
			case BoxingPackage.BOXING_MODEL_NODE__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
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
			case BoxingPackage.BOXING_MODEL_NODE__INVOCATIONS:
				return getInvocations();
			case BoxingPackage.BOXING_MODEL_NODE__MODELS:
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
			case BoxingPackage.BOXING_MODEL_NODE__INVOCATIONS:
				getInvocations().clear();
				getInvocations().addAll((Collection<? extends Generator>)newValue);
				return;
			case BoxingPackage.BOXING_MODEL_NODE__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends PropertyModelNode>)newValue);
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
			case BoxingPackage.BOXING_MODEL_NODE__INVOCATIONS:
				getInvocations().clear();
				return;
			case BoxingPackage.BOXING_MODEL_NODE__MODELS:
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
			case BoxingPackage.BOXING_MODEL_NODE__INVOCATIONS:
				return invocations != null && !invocations.isEmpty();
			case BoxingPackage.BOXING_MODEL_NODE__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoxingModelNodeImpl
