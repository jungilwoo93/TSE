/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tSE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getStart <em>Start</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getEnd <em>End</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getTransitionProperties <em>Transition Properties</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(CoordinatesStatesTransition)
   * @see fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage#getTransition_Start()
   * @model containment="true"
   * @generated
   */
  CoordinatesStatesTransition getStart();

  /**
   * Sets the value of the '{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(CoordinatesStatesTransition value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(CoordinatesStatesTransition)
   * @see fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage#getTransition_End()
   * @model containment="true"
   * @generated
   */
  CoordinatesStatesTransition getEnd();

  /**
   * Sets the value of the '{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(CoordinatesStatesTransition value);

  /**
   * Returns the value of the '<em><b>Transition Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.uha.ensisa.project.pan_chabalier.tSE.TransitionProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Properties</em>' containment reference list.
   * @see fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage#getTransition_TransitionProperties()
   * @model containment="true"
   * @generated
   */
  EList<TransitionProperties> getTransitionProperties();

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(Label)
   * @see fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage#getTransition_Label()
   * @model containment="true"
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' attribute.
   * @see #setInit(String)
   * @see fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage#getTransition_Init()
   * @model
   * @generated
   */
  String getInit();

  /**
   * Sets the value of the '{@link fr.uha.ensisa.project.pan_chabalier.tSE.Transition#getInit <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' attribute.
   * @see #getInit()
   * @generated
   */
  void setInit(String value);

} // Transition
