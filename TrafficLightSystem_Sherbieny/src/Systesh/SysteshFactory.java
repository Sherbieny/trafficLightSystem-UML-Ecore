/**
 */
package Systesh;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Systesh.SysteshPackage
 * @generated
 */
public interface SysteshFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysteshFactory eINSTANCE = Systesh.impl.SysteshFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity1</em>'.
	 * @generated
	 */
	Activity1 createActivity1();

	/**
	 * Returns a new object of class '<em>Interaction1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction1</em>'.
	 * @generated
	 */
	Interaction1 createInteraction1();

	/**
	 * Returns a new object of class '<em>Buton A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buton A</em>'.
	 * @generated
	 */
	ButonA createButonA();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Ped Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ped Light</em>'.
	 * @generated
	 */
	PedLight createPedLight();

	/**
	 * Returns a new object of class '<em>Car Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car Light</em>'.
	 * @generated
	 */
	CarLight createCarLight();

	/**
	 * Returns a new object of class '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer</em>'.
	 * @generated
	 */
	Timer createTimer();

	/**
	 * Returns a new object of class '<em>Button B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button B</em>'.
	 * @generated
	 */
	ButtonB createButtonB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SysteshPackage getSysteshPackage();

} //SysteshFactory
