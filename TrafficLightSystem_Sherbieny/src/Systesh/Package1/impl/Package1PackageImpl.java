/**
 */
package Systesh.Package1.impl;

import Systesh.Package1.Package1Factory;
import Systesh.Package1.Package1Package;
import Systesh.Package1.Scenario1;

import Systesh.Package1.util.Package1Validator;

import Systesh.SysteshPackage;

import Systesh.impl.SysteshPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Package1PackageImpl extends EPackageImpl implements Package1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenario1EClass = null;

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
	 * @see Systesh.Package1.Package1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Package1PackageImpl() {
		super(eNS_URI, Package1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Package1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Package1Package init() {
		if (isInited) return (Package1Package)EPackage.Registry.INSTANCE.getEPackage(Package1Package.eNS_URI);

		// Obtain or create and register package
		Package1PackageImpl thePackage1Package = (Package1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Package1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Package1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SysteshPackageImpl theSysteshPackage = (SysteshPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SysteshPackage.eNS_URI) instanceof SysteshPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SysteshPackage.eNS_URI) : SysteshPackage.eINSTANCE);

		// Create package meta-data objects
		thePackage1Package.createPackageContents();
		theSysteshPackage.createPackageContents();

		// Initialize created meta-data
		thePackage1Package.initializePackageContents();
		theSysteshPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePackage1Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Package1Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePackage1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Package1Package.eNS_URI, thePackage1Package);
		return thePackage1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario1() {
		return scenario1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario1__Constraint1__DiagnosticChain_Map() {
		return scenario1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package1Factory getPackage1Factory() {
		return (Package1Factory)getEFactoryInstance();
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
		scenario1EClass = createEClass(SCENARIO1);
		createEOperation(scenario1EClass, SCENARIO1___CONSTRAINT1__DIAGNOSTICCHAIN_MAP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenario1EClass, Scenario1.class, "Scenario1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getScenario1__Constraint1__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (scenario1EClass, 
		   source, 
		   new String[] {
			 "originalName", "Scenario 1"
		   });
	}

} //Package1PackageImpl
