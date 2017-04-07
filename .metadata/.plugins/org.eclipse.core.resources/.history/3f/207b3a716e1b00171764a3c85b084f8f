/**
 */
package Systesh.tests;

import Systesh.SysteshFactory;
import Systesh.Timer;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Systesh.Timer#Tick() <em>Tick</em>}</li>
 *   <li>{@link Systesh.Timer#timer_reset() <em>Timer reset</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimerTest extends TestCase {

	/**
	 * The fixture for this Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Timer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimerTest.class);
	}

	/**
	 * Constructs a new Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Timer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Timer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SysteshFactory.eINSTANCE.createTimer());
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
	 * Tests the '{@link Systesh.Timer#Tick() <em>Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Timer#Tick()
	 * @generated
	 */
	public void testTick() {
		int x = getFixture().tick();
		int y = getFixture().tick();
		
		if(x == y){
			fail();
		}
		
	}

	/**
	 * Tests the '{@link Systesh.Timer#timer_reset() <em>Timer reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Timer#timer_reset()
	 * @generated not
	 */
	public void testTimer_reset() {
		setFixture(SysteshFactory.eINSTANCE.createTimer());
		getFixture().timer_reset();
	}

} //TimerTest
