/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Model Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.RootModelNodeImpl#getDeclaredModel <em>Declared Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootModelNodeImpl extends BoxingModelNodeImpl implements RootModelNode {
	/**
	 * The cached value of the '{@link #getDeclaredModel() <em>Declared Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredModel()
	 * @generated
	 * @ordered
	 */
	protected RegisteredPackage declaredModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootModelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxingPackage.Literals.ROOT_MODEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredPackage getDeclaredModel() {
		if (declaredModel != null && declaredModel.eIsProxy()) {
			InternalEObject oldDeclaredModel = (InternalEObject)declaredModel;
			declaredModel = (RegisteredPackage)eResolveProxy(oldDeclaredModel);
			if (declaredModel != oldDeclaredModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.ROOT_MODEL_NODE__DECLARED_MODEL, oldDeclaredModel, declaredModel));
			}
		}
		return declaredModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredPackage basicGetDeclaredModel() {
		return declaredModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredModel(RegisteredPackage newDeclaredModel) {
		RegisteredPackage oldDeclaredModel = declaredModel;
		declaredModel = newDeclaredModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.ROOT_MODEL_NODE__DECLARED_MODEL, oldDeclaredModel, declaredModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoxingPackage.ROOT_MODEL_NODE__DECLARED_MODEL:
				if (resolve) return getDeclaredModel();
				return basicGetDeclaredModel();
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
			case BoxingPackage.ROOT_MODEL_NODE__DECLARED_MODEL:
				setDeclaredModel((RegisteredPackage)newValue);
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
			case BoxingPackage.ROOT_MODEL_NODE__DECLARED_MODEL:
				setDeclaredModel((RegisteredPackage)null);
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
			case BoxingPackage.ROOT_MODEL_NODE__DECLARED_MODEL:
				return declaredModel != null;
		}
		return super.eIsSet(featureID);
	}

} //RootModelNodeImpl
