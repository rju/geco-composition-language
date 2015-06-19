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
   * The feature id for the '<em><b>Registered Packages</b></em>' containment reference list.
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
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference.
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
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference.
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
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference.
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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl <em>Registered Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getRegisteredPackage()
   * @generated
   */
  int REGISTERED_PACKAGE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Registered Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE__REGISTERED_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Is Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE__IS_TEXT = 2;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE__EXTENSION = 3;

  /**
   * The number of structural features of the '<em>Registered Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ConnectionImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 7;

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
  int WEAVER = 8;

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
  int ASPECT_MODEL = 9;

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
  int GENERATOR = 10;

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
  int SOURCE_MODEL_NODE_SELECTOR = 11;

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
  int TARGET_MODEL_NODE_TYPE = 12;

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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelNodeTypeImpl <em>Model Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelNodeTypeImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelNodeType()
   * @generated
   */
  int MODEL_NODE_TYPE = 13;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODE_TYPE__TARGET = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODE_TYPE__PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Model Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ConstraintExpressionImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConstraintExpression()
   * @generated
   */
  int CONSTRAINT_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__CONSTRAINT = 3;

  /**
   * The number of structural features of the '<em>Constraint Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.OperandImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__LEFT = CONSTRAINT_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__OPERATOR = CONSTRAINT_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__RIGHT = CONSTRAINT_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__CONSTRAINT = CONSTRAINT_EXPRESSION__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl <em>Node Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeProperty()
   * @generated
   */
  int NODE_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__LEFT = OPERAND__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__RIGHT = OPERAND__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__CONSTRAINT = OPERAND__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__PROPERTY = OPERAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__SUB_PROPERTY = OPERAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl <em>Trace Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModel()
   * @generated
   */
  int TRACE_MODEL = 17;

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
  int NODE_SET_RELATION = 18;

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
  int NODE_TYPE = 19;

  /**
   * The feature id for the '<em><b>Eclass</b></em>' attribute.
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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.LiteralImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEFT = OPERAND__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__RIGHT = OPERAND__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__CONSTRAINT = OPERAND__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArrayLiteralImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getArrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__OPERATOR = LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__CONSTRAINT = LITERAL__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__LITERALS = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.StringLiteralImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__OPERATOR = LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__CONSTRAINT = LITERAL__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.IntLiteralImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__OPERATOR = LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__CONSTRAINT = LITERAL__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.FloatLiteralImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__OPERATOR = LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__CONSTRAINT = LITERAL__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.BooleanLiteralImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__OPERATOR = LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__CONSTRAINT = LITERAL__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.LogicOperatorImpl <em>Logic Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.LogicOperatorImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getLogicOperator()
   * @generated
   */
  int LOGIC_OPERATOR = 26;

  /**
   * The feature id for the '<em><b>AND</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATOR__AND = 0;

  /**
   * The feature id for the '<em><b>OR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATOR__OR = 1;

  /**
   * The number of structural features of the '<em>Logic Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl <em>Comparator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getComparator()
   * @generated
   */
  int COMPARATOR = 27;

  /**
   * The feature id for the '<em><b>EQ</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__EQ = 0;

  /**
   * The feature id for the '<em><b>NE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__NE = 1;

  /**
   * The feature id for the '<em><b>GR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__GR = 2;

  /**
   * The feature id for the '<em><b>LW</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__LW = 3;

  /**
   * The feature id for the '<em><b>GE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__GE = 4;

  /**
   * The feature id for the '<em><b>LE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__LE = 5;

  /**
   * The feature id for the '<em><b>LIKE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR__LIKE = 6;

  /**
   * The number of structural features of the '<em>Comparator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARATOR_FEATURE_COUNT = 7;


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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.Model#getRegisteredPackages <em>Registered Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Registered Packages</em>'.
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
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Namespace</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportedNamespace();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredPackage <em>Registered Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Registered Package</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredPackage
   * @generated
   */
  EClass getRegisteredPackage();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#getName()
   * @see #getRegisteredPackage()
   * @generated
   */
  EAttribute getRegisteredPackage_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#getRegisteredPackage <em>Registered Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Registered Package</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#getRegisteredPackage()
   * @see #getRegisteredPackage()
   * @generated
   */
  EReference getRegisteredPackage_RegisteredPackage();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#isIsText <em>Is Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Text</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#isIsText()
   * @see #getRegisteredPackage()
   * @generated
   */
  EAttribute getRegisteredPackage_IsText();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredPackage#getExtension()
   * @see #getRegisteredPackage()
   * @generated
   */
  EAttribute getRegisteredPackage_Extension();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelNodeType#getProperty()
   * @see #getModelNodeType()
   * @generated
   */
  EReference getModelNodeType_Property();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty <em>Node Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeProperty
   * @generated
   */
  EClass getNodeProperty();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeProperty#getProperty()
   * @see #getNodeProperty()
   * @generated
   */
  EReference getNodeProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getSubProperty <em>Sub Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeProperty#getSubProperty()
   * @see #getNodeProperty()
   * @generated
   */
  EReference getNodeProperty_SubProperty();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression <em>Constraint Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Expression</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ConstraintExpression
   * @generated
   */
  EClass getConstraintExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getLeft()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getRight()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getConstraint()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Constraint();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Operand
   * @generated
   */
  EClass getOperand();

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
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.NodeType#getEclass <em>Eclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eclass</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeType#getEclass()
   * @see #getNodeType()
   * @generated
   */
  EAttribute getNodeType_Eclass();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Literal</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ArrayLiteral
   * @generated
   */
  EClass getArrayLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.ArrayLiteral#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ArrayLiteral#getLiterals()
   * @see #getArrayLiteral()
   * @generated
   */
  EReference getArrayLiteral_Literals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator <em>Logic Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Operator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator
   * @generated
   */
  EClass getLogicOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator#getAND <em>AND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AND</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator#getAND()
   * @see #getLogicOperator()
   * @generated
   */
  EAttribute getLogicOperator_AND();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator#getOR <em>OR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>OR</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator#getOR()
   * @see #getLogicOperator()
   * @generated
   */
  EAttribute getLogicOperator_OR();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator
   * @generated
   */
  EClass getComparator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getEQ <em>EQ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EQ</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getEQ()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_EQ();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getNE <em>NE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>NE</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getNE()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_NE();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getGR <em>GR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>GR</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getGR()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_GR();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getLW <em>LW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LW</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getLW()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_LW();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getGE <em>GE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>GE</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getGE()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_GE();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getLE <em>LE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LE</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getLE()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_LE();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.Comparator#getLIKE <em>LIKE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LIKE</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator#getLIKE()
   * @see #getComparator()
   * @generated
   */
  EAttribute getComparator_LIKE();

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
     * The meta object literal for the '<em><b>Registered Packages</b></em>' containment reference list feature.
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
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl <em>Registered Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.RegisteredPackageImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getRegisteredPackage()
     * @generated
     */
    EClass REGISTERED_PACKAGE = eINSTANCE.getRegisteredPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_PACKAGE__NAME = eINSTANCE.getRegisteredPackage_Name();

    /**
     * The meta object literal for the '<em><b>Registered Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTERED_PACKAGE__REGISTERED_PACKAGE = eINSTANCE.getRegisteredPackage_RegisteredPackage();

    /**
     * The meta object literal for the '<em><b>Is Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_PACKAGE__IS_TEXT = eINSTANCE.getRegisteredPackage_IsText();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_PACKAGE__EXTENSION = eINSTANCE.getRegisteredPackage_Extension();

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
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_NODE_TYPE__PROPERTY = eINSTANCE.getModelNodeType_Property();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl <em>Node Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.NodePropertyImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeProperty()
     * @generated
     */
    EClass NODE_PROPERTY = eINSTANCE.getNodeProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PROPERTY__PROPERTY = eINSTANCE.getNodeProperty_Property();

    /**
     * The meta object literal for the '<em><b>Sub Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PROPERTY__SUB_PROPERTY = eINSTANCE.getNodeProperty_SubProperty();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ConstraintExpressionImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getConstraintExpression()
     * @generated
     */
    EClass CONSTRAINT_EXPRESSION = eINSTANCE.getConstraintExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__LEFT = eINSTANCE.getConstraintExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__OPERATOR = eINSTANCE.getConstraintExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__RIGHT = eINSTANCE.getConstraintExpression_Right();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__CONSTRAINT = eINSTANCE.getConstraintExpression_Constraint();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.OperandImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

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
     * The meta object literal for the '<em><b>Eclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE__ECLASS = eINSTANCE.getNodeType_Eclass();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.LiteralImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArrayLiteralImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getArrayLiteral()
     * @generated
     */
    EClass ARRAY_LITERAL = eINSTANCE.getArrayLiteral();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_LITERAL__LITERALS = eINSTANCE.getArrayLiteral_Literals();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.StringLiteralImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.IntLiteralImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.FloatLiteralImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.BooleanLiteralImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.LogicOperatorImpl <em>Logic Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.LogicOperatorImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getLogicOperator()
     * @generated
     */
    EClass LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

    /**
     * The meta object literal for the '<em><b>AND</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_OPERATOR__AND = eINSTANCE.getLogicOperator_AND();

    /**
     * The meta object literal for the '<em><b>OR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_OPERATOR__OR = eINSTANCE.getLogicOperator_OR();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl <em>Comparator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getComparator()
     * @generated
     */
    EClass COMPARATOR = eINSTANCE.getComparator();

    /**
     * The meta object literal for the '<em><b>EQ</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__EQ = eINSTANCE.getComparator_EQ();

    /**
     * The meta object literal for the '<em><b>NE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__NE = eINSTANCE.getComparator_NE();

    /**
     * The meta object literal for the '<em><b>GR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__GR = eINSTANCE.getComparator_GR();

    /**
     * The meta object literal for the '<em><b>LW</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__LW = eINSTANCE.getComparator_LW();

    /**
     * The meta object literal for the '<em><b>GE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__GE = eINSTANCE.getComparator_GE();

    /**
     * The meta object literal for the '<em><b>LE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__LE = eINSTANCE.getComparator_LE();

    /**
     * The meta object literal for the '<em><b>LIKE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARATOR__LIKE = eINSTANCE.getComparator_LIKE();

  }

} //ArchitecturePackage
