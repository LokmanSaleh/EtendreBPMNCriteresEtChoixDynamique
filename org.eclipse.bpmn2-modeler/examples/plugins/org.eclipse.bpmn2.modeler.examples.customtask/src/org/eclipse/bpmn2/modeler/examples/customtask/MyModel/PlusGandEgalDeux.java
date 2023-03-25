/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Plus Gand Egal Deux</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getPlusGandEgalDeux()
 * @model
 * @generated
 */
public enum PlusGandEgalDeux implements Enumerator {
	/**
	 * The '<em><b>Plus Grand 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_GRAND_2_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_GRAND_2(0, "PlusGrand_2", "PlusGrand_2"),

	/**
	 * The '<em><b>Egal 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGAL_2_VALUE
	 * @generated
	 * @ordered
	 */
	EGAL_2(1, "Egal_2", "Egal_2");

	/**
	 * The '<em><b>Plus Grand 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_GRAND_2
	 * @model name="PlusGrand_2"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_GRAND_2_VALUE = 0;

	/**
	 * The '<em><b>Egal 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGAL_2
	 * @model name="Egal_2"
	 * @generated
	 * @ordered
	 */
	public static final int EGAL_2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Plus Gand Egal Deux</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlusGandEgalDeux[] VALUES_ARRAY =
		new PlusGandEgalDeux[] {
			PLUS_GRAND_2,
			EGAL_2,
		};

	/**
	 * A public read-only list of all the '<em><b>Plus Gand Egal Deux</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlusGandEgalDeux> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Plus Gand Egal Deux</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlusGandEgalDeux get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlusGandEgalDeux result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plus Gand Egal Deux</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlusGandEgalDeux getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlusGandEgalDeux result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plus Gand Egal Deux</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlusGandEgalDeux get(int value) {
		switch (value) {
			case PLUS_GRAND_2_VALUE: return PLUS_GRAND_2;
			case EGAL_2_VALUE: return EGAL_2;
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
	private PlusGandEgalDeux(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //PlusGandEgalDeux
