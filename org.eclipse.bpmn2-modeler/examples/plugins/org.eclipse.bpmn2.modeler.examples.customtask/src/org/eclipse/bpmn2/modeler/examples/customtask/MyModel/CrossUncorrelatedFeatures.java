/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cross Uncorrelated Features</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCrossUncorrelatedFeatures()
 * @model
 * @generated
 */
public enum CrossUncorrelatedFeatures implements Enumerator {
	/**
	 * The '<em><b>Cross Uncorrelated Features</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_UNCORRELATED_FEATURES_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_UNCORRELATED_FEATURES(0, "CrossUncorrelatedFeatures", "CrossUncorrelatedFeatures");

	/**
	 * The '<em><b>Cross Uncorrelated Features</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_UNCORRELATED_FEATURES
	 * @model name="CrossUncorrelatedFeatures"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_UNCORRELATED_FEATURES_VALUE = 0;

	/**
	 * An array of all the '<em><b>Cross Uncorrelated Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CrossUncorrelatedFeatures[] VALUES_ARRAY =
		new CrossUncorrelatedFeatures[] {
			CROSS_UNCORRELATED_FEATURES,
		};

	/**
	 * A public read-only list of all the '<em><b>Cross Uncorrelated Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CrossUncorrelatedFeatures> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cross Uncorrelated Features</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrossUncorrelatedFeatures get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CrossUncorrelatedFeatures result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cross Uncorrelated Features</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrossUncorrelatedFeatures getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CrossUncorrelatedFeatures result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cross Uncorrelated Features</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CrossUncorrelatedFeatures get(int value) {
		switch (value) {
			case CROSS_UNCORRELATED_FEATURES_VALUE: return CROSS_UNCORRELATED_FEATURES;
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
	private CrossUncorrelatedFeatures(int value, String name, String literal) {
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
	
} //CrossUncorrelatedFeatures
