/**
 */
package Systesh.Package1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Systesh.Package1.Package1Package
 * @generated
 */
public interface Package1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package1Factory eINSTANCE = Systesh.Package1.impl.Package1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenario1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario1</em>'.
	 * @generated
	 */
	Scenario1 createScenario1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Package1Package getPackage1Package();

} //Package1Factory
