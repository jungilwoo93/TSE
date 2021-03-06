/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tSE.impl;

import fr.uha.ensisa.project.pan_chabalier.tSE.*;

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
public class TSEFactoryImpl extends EFactoryImpl implements TSEFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TSEFactory init()
  {
    try
    {
      TSEFactory theTSEFactory = (TSEFactory)EPackage.Registry.INSTANCE.getEFactory(TSEPackage.eNS_URI);
      if (theTSEFactory != null)
      {
        return theTSEFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TSEFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TSEFactoryImpl()
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
      case TSEPackage.MODEL: return createModel();
      case TSEPackage.ELEMENT: return createElement();
      case TSEPackage.STATE: return createState();
      case TSEPackage.STATES_PROPERTIES: return createStatesProperties();
      case TSEPackage.TRANSITION: return createTransition();
      case TSEPackage.LABEL: return createLabel();
      case TSEPackage.COORDINATES_STATES_TRANSITION: return createCoordinatesStatesTransition();
      case TSEPackage.TRANSITION_PROPERTIES: return createTransitionProperties();
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
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesProperties createStatesProperties()
  {
    StatesPropertiesImpl statesProperties = new StatesPropertiesImpl();
    return statesProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoordinatesStatesTransition createCoordinatesStatesTransition()
  {
    CoordinatesStatesTransitionImpl coordinatesStatesTransition = new CoordinatesStatesTransitionImpl();
    return coordinatesStatesTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionProperties createTransitionProperties()
  {
    TransitionPropertiesImpl transitionProperties = new TransitionPropertiesImpl();
    return transitionProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TSEPackage getTSEPackage()
  {
    return (TSEPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TSEPackage getPackage()
  {
    return TSEPackage.eINSTANCE;
  }

} //TSEFactoryImpl
