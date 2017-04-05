/**
 */
package Systesh.impl;

import Systesh.ButonA;
import Systesh.Interaction1;
import Systesh.SysteshPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Systesh.impl.Interaction1Impl#get_ <em></em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interaction1Impl extends MinimalEObjectImpl.Container implements Interaction1 {
	/**
	 * The cached value of the '{@link #get_() <em></em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_()
	 * @generated
	 * @ordered
	 */
	protected ButonA _;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interaction1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysteshPackage.Literals.INTERACTION1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButonA get_() {
		if (_ != null && _.eIsProxy()) {
			InternalEObject old_ = (InternalEObject)_;
			_ = (ButonA)eResolveProxy(old_);
			if (_ != old_) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysteshPackage.INTERACTION1__, old_, _));
			}
		}
		return _;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButonA basicGet_() {
		return _;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_(ButonA new_) {
		ButonA old_ = _;
		_ = new_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysteshPackage.INTERACTION1__, old_, _));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysteshPackage.INTERACTION1__:
				if (resolve) return get_();
				return basicGet_();
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
			case SysteshPackage.INTERACTION1__:
				set_((ButonA)newValue);
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
			case SysteshPackage.INTERACTION1__:
				set_((ButonA)null);
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
			case SysteshPackage.INTERACTION1__:
				return _ != null;
		}
		return super.eIsSet(featureID);
	}

} //Interaction1Impl
