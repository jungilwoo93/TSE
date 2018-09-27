/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tse.tSE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.TSEFactory
 * @model kind="package"
 * @generated
 */
public interface TSEPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tSE";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uha.fr/ensisa/project/pan_chabalier/tse/TSE";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tSE";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TSEPackage eINSTANCE = fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ModelImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ElementImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__STATES = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StateImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>States Propriety</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATES_PROPRIETY = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StatesPropertiesImpl <em>States Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StatesPropertiesImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getStatesProperties()
   * @generated
   */
  int STATES_PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_PROPERTIES__COLOR = 0;

  /**
   * The feature id for the '<em><b>Thickness</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_PROPERTIES__THICKNESS = 1;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_PROPERTIES__POSITION = 2;

  /**
   * The number of structural features of the '<em>States Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_PROPERTIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__END = 1;

  /**
   * The feature id for the '<em><b>Propriety States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__PROPRIETY_STATES = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__LABEL = 3;

  /**
   * The feature id for the '<em><b>Init</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__INIT = 4;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.EndTransitionImpl <em>End Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.EndTransitionImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getEndTransition()
   * @generated
   */
  int END_TRANSITION = 5;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_TRANSITION__END = 0;

  /**
   * The number of structural features of the '<em>End Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_TRANSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.transitionPropertiesImpl <em>transition Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.transitionPropertiesImpl
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#gettransitionProperties()
   * @generated
   */
  int TRANSITION_PROPERTIES = 6;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_PROPERTIES__COLOR = 0;

  /**
   * The feature id for the '<em><b>Thickness</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_PROPERTIES__THICKNESS = 1;

  /**
   * The feature id for the '<em><b>Curve</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_PROPERTIES__CURVE = 2;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_PROPERTIES__POSITION = 3;

  /**
   * The number of structural features of the '<em>transition Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_PROPERTIES_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element#getStates()
   * @see #getElement()
   * @generated
   */
  EReference getElement_States();

  /**
   * Returns the meta object for the containment reference list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element#getTransitions()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Transitions();

  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.State#getStatesPropriety <em>States Propriety</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States Propriety</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.State#getStatesPropriety()
   * @see #getState()
   * @generated
   */
  EReference getState_StatesPropriety();

  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties <em>States Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States Properties</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties
   * @generated
   */
  EClass getStatesProperties();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Color</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties#getColor()
   * @see #getStatesProperties()
   * @generated
   */
  EAttribute getStatesProperties_Color();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties#getThickness <em>Thickness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Thickness</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties#getThickness()
   * @see #getStatesProperties()
   * @generated
   */
  EAttribute getStatesProperties_Thickness();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Position</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties#getPosition()
   * @see #getStatesProperties()
   * @generated
   */
  EAttribute getStatesProperties_Position();

  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Start</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getStart()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Start();

  /**
   * Returns the meta object for the containment reference list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>End</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getEnd()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_End();

  /**
   * Returns the meta object for the containment reference list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getProprietyStates <em>Propriety States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Propriety States</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getProprietyStates()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_ProprietyStates();

  /**
   * Returns the meta object for the attribute '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getLabel()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Label();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Init</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.Transition#getInit()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Init();

  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.EndTransition <em>End Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Transition</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.EndTransition
   * @generated
   */
  EClass getEndTransition();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.EndTransition#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>End</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.EndTransition#getEnd()
   * @see #getEndTransition()
   * @generated
   */
  EAttribute getEndTransition_End();

  /**
   * Returns the meta object for class '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties <em>transition Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>transition Properties</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties
   * @generated
   */
  EClass gettransitionProperties();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Color</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getColor()
   * @see #gettransitionProperties()
   * @generated
   */
  EAttribute gettransitionProperties_Color();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getThickness <em>Thickness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Thickness</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getThickness()
   * @see #gettransitionProperties()
   * @generated
   */
  EAttribute gettransitionProperties_Thickness();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getCurve <em>Curve</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Curve</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getCurve()
   * @see #gettransitionProperties()
   * @generated
   */
  EAttribute gettransitionProperties_Curve();

  /**
   * Returns the meta object for the attribute list '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Position</em>'.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getPosition()
   * @see #gettransitionProperties()
   * @generated
   */
  EAttribute gettransitionProperties_Position();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TSEFactory getTSEFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ModelImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.ElementImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__STATES = eINSTANCE.getElement_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__TRANSITIONS = eINSTANCE.getElement_Transitions();

    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StateImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>States Propriety</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATES_PROPRIETY = eINSTANCE.getState_StatesPropriety();

    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StatesPropertiesImpl <em>States Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.StatesPropertiesImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getStatesProperties()
     * @generated
     */
    EClass STATES_PROPERTIES = eINSTANCE.getStatesProperties();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES_PROPERTIES__COLOR = eINSTANCE.getStatesProperties_Color();

    /**
     * The meta object literal for the '<em><b>Thickness</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES_PROPERTIES__THICKNESS = eINSTANCE.getStatesProperties_Thickness();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES_PROPERTIES__POSITION = eINSTANCE.getStatesProperties_Position();

    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TransitionImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__START = eINSTANCE.getTransition_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__END = eINSTANCE.getTransition_End();

    /**
     * The meta object literal for the '<em><b>Propriety States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__PROPRIETY_STATES = eINSTANCE.getTransition_ProprietyStates();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__INIT = eINSTANCE.getTransition_Init();

    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.EndTransitionImpl <em>End Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.EndTransitionImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#getEndTransition()
     * @generated
     */
    EClass END_TRANSITION = eINSTANCE.getEndTransition();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_TRANSITION__END = eINSTANCE.getEndTransition_End();

    /**
     * The meta object literal for the '{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.transitionPropertiesImpl <em>transition Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.transitionPropertiesImpl
     * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.impl.TSEPackageImpl#gettransitionProperties()
     * @generated
     */
    EClass TRANSITION_PROPERTIES = eINSTANCE.gettransitionProperties();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_PROPERTIES__COLOR = eINSTANCE.gettransitionProperties_Color();

    /**
     * The meta object literal for the '<em><b>Thickness</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_PROPERTIES__THICKNESS = eINSTANCE.gettransitionProperties_Thickness();

    /**
     * The meta object literal for the '<em><b>Curve</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_PROPERTIES__CURVE = eINSTANCE.gettransitionProperties_Curve();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_PROPERTIES__POSITION = eINSTANCE.gettransitionProperties_Position();

  }

} //TSEPackage
