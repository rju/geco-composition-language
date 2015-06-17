/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Comparator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getEQ <em>EQ</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getNE <em>NE</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getGR <em>GR</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getLW <em>LW</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getGE <em>GE</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getLE <em>LE</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.ComparatorImpl#getLIKE <em>LIKE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparatorImpl extends MinimalEObjectImpl.Container implements Comparator
{
  /**
   * The default value of the '{@link #getEQ() <em>EQ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEQ()
   * @generated
   * @ordered
   */
  protected static final String EQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEQ() <em>EQ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEQ()
   * @generated
   * @ordered
   */
  protected String eq = EQ_EDEFAULT;

  /**
   * The default value of the '{@link #getNE() <em>NE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNE()
   * @generated
   * @ordered
   */
  protected static final String NE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNE() <em>NE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNE()
   * @generated
   * @ordered
   */
  protected String ne = NE_EDEFAULT;

  /**
   * The default value of the '{@link #getGR() <em>GR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGR()
   * @generated
   * @ordered
   */
  protected static final String GR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGR() <em>GR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGR()
   * @generated
   * @ordered
   */
  protected String gr = GR_EDEFAULT;

  /**
   * The default value of the '{@link #getLW() <em>LW</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLW()
   * @generated
   * @ordered
   */
  protected static final String LW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLW() <em>LW</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLW()
   * @generated
   * @ordered
   */
  protected String lw = LW_EDEFAULT;

  /**
   * The default value of the '{@link #getGE() <em>GE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGE()
   * @generated
   * @ordered
   */
  protected static final String GE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGE() <em>GE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGE()
   * @generated
   * @ordered
   */
  protected String ge = GE_EDEFAULT;

  /**
   * The default value of the '{@link #getLE() <em>LE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLE()
   * @generated
   * @ordered
   */
  protected static final String LE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLE() <em>LE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLE()
   * @generated
   * @ordered
   */
  protected String le = LE_EDEFAULT;

  /**
   * The default value of the '{@link #getLIKE() <em>LIKE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLIKE()
   * @generated
   * @ordered
   */
  protected static final String LIKE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLIKE() <em>LIKE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLIKE()
   * @generated
   * @ordered
   */
  protected String like = LIKE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparatorImpl()
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
    return ArchitecturePackage.Literals.COMPARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEQ()
  {
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEQ(String newEQ)
  {
    String oldEQ = eq;
    eq = newEQ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__EQ, oldEQ, eq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNE()
  {
    return ne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNE(String newNE)
  {
    String oldNE = ne;
    ne = newNE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__NE, oldNE, ne));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGR()
  {
    return gr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGR(String newGR)
  {
    String oldGR = gr;
    gr = newGR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__GR, oldGR, gr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLW()
  {
    return lw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLW(String newLW)
  {
    String oldLW = lw;
    lw = newLW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__LW, oldLW, lw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGE()
  {
    return ge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGE(String newGE)
  {
    String oldGE = ge;
    ge = newGE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__GE, oldGE, ge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLE()
  {
    return le;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLE(String newLE)
  {
    String oldLE = le;
    le = newLE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__LE, oldLE, le));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLIKE()
  {
    return like;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLIKE(String newLIKE)
  {
    String oldLIKE = like;
    like = newLIKE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPARATOR__LIKE, oldLIKE, like));
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
      case ArchitecturePackage.COMPARATOR__EQ:
        return getEQ();
      case ArchitecturePackage.COMPARATOR__NE:
        return getNE();
      case ArchitecturePackage.COMPARATOR__GR:
        return getGR();
      case ArchitecturePackage.COMPARATOR__LW:
        return getLW();
      case ArchitecturePackage.COMPARATOR__GE:
        return getGE();
      case ArchitecturePackage.COMPARATOR__LE:
        return getLE();
      case ArchitecturePackage.COMPARATOR__LIKE:
        return getLIKE();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.COMPARATOR__EQ:
        setEQ((String)newValue);
        return;
      case ArchitecturePackage.COMPARATOR__NE:
        setNE((String)newValue);
        return;
      case ArchitecturePackage.COMPARATOR__GR:
        setGR((String)newValue);
        return;
      case ArchitecturePackage.COMPARATOR__LW:
        setLW((String)newValue);
        return;
      case ArchitecturePackage.COMPARATOR__GE:
        setGE((String)newValue);
        return;
      case ArchitecturePackage.COMPARATOR__LE:
        setLE((String)newValue);
        return;
      case ArchitecturePackage.COMPARATOR__LIKE:
        setLIKE((String)newValue);
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
      case ArchitecturePackage.COMPARATOR__EQ:
        setEQ(EQ_EDEFAULT);
        return;
      case ArchitecturePackage.COMPARATOR__NE:
        setNE(NE_EDEFAULT);
        return;
      case ArchitecturePackage.COMPARATOR__GR:
        setGR(GR_EDEFAULT);
        return;
      case ArchitecturePackage.COMPARATOR__LW:
        setLW(LW_EDEFAULT);
        return;
      case ArchitecturePackage.COMPARATOR__GE:
        setGE(GE_EDEFAULT);
        return;
      case ArchitecturePackage.COMPARATOR__LE:
        setLE(LE_EDEFAULT);
        return;
      case ArchitecturePackage.COMPARATOR__LIKE:
        setLIKE(LIKE_EDEFAULT);
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
      case ArchitecturePackage.COMPARATOR__EQ:
        return EQ_EDEFAULT == null ? eq != null : !EQ_EDEFAULT.equals(eq);
      case ArchitecturePackage.COMPARATOR__NE:
        return NE_EDEFAULT == null ? ne != null : !NE_EDEFAULT.equals(ne);
      case ArchitecturePackage.COMPARATOR__GR:
        return GR_EDEFAULT == null ? gr != null : !GR_EDEFAULT.equals(gr);
      case ArchitecturePackage.COMPARATOR__LW:
        return LW_EDEFAULT == null ? lw != null : !LW_EDEFAULT.equals(lw);
      case ArchitecturePackage.COMPARATOR__GE:
        return GE_EDEFAULT == null ? ge != null : !GE_EDEFAULT.equals(ge);
      case ArchitecturePackage.COMPARATOR__LE:
        return LE_EDEFAULT == null ? le != null : !LE_EDEFAULT.equals(le);
      case ArchitecturePackage.COMPARATOR__LIKE:
        return LIKE_EDEFAULT == null ? like != null : !LIKE_EDEFAULT.equals(like);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (EQ: ");
    result.append(eq);
    result.append(", NE: ");
    result.append(ne);
    result.append(", GR: ");
    result.append(gr);
    result.append(", LW: ");
    result.append(lw);
    result.append(", GE: ");
    result.append(ge);
    result.append(", LE: ");
    result.append(le);
    result.append(", LIKE: ");
    result.append(like);
    result.append(')');
    return result.toString();
  }

} //ComparatorImpl
