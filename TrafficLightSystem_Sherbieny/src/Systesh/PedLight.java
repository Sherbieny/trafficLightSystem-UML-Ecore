/**
 */
package Systesh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ped Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Systesh.PedLight#getPed_current_light <em>Ped current light</em>}</li>
 * </ul>
 *
 * @see Systesh.SysteshPackage#getPedLight()
 * @model
 * @generated
 */
public interface PedLight extends EObject {
	/**
	 * Returns the value of the '<em><b>Ped current light</b></em>' attribute.
	 * The literals are from the enumeration {@link Systesh.Lights}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ped current light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ped current light</em>' attribute.
	 * @see Systesh.Lights
	 * @see #setPed_current_light(Lights)
	 * @see Systesh.SysteshPackage#getPedLight_Ped_current_light()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Lights getPed_current_light();

	/**
	 * Sets the value of the '{@link Systesh.PedLight#getPed_current_light <em>Ped current light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ped current light</em>' attribute.
	 * @see Systesh.Lights
	 * @see #getPed_current_light()
	 * @generated
	 */
	void setPed_current_light(Lights value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void switch_ped_light();

} // PedLight
