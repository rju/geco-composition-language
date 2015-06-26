/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Model Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.PropertyModelNodeImpl#getDeclaredNodeProperty <em>Declared Node Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyModelNodeImpl extends BoxingModelNodeImpl implements PropertyModelNode {
	/**
	 * The cached value of the '{@link #getDeclaredNodeProperty() <em>Declared Node Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredNodeProperty()
	 * @generated
	 * @ordered
	 */
	protected NodeProperty declaredNodeProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyModelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxingPackage.Literals.PROPERTY_MODEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeProperty getDeclaredNodeProperty() {
		if (declaredNodeProperty != null && declaredNodeProperty.eIsProxy()) {
			InternalEObject oldDeclaredNodeProperty = (InternalEObject)declaredNodeProperty;
			declaredNodeProperty = (NodeProperty)eResolveProxy(oldDeclaredNodeProperty);
			if (declaredNodeProperty != oldDeclaredNodeProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY, oldDeclaredNodeProperty, declaredNodeProperty));
			}
		}
		return declaredNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeProperty basicGetDeclaredNodeProperty() {
		return declaredNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredNodeProperty(NodeProperty newDeclaredNodeProperty) {
		NodeProperty oldDeclaredNodeProperty = declaredNodeProperty;
		declaredNodeProperty = newDeclaredNodeProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY, oldDeclaredNodeProperty, declaredNodeProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoxingPackage.PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY:
				if (resolve) return getDeclaredNodeProperty();
				return basicGetDeclaredNodeProperty();
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
			case BoxingPackage.PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY:
				setDeclaredNodeProperty((NodeProperty)newValue);
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
			case BoxingPackage.PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY:
				setDeclaredNodeProperty((NodeProperty)null);
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
			case BoxingPackage.PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY:
				return declaredNodeProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyModelNodeImpl
