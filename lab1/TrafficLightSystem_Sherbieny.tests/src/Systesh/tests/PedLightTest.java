/**
 */
package Systesh.tests;

import Systesh.Controller;
import Systesh.Lights;
import Systesh.PedLight;
import Systesh.SysteshFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ped Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Systesh.PedLight#switch_ped_light() <em>Switch ped light</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PedLightTest extends TestCase {

	/**
	 * The fixture for this Ped Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedLight fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PedLightTest.class);
	}

	/**
	 * Constructs a new Ped Light test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedLightTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ped Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PedLight fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ped Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedLight getFixture() {
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
		setFixture(SysteshFactory.eINSTANCE.createPedLight());
		getFixture().setPed_current_light(Lights.RED);
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
	 * Tests the '{@link Systesh.PedLight#switch_ped_light() <em>Switch ped light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.PedLight#switch_ped_light()
	 * @generated not
	 */
	public void testSwitch_ped_light() {		
		
//		Controller c = SysteshFactory.eINSTANCE.createController();
		getFixture().switch_ped_light();		
		if (getFixture().getPed_current_light() == Lights.RED){
			fail();
		}
	}

} //PedLightTest