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
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METAMODELS = 2;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONNECTIONS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Model Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__MODEL_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Is Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__IS_TEXT = 2;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__EXTENSION = 3;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__SOURCE_MODEL = 1;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__TARGET_MODEL = 2;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MergerImpl <em>Merger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.MergerImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMerger()
   * @generated
   */
  int MERGER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGER__NAME = CONNECTION__NAME;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGER__SOURCE_MODEL = CONNECTION__SOURCE_MODEL;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGER__TARGET_MODEL = CONNECTION__TARGET_MODEL;

  /**
   * The feature id for the '<em><b>Merger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGER__MERGER = CONNECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aspect Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGER__ASPECT_MODEL = CONNECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Merger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGER_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.GeneratorImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGenerator()
   * @generated
   */
  int GENERATOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__NAME = CONNECTION__NAME;

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
   * The feature id for the '<em><b>Generator</b></em>' containment reference.
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
  int SOURCE_MODEL_NODE_SELECTOR = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_NODE_SELECTOR__TYPE = 0;

  /**
   * The number of structural features of the '<em>Source Model Node Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_NODE_SELECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl <em>Target Model Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetModelNodeTypeImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetModelNodeType()
   * @generated
   */
  int TARGET_MODEL_NODE_TYPE = 6;

  /**
   * The feature id for the '<em><b>Node Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_NODE_TYPE__NODE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_NODE_TYPE__MULTIPLY = 1;

  /**
   * The number of structural features of the '<em>Target Model Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_NODE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelNodeTypeImpl <em>Model Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelNodeTypeImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelNodeType()
   * @generated
   */
  int MODEL_NODE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODE_TYPE__TARGET = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODE_TYPE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Model Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl <em>Trace Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModel()
   * @generated
   */
  int TRACE_MODEL = 8;

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
  int NODE_SET_RELATION = 9;

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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeTypeImpl <em>Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.NodeTypeImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeType()
   * @generated
   */
  int NODE_TYPE = 10;

  /**
   * The feature id for the '<em><b>Eclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__ECLASS = 0;

  /**
   * The number of structural features of the '<em>Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FEATURE_COUNT = 1;


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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Model#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Model#getImportSection()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ImportSection();

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
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Metamodel#getModelPackage <em>Model Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Package</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Metamodel#getModelPackage()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_ModelPackage();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Metamodel#isIsText <em>Is Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Text</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Metamodel#isIsText()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_IsText();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Metamodel#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Metamodel#getExtension()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_Extension();

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
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getName()
   * @see #getConnection()
   * @generated
   */
  EAttribute getConnection_Name();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Merger <em>Merger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Merger</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Merger
   * @generated
   */
  EClass getMerger();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Merger#getMerger <em>Merger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Merger</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Merger#getMerger()
   * @see #getMerger()
   * @generated
   */
  EReference getMerger_Merger();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Merger#getAspectModel <em>Aspect Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aspect Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Merger#getAspectModel()
   * @see #getMerger()
   * @generated
   */
  EReference getMerger_AspectModel();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getGenerator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generator</em>'.
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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector#getType()
   * @see #getSourceModelNodeSelector()
   * @generated
   */
  EReference getSourceModelNodeSelector_Type();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getNodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType#getNodeType()
   * @see #getTargetModelNodeType()
   * @generated
   */
  EReference getTargetModelNodeType_NodeType();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType <em>Model Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Node Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelNodeType
   * @generated
   */
  EClass getModelNodeType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getTarget()
   * @see #getModelNodeType()
   * @generated
   */
  EReference getModelNodeType_Target();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getType()
   * @see #getModelNodeType()
   * @generated
   */
  EReference getModelNodeType_Type();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeType
   * @generated
   */
  EClass getNodeType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.NodeType#getEclass <em>Eclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Eclass</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeType#getEclass()
   * @see #getNodeType()
   * @generated
   */
  EReference getNodeType_Eclass();

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
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORT_SECTION = eINSTANCE.getModel_ImportSection();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METAMODELS = eINSTANCE.getModel_Metamodels();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONNECTIONS = eINSTANCE.getModel_Connections();

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
     * The meta object literal for the '<em><b>Model Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL__MODEL_PACKAGE = eINSTANCE.getMetamodel_ModelPackage();

    /**
     * The meta object literal for the '<em><b>Is Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__IS_TEXT = eINSTANCE.getMetamodel_IsText();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__EXTENSION = eINSTANCE.getMetamodel_Extension();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MergerImpl <em>Merger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.MergerImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMerger()
     * @generated
     */
    EClass MERGER = eINSTANCE.getMerger();

    /**
     * The meta object literal for the '<em><b>Merger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERGER__MERGER = eINSTANCE.getMerger_Merger();

    /**
     * The meta object literal for the '<em><b>Aspect Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERGER__ASPECT_MODEL = eINSTANCE.getMerger_AspectModel();

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
     * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_MODEL_NODE_SELECTOR__TYPE = eINSTANCE.getSourceModelNodeSelector_Type();

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
     * The meta object literal for the '<em><b>Node Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_MODEL_NODE_TYPE__NODE_TYPE = eINSTANCE.getTargetModelNodeType_NodeType();

    /**
     * The meta object literal for the '<em><b>Multiply</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_MODEL_NODE_TYPE__MULTIPLY = eINSTANCE.getTargetModelNodeType_Multiply();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelNodeTypeImpl <em>Model Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelNodeTypeImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelNodeType()
     * @generated
     */
    EClass MODEL_NODE_TYPE = eINSTANCE.getModelNodeType();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_NODE_TYPE__TARGET = eINSTANCE.getModelNodeType_Target();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_NODE_TYPE__TYPE = eINSTANCE.getModelNodeType_Type();

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

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeTypeImpl <em>Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.NodeTypeImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeType()
     * @generated
     */
    EClass NODE_TYPE = eINSTANCE.getNodeType();

    /**
     * The meta object literal for the '<em><b>Eclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE__ECLASS = eINSTANCE.getNodeType_Eclass();

  }

} //ArchitecturePackage
