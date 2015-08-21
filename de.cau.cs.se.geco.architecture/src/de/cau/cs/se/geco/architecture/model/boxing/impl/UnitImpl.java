/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getSourceTraceModels <em>Source Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getTargetModel <em>Target Model</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl#getTargetTraceModel <em>Target Trace Model</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

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
	public Processor getProcessor() {
		if (processor != null && processor.eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (Processor)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoxingPackage.UNIT__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoxingPackage.UNIT__PROCESSOR, oldProcessor, processor));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoxingPackage.UNIT__SOURCE_TRACE_MODELS:
				return getSourceTraceModels();
			case BoxingPackage.UNIT__SOURCE_MODELS:
				return getSourceModels();
			case BoxingPackage.UNIT__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
			case BoxingPackage.UNIT__TARGET_MODEL:
				if (resolve) return getTargetModel();
				return basicGetTargetModel();
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				if (resolve) return getTargetTraceModel();
				return basicGetTargetTraceModel();
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
			case BoxingPackage.UNIT__PROCESSOR:
				setProcessor((Processor)newValue);
				return;
			case BoxingPackage.UNIT__TARGET_MODEL:
				setTargetModel((Metamodel)newValue);
				return;
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				setTargetTraceModel((TraceModel)newValue);
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
			case BoxingPackage.UNIT__PROCESSOR:
				setProcessor((Processor)null);
				return;
			case BoxingPackage.UNIT__TARGET_MODEL:
				setTargetModel((Metamodel)null);
				return;
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				setTargetTraceModel((TraceModel)null);
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
			case BoxingPackage.UNIT__PROCESSOR:
				return processor != null;
			case BoxingPackage.UNIT__TARGET_MODEL:
				return targetModel != null;
			case BoxingPackage.UNIT__TARGET_TRACE_MODEL:
				return targetTraceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitImpl
