/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory
 * @model kind="package"
 * @generated
 */
public interface BoxingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boxing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cau.de/cs/se/geco/architecture/boxing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boxing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoxingPackage eINSTANCE = de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getBoxingModel()
	 * @generated
	 */
	int BOXING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__DERIVED_FROM = 1;

	/**
	 * The feature id for the '<em><b>All Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__ALL_PROCESSORS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SOURCE_MODELS = 0;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSFORMATIONS = 1;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SUB_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Write Trace Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WRITE_TRACE_MODELS = 3;

	/**
	 * The feature id for the '<em><b>Read Trace Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__READ_TRACE_MODELS = 4;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
	 * @generated
	 */
	EClass getBoxingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getGroups()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_Groups();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived From</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getDerivedFrom()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_DerivedFrom();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getAllProcessors <em>All Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Processors</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getAllProcessors()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_AllProcessors();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceModels()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SourceModels();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getTransformations()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Transformations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSubGroups <em>Sub Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getSubGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SubGroups();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getWriteTraceModels <em>Write Trace Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Write Trace Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getWriteTraceModels()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_WriteTraceModels();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getReadTraceModels <em>Read Trace Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read Trace Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getReadTraceModels()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ReadTraceModels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoxingFactory getBoxingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getBoxingModel()
		 * @generated
		 */
		EClass BOXING_MODEL = eINSTANCE.getBoxingModel();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__GROUPS = eINSTANCE.getBoxingModel_Groups();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__DERIVED_FROM = eINSTANCE.getBoxingModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>All Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__ALL_PROCESSORS = eINSTANCE.getBoxingModel_AllProcessors();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SOURCE_MODELS = eINSTANCE.getGroup_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__TRANSFORMATIONS = eINSTANCE.getGroup_Transformations();

		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SUB_GROUPS = eINSTANCE.getGroup_SubGroups();

		/**
		 * The meta object literal for the '<em><b>Write Trace Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__WRITE_TRACE_MODELS = eINSTANCE.getGroup_WriteTraceModels();

		/**
		 * The meta object literal for the '<em><b>Read Trace Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__READ_TRACE_MODELS = eINSTANCE.getGroup_ReadTraceModels();

	}

} //BoxingPackage
