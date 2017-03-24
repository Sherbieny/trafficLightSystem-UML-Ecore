/**
 */
package Systesh.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Systesh</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysteshTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SysteshTests("Systesh Tests");
		suite.addTestSuite(ButonATest.class);
		suite.addTestSuite(ControllerTest.class);
		suite.addTestSuite(PedLightTest.class);
		suite.addTestSuite(CarLightTest.class);
		suite.addTestSuite(TimerTest.class);
		suite.addTestSuite(ButtonBTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysteshTests(String name) {
		super(name);
	}

} //SysteshTests
