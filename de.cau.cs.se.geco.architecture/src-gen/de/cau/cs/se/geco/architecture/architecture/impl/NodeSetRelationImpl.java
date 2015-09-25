/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation;
import de.cau.cs.se.geco.architecture.architecture.NodeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Set Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl#getSourceNodes <em>Source Nodes</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.NodeSetRelationImpl#getTargetNodes <em>Target Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSetRelationImpl extends MinimalEObjectImpl.Container implements NodeSetRelation
{
  /**
   * The cached value of the '{@link #getSourceNodes() <em>Source Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceNodes()
   * @generated
   * @ordered
   */
  protected EList<NodeType> sourceNodes;

  /**
   * The cached value of the '{@link #getTargetNodes() <em>Target Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNodes()
   * @generated
   * @ordered
   */
  protected EList<NodeType> targetNodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeSetRelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchitecturePackage.Literals.NODE_SET_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeType> getSourceNodes()
  {
    if (sourceNodes == null)
    {
      sourceNodes = new EObjectContainmentEList<NodeType>(NodeType.class, this, ArchitecturePackage.NODE_SET_RELATION__SOURCE_NODES);
    }
    return sourceNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeType> getTargetNodes()
  {
    if (targetNodes == null)
    {
      targetNodes = new EObjectContainmentEList<NodeType>(NodeType.class, this, ArchitecturePackage.NODE_SET_RELATION__TARGET_NODES);
    }
    return targetNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArchitecturePackage.NODE_SET_RELATION__SOURCE_NODES:
        return ((InternalEList<?>)getSourceNodes()).basicRemove(otherEnd, msgs);
      case ArchitecturePackage.NODE_SET_RELATION__TARGET_NODES:
        return ((InternalEList<?>)getTargetNodes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchitecturePackage.NODE_SET_RELATION__SOURCE_NODES:
        return getSourceNodes();
      case ArchitecturePackage.NODE_SET_RELATION__TARGET_NODES:
        return getTargetNodes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.NODE_SET_RELATION__SOURCE_NODES:
        getSourceNodes().clear();
        getSourceNodes().addAll((Collection<? extends NodeType>)newValue);
        return;
      case ArchitecturePackage.NODE_SET_RELATION__TARGET_NODES:
        getTargetNodes().clear();
        getTargetNodes().addAll((Collection<? extends NodeType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.NODE_SET_RELATION__SOURCE_NODES:
        getSourceNodes().clear();
        return;
      case ArchitecturePackage.NODE_SET_RELATION__TARGET_NODES:
        getTargetNodes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.NODE_SET_RELATION__SOURCE_NODES:
        return sourceNodes != null && !sourceNodes.isEmpty();
      case ArchitecturePackage.NODE_SET_RELATION__TARGET_NODES:
        return targetNodes != null && !targetNodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeSetRelationImpl
