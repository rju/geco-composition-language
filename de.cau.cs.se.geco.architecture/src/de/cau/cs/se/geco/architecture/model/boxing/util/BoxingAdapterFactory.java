/**
 */
package de.cau.cs.se.geco.architecture.model.boxing.util;

import de.cau.cs.se.geco.architecture.model.boxing.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage
 * @generated
 */
public class BoxingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BoxingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BoxingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxingSwitch<Adapter> modelSwitch =
		new BoxingSwitch<Adapter>() {
			@Override
			public Adapter caseBoxingModel(BoxingModel object) {
				return createBoxingModelAdapter();
			}
			@Override
			public Adapter caseGeneratorContainer(GeneratorContainer object) {
				return createGeneratorContainerAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseBoxingModelNode(BoxingModelNode object) {
				return createBoxingModelNodeAdapter();
			}
			@Override
			public Adapter caseRootModelNode(RootModelNode object) {
				return createRootModelNodeAdapter();
			}
			@Override
			public Adapter casePropertyModelNode(PropertyModelNode object) {
				return createPropertyModelNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModel
	 * @generated
	 */
	public Adapter createBoxingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer <em>Generator Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer
	 * @generated
	 */
	public Adapter createGeneratorContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.se.geco.architecture.model.boxing.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode <em>Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode
	 * @generated
	 */
	public Adapter createBoxingModelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.se.geco.architecture.model.boxing.RootModelNode <em>Root Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.RootModelNode
	 * @generated
	 */
	public Adapter createRootModelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode <em>Property Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode
	 * @generated
	 */
	public Adapter createPropertyModelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BoxingAdapterFactory
