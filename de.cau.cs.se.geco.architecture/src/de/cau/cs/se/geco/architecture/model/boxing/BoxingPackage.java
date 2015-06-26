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
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer <em>Generator Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getGeneratorContainer()
	 * @generated
	 */
	int GENERATOR_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTAINER__INVOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Generator Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generator Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTAINER_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__INVOCATIONS = GENERATOR_CONTAINER__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__SOURCE_MODELS = GENERATOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__TARGET_MODELS = GENERATOR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__DERIVED_FROM = GENERATOR_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL__TRANSFORMATIONS = GENERATOR_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_FEATURE_COUNT = GENERATOR_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_OPERATION_COUNT = GENERATOR_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.TransformationImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DERIVED_FROM = 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelNodeImpl <em>Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelNodeImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getBoxingModelNode()
	 * @generated
	 */
	int BOXING_MODEL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_NODE__INVOCATIONS = GENERATOR_CONTAINER__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_NODE__MODELS = GENERATOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_NODE_FEATURE_COUNT = GENERATOR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXING_MODEL_NODE_OPERATION_COUNT = GENERATOR_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.RootModelNodeImpl <em>Root Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.RootModelNodeImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getRootModelNode()
	 * @generated
	 */
	int ROOT_MODEL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MODEL_NODE__INVOCATIONS = BOXING_MODEL_NODE__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MODEL_NODE__MODELS = BOXING_MODEL_NODE__MODELS;

	/**
	 * The feature id for the '<em><b>Declared Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MODEL_NODE__DECLARED_MODEL = BOXING_MODEL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MODEL_NODE_FEATURE_COUNT = BOXING_MODEL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MODEL_NODE_OPERATION_COUNT = BOXING_MODEL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.PropertyModelNodeImpl <em>Property Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.PropertyModelNodeImpl
	 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getPropertyModelNode()
	 * @generated
	 */
	int PROPERTY_MODEL_NODE = 5;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_NODE__INVOCATIONS = BOXING_MODEL_NODE__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_NODE__MODELS = BOXING_MODEL_NODE__MODELS;

	/**
	 * The feature id for the '<em><b>Declared Node Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY = BOXING_MODEL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_NODE_FEATURE_COUNT = BOXING_MODEL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_NODE_OPERATION_COUNT = BOXING_MODEL_NODE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getSourceModels()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getTargetModels()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_TargetModels();

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
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel#getTransformations()
	 * @see #getBoxingModel()
	 * @generated
	 */
	EReference getBoxingModel_Transformations();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer <em>Generator Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Container</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer
	 * @generated
	 */
	EClass getGeneratorContainer();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invocations</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer#getInvocations()
	 * @see #getGeneratorContainer()
	 * @generated
	 */
	EReference getGeneratorContainer_Invocations();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.Transformation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived From</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Transformation#getDerivedFrom()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_DerivedFrom();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode <em>Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Node</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode
	 * @generated
	 */
	EClass getBoxingModelNode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode#getModels()
	 * @see #getBoxingModelNode()
	 * @generated
	 */
	EReference getBoxingModelNode_Models();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode <em>Root Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Model Node</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.RootModelNode
	 * @generated
	 */
	EClass getRootModelNode();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode#getDeclaredModel <em>Declared Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Model</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.RootModelNode#getDeclaredModel()
	 * @see #getRootModelNode()
	 * @generated
	 */
	EReference getRootModelNode_DeclaredModel();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode <em>Property Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Model Node</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode
	 * @generated
	 */
	EClass getPropertyModelNode();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode#getDeclaredNodeProperty <em>Declared Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Node Property</em>'.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode#getDeclaredNodeProperty()
	 * @see #getPropertyModelNode()
	 * @generated
	 */
	EReference getPropertyModelNode_DeclaredNodeProperty();

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
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__SOURCE_MODELS = eINSTANCE.getBoxingModel_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__TARGET_MODELS = eINSTANCE.getBoxingModel_TargetModels();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__DERIVED_FROM = eINSTANCE.getBoxingModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL__TRANSFORMATIONS = eINSTANCE.getBoxingModel_Transformations();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer <em>Generator Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getGeneratorContainer()
		 * @generated
		 */
		EClass GENERATOR_CONTAINER = eINSTANCE.getGeneratorContainer();

		/**
		 * The meta object literal for the '<em><b>Invocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_CONTAINER__INVOCATIONS = eINSTANCE.getGeneratorContainer_Invocations();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.TransformationImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__DERIVED_FROM = eINSTANCE.getTransformation_DerivedFrom();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelNodeImpl <em>Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingModelNodeImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getBoxingModelNode()
		 * @generated
		 */
		EClass BOXING_MODEL_NODE = eINSTANCE.getBoxingModelNode();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOXING_MODEL_NODE__MODELS = eINSTANCE.getBoxingModelNode_Models();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.RootModelNodeImpl <em>Root Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.RootModelNodeImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getRootModelNode()
		 * @generated
		 */
		EClass ROOT_MODEL_NODE = eINSTANCE.getRootModelNode();

		/**
		 * The meta object literal for the '<em><b>Declared Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_MODEL_NODE__DECLARED_MODEL = eINSTANCE.getRootModelNode_DeclaredModel();

		/**
		 * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.model.boxing.impl.PropertyModelNodeImpl <em>Property Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.PropertyModelNodeImpl
		 * @see de.cau.cs.se.geco.architecture.model.boxing.impl.BoxingPackageImpl#getPropertyModelNode()
		 * @generated
		 */
		EClass PROPERTY_MODEL_NODE = eINSTANCE.getPropertyModelNode();

		/**
		 * The meta object literal for the '<em><b>Declared Node Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY = eINSTANCE.getPropertyModelNode_DeclaredNodeProperty();

	}

} //BoxingPackage
