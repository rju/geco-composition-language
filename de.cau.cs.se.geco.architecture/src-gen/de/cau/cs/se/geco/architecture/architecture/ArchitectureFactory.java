/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage
 * @generated
 */
public interface ArchitectureFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchitectureFactory eINSTANCE = de.cau.cs.se.geco.architecture.architecture.impl.ArchitectureFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Geco Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geco Model</em>'.
   * @generated
   */
  GecoModel createGecoModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Registered Root Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Registered Root Class</em>'.
   * @generated
   */
  RegisteredRootClass createRegisteredRootClass();

  /**
   * Returns a new object of class '<em>Model Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Sequence</em>'.
   * @generated
   */
  ModelSequence createModelSequence();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fragment</em>'.
   * @generated
   */
  Fragment createFragment();

  /**
   * Returns a new object of class '<em>Weaver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weaver</em>'.
   * @generated
   */
  Weaver createWeaver();

  /**
   * Returns a new object of class '<em>Aspect Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect Model</em>'.
   * @generated
   */
  AspectModel createAspectModel();

  /**
   * Returns a new object of class '<em>Separate Models</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Separate Models</em>'.
   * @generated
   */
  SeparateModels createSeparateModels();

  /**
   * Returns a new object of class '<em>Combined Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combined Model</em>'.
   * @generated
   */
  CombinedModel createCombinedModel();

  /**
   * Returns a new object of class '<em>Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generator</em>'.
   * @generated
   */
  Generator createGenerator();

  /**
   * Returns a new object of class '<em>Source Model Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Model Selector</em>'.
   * @generated
   */
  SourceModelSelector createSourceModelSelector();

  /**
   * Returns a new object of class '<em>Target Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Model</em>'.
   * @generated
   */
  TargetModel createTargetModel();

  /**
   * Returns a new object of class '<em>Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Type</em>'.
   * @generated
   */
  ModelType createModelType();

  /**
   * Returns a new object of class '<em>Node Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Property</em>'.
   * @generated
   */
  NodeProperty createNodeProperty();

  /**
   * Returns a new object of class '<em>Constraint Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Expression</em>'.
   * @generated
   */
  ConstraintExpression createConstraintExpression();

  /**
   * Returns a new object of class '<em>Compare Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare Expression</em>'.
   * @generated
   */
  CompareExpression createCompareExpression();

  /**
   * Returns a new object of class '<em>Basic Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Constraint</em>'.
   * @generated
   */
  BasicConstraint createBasicConstraint();

  /**
   * Returns a new object of class '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negation</em>'.
   * @generated
   */
  Negation createNegation();

  /**
   * Returns a new object of class '<em>Parenthesis Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesis Constraint</em>'.
   * @generated
   */
  ParenthesisConstraint createParenthesisConstraint();

  /**
   * Returns a new object of class '<em>Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operand</em>'.
   * @generated
   */
  Operand createOperand();

  /**
   * Returns a new object of class '<em>Instance Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Of</em>'.
   * @generated
   */
  InstanceOf createInstanceOf();

  /**
   * Returns a new object of class '<em>Target Trace Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Trace Model</em>'.
   * @generated
   */
  TargetTraceModel createTargetTraceModel();

  /**
   * Returns a new object of class '<em>Trace Model Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trace Model Reference</em>'.
   * @generated
   */
  TraceModelReference createTraceModelReference();

  /**
   * Returns a new object of class '<em>Trace Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trace Model</em>'.
   * @generated
   */
  TraceModel createTraceModel();

  /**
   * Returns a new object of class '<em>Node Set Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Set Relation</em>'.
   * @generated
   */
  NodeSetRelation createNodeSetRelation();

  /**
   * Returns a new object of class '<em>Node Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Type</em>'.
   * @generated
   */
  NodeType createNodeType();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Array Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Literal</em>'.
   * @generated
   */
  ArrayLiteral createArrayLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  FloatLiteral createFloatLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArchitecturePackage getArchitecturePackage();

} //ArchitectureFactory
