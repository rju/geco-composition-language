/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.Fragment;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getSourceTraceModels <em>Source Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getTargetModel <em>Target Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getTargetTraceModel <em>Target Trace Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getInputTypeReference <em>Input Type Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getOutputTypeReference <em>Output Type Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getAuxiliaryInputTypeMap <em>Auxiliary Input Type Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends MinimalEObjectImpl.Container implements Unit {
	/**
	 * The cached value of the '{@link #getSourceTraceModels() <em>Source Trace Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTraceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceModel> sourceTraceModels;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> sourceModels;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected Fragment fragment;

	/**
	 * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel targetModel;

	/**
	 * The cached value of the '{@link #getTargetTraceModel() <em>Target Trace Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTraceModel()
	 * @generated
	 * @ordered
	 */
	protected TraceModel targetTraceModel;

	/**
	 * The cached value of the '{@link #getInputTypeReference() <em>Input Type Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTypeReference()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference inputTypeReference;

	/**
	 * The cached value of the '{@link #getOutputTypeReference() <em>Output Type Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTypeReference()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference outputTypeReference;

	/**
	 * The cached value of the '{@link #getAuxiliaryInputTypeMap() <em>Auxiliary Input Type Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryInputTypeMap()
	 * @generated
	 * @ordered
	 */
	protected Map<String, JvmTypeReference> auxiliaryInputTypeMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxingPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceModel> getSourceTraceModels() {
		if (sourceTraceModels == null) {
			sourceTraceModels = new EObjectResolvingEList<TraceModel>(TraceModel.class, this, BoxingPackage.UNIT__SOURCE_TRACE_MODELS);
		}
		return sourceTraceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectResolvingEList<Metamodel>(Metamodel.class, this, BoxingPackage.UNIT__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getFragment() {
		if (fragment != null && fragment.eIsProxy()) {
			InternalEObject oldFragment = (InternalEObject)fragment;
			fragment = (Fragment)eResolveProxy(oldFragment);
			if (fragment != oldFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.UNIT__FRAGMENT, oldFragment, fragment));
			}
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetFragment() {
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragment(Fragment newFragment) {
		Fragment oldFragment = fragment;
		fragment = newFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__FRAGMENT, oldFragment, fragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getTargetModel() {
		if (targetModel != null && targetModel.eIsProxy()) {
			InternalEObject oldTargetModel = (InternalEObject)targetModel;
			targetModel = (Metamodel)eResolveProxy(oldTargetModel);
			if (targetModel != oldTargetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.UNIT__TARGET_MODEL, oldTargetModel, targetModel));
			}
		}
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetTargetModel() {
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModel(Metamodel newTargetModel) {
		Metamodel oldTargetModel = targetModel;
		targetModel = newTargetModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__TARGET_MODEL, oldTargetModel, targetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel getTargetTraceModel() {
		if (targetTraceModel != null && targetTraceModel.eIsProxy()) {
			InternalEObject oldTargetTraceModel = (InternalEObject)targetTraceModel;
			targetTraceModel = (TraceModel)eResolveProxy(oldTargetTraceModel);
			if (targetTraceModel != oldTargetTraceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.UNIT__TARGET_TRACE_MODEL, oldTargetTraceModel, targetTraceModel));
			}
		}
		return targetTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel basicGetTargetTraceModel() {
		return targetTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTraceModel(TraceModel newTargetTraceModel) {
		TraceModel oldTargetTraceModel = targetTraceModel;
		targetTraceModel = newTargetTraceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__TARGET_TRACE_MODEL, oldTargetTraceModel, targetTraceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getInputTypeReference() {
		if (inputTypeReference != null && inputTypeReference.eIsProxy()) {
			InternalEObject oldInputTypeReference = (InternalEObject)inputTypeReference;
			inputTypeReference = (JvmTypeReference)eResolveProxy(oldInputTypeReference);
			if (inputTypeReference != oldInputTypeReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.UNIT__INPUT_TYPE_REFERENCE, oldInputTypeReference, inputTypeReference));
			}
		}
		return inputTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference basicGetInputTypeReference() {
		return inputTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTypeReference(JvmTypeReference newInputTypeReference) {
		JvmTypeReference oldInputTypeReference = inputTypeReference;
		inputTypeReference = newInputTypeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__INPUT_TYPE_REFERENCE, oldInputTypeReference, inputTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getOutputTypeReference() {
		if (outputTypeReference != null && outputTypeReference.eIsProxy()) {
			InternalEObject oldOutputTypeReference = (InternalEObject)outputTypeReference;
			outputTypeReference = (JvmTypeReference)eResolveProxy(oldOutputTypeReference);
			if (outputTypeReference != oldOutputTypeReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.UNIT__OUTPUT_TYPE_REFERENCE, oldOutputTypeReference, outputTypeReference));
			}
		}
		return outputTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference basicGetOutputTypeReference() {
		return outputTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputTypeReference(JvmTypeReference newOutputTypeReference) {
		JvmTypeReference oldOutputTypeReference = outputTypeReference;
		outputTypeReference = newOutputTypeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__OUTPUT_TYPE_REFERENCE, oldOutputTypeReference, outputTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, JvmTypeReference> getAuxiliaryInputTypeMap() {
		return auxiliaryInputTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliaryInputTypeMap(Map<String, JvmTypeReference> newAuxiliaryInputTypeMap) {
		Map<String, JvmTypeReference> oldAuxiliaryInputTypeMap = auxiliaryInputTypeMap;
		auxiliaryInputTypeMap = newAuxiliaryInputTypeMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__AUXILIARY_INPUT_TYPE_MAP, oldAuxiliaryInputTypeMap, auxiliaryInputTypeMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoxingPackage.UNIT__SOURCE_TRACE_MODELS:
				return getSourceTraceModels();
			case BoxingPackage.UNIT__SOURCE_MODELS:
				return getSourceModels();
			case BoxingPackage.UNIT__FRAGMENT:
				if (resolve) return getFragment();
				return basicGetFragment();
			case BoxingPackage.UNIT__TARGET_MODEL:
				if (resolve) return getTargetModel();
				return basicGetTargetModel();
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				if (resolve) return getTargetTraceModel();
				return basicGetTargetTraceModel();
			case BoxingPackage.UNIT__INPUT_TYPE_REFERENCE:
				if (resolve) return getInputTypeReference();
				return basicGetInputTypeReference();
			case BoxingPackage.UNIT__OUTPUT_TYPE_REFERENCE:
				if (resolve) return getOutputTypeReference();
				return basicGetOutputTypeReference();
			case BoxingPackage.UNIT__AUXILIARY_INPUT_TYPE_MAP:
				return getAuxiliaryInputTypeMap();
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
			case BoxingPackage.UNIT__SOURCE_TRACE_MODELS:
				getSourceTraceModels().clear();
				getSourceTraceModels().addAll((Collection<? extends TraceModel>)newValue);
				return;
			case BoxingPackage.UNIT__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends Metamodel>)newValue);
				return;
			case BoxingPackage.UNIT__FRAGMENT:
				setFragment((Fragment)newValue);
				return;
			case BoxingPackage.UNIT__TARGET_MODEL:
				setTargetModel((Metamodel)newValue);
				return;
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				setTargetTraceModel((TraceModel)newValue);
				return;
			case BoxingPackage.UNIT__INPUT_TYPE_REFERENCE:
				setInputTypeReference((JvmTypeReference)newValue);
				return;
			case BoxingPackage.UNIT__OUTPUT_TYPE_REFERENCE:
				setOutputTypeReference((JvmTypeReference)newValue);
				return;
			case BoxingPackage.UNIT__AUXILIARY_INPUT_TYPE_MAP:
				setAuxiliaryInputTypeMap((Map<String, JvmTypeReference>)newValue);
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
			case BoxingPackage.UNIT__SOURCE_TRACE_MODELS:
				getSourceTraceModels().clear();
				return;
			case BoxingPackage.UNIT__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case BoxingPackage.UNIT__FRAGMENT:
				setFragment((Fragment)null);
				return;
			case BoxingPackage.UNIT__TARGET_MODEL:
				setTargetModel((Metamodel)null);
				return;
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				setTargetTraceModel((TraceModel)null);
				return;
			case BoxingPackage.UNIT__INPUT_TYPE_REFERENCE:
				setInputTypeReference((JvmTypeReference)null);
				return;
			case BoxingPackage.UNIT__OUTPUT_TYPE_REFERENCE:
				setOutputTypeReference((JvmTypeReference)null);
				return;
			case BoxingPackage.UNIT__AUXILIARY_INPUT_TYPE_MAP:
				setAuxiliaryInputTypeMap((Map<String, JvmTypeReference>)null);
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
			case BoxingPackage.UNIT__SOURCE_TRACE_MODELS:
				return sourceTraceModels != null && !sourceTraceModels.isEmpty();
			case BoxingPackage.UNIT__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case BoxingPackage.UNIT__FRAGMENT:
				return fragment != null;
			case BoxingPackage.UNIT__TARGET_MODEL:
				return targetModel != null;
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				return targetTraceModel != null;
			case BoxingPackage.UNIT__INPUT_TYPE_REFERENCE:
				return inputTypeReference != null;
			case BoxingPackage.UNIT__OUTPUT_TYPE_REFERENCE:
				return outputTypeReference != null;
			case BoxingPackage.UNIT__AUXILIARY_INPUT_TYPE_MAP:
				return auxiliaryInputTypeMap != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (auxiliaryInputTypeMap: ");
		result.append(auxiliaryInputTypeMap);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
