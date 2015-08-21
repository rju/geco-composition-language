/**
 */
package de.cau.cs.se.geco.architecture.architecture.util;

import de.cau.cs.se.geco.architecture.architecture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArchitecturePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArchitecturePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ArchitecturePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.METAMODEL_SEQUENCE:
      {
        MetamodelSequence metamodelSequence = (MetamodelSequence)theEObject;
        T result = caseMetamodelSequence(metamodelSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.METAMODEL:
      {
        Metamodel metamodel = (Metamodel)theEObject;
        T result = caseMetamodel(metamodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.REGISTERED_PACKAGE:
      {
        RegisteredPackage registeredPackage = (RegisteredPackage)theEObject;
        T result = caseRegisteredPackage(registeredPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.PROCESSOR:
      {
        Processor processor = (Processor)theEObject;
        T result = caseProcessor(processor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.WEAVER:
      {
        Weaver weaver = (Weaver)theEObject;
        T result = caseWeaver(weaver);
        if (result == null) result = caseProcessor(weaver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.ASPECT_MODEL:
      {
        AspectModel aspectModel = (AspectModel)theEObject;
        T result = caseAspectModel(aspectModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.GENERATOR:
      {
        Generator generator = (Generator)theEObject;
        T result = caseGenerator(generator);
        if (result == null) result = caseProcessor(generator);
        if (result == null) result = caseAspectModel(generator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.SOURCE_MODEL_NODE_SELECTOR:
      {
        SourceModelNodeSelector sourceModelNodeSelector = (SourceModelNodeSelector)theEObject;
        T result = caseSourceModelNodeSelector(sourceModelNodeSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE:
      {
        TargetModelNodeType targetModelNodeType = (TargetModelNodeType)theEObject;
        T result = caseTargetModelNodeType(targetModelNodeType);
        if (result == null) result = caseAspectModel(targetModelNodeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.MODEL_NODE_TYPE:
      {
        ModelNodeType modelNodeType = (ModelNodeType)theEObject;
        T result = caseModelNodeType(modelNodeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.NODE_PROPERTY:
      {
        NodeProperty nodeProperty = (NodeProperty)theEObject;
        T result = caseNodeProperty(nodeProperty);
        if (result == null) result = caseOperand(nodeProperty);
        if (result == null) result = caseBasicConstraint(nodeProperty);
        if (result == null) result = caseCompareExpression(nodeProperty);
        if (result == null) result = caseConstraintExpression(nodeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.CONSTRAINT_EXPRESSION:
      {
        ConstraintExpression constraintExpression = (ConstraintExpression)theEObject;
        T result = caseConstraintExpression(constraintExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.COMPARE_EXPRESSION:
      {
        CompareExpression compareExpression = (CompareExpression)theEObject;
        T result = caseCompareExpression(compareExpression);
        if (result == null) result = caseConstraintExpression(compareExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.BASIC_CONSTRAINT:
      {
        BasicConstraint basicConstraint = (BasicConstraint)theEObject;
        T result = caseBasicConstraint(basicConstraint);
        if (result == null) result = caseCompareExpression(basicConstraint);
        if (result == null) result = caseConstraintExpression(basicConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.NEGATION:
      {
        Negation negation = (Negation)theEObject;
        T result = caseNegation(negation);
        if (result == null) result = caseBasicConstraint(negation);
        if (result == null) result = caseCompareExpression(negation);
        if (result == null) result = caseConstraintExpression(negation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.PARENTHESIS_CONSTRAINT:
      {
        ParenthesisConstraint parenthesisConstraint = (ParenthesisConstraint)theEObject;
        T result = caseParenthesisConstraint(parenthesisConstraint);
        if (result == null) result = caseBasicConstraint(parenthesisConstraint);
        if (result == null) result = caseCompareExpression(parenthesisConstraint);
        if (result == null) result = caseConstraintExpression(parenthesisConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.OPERAND:
      {
        Operand operand = (Operand)theEObject;
        T result = caseOperand(operand);
        if (result == null) result = caseBasicConstraint(operand);
        if (result == null) result = caseCompareExpression(operand);
        if (result == null) result = caseConstraintExpression(operand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.TYPEOF:
      {
        Typeof typeof = (Typeof)theEObject;
        T result = caseTypeof(typeof);
        if (result == null) result = caseOperand(typeof);
        if (result == null) result = caseBasicConstraint(typeof);
        if (result == null) result = caseCompareExpression(typeof);
        if (result == null) result = caseConstraintExpression(typeof);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.TARGET_TRACE_MODEL:
      {
        TargetTraceModel targetTraceModel = (TargetTraceModel)theEObject;
        T result = caseTargetTraceModel(targetTraceModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.TRACE_MODEL_REFERENCE:
      {
        TraceModelReference traceModelReference = (TraceModelReference)theEObject;
        T result = caseTraceModelReference(traceModelReference);
        if (result == null) result = caseTargetTraceModel(traceModelReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.TRACE_MODEL:
      {
        TraceModel traceModel = (TraceModel)theEObject;
        T result = caseTraceModel(traceModel);
        if (result == null) result = caseTargetTraceModel(traceModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.NODE_SET_RELATION:
      {
        NodeSetRelation nodeSetRelation = (NodeSetRelation)theEObject;
        T result = caseNodeSetRelation(nodeSetRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.NODE_TYPE:
      {
        NodeType nodeType = (NodeType)theEObject;
        T result = caseNodeType(nodeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseOperand(literal);
        if (result == null) result = caseBasicConstraint(literal);
        if (result == null) result = caseCompareExpression(literal);
        if (result == null) result = caseConstraintExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.ARRAY_LITERAL:
      {
        ArrayLiteral arrayLiteral = (ArrayLiteral)theEObject;
        T result = caseArrayLiteral(arrayLiteral);
        if (result == null) result = caseLiteral(arrayLiteral);
        if (result == null) result = caseOperand(arrayLiteral);
        if (result == null) result = caseBasicConstraint(arrayLiteral);
        if (result == null) result = caseCompareExpression(arrayLiteral);
        if (result == null) result = caseConstraintExpression(arrayLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = caseOperand(stringLiteral);
        if (result == null) result = caseBasicConstraint(stringLiteral);
        if (result == null) result = caseCompareExpression(stringLiteral);
        if (result == null) result = caseConstraintExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseLiteral(intLiteral);
        if (result == null) result = caseOperand(intLiteral);
        if (result == null) result = caseBasicConstraint(intLiteral);
        if (result == null) result = caseCompareExpression(intLiteral);
        if (result == null) result = caseConstraintExpression(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.FLOAT_LITERAL:
      {
        FloatLiteral floatLiteral = (FloatLiteral)theEObject;
        T result = caseFloatLiteral(floatLiteral);
        if (result == null) result = caseLiteral(floatLiteral);
        if (result == null) result = caseOperand(floatLiteral);
        if (result == null) result = caseBasicConstraint(floatLiteral);
        if (result == null) result = caseCompareExpression(floatLiteral);
        if (result == null) result = caseConstraintExpression(floatLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitecturePackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseLiteral(booleanLiteral);
        if (result == null) result = caseOperand(booleanLiteral);
        if (result == null) result = caseBasicConstraint(booleanLiteral);
        if (result == null) result = caseCompareExpression(booleanLiteral);
        if (result == null) result = caseConstraintExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metamodel Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metamodel Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetamodelSequence(MetamodelSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetamodel(Metamodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Registered Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Registered Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegisteredPackage(RegisteredPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessor(Processor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weaver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weaver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaver(Weaver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspectModel(AspectModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerator(Generator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source Model Node Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source Model Node Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourceModelNodeSelector(SourceModelNodeSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Model Node Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Model Node Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetModelNodeType(TargetModelNodeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Node Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Node Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelNodeType(ModelNodeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeProperty(NodeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintExpression(ConstraintExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareExpression(CompareExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicConstraint(BasicConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegation(Negation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesis Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesis Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesisConstraint(ParenthesisConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperand(Operand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typeof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typeof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeof(Typeof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Trace Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Trace Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetTraceModel(TargetTraceModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trace Model Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trace Model Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceModelReference(TraceModelReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trace Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trace Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceModel(TraceModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Set Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Set Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeSetRelation(NodeSetRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeType(NodeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayLiteral(ArrayLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatLiteral(FloatLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ArchitectureSwitch
