/**
 */
package Systesh.impl;

import Systesh.ButonA;
import Systesh.SysteshPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buton A</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ButonAImpl extends MinimalEObjectImpl.Container implements ButonA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButonAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysteshPackage.Literals.BUTON_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void activate() {
		ControllerImpl cont = new ControllerImpl();
		cont.setButtonA_pressed(true);
		cont.switch_lights_buttonA();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysteshPackage.BUTON_A___ACTIVATE:
				activate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ButonAImpl
