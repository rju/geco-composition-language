/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.Processor;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
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
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getWriteTraceModels <em>Write Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getReadTraceModels <em>Read Trace Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceModelNodeSelector> sourceModels;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> transformations;

	/**
	 * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> subGroups;

	/**
	 * The cached value of the '{@link #getWriteTraceModels() <em>Write Trace Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTraceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceModel> writeTraceModels;

	/**
	 * The cached value of the '{@link #getReadTraceModels() <em>Read Trace Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTraceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceModel> readTraceModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxingPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceModelNodeSelector> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentEList<SourceModelNodeSelector>(SourceModelNodeSelector.class, this, BoxingPackage.GROUP__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectResolvingEList<Processor>(Processor.class, this, BoxingPackage.GROUP__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getSubGroups() {
		if (subGroups == null) {
			subGroups = new EObjectContainmentEList<Group>(Group.class, this, BoxingPackage.GROUP__SUB_GROUPS);
		}
		return subGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceModel> getWriteTraceModels() {
		if (writeTraceModels == null) {
			writeTraceModels = new EObjectResolvingEList<TraceModel>(TraceModel.class, this, BoxingPackage.GROUP__WRITE_TRACE_MODELS);
		}
		return writeTraceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceModel> getReadTraceModels() {
		if (readTraceModels == null) {
			readTraceModels = new EObjectResolvingEList<TraceModel>(TraceModel.class, this, BoxingPackage.GROUP__READ_TRACE_MODELS);
		}
		return readTraceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BoxingPackage.GROUP__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case BoxingPackage.GROUP__SUB_GROUPS:
				return ((InternalEList<?>)getSubGroups()).basicRemove(otherEnd, msgs);
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
			case BoxingPackage.GROUP__SOURCE_MODELS:
				return getSourceModels();
			case BoxingPackage.GROUP__TRANSFORMATIONS:
				return getTransformations();
			case BoxingPackage.GROUP__SUB_GROUPS:
				return getSubGroups();
			case BoxingPackage.GROUP__WRITE_TRACE_MODELS:
				return getWriteTraceModels();
			case BoxingPackage.GROUP__READ_TRACE_MODELS:
				return getReadTraceModels();
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
			case BoxingPackage.GROUP__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends SourceModelNodeSelector>)newValue);
				return;
			case BoxingPackage.GROUP__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Processor>)newValue);
				return;
			case BoxingPackage.GROUP__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case BoxingPackage.GROUP__WRITE_TRACE_MODELS:
				getWriteTraceModels().clear();
				getWriteTraceModels().addAll((Collection<? extends TraceModel>)newValue);
				return;
			case BoxingPackage.GROUP__READ_TRACE_MODELS:
				getReadTraceModels().clear();
				getReadTraceModels().addAll((Collection<? extends TraceModel>)newValue);
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
			case BoxingPackage.GROUP__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case BoxingPackage.GROUP__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case BoxingPackage.GROUP__SUB_GROUPS:
				getSubGroups().clear();
				return;
			case BoxingPackage.GROUP__WRITE_TRACE_MODELS:
				getWriteTraceModels().clear();
				return;
			case BoxingPackage.GROUP__READ_TRACE_MODELS:
				getReadTraceModels().clear();
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
			case BoxingPackage.GROUP__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case BoxingPackage.GROUP__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case BoxingPackage.GROUP__SUB_GROUPS:
				return subGroups != null && !subGroups.isEmpty();
			case BoxingPackage.GROUP__WRITE_TRACE_MODELS:
				return writeTraceModels != null && !writeTraceModels.isEmpty();
			case BoxingPackage.GROUP__READ_TRACE_MODELS:
				return readTraceModels != null && !readTraceModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
