/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceMetamodelImpl <em>Source Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceMetamodelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSourceMetamodel()
   * @generated
   */
  int SOURCE_METAMODEL = 2;

  /**
   * The number of structural features of the '<em>Source Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_METAMODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetMetamodelImpl <em>Target Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetMetamodelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetMetamodel()
   * @generated
   */
  int TARGET_METAMODEL = 3;

  /**
   * The number of structural features of the '<em>Target Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_METAMODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl <em>Intermediate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getIntermediate()
   * @generated
   */
  int INTERMEDIATE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE__NAME = METAMODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Instance Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY = METAMODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Instance Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY = METAMODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE__LOCATION = METAMODEL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Intermediate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_FEATURE_COUNT = METAMODEL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSource()
   * @generated
   */
  int SOURCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__NAME = METAMODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Instance Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__SOURCE_INSTANCE_MULTIPLICITY = METAMODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__LOCATION = METAMODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = METAMODEL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTarget()
   * @generated
   */
  int TARGET = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__NAME = METAMODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Instance Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__TARGET_INSTANCE_MULTIPLICITY = METAMODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__LOCATION = METAMODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__IS_TEXT = METAMODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__EXTENSION = METAMODEL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = METAMODEL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelLocationImpl <em>Metamodel Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelLocationImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodelLocation()
   * @generated
   */
  int METAMODEL_LOCATION = 7;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_LOCATION__URL = 0;

  /**
   * The number of structural features of the '<em>Metamodel Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_LOCATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 8;

  /**
   * The feature id for the '<em><b>Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__GENERATOR = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__TARGET = 2;

  /**
   * The feature id for the '<em><b>Write Trace Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__WRITE_TRACE_MODEL = 3;

  /**
   * The feature id for the '<em><b>Read Trace Models</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__READ_TRACE_MODELS = 4;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl <em>Trace Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModel()
   * @generated
   */
  int TRACE_MODEL = 9;

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
  int NODE_SET_RELATION = 10;

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
  int NODE_TYPE = 11;

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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity <em>Model Multiplicity</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelMultiplicity()
   * @generated
   */
  int MODEL_MULTIPLICITY = 12;


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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.SourceMetamodel <em>Source Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Metamodel</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceMetamodel
   * @generated
   */
  EClass getSourceMetamodel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.TargetMetamodel <em>Target Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Metamodel</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetMetamodel
   * @generated
   */
  EClass getTargetMetamodel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Intermediate <em>Intermediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intermediate</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Intermediate
   * @generated
   */
  EClass getIntermediate();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Intermediate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Intermediate#getName()
   * @see #getIntermediate()
   * @generated
   */
  EAttribute getIntermediate_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Intermediate#getSourceInstanceMultiplicity <em>Source Instance Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Instance Multiplicity</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Intermediate#getSourceInstanceMultiplicity()
   * @see #getIntermediate()
   * @generated
   */
  EAttribute getIntermediate_SourceInstanceMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Intermediate#getTargetInstanceMultiplicity <em>Target Instance Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Instance Multiplicity</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Intermediate#getTargetInstanceMultiplicity()
   * @see #getIntermediate()
   * @generated
   */
  EAttribute getIntermediate_TargetInstanceMultiplicity();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Intermediate#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Intermediate#getLocation()
   * @see #getIntermediate()
   * @generated
   */
  EReference getIntermediate_Location();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Source#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Source#getName()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Source#getSourceInstanceMultiplicity <em>Source Instance Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Instance Multiplicity</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Source#getSourceInstanceMultiplicity()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_SourceInstanceMultiplicity();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Source#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Source#getLocation()
   * @see #getSource()
   * @generated
   */
  EReference getSource_Location();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Target#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Target#getName()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Target#getTargetInstanceMultiplicity <em>Target Instance Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Instance Multiplicity</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Target#getTargetInstanceMultiplicity()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_TargetInstanceMultiplicity();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Target#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Target#getLocation()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_Location();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Target#isIsText <em>Is Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Text</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Target#isIsText()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_IsText();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Target#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Target#getExtension()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Extension();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelLocation <em>Metamodel Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel Location</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelLocation
   * @generated
   */
  EClass getMetamodelLocation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.MetamodelLocation#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.MetamodelLocation#getUrl()
   * @see #getMetamodelLocation()
   * @generated
   */
  EAttribute getMetamodelLocation_Url();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getGenerator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getGenerator()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Generator();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getSource()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Source();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getTarget()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Target();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getWriteTraceModel <em>Write Trace Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Write Trace Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getWriteTraceModel()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_WriteTraceModel();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.se.geco.architecture.architecture.Connection#getReadTraceModels <em>Read Trace Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Read Trace Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Connection#getReadTraceModels()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_ReadTraceModels();

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
   * Returns the meta object for enum '{@link de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity <em>Model Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Model Multiplicity</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
   * @generated
   */
  EEnum getModelMultiplicity();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceMetamodelImpl <em>Source Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceMetamodelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSourceMetamodel()
     * @generated
     */
    EClass SOURCE_METAMODEL = eINSTANCE.getSourceMetamodel();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetMetamodelImpl <em>Target Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetMetamodelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetMetamodel()
     * @generated
     */
    EClass TARGET_METAMODEL = eINSTANCE.getTargetMetamodel();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl <em>Intermediate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.IntermediateImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getIntermediate()
     * @generated
     */
    EClass INTERMEDIATE = eINSTANCE.getIntermediate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERMEDIATE__NAME = eINSTANCE.getIntermediate_Name();

    /**
     * The meta object literal for the '<em><b>Source Instance Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERMEDIATE__SOURCE_INSTANCE_MULTIPLICITY = eINSTANCE.getIntermediate_SourceInstanceMultiplicity();

    /**
     * The meta object literal for the '<em><b>Target Instance Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERMEDIATE__TARGET_INSTANCE_MULTIPLICITY = eINSTANCE.getIntermediate_TargetInstanceMultiplicity();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERMEDIATE__LOCATION = eINSTANCE.getIntermediate_Location();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

    /**
     * The meta object literal for the '<em><b>Source Instance Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__SOURCE_INSTANCE_MULTIPLICITY = eINSTANCE.getSource_SourceInstanceMultiplicity();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE__LOCATION = eINSTANCE.getSource_Location();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__NAME = eINSTANCE.getTarget_Name();

    /**
     * The meta object literal for the '<em><b>Target Instance Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__TARGET_INSTANCE_MULTIPLICITY = eINSTANCE.getTarget_TargetInstanceMultiplicity();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__LOCATION = eINSTANCE.getTarget_Location();

    /**
     * The meta object literal for the '<em><b>Is Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__IS_TEXT = eINSTANCE.getTarget_IsText();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__EXTENSION = eINSTANCE.getTarget_Extension();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelLocationImpl <em>Metamodel Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.MetamodelLocationImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getMetamodelLocation()
     * @generated
     */
    EClass METAMODEL_LOCATION = eINSTANCE.getMetamodelLocation();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL_LOCATION__URL = eINSTANCE.getMetamodelLocation_Url();

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
     * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__GENERATOR = eINSTANCE.getConnection_Generator();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

    /**
     * The meta object literal for the '<em><b>Write Trace Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__WRITE_TRACE_MODEL = eINSTANCE.getConnection_WriteTraceModel();

    /**
     * The meta object literal for the '<em><b>Read Trace Models</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__READ_TRACE_MODELS = eINSTANCE.getConnection_ReadTraceModels();

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

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity <em>Model Multiplicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.ModelMultiplicity
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelMultiplicity()
     * @generated
     */
    EEnum MODEL_MULTIPLICITY = eINSTANCE.getModelMultiplicity();

  }

} //ArchitecturePackage
