/**
 */
package Systesh.Package1.util;

import Systesh.Package1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Systesh.Package1.Package1Package
 * @generated
 */
public class Package1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Package1Validator INSTANCE = new Package1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Systesh.Package1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint1' of 'Scenario1'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO1__CONSTRAINT1 = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Package1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Package1Package.SCENARIO1:
				return validateScenario1((Scenario1)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenario1(Scenario1 scenario1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scenario1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scenario1, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenario1_Constraint1(scenario1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint1 constraint of '<em>Scenario1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenario1_Constraint1(Scenario1 scenario1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenario1.Constraint1(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Package1Validator
