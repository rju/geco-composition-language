/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
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
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getSourceTraceModels <em>Source Trace Models</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl#getSourceModels <em>Source Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

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
	protected EList<Model> sourceModels;

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
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectResolvingEList<Unit>(Unit.class, this, BoxingPackage.GROUP__UNITS);
		}
		return units;
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
	public EList<TraceModel> getSourceTraceModels() {
		if (sourceTraceModels == null) {
			sourceTraceModels = new EObjectResolvingEList<TraceModel>(TraceModel.class, this, BoxingPackage.GROUP__SOURCE_TRACE_MODELS);
		}
		return sourceTraceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectResolvingEList<Model>(Model.class, this, BoxingPackage.GROUP__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case BoxingPackage.GROUP__UNITS:
				return getUnits();
			case BoxingPackage.GROUP__SUB_GROUPS:
				return getSubGroups();
			case BoxingPackage.GROUP__SOURCE_TRACE_MODELS:
				return getSourceTraceModels();
			case BoxingPackage.GROUP__SOURCE_MODELS:
				return getSourceModels();
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
			case BoxingPackage.GROUP__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case BoxingPackage.GROUP__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case BoxingPackage.GROUP__SOURCE_TRACE_MODELS:
				getSourceTraceModels().clear();
				getSourceTraceModels().addAll((Collection<? extends TraceModel>)newValue);
				return;
			case BoxingPackage.GROUP__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends Model>)newValue);
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
			case BoxingPackage.GROUP__UNITS:
				getUnits().clear();
				return;
			case BoxingPackage.GROUP__SUB_GROUPS:
				getSubGroups().clear();
				return;
			case BoxingPackage.GROUP__SOURCE_TRACE_MODELS:
				getSourceTraceModels().clear();
				return;
			case BoxingPackage.GROUP__SOURCE_MODELS:
				getSourceModels().clear();
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
			case BoxingPackage.GROUP__UNITS:
				return units != null && !units.isEmpty();
			case BoxingPackage.GROUP__SUB_GROUPS:
				return subGroups != null && !subGroups.isEmpty();
			case BoxingPackage.GROUP__SOURCE_TRACE_MODELS:
				return sourceTraceModels != null && !sourceTraceModels.isEmpty();
			case BoxingPackage.GROUP__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
