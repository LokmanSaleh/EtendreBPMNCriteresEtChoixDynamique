/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Algorithme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTypeAlgorithme()
 * @model
 * @generated
 */
public enum TypeAlgorithme implements Enumerator {
	/**
	 * The '<em><b>Naive Bayes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAIVE_BAYES_VALUE
	 * @generated
	 * @ordered
	 */
	NAIVE_BAYES(0, "NaiveBayes", "NaiveBayes"), /**
	 * The '<em><b>SVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM_VALUE
	 * @generated
	 * @ordered
	 */
	SVM(1, "SVM", "SVM"), /**
	 * The '<em><b>Bayesian Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAYESIAN_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	BAYESIAN_NETWORK(2, "BayesianNetwork", "BayesianNetwork"), /**
	 * The '<em><b>Descion Tree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCION_TREE_VALUE
	 * @generated
	 * @ordered
	 */
	DESCION_TREE(3, "DescionTree", "DescionTree"), /**
	 * The '<em><b>Neural Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEURAL_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NEURAL_NETWORK(4, "NeuralNetwork", "NeuralNetwork"), /**
	 * The '<em><b>Multi Class Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_CLASS_CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_CLASS_CLASSIFICATION(5, "MultiClassClassification", "MultiClassClassification"), /**
	 * The '<em><b>Multi Label Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LABEL_CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_LABEL_CLASSIFICATION(6, "MultiLabelClassification", "MultiLabelClassification"), /**
	 * The '<em><b>Regression Algorithms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_ALGORITHMS_VALUE
	 * @generated
	 * @ordered
	 */
	REGRESSION_ALGORITHMS(7, "RegressionAlgorithms", "RegressionAlgorithms"), /**
	 * The '<em><b>Clustering Algorithms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_ALGORITHMS_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING_ALGORITHMS(8, "ClusteringAlgorithms", "ClusteringAlgorithms") ;

	/**
	 * The '<em><b>Naive Bayes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAIVE_BAYES
	 * @model name="NaiveBayes"
	 * @generated
	 * @ordered
	 */
	public static final  int NAIVE_BAYES_VALUE = 0;

	/**
	 * The '<em><b>SVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVM_VALUE = 1;

	/**
	 * The '<em><b>Bayesian Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAYESIAN_NETWORK
	 * @model name="BayesianNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int BAYESIAN_NETWORK_VALUE = 2;

	/**
	 * The '<em><b>Descion Tree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCION_TREE
	 * @model name="DescionTree"
	 * @generated
	 * @ordered
	 */
	public static final int DESCION_TREE_VALUE = 3;

	/**
	 * The '<em><b>Neural Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEURAL_NETWORK
	 * @model name="NeuralNetwork"
	 * @generated
	 * @ordered
	 */
	public static final  int NEURAL_NETWORK_VALUE = 4;

	/**
	 * The '<em><b>Multi Class Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_CLASS_CLASSIFICATION
	 * @model name="MultiClassClassification"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_CLASS_CLASSIFICATION_VALUE = 5;

	/**
	 * The '<em><b>Multi Label Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LABEL_CLASSIFICATION
	 * @model name="MultiLabelClassification"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_LABEL_CLASSIFICATION_VALUE = 6;

	/**
	 * The '<em><b>Regression Algorithms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_ALGORITHMS
	 * @model name="RegressionAlgorithms"
	 * @generated
	 * @ordered
	 */
	public static final int REGRESSION_ALGORITHMS_VALUE = 7;

	/**
	 * The '<em><b>Clustering Algorithms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_ALGORITHMS
	 * @model name="ClusteringAlgorithms"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_ALGORITHMS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Type Algorithme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static   TypeAlgorithme[] VALUES_ARRAY =
		new TypeAlgorithme[] {
			NAIVE_BAYES,
			SVM,
			BAYESIAN_NETWORK,
			DESCION_TREE,
			NEURAL_NETWORK,
			MULTI_CLASS_CLASSIFICATION,
			MULTI_LABEL_CLASSIFICATION,
			REGRESSION_ALGORITHMS,
			CLUSTERING_ALGORITHMS,
		};

	/**
	 * Returns the '<em><b>Type Algorithme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAlgorithme get(int value) {
		switch (value) {
			case NAIVE_BAYES_VALUE: return NAIVE_BAYES;
			case SVM_VALUE: return SVM;
			case BAYESIAN_NETWORK_VALUE: return BAYESIAN_NETWORK;
			case DESCION_TREE_VALUE: return DESCION_TREE;
			case NEURAL_NETWORK_VALUE: return NEURAL_NETWORK;
			case MULTI_CLASS_CLASSIFICATION_VALUE: return MULTI_CLASS_CLASSIFICATION;
			case MULTI_LABEL_CLASSIFICATION_VALUE: return MULTI_LABEL_CLASSIFICATION;
			case REGRESSION_ALGORITHMS_VALUE: return REGRESSION_ALGORITHMS;
			case CLUSTERING_ALGORITHMS_VALUE: return CLUSTERING_ALGORITHMS;
		}
		return null;
	}
	
	/**
	 * A public read-only list of all the '<em><b>Type Algorithme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  List<TypeAlgorithme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Algorithme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAlgorithme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAlgorithme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Algorithme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAlgorithme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAlgorithme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private  int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private  String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private  String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeAlgorithme(int value, String name, String literal) {
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
	
} //TypeAlgorithme
