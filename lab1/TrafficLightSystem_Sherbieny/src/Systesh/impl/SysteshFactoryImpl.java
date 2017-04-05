/**
 */
package Systesh.impl;

import Systesh.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysteshFactoryImpl extends EFactoryImpl implements SysteshFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SysteshFactory init() {
		try {
			SysteshFactory theSysteshFactory = (SysteshFactory)EPackage.Registry.INSTANCE.getEFactory(SysteshPackage.eNS_URI);
			if (theSysteshFactory != null) {
				return theSysteshFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SysteshFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysteshFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SysteshPackage.ACTIVITY1: return createActivity1();
			case SysteshPackage.INTERACTION1: return createInteraction1();
			case SysteshPackage.BUTON_A: return createButonA();
			case SysteshPackage.CONTROLLER: return createController();
			case SysteshPackage.PED_LIGHT: return createPedLight();
			case SysteshPackage.CAR_LIGHT: return createCarLight();
			case SysteshPackage.TIMER: return createTimer();
			case SysteshPackage.BUTTON_B: return createButtonB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SysteshPackage.LIGHTS:
				return createLightsFromString(eDataType, initialValue);
			case SysteshPackage.DEFAULT_STATE:
				return createDefaultStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SysteshPackage.LIGHTS:
				return convertLightsToString(eDataType, instanceValue);
			case SysteshPackage.DEFAULT_STATE:
				return convertDefaultStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity1 createActivity1() {
		Activity1Impl activity1 = new Activity1Impl();
		return activity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction1 createInteraction1() {
		Interaction1Impl interaction1 = new Interaction1Impl();
		return interaction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButonA createButonA() {
		ButonAImpl butonA = new ButonAImpl();
		return butonA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedLight createPedLight() {
		PedLightImpl pedLight = new PedLightImpl();
		return pedLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarLight createCarLight() {
		CarLightImpl carLight = new CarLightImpl();
		return carLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonB createButtonB() {
		ButtonBImpl buttonB = new ButtonBImpl();
		return buttonB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lights createLightsFromString(EDataType eDataType, String initialValue) {
		Lights result = Lights.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultState createDefaultStateFromString(EDataType eDataType, String initialValue) {
		DefaultState result = DefaultState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysteshPackage getSysteshPackage() {
		return (SysteshPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SysteshPackage getPackage() {
		return SysteshPackage.eINSTANCE;
	}

} //SysteshFactoryImpl
