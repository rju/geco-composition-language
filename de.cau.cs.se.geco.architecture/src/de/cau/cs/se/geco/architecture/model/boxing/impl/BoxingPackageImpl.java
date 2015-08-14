/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass groupEClass = null;

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
	public EReference getBoxingModel_Groups() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModel_DerivedFrom() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxingModel_AllProcessors() {
		return (EReference)boxingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_SourceModels() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Transformations() {
		return (EReference)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_SubGroups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_WriteTraceModels() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_ReadTraceModels() {
		return (EReference)groupEClass.getEStructuralFeatures().get(4);
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
		createEReference(boxingModelEClass, BOXING_MODEL__GROUPS);
		createEReference(boxingModelEClass, BOXING_MODEL__DERIVED_FROM);
		createEReference(boxingModelEClass, BOXING_MODEL__ALL_PROCESSORS);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__SOURCE_MODELS);
		createEReference(groupEClass, GROUP__TRANSFORMATIONS);
		createEReference(groupEClass, GROUP__SUB_GROUPS);
		createEReference(groupEClass, GROUP__WRITE_TRACE_MODELS);
		createEReference(groupEClass, GROUP__READ_TRACE_MODELS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(boxingModelEClass, BoxingModel.class, "BoxingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoxingModel_Groups(), this.getGroup(), null, "groups", null, 0, -1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoxingModel_DerivedFrom(), theArchitecturePackage.getModel(), null, "derivedFrom", null, 1, 1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoxingModel_AllProcessors(), theArchitecturePackage.getProcessor(), null, "allProcessors", null, 0, -1, BoxingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_SourceModels(), theArchitecturePackage.getSourceModelNodeSelector(), null, "sourceModels", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Transformations(), theArchitecturePackage.getProcessor(), null, "transformations", null, 0, -1, Group.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_SubGroups(), this.getGroup(), null, "subGroups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_WriteTraceModels(), theArchitecturePackage.getTraceModel(), null, "writeTraceModels", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_ReadTraceModels(), theArchitecturePackage.getTraceModel(), null, "readTraceModels", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BoxingPackageImpl
