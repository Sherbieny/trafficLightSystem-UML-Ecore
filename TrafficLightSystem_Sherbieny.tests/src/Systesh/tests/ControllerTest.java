/**
 */
package Systesh.tests;

import org.omg.PortableInterceptor.SUCCESSFUL;

import Systesh.CarLight;
import Systesh.Controller;
import Systesh.PedLight;
import Systesh.SysteshFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Systesh.Controller#switch_lights_buttonA() <em>Switch lights button A</em>}</li>
 *   <li>{@link Systesh.Controller#switch_lights_buttonB() <em>Switch lights button B</em>}</li>
 *   <li>{@link Systesh.Controller#timer_reset() <em>Timer reset</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ControllerTest extends TestCase {

	/**
	 * The fixture for this Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controller fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ControllerTest.class);
	}

	/**
	 * Constructs a new Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Controller fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controller getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated not
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SysteshFactory.eINSTANCE.createController());
		//getFixture().setCar_traffic_active(true);
		//getFixture().setPed_traffic_active(false);
		getFixture().timer_reset();
		
		CarLight cl1 = SysteshFactory.eINSTANCE.createCarLight();
		CarLight cl2 = SysteshFactory.eINSTANCE.createCarLight();
		getFixture().getCarlight().add(cl1);
		getFixture().getCarlight().add(cl2);
		
		PedLight pl1 = SysteshFactory.eINSTANCE.createPedLight();
		PedLight pl2 = SysteshFactory.eINSTANCE.createPedLight();
		getFixture().getPedlight().add(pl1);
		getFixture().getPedlight().add(pl2);			
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link Systesh.Controller#switch_lights_buttonA() <em>Switch lights button A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Controller#switch_lights_buttonA()
	 * @generated not
	 */
	public void testSwitch_lights_buttonA() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getFixture().switch_lights_buttonA();
		if(getFixture().isCar_traffic_active() || !getFixture().isPed_traffic_active()){
			fail();
		}
		
	}

	/**
	 * Tests the '{@link Systesh.Controller#switch_lights_buttonB() <em>Switch lights button B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Controller#switch_lights_buttonB()
	 * @generated not
	 */
	public void testSwitch_lights_buttonB() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getFixture().switch_lights_buttonB();
	}

	/**
	 * Tests the '{@link Systesh.Controller#timer_reset() <em>Timer reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Controller#timer_reset()
	 * @generated not
	 */
	public void testTimer_reset() {
		setFixture(SysteshFactory.eINSTANCE.createController());
		getFixture().timer_reset();
	}

} //ControllerTest
