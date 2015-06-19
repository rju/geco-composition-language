/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.*;

import org.eclipse.emf.ecore.EClass;
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
      case ArchitecturePackage.WEAVER_IMPORT: return createWeaverImport();
      case ArchitecturePackage.GENERATOR_IMPORT: return createGeneratorImport();
      case ArchitecturePackage.METAMODEL_SEQUENCE: return createMetamodelSequence();
      case ArchitecturePackage.METAMODEL: return createMetamodel();
      case ArchitecturePackage.CONNECTION: return createConnection();
      case ArchitecturePackage.WEAVER: return createWeaver();
      case ArchitecturePackage.ASPECT_MODEL: return createAspectModel();
      case ArchitecturePackage.GENERATOR: return createGenerator();
      case ArchitecturePackage.SOURCE_MODEL_NODE_SELECTOR: return createSourceModelNodeSelector();
      case ArchitecturePackage.TARGET_MODEL_NODE_TYPE: return createTargetModelNodeType();
      case ArchitecturePackage.TRACE_MODEL: return createTraceModel();
      case ArchitecturePackage.NODE_SET_RELATION: return createNodeSetRelation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public WeaverImport createWeaverImport()
  {
    WeaverImportImpl weaverImport = new WeaverImportImpl();
    return weaverImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneratorImport createGeneratorImport()
  {
    GeneratorImportImpl generatorImport = new GeneratorImportImpl();
    return generatorImport;
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
  public Connection createConnection()
  {
    ConnectionImpl connection = new ConnectionImpl();
    return connection;
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
