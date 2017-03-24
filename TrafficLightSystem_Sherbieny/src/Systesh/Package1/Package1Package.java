/**
 */
package Systesh.Package1;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see Systesh.Package1.Package1Factory
 * @model kind="package"
 * @generated
 */
public interface Package1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Package1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Systesh/Package1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Systesh.Package1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package1Package eINSTANCE = Systesh.Package1.impl.Package1PackageImpl.init();

	/**
	 * The meta object id for the '{@link Systesh.Package1.impl.Scenario1Impl <em>Scenario1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Systesh.Package1.impl.Scenario1Impl
	 * @see Systesh.Package1.impl.Package1PackageImpl#getScenario1()
	 * @generated
	 */
	int SCENARIO1 = 0;

	/**
	 * The number of structural features of the '<em>Scenario1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO1_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Constraint1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO1___CONSTRAINT1__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Scenario1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO1_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link Systesh.Package1.Scenario1 <em>Scenario1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario1</em>'.
	 * @see Systesh.Package1.Scenario1
	 * @generated
	 */
	EClass getScenario1();

	/**
	 * Returns the meta object for the '{@link Systesh.Package1.Scenario1#Constraint1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint1</em>' operation.
	 * @see Systesh.Package1.Scenario1#Constraint1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getScenario1__Constraint1__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Package1Factory getPackage1Factory();

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
		 * The meta object literal for the '{@link Systesh.Package1.impl.Scenario1Impl <em>Scenario1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Systesh.Package1.impl.Scenario1Impl
		 * @see Systesh.Package1.impl.Package1PackageImpl#getScenario1()
		 * @generated
		 */
		EClass SCENARIO1 = eINSTANCE.getScenario1();

		/**
		 * The meta object literal for the '<em><b>Constraint1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO1___CONSTRAINT1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScenario1__Constraint1__DiagnosticChain_Map();

	}

} //Package1Package
