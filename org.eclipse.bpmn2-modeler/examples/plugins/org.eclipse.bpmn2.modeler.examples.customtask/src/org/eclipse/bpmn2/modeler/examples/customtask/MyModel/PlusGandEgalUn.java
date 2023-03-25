/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Plus Gand Egal Un</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getPlusGandEgalUn()
 * @model
 * @generated
 */
public enum PlusGandEgalUn implements Enumerator {
	/**
	 * The '<em><b>Plus Grand 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_GRAND_1_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_GRAND_1(0, "PlusGrand_1", "PlusGrand_1"),

	/**
	 * The '<em><b>Egal 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGAL_1_VALUE
	 * @generated
	 * @ordered
	 */
	EGAL_1(1, "Egal_1", "Egal_1");

	/**
	 * The '<em><b>Plus Grand 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_GRAND_1
	 * @model name="PlusGrand_1"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_GRAND_1_VALUE = 0;

	/**
	 * The '<em><b>Egal 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGAL_1
	 * @model name="Egal_1"
	 * @generated
	 * @ordered
	 */
	public static final int EGAL_1_VALUE = 1;

	/**
	 * An array of all the '<em><b>Plus Gand Egal Un</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlusGandEgalUn[] VALUES_ARRAY =
		new PlusGandEgalUn[] {
			PLUS_GRAND_1,
			EGAL_1,
		};

	/**
	 * A public read-only list of all the '<em><b>Plus Gand Egal Un</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlusGandEgalUn> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Plus Gand Egal Un</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlusGandEgalUn get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlusGandEgalUn result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plus Gand Egal Un</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlusGandEgalUn getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlusGandEgalUn result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plus Gand Egal Un</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlusGandEgalUn get(int value) {
		switch (value) {
			case PLUS_GRAND_1_VALUE: return PLUS_GRAND_1;
			case EGAL_1_VALUE: return EGAL_1;
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
	private PlusGandEgalUn(int value, String name, String literal) {
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
	
} //PlusGandEgalUn
