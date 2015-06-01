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
   * Returns a new object of class '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel</em>'.
   * @generated
   */
  Metamodel createMetamodel();

  /**
   * Returns a new object of class '<em>Source Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Metamodel</em>'.
   * @generated
   */
  SourceMetamodel createSourceMetamodel();

  /**
   * Returns a new object of class '<em>Target Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Metamodel</em>'.
   * @generated
   */
  TargetMetamodel createTargetMetamodel();

  /**
   * Returns a new object of class '<em>Intermediate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intermediate</em>'.
   * @generated
   */
  Intermediate createIntermediate();

  /**
   * Returns a new object of class '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source</em>'.
   * @generated
   */
  Source createSource();

  /**
   * Returns a new object of class '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target</em>'.
   * @generated
   */
  Target createTarget();

  /**
   * Returns a new object of class '<em>Metamodel Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel Location</em>'.
   * @generated
   */
  MetamodelLocation createMetamodelLocation();

  /**
   * Returns a new object of class '<em>Connection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection</em>'.
   * @generated
   */
  Connection createConnection();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArchitecturePackage getArchitecturePackage();

} //ArchitectureFactory
