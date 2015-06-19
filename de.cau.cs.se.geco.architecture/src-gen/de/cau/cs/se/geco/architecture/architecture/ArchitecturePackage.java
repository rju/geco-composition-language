/**
 */
package de.cau.cs.se.geco.architecture.architecture;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "architecture";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/se/geco/architecture/Architecture";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "architecture";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchitecturePackage eINSTANCE = de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Registered Packages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__REGISTERED_PACKAGES = 2;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONNECTIONS = 3;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METAMODELS = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ImportImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImportImpl <em>Weaver Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.WeaverImportImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getWeaverImport()
   * @generated
   */
  int WEAVER_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER_IMPORT__IMPORTED_NAMESPACE = IMPORT__IMPORTED_NAMESPACE;

  /**
   * The number of structural features of the '<em>Weaver Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImportImpl <em>Generator Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImportImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGeneratorImport()
   * @generated
   */
  int GENERATOR_IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_IMPORT__IMPORTED_NAMESPACE = IMPORT__IMPORTED_NAMESPACE;

  /**
   * The number of structural features of the '<em>Generator Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelSequenceImpl <em>Metamodel Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelSequenceImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodelSequence()
   * @generated
   */
  int METAMODEL_SEQUENCE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_SEQUENCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_SEQUENCE__METAMODELS = 1;

  /**
   * The number of structural features of the '<em>Metamodel Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_SEQUENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 6;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__SOURCE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__TARGET_MODEL = 1;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl <em>Weaver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getWeaver()
   * @generated
   */
  int WEAVER = 7;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__SOURCE_MODEL = CONNECTION__SOURCE_MODEL;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__TARGET_MODEL = CONNECTION__TARGET_MODEL;

  /**
   * The feature id for the '<em><b>Weaver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__WEAVER = CONNECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aspect Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__ASPECT_MODEL = CONNECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Weaver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.AspectModelImpl <em>Aspect Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.AspectModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getAspectModel()
   * @generated
   */
  int ASPECT_MODEL = 8;

  /**
   * The number of structural features of the '<em>Aspect Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGenerator()
   * @generated
   */
  int GENERATOR = 9;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__SOURCE_MODEL = CONNECTION__SOURCE_MODEL;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__TARGET_MODEL = CONNECTION__TARGET_MODEL;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__GENERATOR = CONNECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Write Trace Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__WRITE_TRACE_MODEL = CONNECTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Read Trace Models</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__READ_TRACE_MODELS = CONNECTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceModelNodeSelectorImpl <em>Source Model Node Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceModelNodeSelectorImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSourceModelNodeSelector()
   * @generated
   */
  int SOURCE_MODEL_NODE_SELECTOR = 10;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_NODE_SELECTOR__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_NODE_SELECTOR__PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Source Model Node Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_NODE_SELECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl <em>Target Model Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetModelNodeType()
   * @generated
   */
  int TARGET_MODEL_NODE_TYPE = 11;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_NODE_TYPE__REFERENCE = ASPECT_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_NODE_TYPE__MULTIPLY = ASPECT_MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Target Model Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_NODE_TYPE_FEATURE_COUNT = ASPECT_MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl <em>Trace Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModel()
   * @generated
   */
  int TRACE_MODEL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Node Set Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL__NODE_SET_RELATIONS = 1;

  /**
   * The number of structural features of the '<em>Trace Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl <em>Node Set Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeSetRelation()
   * @generated
   */
  int NODE_SET_RELATION = 13;

  /**
   * The feature id for the '<em><b>Source Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SET_RELATION__SOURCE_NODES = 0;

  /**
   * The feature id for the '<em><b>Target Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SET_RELATION__TARGET_NODES = 1;

  /**
   * The number of structural features of the '<em>Node Set Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SET_RELATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Model#getRegisteredPackages <em>Registered Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Registered Packages</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model#getRegisteredPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_RegisteredPackages();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.Model#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model#getConnections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Connections();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.Model#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model#getMetamodels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Metamodels();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.WeaverImport <em>Weaver Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weaver Import</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.WeaverImport
   * @generated
   */
  EClass getWeaverImport();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.GeneratorImport <em>Generator Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator Import</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GeneratorImport
   * @generated
   */
  EClass getGeneratorImport();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence <em>Metamodel Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel Sequence</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
   * @generated
   */
  EClass getMetamodelSequence();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getType()
   * @see #getMetamodelSequence()
   * @generated
   */
  EReference getMetamodelSequence_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelSequence#getMetamodels()
   * @see #getMetamodelSequence()
   * @generated
   */
  EReference getMetamodelSequence_Metamodels();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Metamodel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Metamodel#getName()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection
   * @generated
   */
  EClass getConnection();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getSourceModel <em>Source Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getSourceModel()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_SourceModel();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getTargetModel <em>Target Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getTargetModel()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_TargetModel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Weaver <em>Weaver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weaver</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Weaver
   * @generated
   */
  EClass getWeaver();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Weaver#getWeaver <em>Weaver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Weaver</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Weaver#getWeaver()
   * @see #getWeaver()
   * @generated
   */
  EReference getWeaver_Weaver();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Weaver#getAspectModel <em>Aspect Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aspect Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Weaver#getAspectModel()
   * @see #getWeaver()
   * @generated
   */
  EReference getWeaver_AspectModel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.AspectModel <em>Aspect Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.AspectModel
   * @generated
   */
  EClass getAspectModel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Generator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator
   * @generated
   */
  EClass getGenerator();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getGenerator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Generator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator#getGenerator()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_Generator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getWriteTraceModel <em>Write Trace Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Write Trace Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator#getWriteTraceModel()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_WriteTraceModel();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getReadTraceModels <em>Read Trace Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Read Trace Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator#getReadTraceModels()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_ReadTraceModels();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector <em>Source Model Node Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Model Node Selector</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector
   * @generated
   */
  EClass getSourceModelNodeSelector();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getReference()
   * @see #getSourceModelNodeSelector()
   * @generated
   */
  EReference getSourceModelNodeSelector_Reference();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getProperty()
   * @see #getSourceModelNodeSelector()
   * @generated
   */
  EReference getSourceModelNodeSelector_Property();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType <em>Target Model Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Model Node Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType
   * @generated
   */
  EClass getTargetModelNodeType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getReference()
   * @see #getTargetModelNodeType()
   * @generated
   */
  EReference getTargetModelNodeType_Reference();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#isMultiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiply</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#isMultiply()
   * @see #getTargetModelNodeType()
   * @generated
   */
  EAttribute getTargetModelNodeType_Multiply();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.TraceModel <em>Trace Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TraceModel
   * @generated
   */
  EClass getTraceModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.TraceModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TraceModel#getName()
   * @see #getTraceModel()
   * @generated
   */
  EAttribute getTraceModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.TraceModel#getNodeSetRelations <em>Node Set Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Node Set Relations</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TraceModel#getNodeSetRelations()
   * @see #getTraceModel()
   * @generated
   */
  EReference getTraceModel_NodeSetRelations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.NodeSetRelation <em>Node Set Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Set Relation</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeSetRelation
   * @generated
   */
  EClass getNodeSetRelation();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.NodeSetRelation#getSourceNodes <em>Source Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Nodes</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeSetRelation#getSourceNodes()
   * @see #getNodeSetRelation()
   * @generated
   */
  EReference getNodeSetRelation_SourceNodes();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.NodeSetRelation#getTargetNodes <em>Target Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target Nodes</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeSetRelation#getTargetNodes()
   * @see #getNodeSetRelation()
   * @generated
   */
  EReference getNodeSetRelation_TargetNodes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArchitectureFactory getArchitectureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Registered Packages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__REGISTERED_PACKAGES = eINSTANCE.getModel_RegisteredPackages();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONNECTIONS = eINSTANCE.getModel_Connections();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METAMODELS = eINSTANCE.getModel_Metamodels();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ImportImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImportImpl <em>Weaver Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.WeaverImportImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getWeaverImport()
     * @generated
     */
    EClass WEAVER_IMPORT = eINSTANCE.getWeaverImport();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImportImpl <em>Generator Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImportImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGeneratorImport()
     * @generated
     */
    EClass GENERATOR_IMPORT = eINSTANCE.getGeneratorImport();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelSequenceImpl <em>Metamodel Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelSequenceImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodelSequence()
     * @generated
     */
    EClass METAMODEL_SEQUENCE = eINSTANCE.getMetamodelSequence();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL_SEQUENCE__TYPE = eINSTANCE.getMetamodelSequence_Type();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL_SEQUENCE__METAMODELS = eINSTANCE.getMetamodelSequence_Metamodels();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodel()
     * @generated
     */
    EClass METAMODEL = eINSTANCE.getMetamodel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__NAME = eINSTANCE.getMetamodel_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConnection()
     * @generated
     */
    EClass CONNECTION = eINSTANCE.getConnection();

    /**
     * The meta object literal for the '<em><b>Source Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__SOURCE_MODEL = eINSTANCE.getConnection_SourceModel();

    /**
     * The meta object literal for the '<em><b>Target Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__TARGET_MODEL = eINSTANCE.getConnection_TargetModel();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl <em>Weaver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getWeaver()
     * @generated
     */
    EClass WEAVER = eINSTANCE.getWeaver();

    /**
     * The meta object literal for the '<em><b>Weaver</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVER__WEAVER = eINSTANCE.getWeaver_Weaver();

    /**
     * The meta object literal for the '<em><b>Aspect Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVER__ASPECT_MODEL = eINSTANCE.getWeaver_AspectModel();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.AspectModelImpl <em>Aspect Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.AspectModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getAspectModel()
     * @generated
     */
    EClass ASPECT_MODEL = eINSTANCE.getAspectModel();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl <em>Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGenerator()
     * @generated
     */
    EClass GENERATOR = eINSTANCE.getGenerator();

    /**
     * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__GENERATOR = eINSTANCE.getGenerator_Generator();

    /**
     * The meta object literal for the '<em><b>Write Trace Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__WRITE_TRACE_MODEL = eINSTANCE.getGenerator_WriteTraceModel();

    /**
     * The meta object literal for the '<em><b>Read Trace Models</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__READ_TRACE_MODELS = eINSTANCE.getGenerator_ReadTraceModels();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceModelNodeSelectorImpl <em>Source Model Node Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceModelNodeSelectorImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSourceModelNodeSelector()
     * @generated
     */
    EClass SOURCE_MODEL_NODE_SELECTOR = eINSTANCE.getSourceModelNodeSelector();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_MODEL_NODE_SELECTOR__REFERENCE = eINSTANCE.getSourceModelNodeSelector_Reference();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_MODEL_NODE_SELECTOR__PROPERTY = eINSTANCE.getSourceModelNodeSelector_Property();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl <em>Target Model Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetModelNodeType()
     * @generated
     */
    EClass TARGET_MODEL_NODE_TYPE = eINSTANCE.getTargetModelNodeType();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_MODEL_NODE_TYPE__REFERENCE = eINSTANCE.getTargetModelNodeType_Reference();

    /**
     * The meta object literal for the '<em><b>Multiply</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_MODEL_NODE_TYPE__MULTIPLY = eINSTANCE.getTargetModelNodeType_Multiply();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl <em>Trace Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModel()
     * @generated
     */
    EClass TRACE_MODEL = eINSTANCE.getTraceModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE_MODEL__NAME = eINSTANCE.getTraceModel_Name();

    /**
     * The meta object literal for the '<em><b>Node Set Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE_MODEL__NODE_SET_RELATIONS = eINSTANCE.getTraceModel_NodeSetRelations();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl <em>Node Set Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeSetRelation()
     * @generated
     */
    EClass NODE_SET_RELATION = eINSTANCE.getNodeSetRelation();

    /**
     * The meta object literal for the '<em><b>Source Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_SET_RELATION__SOURCE_NODES = eINSTANCE.getNodeSetRelation_SourceNodes();

    /**
     * The meta object literal for the '<em><b>Target Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_SET_RELATION__TARGET_NODES = eINSTANCE.getNodeSetRelation_TargetNodes();

  }

} //ArchitecturePackage
