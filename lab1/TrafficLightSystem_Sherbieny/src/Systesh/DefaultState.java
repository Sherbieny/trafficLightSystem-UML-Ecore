/**
 */
package Systesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Default State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Systesh.SysteshPackage#getDefaultState()
 * @model
 * @generated
 */
public enum DefaultState implements Enumerator {
	/**
	 * The '<em><b>Ped Light State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PED_LIGHT_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	PED_LIGHT_STATE(0, "PedLightState", "PedLightState"),

	/**
	 * The '<em><b>Car Light State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_LIGHT_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	CAR_LIGHT_STATE(1, "CarLightState", "CarLightState");

	/**
	 * The '<em><b>Ped Light State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ped Light State</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PED_LIGHT_STATE
	 * @model name="PedLightState"
	 * @generated
	 * @ordered
	 */
	public static final int PED_LIGHT_STATE_VALUE = 0;

	/**
	 * The '<em><b>Car Light State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Car Light State</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAR_LIGHT_STATE
	 * @model name="CarLightState"
	 * @generated
	 * @ordered
	 */
	public static final int CAR_LIGHT_STATE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Default State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefaultState[] VALUES_ARRAY =
		new DefaultState[] {
			PED_LIGHT_STATE,
			CAR_LIGHT_STATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Default State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefaultState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Default State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefaultState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefaultState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefaultState get(int value) {
		switch (value) {
			case PED_LIGHT_STATE_VALUE: return PED_LIGHT_STATE;
			case CAR_LIGHT_STATE_VALUE: return CAR_LIGHT_STATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DefaultState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DefaultState
