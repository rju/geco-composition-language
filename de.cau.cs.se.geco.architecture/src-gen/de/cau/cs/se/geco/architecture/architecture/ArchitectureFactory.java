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
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Weaver Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weaver Import</em>'.
   * @generated
   */
  WeaverImport createWeaverImport();

  /**
   * Returns a new object of class '<em>Generator Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generator Import</em>'.
   * @generated
   */
  GeneratorImport createGeneratorImport();

  /**
   * Returns a new object of class '<em>Metamodel Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel Sequence</em>'.
   * @generated
   */
  MetamodelSequence createMetamodelSequence();

  /**
   * Returns a new object of class '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel</em>'.
   * @generated
   */
  Metamodel createMetamodel();

  /**
   * Returns a new object of class '<em>Connection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection</em>'.
   * @generated
   */
  Connection createConnection();

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
   * Returns a new object of class '<em>Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generator</em>'.
   * @generated
   */
  Generator createGenerator();

  /**
   * Returns a new object of class '<em>Source Model Node Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Model Node Selector</em>'.
   * @generated
   */
  SourceModelNodeSelector createSourceModelNodeSelector();

  /**
   * Returns a new object of class '<em>Target Model Node Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Model Node Type</em>'.
   * @generated
   */
  TargetModelNodeType createTargetModelNodeType();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArchitecturePackage getArchitecturePackage();

} //ArchitectureFactory
