/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Seperate Data</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getSeperateData()
 * @model instanceClass="org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData"
 * @generated
 */
public enum SeperateData implements Enumerator {
	/**
	 * The '<em><b>Seperate Data Into Training And Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPERATE_DATA_INTO_TRAINING_AND_TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	SEPERATE_DATA_INTO_TRAINING_AND_TESTING(0, "SeperateDataIntoTrainingAndTesting", "SeperateDataIntoTrainingAndTesting"),

	/**
	 * The '<em><b>Seperate Data Into Training Validation And Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING(1, "SeperateDataIntoTrainingValidationAndTesting", "SeperateDataIntoTrainingValidationAndTesting"), /**
	 * The '<em><b>TES Separate Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TES_SEPARATE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	TES_SEPARATE_DATA(2, "TESSeparateData", "TESSeparateData");

	/**
	 * The '<em><b>Seperate Data Into Training And Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPERATE_DATA_INTO_TRAINING_AND_TESTING
	 * @model name="SeperateDataIntoTrainingAndTesting"
	 * @generated
	 * @ordered
	 */
	public static final int SEPERATE_DATA_INTO_TRAINING_AND_TESTING_VALUE = 0;

	/**
	 * The '<em><b>Seperate Data Into Training Validation And Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING
	 * @model name="SeperateDataIntoTrainingValidationAndTesting"
	 * @generated
	 * @ordered
	 */
	public static final int SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING_VALUE = 1;

	/**
	 * The '<em><b>TES Separate Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TES_SEPARATE_DATA
	 * @model name="TESSeparateData"
	 * @generated
	 * @ordered
	 */
	public static final int TES_SEPARATE_DATA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Seperate Data</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeperateData[] VALUES_ARRAY =
		new SeperateData[] {
			SEPERATE_DATA_INTO_TRAINING_AND_TESTING,
			SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING,
			TES_SEPARATE_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Seperate Data</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SeperateData> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Seperate Data</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeperateData get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeperateData result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seperate Data</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeperateData getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeperateData result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seperate Data</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeperateData get(int value) {
		switch (value) {
			case SEPERATE_DATA_INTO_TRAINING_AND_TESTING_VALUE: return SEPERATE_DATA_INTO_TRAINING_AND_TESTING;
			case SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING_VALUE: return SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING;
			case TES_SEPARATE_DATA_VALUE: return TES_SEPARATE_DATA;
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
	private SeperateData(int value, String name, String literal) {
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
	
} //SeperateData
