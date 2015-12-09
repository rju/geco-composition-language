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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl <em>Geco Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGecoModel()
   * @generated
   */
  int GECO_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GECO_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GECO_MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Registered Root Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GECO_MODEL__REGISTERED_ROOT_CLASS = 2;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GECO_MODEL__MODELS = 3;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GECO_MODEL__FRAGMENTS = 4;

  /**
   * The number of structural features of the '<em>Geco Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GECO_MODEL_FEATURE_COUNT = 5;

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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredRootClassImpl <em>Registered Root Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.RegisteredRootClassImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getRegisteredRootClass()
   * @generated
   */
  int REGISTERED_ROOT_CLASS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_ROOT_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_ROOT_CLASS__IMPORTED_NAMESPACE = 1;

  /**
   * The feature id for the '<em><b>Is Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_ROOT_CLASS__IS_TEXT = 2;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_ROOT_CLASS__EXTENSION = 3;

  /**
   * The number of structural features of the '<em>Registered Root Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_ROOT_CLASS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelSequenceImpl <em>Model Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelSequenceImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelSequence()
   * @generated
   */
  int MODEL_SEQUENCE = 3;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SEQUENCE__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SEQUENCE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SEQUENCE__MODELS = 2;

  /**
   * The number of structural features of the '<em>Model Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SEQUENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
   * @generated
   */
  int MODEL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl <em>Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__SOURCE_MODEL = 1;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__TARGET_MODEL = 2;

  /**
   * The number of structural features of the '<em>Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl <em>Weaver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.WeaverImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getWeaver()
   * @generated
   */
  int WEAVER = 6;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__REFERENCE = FRAGMENT__REFERENCE;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__SOURCE_MODEL = FRAGMENT__SOURCE_MODEL;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__TARGET_MODEL = FRAGMENT__TARGET_MODEL;

  /**
   * The feature id for the '<em><b>Aspect Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER__ASPECT_MODEL = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Weaver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVER_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.AspectModelImpl <em>Aspect Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.AspectModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getAspectModel()
   * @generated
   */
  int ASPECT_MODEL = 7;

  /**
   * The number of structural features of the '<em>Aspect Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SeparateModelsImpl <em>Separate Models</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.SeparateModelsImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSeparateModels()
   * @generated
   */
  int SEPARATE_MODELS = 8;

  /**
   * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATE_MODELS__POINTCUT = ASPECT_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Advice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATE_MODELS__ADVICE = ASPECT_MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Separate Models</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATE_MODELS_FEATURE_COUNT = ASPECT_MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.CombinedModelImpl <em>Combined Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.CombinedModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getCombinedModel()
   * @generated
   */
  int COMBINED_MODEL = 9;

  /**
   * The number of structural features of the '<em>Combined Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINED_MODEL_FEATURE_COUNT = ASPECT_MODEL_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__REFERENCE = FRAGMENT__REFERENCE;

  /**
   * The feature id for the '<em><b>Source Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__SOURCE_MODEL = FRAGMENT__SOURCE_MODEL;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__TARGET_MODEL = FRAGMENT__TARGET_MODEL;

  /**
   * The feature id for the '<em><b>Source Aux Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__SOURCE_AUX_MODELS = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Trace Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__TARGET_TRACE_MODEL = FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Trace Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__SOURCE_TRACE_MODELS = FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceModelSelectorImpl <em>Source Model Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceModelSelectorImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSourceModelSelector()
   * @generated
   */
  int SOURCE_MODEL_SELECTOR = 11;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_SELECTOR__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_SELECTOR__CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_SELECTOR__PROPERTY = 2;

  /**
   * The number of structural features of the '<em>Source Model Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_MODEL_SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelImpl <em>Target Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetModel()
   * @generated
   */
  int TARGET_MODEL = 12;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL__REFERENCE = COMBINED_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Target Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_MODEL_FEATURE_COUNT = COMBINED_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelTypeImpl <em>Model Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelTypeImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelType()
   * @generated
   */
  int MODEL_TYPE = 13;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__TARGET = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__COLLECTION = 2;

  /**
   * The number of structural features of the '<em>Model Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The number of structural features of the '<em>Constraint Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.CompareExpressionImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getCompareExpression()
   * @generated
   */
  int COMPARE_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__LEFT = CONSTRAINT_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__OPERATOR = CONSTRAINT_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__RIGHT = CONSTRAINT_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__COMPARATOR = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compare Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION_FEATURE_COUNT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.BasicConstraintImpl <em>Basic Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.BasicConstraintImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getBasicConstraint()
   * @generated
   */
  int BASIC_CONSTRAINT = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_CONSTRAINT__LEFT = COMPARE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_CONSTRAINT__OPERATOR = COMPARE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_CONSTRAINT__RIGHT = COMPARE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_CONSTRAINT__COMPARATOR = COMPARE_EXPRESSION__COMPARATOR;

  /**
   * The number of structural features of the '<em>Basic Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_CONSTRAINT_FEATURE_COUNT = COMPARE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.OperandImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__LEFT = BASIC_CONSTRAINT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__OPERATOR = BASIC_CONSTRAINT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__RIGHT = BASIC_CONSTRAINT__RIGHT;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__COMPARATOR = BASIC_CONSTRAINT__COMPARATOR;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = BASIC_CONSTRAINT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__COMPARATOR = OPERAND__COMPARATOR;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__PROPERTY = OPERAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__CONSTRAINT = OPERAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY__SUB_PROPERTY = OPERAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Node Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PROPERTY_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NegationImpl <em>Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.NegationImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNegation()
   * @generated
   */
  int NEGATION = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__LEFT = BASIC_CONSTRAINT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__OPERATOR = BASIC_CONSTRAINT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__RIGHT = BASIC_CONSTRAINT__RIGHT;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__COMPARATOR = BASIC_CONSTRAINT__COMPARATOR;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__CONSTRAINT = BASIC_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_FEATURE_COUNT = BASIC_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ParenthesisConstraintImpl <em>Parenthesis Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ParenthesisConstraintImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getParenthesisConstraint()
   * @generated
   */
  int PARENTHESIS_CONSTRAINT = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONSTRAINT__LEFT = BASIC_CONSTRAINT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONSTRAINT__OPERATOR = BASIC_CONSTRAINT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONSTRAINT__RIGHT = BASIC_CONSTRAINT__RIGHT;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONSTRAINT__COMPARATOR = BASIC_CONSTRAINT__COMPARATOR;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONSTRAINT__CONSTRAINT = BASIC_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesis Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONSTRAINT_FEATURE_COUNT = BASIC_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.InstanceOfImpl <em>Instance Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.InstanceOfImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getInstanceOf()
   * @generated
   */
  int INSTANCE_OF = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF__LEFT = OPERAND__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF__RIGHT = OPERAND__RIGHT;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF__COMPARATOR = OPERAND__COMPARATOR;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF__TYPE = OPERAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetTraceModelImpl <em>Target Trace Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetTraceModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetTraceModel()
   * @generated
   */
  int TARGET_TRACE_MODEL = 22;

  /**
   * The number of structural features of the '<em>Target Trace Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TRACE_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelReferenceImpl <em>Trace Model Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelReferenceImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModelReference()
   * @generated
   */
  int TRACE_MODEL_REFERENCE = 23;

  /**
   * The feature id for the '<em><b>Trace Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL_REFERENCE__TRACE_MODEL = TARGET_TRACE_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trace Model Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL_REFERENCE_FEATURE_COUNT = TARGET_TRACE_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl <em>Trace Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModel()
   * @generated
   */
  int TRACE_MODEL = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL__NAME = TARGET_TRACE_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Node Set Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL__NODE_SET_RELATIONS = TARGET_TRACE_MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trace Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_MODEL_FEATURE_COUNT = TARGET_TRACE_MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl <em>Node Set Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNodeSetRelation()
   * @generated
   */
  int NODE_SET_RELATION = 25;

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
  int NODE_TYPE = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__TYPE = 0;

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
  int LITERAL = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEFT = OPERAND__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__COMPARATOR = OPERAND__COMPARATOR;

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
  int ARRAY_LITERAL = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__COMPARATOR = LITERAL__COMPARATOR;

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
  int STRING_LITERAL = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__COMPARATOR = LITERAL__COMPARATOR;

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
  int INT_LITERAL = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__COMPARATOR = LITERAL__COMPARATOR;

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
  int FLOAT_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__COMPARATOR = LITERAL__COMPARATOR;

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
  int BOOLEAN_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
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
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__COMPARATOR = LITERAL__COMPARATOR;

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
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.ModelModifier <em>Model Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelModifier()
   * @generated
   */
  int MODEL_MODIFIER = 33;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator <em>Logic Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getLogicOperator()
   * @generated
   */
  int LOGIC_OPERATOR = 34;

  /**
   * The meta object id for the '{@link de.cau.cs.se.geco.architecture.architecture.Comparator <em>Comparator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator
   * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getComparator()
   * @generated
   */
  int COMPARATOR = 35;


  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.GecoModel <em>Geco Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geco Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GecoModel
   * @generated
   */
  EClass getGecoModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.GecoModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GecoModel#getName()
   * @see #getGecoModel()
   * @generated
   */
  EAttribute getGecoModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.GecoModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GecoModel#getImports()
   * @see #getGecoModel()
   * @generated
   */
  EReference getGecoModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.GecoModel#getRegisteredRootClass <em>Registered Root Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Registered Root Class</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GecoModel#getRegisteredRootClass()
   * @see #getGecoModel()
   * @generated
   */
  EReference getGecoModel_RegisteredRootClass();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.GecoModel#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GecoModel#getModels()
   * @see #getGecoModel()
   * @generated
   */
  EReference getGecoModel_Models();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.GecoModel#getFragments <em>Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fragments</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.GecoModel#getFragments()
   * @see #getGecoModel()
   * @generated
   */
  EReference getGecoModel_Fragments();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass <em>Registered Root Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Registered Root Class</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass
   * @generated
   */
  EClass getRegisteredRootClass();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getName()
   * @see #getRegisteredRootClass()
   * @generated
   */
  EAttribute getRegisteredRootClass_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Namespace</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getImportedNamespace()
   * @see #getRegisteredRootClass()
   * @generated
   */
  EReference getRegisteredRootClass_ImportedNamespace();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#isIsText <em>Is Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Text</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#isIsText()
   * @see #getRegisteredRootClass()
   * @generated
   */
  EAttribute getRegisteredRootClass_IsText();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getExtension()
   * @see #getRegisteredRootClass()
   * @generated
   */
  EAttribute getRegisteredRootClass_Extension();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence <em>Model Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Sequence</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelSequence
   * @generated
   */
  EClass getModelSequence();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModifier()
   * @see #getModelSequence()
   * @generated
   */
  EAttribute getModelSequence_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelSequence#getType()
   * @see #getModelSequence()
   * @generated
   */
  EReference getModelSequence_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelSequence#getModels()
   * @see #getModelSequence()
   * @generated
   */
  EReference getModelSequence_Models();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragment</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Fragment#getReference()
   * @see #getFragment()
   * @generated
   */
  EReference getFragment_Reference();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getSourceModel <em>Source Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Fragment#getSourceModel()
   * @see #getFragment()
   * @generated
   */
  EReference getFragment_SourceModel();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Fragment#getTargetModel <em>Target Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Fragment#getTargetModel()
   * @see #getFragment()
   * @generated
   */
  EReference getFragment_TargetModel();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels <em>Separate Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Separate Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SeparateModels
   * @generated
   */
  EClass getSeparateModels();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels#getPointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointcut</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SeparateModels#getPointcut()
   * @see #getSeparateModels()
   * @generated
   */
  EReference getSeparateModels_Pointcut();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.SeparateModels#getAdvice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Advice</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SeparateModels#getAdvice()
   * @see #getSeparateModels()
   * @generated
   */
  EReference getSeparateModels_Advice();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.CombinedModel <em>Combined Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combined Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.CombinedModel
   * @generated
   */
  EClass getCombinedModel();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getSourceAuxModels <em>Source Aux Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Aux Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator#getSourceAuxModels()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_SourceAuxModels();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getTargetTraceModel <em>Target Trace Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Trace Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator#getTargetTraceModel()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_TargetTraceModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.geco.architecture.architecture.Generator#getSourceTraceModels <em>Source Trace Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Trace Models</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Generator#getSourceTraceModels()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_SourceTraceModels();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector <em>Source Model Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Model Selector</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelSelector
   * @generated
   */
  EClass getSourceModelSelector();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getReference()
   * @see #getSourceModelSelector()
   * @generated
   */
  EReference getSourceModelSelector_Reference();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getConstraint()
   * @see #getSourceModelSelector()
   * @generated
   */
  EReference getSourceModelSelector_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.SourceModelSelector#getProperty()
   * @see #getSourceModelSelector()
   * @generated
   */
  EReference getSourceModelSelector_Property();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.TargetModel <em>Target Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetModel
   * @generated
   */
  EClass getTargetModel();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.TargetModel#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetModel#getReference()
   * @see #getTargetModel()
   * @generated
   */
  EReference getTargetModel_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.ModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelType
   * @generated
   */
  EClass getModelType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.ModelType#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelType#getTarget()
   * @see #getModelType()
   * @generated
   */
  EReference getModelType_Target();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ModelType#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelType#getProperty()
   * @see #getModelType()
   * @generated
   */
  EReference getModelType_Property();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.ModelType#isCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelType#isCollection()
   * @see #getModelType()
   * @generated
   */
  EAttribute getModelType_Collection();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.NodeProperty#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeProperty#getConstraint()
   * @see #getNodeProperty()
   * @generated
   */
  EReference getNodeProperty_Constraint();

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
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ConstraintExpression#getOperator()
   * @see #getConstraintExpression()
   * @generated
   */
  EAttribute getConstraintExpression_Operator();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expression</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.CompareExpression
   * @generated
   */
  EClass getCompareExpression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.geco.architecture.architecture.CompareExpression#getComparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comparator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.CompareExpression#getComparator()
   * @see #getCompareExpression()
   * @generated
   */
  EAttribute getCompareExpression_Comparator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.BasicConstraint <em>Basic Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.BasicConstraint
   * @generated
   */
  EClass getBasicConstraint();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Negation
   * @generated
   */
  EClass getNegation();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.Negation#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Negation#getConstraint()
   * @see #getNegation()
   * @generated
   */
  EReference getNegation_Constraint();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint <em>Parenthesis Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint
   * @generated
   */
  EClass getParenthesisConstraint();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint#getConstraint()
   * @see #getParenthesisConstraint()
   * @generated
   */
  EReference getParenthesisConstraint_Constraint();

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
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.InstanceOf <em>Instance Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.InstanceOf
   * @generated
   */
  EClass getInstanceOf();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.InstanceOf#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.InstanceOf#getType()
   * @see #getInstanceOf()
   * @generated
   */
  EReference getInstanceOf_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.TargetTraceModel <em>Target Trace Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Trace Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TargetTraceModel
   * @generated
   */
  EClass getTargetTraceModel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.geco.architecture.architecture.TraceModelReference <em>Trace Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace Model Reference</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TraceModelReference
   * @generated
   */
  EClass getTraceModelReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.TraceModelReference#getTraceModel <em>Trace Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trace Model</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.TraceModelReference#getTraceModel()
   * @see #getTraceModelReference()
   * @generated
   */
  EReference getTraceModelReference_TraceModel();

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
   * Returns the meta object for the reference '{@link de.cau.cs.se.geco.architecture.architecture.NodeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.NodeType#getType()
   * @see #getNodeType()
   * @generated
   */
  EReference getNodeType_Type();

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
   * Returns the meta object for enum '{@link de.cau.cs.se.geco.architecture.architecture.ModelModifier <em>Model Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Model Modifier</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
   * @generated
   */
  EEnum getModelModifier();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator <em>Logic Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Operator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator
   * @generated
   */
  EEnum getLogicOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.geco.architecture.architecture.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparator</em>'.
   * @see de.cau.cs.se.geco.architecture.architecture.Comparator
   * @generated
   */
  EEnum getComparator();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl <em>Geco Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.GecoModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getGecoModel()
     * @generated
     */
    EClass GECO_MODEL = eINSTANCE.getGecoModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GECO_MODEL__NAME = eINSTANCE.getGecoModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GECO_MODEL__IMPORTS = eINSTANCE.getGecoModel_Imports();

    /**
     * The meta object literal for the '<em><b>Registered Root Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GECO_MODEL__REGISTERED_ROOT_CLASS = eINSTANCE.getGecoModel_RegisteredRootClass();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GECO_MODEL__MODELS = eINSTANCE.getGecoModel_Models();

    /**
     * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GECO_MODEL__FRAGMENTS = eINSTANCE.getGecoModel_Fragments();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.RegisteredRootClassImpl <em>Registered Root Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.RegisteredRootClassImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getRegisteredRootClass()
     * @generated
     */
    EClass REGISTERED_ROOT_CLASS = eINSTANCE.getRegisteredRootClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_ROOT_CLASS__NAME = eINSTANCE.getRegisteredRootClass_Name();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTERED_ROOT_CLASS__IMPORTED_NAMESPACE = eINSTANCE.getRegisteredRootClass_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Is Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_ROOT_CLASS__IS_TEXT = eINSTANCE.getRegisteredRootClass_IsText();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_ROOT_CLASS__EXTENSION = eINSTANCE.getRegisteredRootClass_Extension();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelSequenceImpl <em>Model Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelSequenceImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelSequence()
     * @generated
     */
    EClass MODEL_SEQUENCE = eINSTANCE.getModelSequence();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SEQUENCE__MODIFIER = eINSTANCE.getModelSequence_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_SEQUENCE__TYPE = eINSTANCE.getModelSequence_Type();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_SEQUENCE__MODELS = eINSTANCE.getModelSequence_Models();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.FragmentImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENT__REFERENCE = eINSTANCE.getFragment_Reference();

    /**
     * The meta object literal for the '<em><b>Source Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENT__SOURCE_MODEL = eINSTANCE.getFragment_SourceModel();

    /**
     * The meta object literal for the '<em><b>Target Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENT__TARGET_MODEL = eINSTANCE.getFragment_TargetModel();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SeparateModelsImpl <em>Separate Models</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.SeparateModelsImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSeparateModels()
     * @generated
     */
    EClass SEPARATE_MODELS = eINSTANCE.getSeparateModels();

    /**
     * The meta object literal for the '<em><b>Pointcut</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEPARATE_MODELS__POINTCUT = eINSTANCE.getSeparateModels_Pointcut();

    /**
     * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEPARATE_MODELS__ADVICE = eINSTANCE.getSeparateModels_Advice();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.CombinedModelImpl <em>Combined Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.CombinedModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getCombinedModel()
     * @generated
     */
    EClass COMBINED_MODEL = eINSTANCE.getCombinedModel();

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
     * The meta object literal for the '<em><b>Source Aux Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__SOURCE_AUX_MODELS = eINSTANCE.getGenerator_SourceAuxModels();

    /**
     * The meta object literal for the '<em><b>Target Trace Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__TARGET_TRACE_MODEL = eINSTANCE.getGenerator_TargetTraceModel();

    /**
     * The meta object literal for the '<em><b>Source Trace Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__SOURCE_TRACE_MODELS = eINSTANCE.getGenerator_SourceTraceModels();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.SourceModelSelectorImpl <em>Source Model Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.SourceModelSelectorImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getSourceModelSelector()
     * @generated
     */
    EClass SOURCE_MODEL_SELECTOR = eINSTANCE.getSourceModelSelector();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_MODEL_SELECTOR__REFERENCE = eINSTANCE.getSourceModelSelector_Reference();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_MODEL_SELECTOR__CONSTRAINT = eINSTANCE.getSourceModelSelector_Constraint();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_MODEL_SELECTOR__PROPERTY = eINSTANCE.getSourceModelSelector_Property();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetModelImpl <em>Target Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetModel()
     * @generated
     */
    EClass TARGET_MODEL = eINSTANCE.getTargetModel();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_MODEL__REFERENCE = eINSTANCE.getTargetModel_Reference();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ModelTypeImpl <em>Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ModelTypeImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelType()
     * @generated
     */
    EClass MODEL_TYPE = eINSTANCE.getModelType();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TYPE__TARGET = eINSTANCE.getModelType_Target();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TYPE__PROPERTY = eINSTANCE.getModelType_Property();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_TYPE__COLLECTION = eINSTANCE.getModelType_Collection();

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
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PROPERTY__CONSTRAINT = eINSTANCE.getNodeProperty_Constraint();

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
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT_EXPRESSION__OPERATOR = eINSTANCE.getConstraintExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__RIGHT = eINSTANCE.getConstraintExpression_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.CompareExpressionImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getCompareExpression()
     * @generated
     */
    EClass COMPARE_EXPRESSION = eINSTANCE.getCompareExpression();

    /**
     * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_EXPRESSION__COMPARATOR = eINSTANCE.getCompareExpression_Comparator();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.BasicConstraintImpl <em>Basic Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.BasicConstraintImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getBasicConstraint()
     * @generated
     */
    EClass BASIC_CONSTRAINT = eINSTANCE.getBasicConstraint();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.NegationImpl <em>Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.NegationImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getNegation()
     * @generated
     */
    EClass NEGATION = eINSTANCE.getNegation();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION__CONSTRAINT = eINSTANCE.getNegation_Constraint();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.ParenthesisConstraintImpl <em>Parenthesis Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ParenthesisConstraintImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getParenthesisConstraint()
     * @generated
     */
    EClass PARENTHESIS_CONSTRAINT = eINSTANCE.getParenthesisConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS_CONSTRAINT__CONSTRAINT = eINSTANCE.getParenthesisConstraint_Constraint();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.InstanceOfImpl <em>Instance Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.InstanceOfImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getInstanceOf()
     * @generated
     */
    EClass INSTANCE_OF = eINSTANCE.getInstanceOf();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF__TYPE = eINSTANCE.getInstanceOf_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TargetTraceModelImpl <em>Target Trace Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TargetTraceModelImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTargetTraceModel()
     * @generated
     */
    EClass TARGET_TRACE_MODEL = eINSTANCE.getTargetTraceModel();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.impl.TraceModelReferenceImpl <em>Trace Model Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.impl.TraceModelReferenceImpl
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getTraceModelReference()
     * @generated
     */
    EClass TRACE_MODEL_REFERENCE = eINSTANCE.getTraceModelReference();

    /**
     * The meta object literal for the '<em><b>Trace Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE_MODEL_REFERENCE__TRACE_MODEL = eINSTANCE.getTraceModelReference_TraceModel();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE__TYPE = eINSTANCE.getNodeType_Type();

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
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.ModelModifier <em>Model Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.ModelModifier
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getModelModifier()
     * @generated
     */
    EEnum MODEL_MODIFIER = eINSTANCE.getModelModifier();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.LogicOperator <em>Logic Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.LogicOperator
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getLogicOperator()
     * @generated
     */
    EEnum LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.geco.architecture.architecture.Comparator <em>Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.geco.architecture.architecture.Comparator
     * @see de.cau.cs.se.geco.architecture.architecture.impl.ArchitecturePackageImpl#getComparator()
     * @generated
     */
    EEnum COMPARATOR = eINSTANCE.getComparator();

  }

} //ArchitecturePackage
