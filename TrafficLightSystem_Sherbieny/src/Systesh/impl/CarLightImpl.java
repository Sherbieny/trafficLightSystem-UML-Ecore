/**
 */
package Systesh.impl;

import Systesh.CarLight;
import Systesh.Lights;
import Systesh.SysteshPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Systesh.impl.CarLightImpl#getCar_current_light <em>Car current light</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarLightImpl extends MinimalEObjectImpl.Container implements CarLight {
	/**
	 * The default value of the '{@link #getCar_current_light() <em>Car current light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar_current_light()
	 * @generated
	 * @ordered
	 */
	protected static final Lights CAR_CURRENT_LIGHT_EDEFAULT = Lights.RED;

	/**
	 * The cached value of the '{@link #getCar_current_light() <em>Car current light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar_current_light()
	 * @generated
	 * @ordered
	 */
	protected Lights car_current_light = CAR_CURRENT_LIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysteshPackage.Literals.CAR_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lights getCar_current_light() {
		return car_current_light;
	}
	
	public void waiting (int seconds){
		for(int i = 0; i < seconds; i++){}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCar_current_light(Lights newCar_current_light) {
		Lights oldCar_current_light = car_current_light;
		car_current_light = newCar_current_light == null ? CAR_CURRENT_LIGHT_EDEFAULT : newCar_current_light;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysteshPackage.CAR_LIGHT__CAR_CURRENT_LIGHT, oldCar_current_light, car_current_light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void switch_car_light() {
		switch (getCar_current_light()) {
		case RED:
			waiting(5);
			setCar_current_light(Lights.YELLOW);
		case YELLOW:
			waiting(5);
			setCar_current_light(Lights.GREEN);
		case GREEN:
			waiting(10);
			setCar_current_light(Lights.RED);
		default:
			setCar_current_light(Lights.RED);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysteshPackage.CAR_LIGHT__CAR_CURRENT_LIGHT:
				return getCar_current_light();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysteshPackage.CAR_LIGHT__CAR_CURRENT_LIGHT:
				setCar_current_light((Lights)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysteshPackage.CAR_LIGHT__CAR_CURRENT_LIGHT:
				setCar_current_light(CAR_CURRENT_LIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysteshPackage.CAR_LIGHT__CAR_CURRENT_LIGHT:
				return car_current_light != CAR_CURRENT_LIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysteshPackage.CAR_LIGHT___SWITCH_CAR_LIGHT:
				switch_car_light();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (car_current_light: ");
		result.append(car_current_light);
		result.append(')');
		return result.toString();
	}

} //CarLightImpl
