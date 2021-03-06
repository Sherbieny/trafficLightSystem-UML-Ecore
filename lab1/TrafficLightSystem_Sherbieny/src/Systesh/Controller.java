/**
 */
package Systesh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Systesh.Controller#getPedlight <em>Pedlight</em>}</li>
 *   <li>{@link Systesh.Controller#getCarlight <em>Carlight</em>}</li>
 *   <li>{@link Systesh.Controller#isCar_traffic_active <em>Car traffic active</em>}</li>
 *   <li>{@link Systesh.Controller#isPed_traffic_active <em>Ped traffic active</em>}</li>
 *   <li>{@link Systesh.Controller#isButtonA_pressed <em>Button Apressed</em>}</li>
 *   <li>{@link Systesh.Controller#isButtonB_pressed <em>Button Bpressed</em>}</li>
 *   <li>{@link Systesh.Controller#getCar_green_time <em>Car green time</em>}</li>
 *   <li>{@link Systesh.Controller#getPed_green_time <em>Ped green time</em>}</li>
 *   <li>{@link Systesh.Controller#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see Systesh.SysteshPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Pedlight</b></em>' reference list.
	 * The list contents are of type {@link Systesh.PedLight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pedlight</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedlight</em>' reference list.
	 * @see Systesh.SysteshPackage#getController_Pedlight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PedLight> getPedlight();

	/**
	 * Returns the value of the '<em><b>Carlight</b></em>' reference list.
	 * The list contents are of type {@link Systesh.CarLight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carlight</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carlight</em>' reference list.
	 * @see Systesh.SysteshPackage#getController_Carlight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CarLight> getCarlight();

	/**
	 * Returns the value of the '<em><b>Car traffic active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car traffic active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car traffic active</em>' attribute.
	 * @see #setCar_traffic_active(boolean)
	 * @see Systesh.SysteshPackage#getController_Car_traffic_active()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCar_traffic_active();

	/**
	 * Sets the value of the '{@link Systesh.Controller#isCar_traffic_active <em>Car traffic active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car traffic active</em>' attribute.
	 * @see #isCar_traffic_active()
	 * @generated
	 */
	void setCar_traffic_active(boolean value);

	/**
	 * Returns the value of the '<em><b>Ped traffic active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ped traffic active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ped traffic active</em>' attribute.
	 * @see #setPed_traffic_active(boolean)
	 * @see Systesh.SysteshPackage#getController_Ped_traffic_active()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPed_traffic_active();

	/**
	 * Sets the value of the '{@link Systesh.Controller#isPed_traffic_active <em>Ped traffic active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ped traffic active</em>' attribute.
	 * @see #isPed_traffic_active()
	 * @generated
	 */
	void setPed_traffic_active(boolean value);

	/**
	 * Returns the value of the '<em><b>Button Apressed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Apressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Apressed</em>' attribute.
	 * @see #setButtonA_pressed(boolean)
	 * @see Systesh.SysteshPackage#getController_ButtonA_pressed()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isButtonA_pressed();

	/**
	 * Sets the value of the '{@link Systesh.Controller#isButtonA_pressed <em>Button Apressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Apressed</em>' attribute.
	 * @see #isButtonA_pressed()
	 * @generated
	 */
	void setButtonA_pressed(boolean value);

	/**
	 * Returns the value of the '<em><b>Button Bpressed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Bpressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Bpressed</em>' attribute.
	 * @see #setButtonB_pressed(boolean)
	 * @see Systesh.SysteshPackage#getController_ButtonB_pressed()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isButtonB_pressed();

	/**
	 * Sets the value of the '{@link Systesh.Controller#isButtonB_pressed <em>Button Bpressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Bpressed</em>' attribute.
	 * @see #isButtonB_pressed()
	 * @generated
	 */
	void setButtonB_pressed(boolean value);

	/**
	 * Returns the value of the '<em><b>Car green time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car green time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car green time</em>' attribute.
	 * @see #setCar_green_time(int)
	 * @see Systesh.SysteshPackage#getController_Car_green_time()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCar_green_time();

	/**
	 * Sets the value of the '{@link Systesh.Controller#getCar_green_time <em>Car green time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car green time</em>' attribute.
	 * @see #getCar_green_time()
	 * @generated
	 */
	void setCar_green_time(int value);

	/**
	 * Returns the value of the '<em><b>Ped green time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ped green time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ped green time</em>' attribute.
	 * @see #setPed_green_time(int)
	 * @see Systesh.SysteshPackage#getController_Ped_green_time()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPed_green_time();

	/**
	 * Sets the value of the '{@link Systesh.Controller#getPed_green_time <em>Ped green time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ped green time</em>' attribute.
	 * @see #getPed_green_time()
	 * @generated
	 */
	void setPed_green_time(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the variable handling time incremention through the program
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see Systesh.SysteshPackage#getController_Time()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" changeable="false"
	 * @generated
	 */
	int getTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void switch_lights_buttonA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void switch_lights_buttonB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void timer_reset();

} // Controller
