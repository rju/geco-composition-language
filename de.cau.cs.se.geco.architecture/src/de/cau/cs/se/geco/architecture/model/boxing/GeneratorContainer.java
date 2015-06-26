/**
 */
package de.cau.cs.se.geco.architecture.model.boxing;

import de.cau.cs.se.geco.architecture.architecture.Generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer#getInvocations <em>Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGeneratorContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeneratorContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Invocations</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.geco.architecture.architecture.Generator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocations</em>' reference list.
	 * @see de.cau.cs.se.geco.architecture.model.boxing.BoxingPackage#getGeneratorContainer_Invocations()
	 * @model
	 * @generated
	 */
	EList<Generator> getInvocations();

} // GeneratorContainer
