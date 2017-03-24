/**
 */
package Systesh;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Systesh.SysteshFactory
 * @model kind="package"
 * @generated
 */
public interface SysteshPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Systesh";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Systesh.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Systesh";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysteshPackage eINSTANCE = Systesh.impl.SysteshPackageImpl.init();

	/**
	 * The meta object id for the '{@link Systesh.impl.Activity1Impl <em>Activity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.Activity1Impl
	 * @see Systesh.impl.SysteshPackageImpl#getActivity1()
	 * @generated
	 */
	int ACTIVITY1 = 0;

	/**
	 * The number of structural features of the '<em>Activity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Systesh.impl.Interaction1Impl <em>Interaction1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.Interaction1Impl
	 * @see Systesh.impl.SysteshPackageImpl#getInteraction1()
	 * @generated
	 */
	int INTERACTION1 = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1__ = 0;

	/**
	 * The number of structural features of the '<em>Interaction1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Systesh.impl.ButonAImpl <em>Buton A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.ButonAImpl
	 * @see Systesh.impl.SysteshPackageImpl#getButonA()
	 * @generated
	 */
	int BUTON_A = 2;

	/**
	 * The number of structural features of the '<em>Buton A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTON_A_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Activate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTON_A___ACTIVATE = 0;

	/**
	 * The number of operations of the '<em>Buton A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTON_A_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Systesh.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.ControllerImpl
	 * @see Systesh.impl.SysteshPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Pedlight</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PEDLIGHT = 0;

	/**
	 * The feature id for the '<em><b>Carlight</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CARLIGHT = 1;

	/**
	 * The feature id for the '<em><b>Car traffic active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CAR_TRAFFIC_ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Ped traffic active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PED_TRAFFIC_ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Button Apressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__BUTTON_APRESSED = 4;

	/**
	 * The feature id for the '<em><b>Button Bpressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__BUTTON_BPRESSED = 5;

	/**
	 * The feature id for the '<em><b>Car green time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CAR_GREEN_TIME = 6;

	/**
	 * The feature id for the '<em><b>Ped green time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PED_GREEN_TIME = 7;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TIME = 8;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Switch lights button A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___SWITCH_LIGHTS_BUTTON_A = 0;

	/**
	 * The operation id for the '<em>Switch lights button B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___SWITCH_LIGHTS_BUTTON_B = 1;

	/**
	 * The operation id for the '<em>Timer reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TIMER_RESET = 2;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Systesh.impl.PedLightImpl <em>Ped Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.PedLightImpl
	 * @see Systesh.impl.SysteshPackageImpl#getPedLight()
	 * @generated
	 */
	int PED_LIGHT = 4;

	/**
	 * The feature id for the '<em><b>Ped current light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT__PED_CURRENT_LIGHT = 0;

	/**
	 * The number of structural features of the '<em>Ped Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Switch ped light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT___SWITCH_PED_LIGHT = 0;

	/**
	 * The number of operations of the '<em>Ped Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Systesh.impl.CarLightImpl <em>Car Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.CarLightImpl
	 * @see Systesh.impl.SysteshPackageImpl#getCarLight()
	 * @generated
	 */
	int CAR_LIGHT = 5;

	/**
	 * The feature id for the '<em><b>Car current light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT__CAR_CURRENT_LIGHT = 0;

	/**
	 * The number of structural features of the '<em>Car Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Switch car light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT___SWITCH_CAR_LIGHT = 0;

	/**
	 * The number of operations of the '<em>Car Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Systesh.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.TimerImpl
	 * @see Systesh.impl.SysteshPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 6;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Tick</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER___TICK = 0;

	/**
	 * The operation id for the '<em>Timer reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER___TIMER_RESET = 1;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Systesh.impl.ButtonBImpl <em>Button B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.impl.ButtonBImpl
	 * @see Systesh.impl.SysteshPackageImpl#getButtonB()
	 * @generated
	 */
	int BUTTON_B = 7;

	/**
	 * The number of structural features of the '<em>Button B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_B_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Activate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_B___ACTIVATE = 0;

	/**
	 * The number of operations of the '<em>Button B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_B_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Systesh.Lights <em>Lights</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Lights
	 * @see Systesh.impl.SysteshPackageImpl#getLights()
	 * @generated
	 */
	int LIGHTS = 8;

	/**
	 * The meta object id for the '{@link Systesh.DefaultState <em>Default State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.DefaultState
	 * @see Systesh.impl.SysteshPackageImpl#getDefaultState()
	 * @generated
	 */
	int DEFAULT_STATE = 9;


	/**
	 * Returns the meta object for class '{@link Systesh.Activity1 <em>Activity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity1</em>'.
	 * @see Systesh.Activity1
	 * @generated
	 */
	EClass getActivity1();

	/**
	 * Returns the meta object for class '{@link Systesh.Interaction1 <em>Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction1</em>'.
	 * @see Systesh.Interaction1
	 * @generated
	 */
	EClass getInteraction1();

	/**
	 * Returns the meta object for the reference '{@link Systesh.Interaction1#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see Systesh.Interaction1#get_()
	 * @see #getInteraction1()
	 * @generated
	 */
	EReference getInteraction1__();

	/**
	 * Returns the meta object for class '{@link Systesh.ButonA <em>Buton A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buton A</em>'.
	 * @see Systesh.ButonA
	 * @generated
	 */
	EClass getButonA();

	/**
	 * Returns the meta object for the '{@link Systesh.ButonA#activate() <em>Activate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate</em>' operation.
	 * @see Systesh.ButonA#activate()
	 * @generated
	 */
	EOperation getButonA__Activate();

	/**
	 * Returns the meta object for class '{@link Systesh.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see Systesh.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference list '{@link Systesh.Controller#getPedlight <em>Pedlight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pedlight</em>'.
	 * @see Systesh.Controller#getPedlight()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Pedlight();

	/**
	 * Returns the meta object for the reference list '{@link Systesh.Controller#getCarlight <em>Carlight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carlight</em>'.
	 * @see Systesh.Controller#getCarlight()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Carlight();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#isCar_traffic_active <em>Car traffic active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Car traffic active</em>'.
	 * @see Systesh.Controller#isCar_traffic_active()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Car_traffic_active();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#isPed_traffic_active <em>Ped traffic active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ped traffic active</em>'.
	 * @see Systesh.Controller#isPed_traffic_active()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Ped_traffic_active();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#isButtonA_pressed <em>Button Apressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Apressed</em>'.
	 * @see Systesh.Controller#isButtonA_pressed()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_ButtonA_pressed();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#isButtonB_pressed <em>Button Bpressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Bpressed</em>'.
	 * @see Systesh.Controller#isButtonB_pressed()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_ButtonB_pressed();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#getCar_green_time <em>Car green time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Car green time</em>'.
	 * @see Systesh.Controller#getCar_green_time()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Car_green_time();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#getPed_green_time <em>Ped green time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ped green time</em>'.
	 * @see Systesh.Controller#getPed_green_time()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Ped_green_time();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.Controller#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see Systesh.Controller#getTime()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Time();

	/**
	 * Returns the meta object for the '{@link Systesh.Controller#switch_lights_buttonA() <em>Switch lights button A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Switch lights button A</em>' operation.
	 * @see Systesh.Controller#switch_lights_buttonA()
	 * @generated
	 */
	EOperation getController__Switch_lights_buttonA();

	/**
	 * Returns the meta object for the '{@link Systesh.Controller#switch_lights_buttonB() <em>Switch lights button B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Switch lights button B</em>' operation.
	 * @see Systesh.Controller#switch_lights_buttonB()
	 * @generated
	 */
	EOperation getController__Switch_lights_buttonB();

	/**
	 * Returns the meta object for the '{@link Systesh.Controller#timer_reset() <em>Timer reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Timer reset</em>' operation.
	 * @see Systesh.Controller#timer_reset()
	 * @generated
	 */
	EOperation getController__Timer_reset();

	/**
	 * Returns the meta object for class '{@link Systesh.PedLight <em>Ped Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ped Light</em>'.
	 * @see Systesh.PedLight
	 * @generated
	 */
	EClass getPedLight();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.PedLight#getPed_current_light <em>Ped current light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ped current light</em>'.
	 * @see Systesh.PedLight#getPed_current_light()
	 * @see #getPedLight()
	 * @generated
	 */
	EAttribute getPedLight_Ped_current_light();

	/**
	 * Returns the meta object for the '{@link Systesh.PedLight#switch_ped_light() <em>Switch ped light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Switch ped light</em>' operation.
	 * @see Systesh.PedLight#switch_ped_light()
	 * @generated
	 */
	EOperation getPedLight__Switch_ped_light();

	/**
	 * Returns the meta object for class '{@link Systesh.CarLight <em>Car Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Light</em>'.
	 * @see Systesh.CarLight
	 * @generated
	 */
	EClass getCarLight();

	/**
	 * Returns the meta object for the attribute '{@link Systesh.CarLight#getCar_current_light <em>Car current light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Car current light</em>'.
	 * @see Systesh.CarLight#getCar_current_light()
	 * @see #getCarLight()
	 * @generated
	 */
	EAttribute getCarLight_Car_current_light();

	/**
	 * Returns the meta object for the '{@link Systesh.CarLight#switch_car_light() <em>Switch car light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Switch car light</em>' operation.
	 * @see Systesh.CarLight#switch_car_light()
	 * @generated
	 */
	EOperation getCarLight__Switch_car_light();

	/**
	 * Returns the meta object for class '{@link Systesh.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see Systesh.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the '{@link Systesh.Timer#Tick() <em>Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tick</em>' operation.
	 * @see Systesh.Timer#Tick()
	 * @generated
	 */
	EOperation getTimer__Tick();

	/**
	 * Returns the meta object for the '{@link Systesh.Timer#timer_reset() <em>Timer reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Timer reset</em>' operation.
	 * @see Systesh.Timer#timer_reset()
	 * @generated
	 */
	EOperation getTimer__Timer_reset();

	/**
	 * Returns the meta object for class '{@link Systesh.ButtonB <em>Button B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button B</em>'.
	 * @see Systesh.ButtonB
	 * @generated
	 */
	EClass getButtonB();

	/**
	 * Returns the meta object for the '{@link Systesh.ButtonB#activate() <em>Activate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate</em>' operation.
	 * @see Systesh.ButtonB#activate()
	 * @generated
	 */
	EOperation getButtonB__Activate();

	/**
	 * Returns the meta object for enum '{@link Systesh.Lights <em>Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lights</em>'.
	 * @see Systesh.Lights
	 * @generated
	 */
	EEnum getLights();

	/**
	 * Returns the meta object for enum '{@link Systesh.DefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default State</em>'.
	 * @see Systesh.DefaultState
	 * @generated
	 */
	EEnum getDefaultState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SysteshFactory getSysteshFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Systesh.impl.Activity1Impl <em>Activity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.Activity1Impl
		 * @see Systesh.impl.SysteshPackageImpl#getActivity1()
		 * @generated
		 */
		EClass ACTIVITY1 = eINSTANCE.getActivity1();

		/**
		 * The meta object literal for the '{@link Systesh.impl.Interaction1Impl <em>Interaction1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.Interaction1Impl
		 * @see Systesh.impl.SysteshPackageImpl#getInteraction1()
		 * @generated
		 */
		EClass INTERACTION1 = eINSTANCE.getInteraction1();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION1__ = eINSTANCE.getInteraction1__();

		/**
		 * The meta object literal for the '{@link Systesh.impl.ButonAImpl <em>Buton A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.ButonAImpl
		 * @see Systesh.impl.SysteshPackageImpl#getButonA()
		 * @generated
		 */
		EClass BUTON_A = eINSTANCE.getButonA();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTON_A___ACTIVATE = eINSTANCE.getButonA__Activate();

		/**
		 * The meta object literal for the '{@link Systesh.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.ControllerImpl
		 * @see Systesh.impl.SysteshPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Pedlight</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PEDLIGHT = eINSTANCE.getController_Pedlight();

		/**
		 * The meta object literal for the '<em><b>Carlight</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CARLIGHT = eINSTANCE.getController_Carlight();

		/**
		 * The meta object literal for the '<em><b>Car traffic active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__CAR_TRAFFIC_ACTIVE = eINSTANCE.getController_Car_traffic_active();

		/**
		 * The meta object literal for the '<em><b>Ped traffic active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__PED_TRAFFIC_ACTIVE = eINSTANCE.getController_Ped_traffic_active();

		/**
		 * The meta object literal for the '<em><b>Button Apressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__BUTTON_APRESSED = eINSTANCE.getController_ButtonA_pressed();

		/**
		 * The meta object literal for the '<em><b>Button Bpressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__BUTTON_BPRESSED = eINSTANCE.getController_ButtonB_pressed();

		/**
		 * The meta object literal for the '<em><b>Car green time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__CAR_GREEN_TIME = eINSTANCE.getController_Car_green_time();

		/**
		 * The meta object literal for the '<em><b>Ped green time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__PED_GREEN_TIME = eINSTANCE.getController_Ped_green_time();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__TIME = eINSTANCE.getController_Time();

		/**
		 * The meta object literal for the '<em><b>Switch lights button A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___SWITCH_LIGHTS_BUTTON_A = eINSTANCE.getController__Switch_lights_buttonA();

		/**
		 * The meta object literal for the '<em><b>Switch lights button B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___SWITCH_LIGHTS_BUTTON_B = eINSTANCE.getController__Switch_lights_buttonB();

		/**
		 * The meta object literal for the '<em><b>Timer reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TIMER_RESET = eINSTANCE.getController__Timer_reset();

		/**
		 * The meta object literal for the '{@link Systesh.impl.PedLightImpl <em>Ped Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.PedLightImpl
		 * @see Systesh.impl.SysteshPackageImpl#getPedLight()
		 * @generated
		 */
		EClass PED_LIGHT = eINSTANCE.getPedLight();

		/**
		 * The meta object literal for the '<em><b>Ped current light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PED_LIGHT__PED_CURRENT_LIGHT = eINSTANCE.getPedLight_Ped_current_light();

		/**
		 * The meta object literal for the '<em><b>Switch ped light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PED_LIGHT___SWITCH_PED_LIGHT = eINSTANCE.getPedLight__Switch_ped_light();

		/**
		 * The meta object literal for the '{@link Systesh.impl.CarLightImpl <em>Car Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.CarLightImpl
		 * @see Systesh.impl.SysteshPackageImpl#getCarLight()
		 * @generated
		 */
		EClass CAR_LIGHT = eINSTANCE.getCarLight();

		/**
		 * The meta object literal for the '<em><b>Car current light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_LIGHT__CAR_CURRENT_LIGHT = eINSTANCE.getCarLight_Car_current_light();

		/**
		 * The meta object literal for the '<em><b>Switch car light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAR_LIGHT___SWITCH_CAR_LIGHT = eINSTANCE.getCarLight__Switch_car_light();

		/**
		 * The meta object literal for the '{@link Systesh.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.TimerImpl
		 * @see Systesh.impl.SysteshPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Tick</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMER___TICK = eINSTANCE.getTimer__Tick();

		/**
		 * The meta object literal for the '<em><b>Timer reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMER___TIMER_RESET = eINSTANCE.getTimer__Timer_reset();

		/**
		 * The meta object literal for the '{@link Systesh.impl.ButtonBImpl <em>Button B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.impl.ButtonBImpl
		 * @see Systesh.impl.SysteshPackageImpl#getButtonB()
		 * @generated
		 */
		EClass BUTTON_B = eINSTANCE.getButtonB();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_B___ACTIVATE = eINSTANCE.getButtonB__Activate();

		/**
		 * The meta object literal for the '{@link Systesh.Lights <em>Lights</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.Lights
		 * @see Systesh.impl.SysteshPackageImpl#getLights()
		 * @generated
		 */
		EEnum LIGHTS = eINSTANCE.getLights();

		/**
		 * The meta object literal for the '{@link Systesh.DefaultState <em>Default State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.DefaultState
		 * @see Systesh.impl.SysteshPackageImpl#getDefaultState()
		 * @generated
		 */
		EEnum DEFAULT_STATE = eINSTANCE.getDefaultState();

	}

} //SysteshPackage
