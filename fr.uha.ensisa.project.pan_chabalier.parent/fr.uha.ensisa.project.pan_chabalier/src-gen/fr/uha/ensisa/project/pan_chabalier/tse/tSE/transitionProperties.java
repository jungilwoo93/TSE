/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tse.tSE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>transition Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getColor <em>Color</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getThickness <em>Thickness</em>}</li>
 *   <li>{@link fr.uha.ensisa.project.pan_chabalier.tse.tSE.transitionProperties#getCurve <em>Curve</em>}</li>
 * </ul>
 *
 * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.TSEPackage#gettransitionProperties()
 * @model
 * @generated
 */
public interface transitionProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute list.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.TSEPackage#gettransitionProperties_Color()
   * @model unique="false"
   * @generated
   */
  EList<String> getColor();

  /**
   * Returns the value of the '<em><b>Thickness</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thickness</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thickness</em>' attribute list.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.TSEPackage#gettransitionProperties_Thickness()
   * @model unique="false"
   * @generated
   */
  EList<String> getThickness();

  /**
   * Returns the value of the '<em><b>Curve</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Curve</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Curve</em>' attribute list.
   * @see fr.uha.ensisa.project.pan_chabalier.tse.tSE.TSEPackage#gettransitionProperties_Curve()
   * @model unique="false"
   * @generated
   */
  EList<String> getCurve();

} // transitionProperties
