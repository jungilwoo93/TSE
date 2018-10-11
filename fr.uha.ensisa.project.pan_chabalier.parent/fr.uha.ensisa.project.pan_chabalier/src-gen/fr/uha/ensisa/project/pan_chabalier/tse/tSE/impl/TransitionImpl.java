/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl;

import fr.uha.ensisa.project.pan_chabalier.tse.tSE.CoordinatesStatesTransition;
import fr.uha.ensisa.project.pan_chabalier.tse.tSE.Label;
import fr.uha.ensisa.project.pan_chabalier.tse.tSE.TSEPackage;
import fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition;
import fr.uha.ensisa.project.pan_chabalier.tse.tSE.TransitionProperties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl#getTransitionProperties <em>Transition Properties</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected CoordinatesStatesTransition start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected CoordinatesStatesTransition end;

  /**
   * The cached value of the '{@link #getTransitionProperties() <em>Transition Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionProperties()
   * @generated
   * @ordered
   */
  protected EList<TransitionProperties> transitionProperties;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected Label label;

  /**
   * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected static final String INIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected String init = INIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return TSEPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoordinatesStatesTransition getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(CoordinatesStatesTransition newStart, NotificationChain msgs)
  {
    CoordinatesStatesTransition oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(CoordinatesStatesTransition newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSEPackage.TRANSITION__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSEPackage.TRANSITION__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoordinatesStatesTransition getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(CoordinatesStatesTransition newEnd, NotificationChain msgs)
  {
    CoordinatesStatesTransition oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(CoordinatesStatesTransition newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSEPackage.TRANSITION__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSEPackage.TRANSITION__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__END, newEnd, newEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionProperties> getTransitionProperties()
  {
    if (transitionProperties == null)
    {
      transitionProperties = new EObjectContainmentEList<TransitionProperties>(TransitionProperties.class, this, TSEPackage.TRANSITION__TRANSITION_PROPERTIES);
    }
    return transitionProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs)
  {
    Label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(Label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSEPackage.TRANSITION__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSEPackage.TRANSITION__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(String newInit)
  {
    String oldInit = init;
    init = newInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TSEPackage.TRANSITION__INIT, oldInit, init));
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
      case TSEPackage.TRANSITION__START:
        return basicSetStart(null, msgs);
      case TSEPackage.TRANSITION__END:
        return basicSetEnd(null, msgs);
      case TSEPackage.TRANSITION__TRANSITION_PROPERTIES:
        return ((InternalEList<?>)getTransitionProperties()).basicRemove(otherEnd, msgs);
      case TSEPackage.TRANSITION__LABEL:
        return basicSetLabel(null, msgs);
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
      case TSEPackage.TRANSITION__NAME:
        return getName();
      case TSEPackage.TRANSITION__START:
        return getStart();
      case TSEPackage.TRANSITION__END:
        return getEnd();
      case TSEPackage.TRANSITION__TRANSITION_PROPERTIES:
        return getTransitionProperties();
      case TSEPackage.TRANSITION__LABEL:
        return getLabel();
      case TSEPackage.TRANSITION__INIT:
        return getInit();
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
      case TSEPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case TSEPackage.TRANSITION__START:
        setStart((CoordinatesStatesTransition)newValue);
        return;
      case TSEPackage.TRANSITION__END:
        setEnd((CoordinatesStatesTransition)newValue);
        return;
      case TSEPackage.TRANSITION__TRANSITION_PROPERTIES:
        getTransitionProperties().clear();
        getTransitionProperties().addAll((Collection<? extends TransitionProperties>)newValue);
        return;
      case TSEPackage.TRANSITION__LABEL:
        setLabel((Label)newValue);
        return;
      case TSEPackage.TRANSITION__INIT:
        setInit((String)newValue);
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
      case TSEPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TSEPackage.TRANSITION__START:
        setStart((CoordinatesStatesTransition)null);
        return;
      case TSEPackage.TRANSITION__END:
        setEnd((CoordinatesStatesTransition)null);
        return;
      case TSEPackage.TRANSITION__TRANSITION_PROPERTIES:
        getTransitionProperties().clear();
        return;
      case TSEPackage.TRANSITION__LABEL:
        setLabel((Label)null);
        return;
      case TSEPackage.TRANSITION__INIT:
        setInit(INIT_EDEFAULT);
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
      case TSEPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TSEPackage.TRANSITION__START:
        return start != null;
      case TSEPackage.TRANSITION__END:
        return end != null;
      case TSEPackage.TRANSITION__TRANSITION_PROPERTIES:
        return transitionProperties != null && !transitionProperties.isEmpty();
      case TSEPackage.TRANSITION__LABEL:
        return label != null;
      case TSEPackage.TRANSITION__INIT:
        return INIT_EDEFAULT == null ? init != null : !INIT_EDEFAULT.equals(init);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", init: ");
    result.append(init);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
