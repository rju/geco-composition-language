/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureFactoryImpl extends EFactoryImpl implements ArchitectureFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArchitectureFactory init()
  {
    try
    {
      ArchitectureFactory theArchitectureFactory = (ArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory(ArchitecturePackage.eNS_URI);
      if (theArchitectureFactory != null)
      {
        return theArchitectureFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArchitectureFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ArchitecturePackage.MODEL: return createModel();
      case ArchitecturePackage.IMPORT: return createImport();
      case ArchitecturePackage.METAMODEL_SEQUENCE: return createMetamodelSequence();
      case ArchitecturePackage.METAMODEL: return createMetamodel();
      case ArchitecturePackage.REGISTERED_PACKAGE: return createRegisteredPackage();
      case ArchitecturePackage.PROCESSOR: return createProcessor();
      case ArchitecturePackage.WEAVER: return createWeaver();
      case ArchitecturePackage.ASPECT_MODEL: return createAspectModel();
      case ArchitecturePackage.GENERATOR: return createGenerator();
      case ArchitecturePackage.SOURCE_MODEL_NODE_SELECTOR: return createSourceModelNodeSelector();
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE: return createTargetModelNodeType();
      case ArchitecturePackage.MODEL_NODE_TYPE: return createModelNodeType();
      case ArchitecturePackage.NODE_PROPERTY: return createNodeProperty();
      case ArchitecturePackage.CONSTRAINT_EXPRESSION: return createConstraintExpression();
      case ArchitecturePackage.COMPARE_EXPRESSION: return createCompareExpression();
      case ArchitecturePackage.BASIC_CONSTRAINT: return createBasicConstraint();
      case ArchitecturePackage.NEGATION: return createNegation();
      case ArchitecturePackage.PARENTHESIS_CONSTRAINT: return createParenthesisConstraint();
      case ArchitecturePackage.OPERAND: return createOperand();
      case ArchitecturePackage.TYPEOF: return createTypeof();
      case ArchitecturePackage.WRITE_TRACE_MODEL: return createWriteTraceModel();
      case ArchitecturePackage.TRACE_MODEL_REFERENCE: return createTraceModelReference();
      case ArchitecturePackage.TRACE_MODEL: return createTraceModel();
      case ArchitecturePackage.NODE_SET_RELATION: return createNodeSetRelation();
      case ArchitecturePackage.NODE_TYPE: return createNodeType();
      case ArchitecturePackage.LITERAL: return createLiteral();
      case ArchitecturePackage.ARRAY_LITERAL: return createArrayLiteral();
      case ArchitecturePackage.STRING_LITERAL: return createStringLiteral();
      case ArchitecturePackage.INT_LITERAL: return createIntLiteral();
      case ArchitecturePackage.FLOAT_LITERAL: return createFloatLiteral();
      case ArchitecturePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArchitecturePackage.METAMODEL_MODIFIER:
        return createMetamodelModifierFromString(eDataType, initialValue);
      case ArchitecturePackage.LOGIC_OPERATOR:
        return createLogicOperatorFromString(eDataType, initialValue);
      case ArchitecturePackage.COMPARATOR:
        return createComparatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArchitecturePackage.METAMODEL_MODIFIER:
        return convertMetamodelModifierToString(eDataType, instanceValue);
      case ArchitecturePackage.LOGIC_OPERATOR:
        return convertLogicOperatorToString(eDataType, instanceValue);
      case ArchitecturePackage.COMPARATOR:
        return convertComparatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelSequence createMetamodelSequence()
  {
    MetamodelSequenceImpl metamodelSequence = new MetamodelSequenceImpl();
    return metamodelSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel createMetamodel()
  {
    MetamodelImpl metamodel = new MetamodelImpl();
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegisteredPackage createRegisteredPackage()
  {
    RegisteredPackageImpl registeredPackage = new RegisteredPackageImpl();
    return registeredPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Processor createProcessor()
  {
    ProcessorImpl processor = new ProcessorImpl();
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weaver createWeaver()
  {
    WeaverImpl weaver = new WeaverImpl();
    return weaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectModel createAspectModel()
  {
    AspectModelImpl aspectModel = new AspectModelImpl();
    return aspectModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator createGenerator()
  {
    GeneratorImpl generator = new GeneratorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceModelNodeSelector createSourceModelNodeSelector()
  {
    SourceModelNodeSelectorImpl sourceModelNodeSelector = new SourceModelNodeSelectorImpl();
    return sourceModelNodeSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetModelNodeType createTargetModelNodeType()
  {
    TargetModelNodeTypeImpl targetModelNodeType = new TargetModelNodeTypeImpl();
    return targetModelNodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelNodeType createModelNodeType()
  {
    ModelNodeTypeImpl modelNodeType = new ModelNodeTypeImpl();
    return modelNodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeProperty createNodeProperty()
  {
    NodePropertyImpl nodeProperty = new NodePropertyImpl();
    return nodeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpression createConstraintExpression()
  {
    ConstraintExpressionImpl constraintExpression = new ConstraintExpressionImpl();
    return constraintExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareExpression createCompareExpression()
  {
    CompareExpressionImpl compareExpression = new CompareExpressionImpl();
    return compareExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicConstraint createBasicConstraint()
  {
    BasicConstraintImpl basicConstraint = new BasicConstraintImpl();
    return basicConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesisConstraint createParenthesisConstraint()
  {
    ParenthesisConstraintImpl parenthesisConstraint = new ParenthesisConstraintImpl();
    return parenthesisConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand createOperand()
  {
    OperandImpl operand = new OperandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typeof createTypeof()
  {
    TypeofImpl typeof = new TypeofImpl();
    return typeof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WriteTraceModel createWriteTraceModel()
  {
    WriteTraceModelImpl writeTraceModel = new WriteTraceModelImpl();
    return writeTraceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceModelReference createTraceModelReference()
  {
    TraceModelReferenceImpl traceModelReference = new TraceModelReferenceImpl();
    return traceModelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceModel createTraceModel()
  {
    TraceModelImpl traceModel = new TraceModelImpl();
    return traceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSetRelation createNodeSetRelation()
  {
    NodeSetRelationImpl nodeSetRelation = new NodeSetRelationImpl();
    return nodeSetRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType createNodeType()
  {
    NodeTypeImpl nodeType = new NodeTypeImpl();
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLiteral createArrayLiteral()
  {
    ArrayLiteralImpl arrayLiteral = new ArrayLiteralImpl();
    return arrayLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelModifier createMetamodelModifierFromString(EDataType eDataType, String initialValue)
  {
    MetamodelModifier result = MetamodelModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMetamodelModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOperator createLogicOperatorFromString(EDataType eDataType, String initialValue)
  {
    LogicOperator result = LogicOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparator createComparatorFromString(EDataType eDataType, String initialValue)
  {
    Comparator result = Comparator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitecturePackage getArchitecturePackage()
  {
    return (ArchitecturePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArchitecturePackage getPackage()
  {
    return ArchitecturePackage.eINSTANCE;
  }

} //ArchitectureFactoryImpl
