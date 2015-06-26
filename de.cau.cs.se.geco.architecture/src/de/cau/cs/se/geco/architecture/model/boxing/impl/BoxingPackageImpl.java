/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;

import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer;
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode;

import de.cau.cs.se.geco.architecture.model.boxing.Transformation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoxingPackageImpl extends EPackageImpl implements BoxingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxingModelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootModelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyModelNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BoxingPackageImpl() {
		super(eNS_URI, BoxingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BoxingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BoxingPackage init() {
		if (isInited) return (BoxingPackage)EPackage.Registry.INSTANCE.getEPackage(BoxingPackage.eNS_URI);

		// Obtain or create and register package
		BoxingPackageImpl theBoxingPackage = (BoxingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BoxingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BoxingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArchitecturePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBoxingPackage.createPackageContents();

		// Initialize created meta-data
		theBoxingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBoxingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BoxingPackage.eNS_URI, theBoxingPackage);
		return theBoxingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoxingModel() {
		return boxingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModel_SourceModels() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModel_TargetModels() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModel_DerivedFrom() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModel_Transformations() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorContainer() {
		return generatorContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorContainer_Invocations() {
		return (EReference)generatorContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_DerivedFrom() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoxingModelNode() {
		return boxingModelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModelNode_Models() {
		return (EReference)boxingModelNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootModelNode() {
		return rootModelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootModelNode_DeclaredModel() {
		return (EReference)rootModelNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyModelNode() {
		return propertyModelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyModelNode_DeclaredNodeProperty() {
		return (EReference)propertyModelNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxingFactory getBoxingFactory() {
		return (BoxingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boxingModelEClass = createEClass(BOXING_MODEL);
		createEReference(boxingModelEClass, BOXING_MODEL__SOURCE_MODELS);
		createEReference(boxingModelEClass, BOXING_MODEL__TARGET_MODELS);
		createEReference(boxingModelEClass, BOXING_MODEL__DERIVED_FROM);
		createEReference(boxingModelEClass, BOXING_MODEL__TRANSFORMATIONS);

		generatorContainerEClass = createEClass(GENERATOR_CONTAINER);
		createEReference(generatorContainerEClass, GENERATOR_CONTAINER__INVOCATIONS);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__DERIVED_FROM);

		boxingModelNodeEClass = createEClass(BOXING_MODEL_NODE);
		createEReference(boxingModelNodeEClass, BOXING_MODEL_NODE__MODELS);

		rootModelNodeEClass = createEClass(ROOT_MODEL_NODE);
		createEReference(rootModelNodeEClass, ROOT_MODEL_NODE__DECLARED_MODEL);

		propertyModelNodeEClass = createEClass(PROPERTY_MODEL_NODE);
		createEReference(propertyModelNodeEClass, PROPERTY_MODEL_NODE__DECLARED_NODE_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boxingModelEClass.getESuperTypes().add(this.getGeneratorContainer());
		boxingModelNodeEClass.getESuperTypes().add(this.getGeneratorContainer());
		rootModelNodeEClass.getESuperTypes().add(this.getBoxingModelNode());
		propertyModelNodeEClass.getESuperTypes().add(this.getBoxingModelNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(boxingModelEClass, BoxingModel.class, "BoxingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoxingModel_SourceModels(), this.getRootModelNode(), null, "sourceModels", null, 0, -1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoxingModel_TargetModels(), this.getRootModelNode(), null, "targetModels", null, 0, -1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoxingModel_DerivedFrom(), theArchitecturePackage.getModel(), null, "derivedFrom", null, 1, 1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoxingModel_Transformations(), this.getTransformation(), null, "transformations", null, 0, -1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorContainerEClass, GeneratorContainer.class, "GeneratorContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorContainer_Invocations(), theArchitecturePackage.getGenerator(), null, "invocations", null, 0, -1, GeneratorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_DerivedFrom(), theTypesPackage.getJvmType(), null, "derivedFrom", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxingModelNodeEClass, BoxingModelNode.class, "BoxingModelNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoxingModelNode_Models(), this.getPropertyModelNode(), null, "models", null, 0, -1, BoxingModelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootModelNodeEClass, RootModelNode.class, "RootModelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootModelNode_DeclaredModel(), theArchitecturePackage.getRegisteredPackage(), null, "declaredModel", null, 1, 1, RootModelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyModelNodeEClass, PropertyModelNode.class, "PropertyModelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyModelNode_DeclaredNodeProperty(), theArchitecturePackage.getNodeProperty(), null, "declaredNodeProperty", null, 1, 1, PropertyModelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BoxingPackageImpl
