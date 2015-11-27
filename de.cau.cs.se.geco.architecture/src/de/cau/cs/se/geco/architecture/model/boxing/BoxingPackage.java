/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__MODELS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.ModelDeclarationImpl <em>Model Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.ModelDeclarationImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getModelDeclaration()
	 * @generated
	 */
	int MODEL_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION__METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION__MODIFIER = 2;

	/**
	 * The number of structural features of the '<em>Model Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Source Trace Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SOURCE_TRACE_MODELS = 0;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SOURCE_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__FRAGMENT = 2;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TARGET_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Target Trace Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TARGET_TRACE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Input Type Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__INPUT_TYPE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Output Type Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__OUTPUT_TYPE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Auxiliary Input Type Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__AUXILIARY_INPUT_TYPE_MAP = 7;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.GroupImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__UNITS = 0;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SUB_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Source Trace Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SOURCE_TRACE_MODELS = 2;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SOURCE_MODELS = 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 4;

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
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getModels()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_Models();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration <em>Model Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Declaration</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration
	 * @generated
	 */
	EClass getModelDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getSelector()
	 * @see #getModelDeclaration()
	 * @generated
	 */
	EReference getModelDeclaration_Selector();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getMetamodel()
	 * @see #getModelDeclaration()
	 * @generated
	 */
	EReference getModelDeclaration_Metamodel();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration#getModifier()
	 * @see #getModelDeclaration()
	 * @generated
	 */
	EAttribute getModelDeclaration_Modifier();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getSourceTraceModels <em>Source Trace Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Trace Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getSourceTraceModels()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_SourceTraceModels();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getSourceModels()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_SourceModels();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fragment</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getFragment()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Fragment();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Model</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetModel()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_TargetModel();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetTraceModel <em>Target Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Trace Model</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getTargetTraceModel()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_TargetTraceModel();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getInputTypeReference <em>Input Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Type Reference</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getInputTypeReference()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_InputTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getOutputTypeReference <em>Output Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Type Reference</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getOutputTypeReference()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_OutputTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.model.boxing.Unit#getAuxiliaryInputTypeMap <em>Auxiliary Input Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary Input Type Map</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Unit#getAuxiliaryInputTypeMap()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_AuxiliaryInputTypeMap();

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
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getUnits()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Units();

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
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceTraceModels <em>Source Trace Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Trace Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceTraceModels()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SourceTraceModels();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Group#getSourceModels()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SourceModels();

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
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__MODELS = eINSTANCE.getBoxingModel_Models();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.ModelDeclarationImpl <em>Model Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.ModelDeclarationImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getModelDeclaration()
		 * @generated
		 */
		EClass MODEL_DECLARATION = eINSTANCE.getModelDeclaration();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION__SELECTOR = eINSTANCE.getModelDeclaration_Selector();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION__METAMODEL = eINSTANCE.getModelDeclaration_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DECLARATION__MODIFIER = eINSTANCE.getModelDeclaration_Modifier();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.UnitImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Source Trace Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__SOURCE_TRACE_MODELS = eINSTANCE.getUnit_SourceTraceModels();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__SOURCE_MODELS = eINSTANCE.getUnit_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__FRAGMENT = eINSTANCE.getUnit_Fragment();

		/**
		 * The meta object literal for the '<em><b>Target Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__TARGET_MODEL = eINSTANCE.getUnit_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Target Trace Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__TARGET_TRACE_MODEL = eINSTANCE.getUnit_TargetTraceModel();

		/**
		 * The meta object literal for the '<em><b>Input Type Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__INPUT_TYPE_REFERENCE = eINSTANCE.getUnit_InputTypeReference();

		/**
		 * The meta object literal for the '<em><b>Output Type Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__OUTPUT_TYPE_REFERENCE = eINSTANCE.getUnit_OutputTypeReference();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Input Type Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__AUXILIARY_INPUT_TYPE_MAP = eINSTANCE.getUnit_AuxiliaryInputTypeMap();

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
		 * The meta object literal for the '<em><b>Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__UNITS = eINSTANCE.getGroup_Units();

		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SUB_GROUPS = eINSTANCE.getGroup_SubGroups();

		/**
		 * The meta object literal for the '<em><b>Source Trace Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SOURCE_TRACE_MODELS = eINSTANCE.getGroup_SourceTraceModels();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SOURCE_MODELS = eINSTANCE.getGroup_SourceModels();

	}

} //BoxingPackage
