/**
 */
package Systesh.util;

import Systesh.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Systesh.SysteshPackage
 * @generated
 */
public class SysteshAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysteshPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysteshAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SysteshPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysteshSwitch<Adapter> modelSwitch =
		new SysteshSwitch<Adapter>() {
			@Override
			public Adapter caseActivity1(Activity1 object) {
				return createActivity1Adapter();
			}
			@Override
			public Adapter caseInteraction1(Interaction1 object) {
				return createInteraction1Adapter();
			}
			@Override
			public Adapter caseButonA(ButonA object) {
				return createButonAAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter casePedLight(PedLight object) {
				return createPedLightAdapter();
			}
			@Override
			public Adapter caseCarLight(CarLight object) {
				return createCarLightAdapter();
			}
			@Override
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseButtonB(ButtonB object) {
				return createButtonBAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Systesh.Activity1 <em>Activity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.Activity1
	 * @generated
	 */
	public Adapter createActivity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.Interaction1 <em>Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.Interaction1
	 * @generated
	 */
	public Adapter createInteraction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.ButonA <em>Buton A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.ButonA
	 * @generated
	 */
	public Adapter createButonAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.PedLight <em>Ped Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.PedLight
	 * @generated
	 */
	public Adapter createPedLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.CarLight <em>Car Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.CarLight
	 * @generated
	 */
	public Adapter createCarLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Systesh.ButtonB <em>Button B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Systesh.ButtonB
	 * @generated
	 */
	public Adapter createButtonBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SysteshAdapterFactory
