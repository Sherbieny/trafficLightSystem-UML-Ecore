/**
 */
package Systesh.Package1;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario1</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Systesh.Package1.Package1Package#getScenario1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Scenario 1'"
 * @generated
 */
public interface Scenario1 extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * car_traffic_active = true
	 * and
	 * car_green_time = x
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Scenario1
