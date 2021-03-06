/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tSE.impl;

import fr.uha.ensisa.project.pan_chabalier.tSE.StatesProperties;
import fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>States Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.impl.StatesPropertiesImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.impl.StatesPropertiesImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.impl.StatesPropertiesImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatesPropertiesImpl extends MinimalEObjectImpl.Container implements StatesProperties
{
  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final String COLOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected String color = COLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThickness()
   * @generated
   * @ordered
   */
  protected static final String THICKNESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThickness()
   * @generated
   * @ordered
   */
  protected String thickness = THICKNESS_EDEFAULT;

  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final String POSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected String position = POSITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatesPropertiesImpl()
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
    return TSEPackage.Literals.STATES_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(String newColor)
  {
    String oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.STATES_PROPERTIES__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThickness()
  {
    return thickness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThickness(String newThickness)
  {
    String oldThickness = thickness;
    thickness = newThickness;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.STATES_PROPERTIES__THICKNESS, oldThickness, thickness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(String newPosition)
  {
    String oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.STATES_PROPERTIES__POSITION, oldPosition, position));
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
      case TSEPackage.STATES_PROPERTIES__COLOR:
        return getColor();
      case TSEPackage.STATES_PROPERTIES__THICKNESS:
        return getThickness();
      case TSEPackage.STATES_PROPERTIES__POSITION:
        return getPosition();
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
      case TSEPackage.STATES_PROPERTIES__COLOR:
        setColor((String)newValue);
        return;
      case TSEPackage.STATES_PROPERTIES__THICKNESS:
        setThickness((String)newValue);
        return;
      case TSEPackage.STATES_PROPERTIES__POSITION:
        setPosition((String)newValue);
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
      case TSEPackage.STATES_PROPERTIES__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case TSEPackage.STATES_PROPERTIES__THICKNESS:
        setThickness(THICKNESS_EDEFAULT);
        return;
      case TSEPackage.STATES_PROPERTIES__POSITION:
        setPosition(POSITION_EDEFAULT);
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
      case TSEPackage.STATES_PROPERTIES__COLOR:
        return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
      case TSEPackage.STATES_PROPERTIES__THICKNESS:
        return THICKNESS_EDEFAULT == null ? thickness != null : !THICKNESS_EDEFAULT.equals(thickness);
      case TSEPackage.STATES_PROPERTIES__POSITION:
        return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
    result.append(" (color: ");
    result.append(color);
    result.append(", thickness: ");
    result.append(thickness);
    result.append(", position: ");
    result.append(position);
    result.append(')');
    return result.toString();
  }

} //StatesPropertiesImpl
