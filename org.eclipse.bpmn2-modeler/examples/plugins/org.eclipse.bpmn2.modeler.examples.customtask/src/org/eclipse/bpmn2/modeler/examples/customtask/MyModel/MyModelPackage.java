/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory
 * @model kind="package"
 * @generated
 */
public interface MyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.bpmn2.modeler.examples.customtask";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyModelPackage eINSTANCE = org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.DocumentRootImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Task Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Temporal Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__META_DATA = 2;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.ParameterImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MetaDataImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl <em>Task Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getTaskConfig()
	 * @generated
	 */
	int TASK_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Seperate Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__SEPERATE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Sampling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__SAMPLING = 2;

	/**
	 * The feature id for the '<em><b>Neutral Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__NEUTRAL_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Cross Uncorrelated Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__CROSS_UNCORRELATED_FEATURES = 4;

	/**
	 * The feature id for the '<em><b>Criterias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__CRITERIAS = 5;

	/**
	 * The feature id for the '<em><b>Algorithm Name Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__ALGORITHM_NAME_STR = 6;

	/**
	 * The number of structural features of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_FEATURE_COUNT = 7;


	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyEventDefinitionImpl <em>My Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyEventDefinitionImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getMyEventDefinition()
	 * @generated
	 */
	int MY_EVENT_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__EXTENSION_VALUES = Bpmn2Package.EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__DOCUMENTATION = Bpmn2Package.EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__EXTENSION_DEFINITIONS = Bpmn2Package.EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__ID = Bpmn2Package.EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__ANY_ATTRIBUTE = Bpmn2Package.EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION__VALUE = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EVENT_DEFINITION_FEATURE_COUNT = Bpmn2Package.EVENT_DEFINITION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TemporalDependencyImpl <em>Temporal Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TemporalDependencyImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getTemporalDependency()
	 * @generated
	 */
	int TEMPORAL_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__EXTENSION_VALUES = Bpmn2Package.FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__DOCUMENTATION = Bpmn2Package.FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__EXTENSION_DEFINITIONS = Bpmn2Package.FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__ID = Bpmn2Package.FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__ANY_ATTRIBUTE = Bpmn2Package.FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__AUDITING = Bpmn2Package.FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__MONITORING = Bpmn2Package.FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__CATEGORY_VALUE_REF = Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__NAME = Bpmn2Package.FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__SOURCE_REF = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__TARGET_REF = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lag Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY__LAG_TIME = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEPENDENCY_FEATURE_COUNT = Bpmn2Package.FLOW_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl <em>Criterias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getCriterias()
	 * @generated
	 */
	int CRITERIAS = 6;

	/**
	 * The feature id for the '<em><b>Overfitting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__OVERFITTING = 0;

	/**
	 * The feature id for the '<em><b>Imbalanced Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__IMBALANCED_DATA_SET = 1;

	/**
	 * The feature id for the '<em><b>Minory Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__MINORY_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Problem Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__PROBLEM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Confidentialy Data Lableled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__CONFIDENTIALY_DATA_LABLELED = 4;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__ACCURACY = 5;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Speed Of Training</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__SPEED_OF_TRAINING = 7;

	/**
	 * The feature id for the '<em><b>Labeled Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__LABELED_DATA = 8;

	/**
	 * The feature id for the '<em><b>Nmber Of Labels By Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__NMBER_OF_LABELS_BY_CLASSE = 9;

	/**
	 * The feature id for the '<em><b>Number Of Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__NUMBER_OF_CLASSES = 10;

	/**
	 * The feature id for the '<em><b>Small Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__SMALL_DATA_SET = 11;

	/**
	 * The feature id for the '<em><b>High Training Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__HIGH_TRAINING_SPEED = 12;

	/**
	 * The feature id for the '<em><b>Explainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__EXPLAINABLE = 13;

	/**
	 * The number of structural features of the '<em>Criterias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData <em>Seperate Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getSeperateData()
	 * @generated
	 */
	int SEPERATE_DATA = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme <em>Type Algorithme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getTypeAlgorithme()
	 * @generated
	 */
	int TYPE_ALGORITHME = 8;


	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling <em>Sampling</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getSampling()
	 * @generated
	 */
	int SAMPLING = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass <em>Neutral Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getNeutralClass()
	 * @generated
	 */
	int NEUTRAL_CLASS = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getCrossUncorrelatedFeatures()
	 * @generated
	 */
	int CROSS_UNCORRELATED_FEATURES = 11;


	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo <em>Yes No</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getYesNo()
	 * @generated
	 */
	int YES_NO = 12;


	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille <em>Plus Gand Plus Petit Mille</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getPlusGandPlusPetitMille()
	 * @generated
	 */
	int PLUS_GAND_PLUS_PETIT_MILLE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType <em>Problem Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getProblemType()
	 * @generated
	 */
	int PROBLEM_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow <em>High Moderate Low</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getHighModerateLow()
	 * @generated
	 */
	int HIGH_MODERATE_LOW = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux <em>Plus Gand Egal Deux</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getPlusGandEgalDeux()
	 * @generated
	 */
	int PLUS_GAND_EGAL_DEUX = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn <em>Plus Gand Egal Un</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getPlusGandEgalUn()
	 * @generated
	 */
	int PLUS_GAND_EGAL_UN = 18;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getTaskConfig <em>Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Config</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getTaskConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaskConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getTemporalDependency <em>Temporal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Dependency</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getTemporalDependency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TemporalDependency();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getMetaData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MetaData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData#getMixed()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData#getName()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData#getValue()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig <em>Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Config</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig
	 * @generated
	 */
	EClass getTaskConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithm()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EAttribute getTaskConfig_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSeperateData <em>Seperate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seperate Data</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSeperateData()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EAttribute getTaskConfig_SeperateData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSampling()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EAttribute getTaskConfig_Sampling();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getNeutralClass <em>Neutral Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Class</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getNeutralClass()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EAttribute getTaskConfig_NeutralClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross Uncorrelated Features</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCrossUncorrelatedFeatures()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EAttribute getTaskConfig_CrossUncorrelatedFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCriterias <em>Criterias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Criterias</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCriterias()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EReference getTaskConfig_Criterias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithmNameStr <em>Algorithm Name Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Name Str</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithmNameStr()
	 * @see #getTaskConfig()
	 * @generated
	 */
	EAttribute getTaskConfig_AlgorithmNameStr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyEventDefinition <em>My Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Event Definition</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyEventDefinition
	 * @generated
	 */
	EClass getMyEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyEventDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyEventDefinition#getValue()
	 * @see #getMyEventDefinition()
	 * @generated
	 */
	EAttribute getMyEventDefinition_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency <em>Temporal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Dependency</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency
	 * @generated
	 */
	EClass getTemporalDependency();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency#getSourceRef()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EReference getTemporalDependency_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency#getTargetRef()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EReference getTemporalDependency_TargetRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency#getLagTime <em>Lag Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lag Time</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency#getLagTime()
	 * @see #getTemporalDependency()
	 * @generated
	 */
	EAttribute getTemporalDependency_LagTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias <em>Criterias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterias</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias
	 * @generated
	 */
	EClass getCriterias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getOverfitting <em>Overfitting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overfitting</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getOverfitting()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_Overfitting();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getImbalancedDataSet <em>Imbalanced Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imbalanced Data Set</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getImbalancedDataSet()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_ImbalancedDataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getMinoryClass <em>Minory Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minory Class</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getMinoryClass()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_MinoryClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getProblemType <em>Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Type</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getProblemType()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_ProblemType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getConfidentialyDataLableled <em>Confidentialy Data Lableled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentialy Data Lableled</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getConfidentialyDataLableled()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_ConfidentialyDataLableled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getAccuracy()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getDataType()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSpeedOfTraining <em>Speed Of Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Of Training</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSpeedOfTraining()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_SpeedOfTraining();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getLabeledData <em>Labeled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labeled Data</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getLabeledData()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_LabeledData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNmberOfLabelsByClasse <em>Nmber Of Labels By Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nmber Of Labels By Classe</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNmberOfLabelsByClasse()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_NmberOfLabelsByClasse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNumberOfClasses <em>Number Of Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Classes</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNumberOfClasses()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_NumberOfClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSmallDataSet <em>Small Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Data Set</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSmallDataSet()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_SmallDataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getHighTrainingSpeed <em>High Training Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Training Speed</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getHighTrainingSpeed()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_HighTrainingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getExplainable <em>Explainable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explainable</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getExplainable()
	 * @see #getCriterias()
	 * @generated
	 */
	EAttribute getCriterias_Explainable();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData <em>Seperate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seperate Data</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData
	 * @generated
	 */
	EEnum getSeperateData();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme <em>Type Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Algorithme</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme
	 * @generated
	 */
	EEnum getTypeAlgorithme();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sampling</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling
	 * @generated
	 */
	EEnum getSampling();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass <em>Neutral Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neutral Class</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass
	 * @generated
	 */
	EEnum getNeutralClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cross Uncorrelated Features</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures
	 * @generated
	 */
	EEnum getCrossUncorrelatedFeatures();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo <em>Yes No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Yes No</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @generated
	 */
	EEnum getYesNo();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille <em>Plus Gand Plus Petit Mille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plus Gand Plus Petit Mille</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille
	 * @generated
	 */
	EEnum getPlusGandPlusPetitMille();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType <em>Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Problem Type</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType
	 * @generated
	 */
	EEnum getProblemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow <em>High Moderate Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>High Moderate Low</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
	 * @generated
	 */
	EEnum getHighModerateLow();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux <em>Plus Gand Egal Deux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plus Gand Egal Deux</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux
	 * @generated
	 */
	EEnum getPlusGandEgalDeux();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn <em>Plus Gand Egal Un</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plus Gand Egal Un</em>'.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn
	 * @generated
	 */
	EEnum getPlusGandEgalUn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyModelFactory getMyModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.DocumentRootImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Task Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK_CONFIG = eINSTANCE.getDocumentRoot_TaskConfig();

		/**
		 * The meta object literal for the '<em><b>Temporal Dependency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL_DEPENDENCY = eINSTANCE.getDocumentRoot_TemporalDependency();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__META_DATA = eINSTANCE.getDocumentRoot_MetaData();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.ParameterImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MetaDataImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__MIXED = eINSTANCE.getMetaData_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__NAME = eINSTANCE.getMetaData_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__VALUE = eINSTANCE.getMetaData_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl <em>Task Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getTaskConfig()
		 * @generated
		 */
		EClass TASK_CONFIG = eINSTANCE.getTaskConfig();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIG__ALGORITHM = eINSTANCE.getTaskConfig_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Seperate Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIG__SEPERATE_DATA = eINSTANCE.getTaskConfig_SeperateData();

		/**
		 * The meta object literal for the '<em><b>Sampling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIG__SAMPLING = eINSTANCE.getTaskConfig_Sampling();

		/**
		 * The meta object literal for the '<em><b>Neutral Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIG__NEUTRAL_CLASS = eINSTANCE.getTaskConfig_NeutralClass();

		/**
		 * The meta object literal for the '<em><b>Cross Uncorrelated Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIG__CROSS_UNCORRELATED_FEATURES = eINSTANCE.getTaskConfig_CrossUncorrelatedFeatures();

		/**
		 * The meta object literal for the '<em><b>Criterias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIG__CRITERIAS = eINSTANCE.getTaskConfig_Criterias();

		/**
		 * The meta object literal for the '<em><b>Algorithm Name Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIG__ALGORITHM_NAME_STR = eINSTANCE.getTaskConfig_AlgorithmNameStr();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyEventDefinitionImpl <em>My Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyEventDefinitionImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getMyEventDefinition()
		 * @generated
		 */
		EClass MY_EVENT_DEFINITION = eINSTANCE.getMyEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_EVENT_DEFINITION__VALUE = eINSTANCE.getMyEventDefinition_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TemporalDependencyImpl <em>Temporal Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TemporalDependencyImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getTemporalDependency()
		 * @generated
		 */
		EClass TEMPORAL_DEPENDENCY = eINSTANCE.getTemporalDependency();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_DEPENDENCY__SOURCE_REF = eINSTANCE.getTemporalDependency_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_DEPENDENCY__TARGET_REF = eINSTANCE.getTemporalDependency_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Lag Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_DEPENDENCY__LAG_TIME = eINSTANCE.getTemporalDependency_LagTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl <em>Criterias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getCriterias()
		 * @generated
		 */
		EClass CRITERIAS = eINSTANCE.getCriterias();

		/**
		 * The meta object literal for the '<em><b>Overfitting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__OVERFITTING = eINSTANCE.getCriterias_Overfitting();

		/**
		 * The meta object literal for the '<em><b>Imbalanced Data Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__IMBALANCED_DATA_SET = eINSTANCE.getCriterias_ImbalancedDataSet();

		/**
		 * The meta object literal for the '<em><b>Minory Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__MINORY_CLASS = eINSTANCE.getCriterias_MinoryClass();

		/**
		 * The meta object literal for the '<em><b>Problem Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__PROBLEM_TYPE = eINSTANCE.getCriterias_ProblemType();

		/**
		 * The meta object literal for the '<em><b>Confidentialy Data Lableled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__CONFIDENTIALY_DATA_LABLELED = eINSTANCE.getCriterias_ConfidentialyDataLableled();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__ACCURACY = eINSTANCE.getCriterias_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__DATA_TYPE = eINSTANCE.getCriterias_DataType();

		/**
		 * The meta object literal for the '<em><b>Speed Of Training</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__SPEED_OF_TRAINING = eINSTANCE.getCriterias_SpeedOfTraining();

		/**
		 * The meta object literal for the '<em><b>Labeled Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__LABELED_DATA = eINSTANCE.getCriterias_LabeledData();

		/**
		 * The meta object literal for the '<em><b>Nmber Of Labels By Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__NMBER_OF_LABELS_BY_CLASSE = eINSTANCE.getCriterias_NmberOfLabelsByClasse();

		/**
		 * The meta object literal for the '<em><b>Number Of Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__NUMBER_OF_CLASSES = eINSTANCE.getCriterias_NumberOfClasses();

		/**
		 * The meta object literal for the '<em><b>Small Data Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__SMALL_DATA_SET = eINSTANCE.getCriterias_SmallDataSet();

		/**
		 * The meta object literal for the '<em><b>High Training Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__HIGH_TRAINING_SPEED = eINSTANCE.getCriterias_HighTrainingSpeed();

		/**
		 * The meta object literal for the '<em><b>Explainable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIAS__EXPLAINABLE = eINSTANCE.getCriterias_Explainable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData <em>Seperate Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getSeperateData()
		 * @generated
		 */
		EEnum SEPERATE_DATA = eINSTANCE.getSeperateData();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme <em>Type Algorithme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getTypeAlgorithme()
		 * @generated
		 */
		EEnum TYPE_ALGORITHME = eINSTANCE.getTypeAlgorithme();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling <em>Sampling</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getSampling()
		 * @generated
		 */
		EEnum SAMPLING = eINSTANCE.getSampling();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass <em>Neutral Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getNeutralClass()
		 * @generated
		 */
		EEnum NEUTRAL_CLASS = eINSTANCE.getNeutralClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getCrossUncorrelatedFeatures()
		 * @generated
		 */
		EEnum CROSS_UNCORRELATED_FEATURES = eINSTANCE.getCrossUncorrelatedFeatures();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo <em>Yes No</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getYesNo()
		 * @generated
		 */
		EEnum YES_NO = eINSTANCE.getYesNo();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille <em>Plus Gand Plus Petit Mille</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getPlusGandPlusPetitMille()
		 * @generated
		 */
		EEnum PLUS_GAND_PLUS_PETIT_MILLE = eINSTANCE.getPlusGandPlusPetitMille();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType <em>Problem Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getProblemType()
		 * @generated
		 */
		EEnum PROBLEM_TYPE = eINSTANCE.getProblemType();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow <em>High Moderate Low</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getHighModerateLow()
		 * @generated
		 */
		EEnum HIGH_MODERATE_LOW = eINSTANCE.getHighModerateLow();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux <em>Plus Gand Egal Deux</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getPlusGandEgalDeux()
		 * @generated
		 */
		EEnum PLUS_GAND_EGAL_DEUX = eINSTANCE.getPlusGandEgalDeux();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn <em>Plus Gand Egal Un</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn
		 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.MyModelPackageImpl#getPlusGandEgalUn()
		 * @generated
		 */
		EEnum PLUS_GAND_EGAL_UN = eINSTANCE.getPlusGandEgalUn();

	}

} //MyModelPackage
