/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.impl;

import de.cau.cs.se.geco.architecture.model.boxing.*;

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
public class BoxingFactoryImpl extends EFactoryImpl implements BoxingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BoxingFactory init() {
		try {
			BoxingFactory theBoxingFactory = (BoxingFactory)EPackage.Registry.INSTANCE.getEFactory(BoxingPackage.eNS_URI);
			if (theBoxingFactory != null) {
				return theBoxingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BoxingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BoxingPackage.BOXING_MODEL: return createBoxingModel();
			case BoxingPackage.TRANSFORMATION: return createTransformation();
			case BoxingPackage.ROOT_MODEL_NODE: return createRootModelNode();
			case BoxingPackage.PROPERTY_MODEL_NODE: return createPropertyModelNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxingModel createBoxingModel() {
		BoxingModelImpl boxingModel = new BoxingModelImpl();
		return boxingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootModelNode createRootModelNode() {
		RootModelNodeImpl rootModelNode = new RootModelNodeImpl();
		return rootModelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyModelNode createPropertyModelNode() {
		PropertyModelNodeImpl propertyModelNode = new PropertyModelNodeImpl();
		return propertyModelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxingPackage getBoxingPackage() {
		return (BoxingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BoxingPackage getPackage() {
		return BoxingPackage.eINSTANCE;
	}

} //BoxingFactoryImpl
