/**
 */
package Systesh.impl;

import Systesh.Activity1;
import Systesh.ButonA;
import Systesh.ButtonB;
import Systesh.CarLight;
import Systesh.Controller;
import Systesh.DefaultState;
import Systesh.Interaction1;
import Systesh.Lights;
import Systesh.Package1.Package1Package;
import Systesh.Package1.impl.Package1PackageImpl;
import Systesh.PedLight;
import Systesh.SysteshFactory;
import Systesh.SysteshPackage;
import Systesh.Timer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysteshPackageImpl extends EPackageImpl implements SysteshPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass butonAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lightsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Systesh.SysteshPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SysteshPackageImpl() {
		super(eNS_URI, SysteshFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SysteshPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SysteshPackage init() {
		if (isInited) return (SysteshPackage)EPackage.Registry.INSTANCE.getEPackage(SysteshPackage.eNS_URI);

		// Obtain or create and register package
		SysteshPackageImpl theSysteshPackage = (SysteshPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SysteshPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SysteshPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Package1PackageImpl thePackage1Package = (Package1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Package1Package.eNS_URI) instanceof Package1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Package1Package.eNS_URI) : Package1Package.eINSTANCE);

		// Create package meta-data objects
		theSysteshPackage.createPackageContents();
		thePackage1Package.createPackageContents();

		// Initialize created meta-data
		theSysteshPackage.initializePackageContents();
		thePackage1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysteshPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SysteshPackage.eNS_URI, theSysteshPackage);
		return theSysteshPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity1() {
		return activity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction1() {
		return interaction1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction1__() {
		return (EReference)interaction1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButonA() {
		return butonAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButonA__Activate() {
		return butonAEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Pedlight() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Carlight() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Car_traffic_active() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Ped_traffic_active() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_ButtonA_pressed() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_ButtonB_pressed() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Car_green_time() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Ped_green_time() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Time() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__Switch_lights_buttonA() {
		return controllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__Switch_lights_buttonB() {
		return controllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__Timer_reset() {
		return controllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPedLight() {
		return pedLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedLight_Ped_current_light() {
		return (EAttribute)pedLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPedLight__Switch_ped_light() {
		return pedLightEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarLight() {
		return carLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarLight_Car_current_light() {
		return (EAttribute)carLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarLight__Switch_car_light() {
		return carLightEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimer__Tick() {
		return timerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimer__Timer_reset() {
		return timerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonB() {
		return buttonBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButtonB__Activate() {
		return buttonBEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLights() {
		return lightsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultState() {
		return defaultStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysteshFactory getSysteshFactory() {
		return (SysteshFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activity1EClass = createEClass(ACTIVITY1);

		interaction1EClass = createEClass(INTERACTION1);
		createEReference(interaction1EClass, INTERACTION1__);

		butonAEClass = createEClass(BUTON_A);
		createEOperation(butonAEClass, BUTON_A___ACTIVATE);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__PEDLIGHT);
		createEReference(controllerEClass, CONTROLLER__CARLIGHT);
		createEAttribute(controllerEClass, CONTROLLER__CAR_TRAFFIC_ACTIVE);
		createEAttribute(controllerEClass, CONTROLLER__PED_TRAFFIC_ACTIVE);
		createEAttribute(controllerEClass, CONTROLLER__BUTTON_APRESSED);
		createEAttribute(controllerEClass, CONTROLLER__BUTTON_BPRESSED);
		createEAttribute(controllerEClass, CONTROLLER__CAR_GREEN_TIME);
		createEAttribute(controllerEClass, CONTROLLER__PED_GREEN_TIME);
		createEAttribute(controllerEClass, CONTROLLER__TIME);
		createEOperation(controllerEClass, CONTROLLER___SWITCH_LIGHTS_BUTTON_A);
		createEOperation(controllerEClass, CONTROLLER___SWITCH_LIGHTS_BUTTON_B);
		createEOperation(controllerEClass, CONTROLLER___TIMER_RESET);

		pedLightEClass = createEClass(PED_LIGHT);
		createEAttribute(pedLightEClass, PED_LIGHT__PED_CURRENT_LIGHT);
		createEOperation(pedLightEClass, PED_LIGHT___SWITCH_PED_LIGHT);

		carLightEClass = createEClass(CAR_LIGHT);
		createEAttribute(carLightEClass, CAR_LIGHT__CAR_CURRENT_LIGHT);
		createEOperation(carLightEClass, CAR_LIGHT___SWITCH_CAR_LIGHT);

		timerEClass = createEClass(TIMER);
		createEOperation(timerEClass, TIMER___TICK);
		createEOperation(timerEClass, TIMER___TIMER_RESET);

		buttonBEClass = createEClass(BUTTON_B);
		createEOperation(buttonBEClass, BUTTON_B___ACTIVATE);

		// Create enums
		lightsEEnum = createEEnum(LIGHTS);
		defaultStateEEnum = createEEnum(DEFAULT_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Package1Package thePackage1Package = (Package1Package)EPackage.Registry.INSTANCE.getEPackage(Package1Package.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePackage1Package);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(activity1EClass, Activity1.class, "Activity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interaction1EClass, Interaction1.class, "Interaction1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction1__(), this.getButonA(), null, "_", null, 1, 1, Interaction1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(butonAEClass, ButonA.class, "ButonA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getButonA__Activate(), null, "activate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Pedlight(), this.getPedLight(), null, "pedlight", null, 1, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getController_Carlight(), this.getCarLight(), null, "carlight", null, 1, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_Car_traffic_active(), theTypesPackage.getBoolean(), "car_traffic_active", "true", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_Ped_traffic_active(), theTypesPackage.getBoolean(), "ped_traffic_active", "false", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_ButtonA_pressed(), theTypesPackage.getBoolean(), "buttonA_pressed", "false", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_ButtonB_pressed(), theTypesPackage.getBoolean(), "buttonB_pressed", "false", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_Car_green_time(), theTypesPackage.getInteger(), "car_green_time", "0", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_Ped_green_time(), theTypesPackage.getInteger(), "ped_green_time", "0", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getController_Time(), theTypesPackage.getInteger(), "Time", "0", 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getController__Switch_lights_buttonA(), null, "switch_lights_buttonA", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__Switch_lights_buttonB(), null, "switch_lights_buttonB", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__Timer_reset(), null, "timer_reset", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(pedLightEClass, PedLight.class, "PedLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedLight_Ped_current_light(), this.getLights(), "ped_current_light", null, 1, 1, PedLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPedLight__Switch_ped_light(), null, "switch_ped_light", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(carLightEClass, CarLight.class, "CarLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarLight_Car_current_light(), this.getLights(), "car_current_light", null, 1, 1, CarLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCarLight__Switch_car_light(), null, "switch_car_light", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTimer__Tick(), null, "Tick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTimer__Timer_reset(), null, "timer_reset", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(buttonBEClass, ButtonB.class, "ButtonB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getButtonB__Activate(), null, "activate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lightsEEnum, Lights.class, "Lights");
		addEEnumLiteral(lightsEEnum, Lights.RED);
		addEEnumLiteral(lightsEEnum, Lights.YELLOW);
		addEEnumLiteral(lightsEEnum, Lights.GREEN);

		initEEnum(defaultStateEEnum, DefaultState.class, "DefaultState");
		addEEnumLiteral(defaultStateEEnum, DefaultState.PED_LIGHT_STATE);
		addEEnumLiteral(defaultStateEEnum, DefaultState.CAR_LIGHT_STATE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (getInteraction1__(), 
		   source, 
		   new String[] {
			 "originalName", ""
		   });
	}

} //SysteshPackageImpl
