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
      case ArchitecturePackage.METAMODEL: return createMetamodel();
      case ArchitecturePackage.SOURCE_METAMODEL: return createSourceMetamodel();
      case ArchitecturePackage.TARGET_METAMODEL: return createTargetMetamodel();
      case ArchitecturePackage.INTERMEDIATE: return createIntermediate();
      case ArchitecturePackage.SOURCE: return createSource();
      case ArchitecturePackage.TARGET: return createTarget();
      case ArchitecturePackage.METAMODEL_LOCATION: return createMetamodelLocation();
      case ArchitecturePackage.CONNECTION: return createConnection();
      case ArchitecturePackage.TRACE_MODEL: return createTraceModel();
      case ArchitecturePackage.NODE_SET_RELATION: return createNodeSetRelation();
      case ArchitecturePackage.NODE_TYPE: return createNodeType();
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
      case ArchitecturePackage.MODEL_MULTIPLICITY:
        return createModelMultiplicityFromString(eDataType, initialValue);
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
      case ArchitecturePackage.MODEL_MULTIPLICITY:
        return convertModelMultiplicityToString(eDataType, instanceValue);
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
  public SourceMetamodel createSourceMetamodel()
  {
    SourceMetamodelImpl sourceMetamodel = new SourceMetamodelImpl();
    return sourceMetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetMetamodel createTargetMetamodel()
  {
    TargetMetamodelImpl targetMetamodel = new TargetMetamodelImpl();
    return targetMetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intermediate createIntermediate()
  {
    IntermediateImpl intermediate = new IntermediateImpl();
    return intermediate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelLocation createMetamodelLocation()
  {
    MetamodelLocationImpl metamodelLocation = new MetamodelLocationImpl();
    return metamodelLocation;
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
  public ModelMultiplicity createModelMultiplicityFromString(EDataType eDataType, String initialValue)
  {
    ModelMultiplicity result = ModelMultiplicity.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModelMultiplicityToString(EDataType eDataType, Object instanceValue)
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
