/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MetaData;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyEventDefinition;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Parameter;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitDeux;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import java.io.IOException;
import java.sql.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyModelPackageImpl extends EPackageImpl implements MyModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seperateDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAlgorithmeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum samplingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neutralClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum crossUncorrelatedFeaturesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yesNoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum plusGandPlusPetitMilleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum problemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum highModerateLowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum plusGandEgalDeuxEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum plusGandEgalUnEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyModelPackageImpl() {
		super(eNS_URI, MyModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MyModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyModelPackage init() {
		if (isInited) return (MyModelPackage)EPackage.Registry.INSTANCE.getEPackage(MyModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMyModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MyModelPackageImpl theMyModelPackage = registeredMyModelPackage instanceof MyModelPackageImpl ? (MyModelPackageImpl)registeredMyModelPackage : new MyModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		BpmnDiPackage.eINSTANCE.eClass();
		DiPackage.eINSTANCE.eClass();
		DcPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMyModelPackage.createPackageContents();

		// Initialize created meta-data
		theMyModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyModelPackage.eNS_URI, theMyModelPackage);
		return theMyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TaskConfig() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TemporalDependency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MetaData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaData_Mixed() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaData_Name() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaData_Value() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskConfig() {
		return taskConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskConfig_Algorithm() {
		return (EAttribute)taskConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskConfig_SeperateData() {
		return (EAttribute)taskConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskConfig_Sampling() {
		return (EAttribute)taskConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskConfig_NeutralClass() {
		return (EAttribute)taskConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskConfig_CrossUncorrelatedFeatures() {
		return (EAttribute)taskConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskConfig_Criterias() {
		return (EReference)taskConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskConfig_AlgorithmNameStr() {
		return (EAttribute)taskConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMyEventDefinition() {
		return myEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMyEventDefinition_Value() {
		return (EAttribute)myEventDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalDependency() {
		return temporalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalDependency_SourceRef() {
		return (EReference)temporalDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalDependency_TargetRef() {
		return (EReference)temporalDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalDependency_LagTime() {
		return (EAttribute)temporalDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriterias() {
		return criteriasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_Overfitting() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_ImbalancedDataSet() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_MinoryClass() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_ProblemType() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_ConfidentialyDataLableled() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_Accuracy() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_DataType() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_SpeedOfTraining() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_LabeledData() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_NmberOfLabelsByClasse() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_NumberOfClasses() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_SmallDataSet() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_HighTrainingSpeed() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterias_Explainable() {
		return (EAttribute)criteriasEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeperateData() {
		return seperateDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeAlgorithme() {
		return typeAlgorithmeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSampling() {
		return samplingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeutralClass() {
		return neutralClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCrossUncorrelatedFeatures() {
		return crossUncorrelatedFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getYesNo() {
		return yesNoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlusGandPlusPetitMille() {
		return plusGandPlusPetitMilleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProblemType() {
		return problemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHighModerateLow() {
		return highModerateLowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlusGandEgalDeux() {
		return plusGandEgalDeuxEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlusGandEgalUn() {
		return plusGandEgalUnEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MyModelFactory getMyModelFactory() {
		return (MyModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TASK_CONFIG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPORAL_DEPENDENCY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__META_DATA);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		metaDataEClass = createEClass(META_DATA);
		createEAttribute(metaDataEClass, META_DATA__MIXED);
		createEAttribute(metaDataEClass, META_DATA__NAME);
		createEAttribute(metaDataEClass, META_DATA__VALUE);

		taskConfigEClass = createEClass(TASK_CONFIG);
		createEAttribute(taskConfigEClass, TASK_CONFIG__ALGORITHM);
		createEAttribute(taskConfigEClass, TASK_CONFIG__SEPERATE_DATA);
		createEAttribute(taskConfigEClass, TASK_CONFIG__SAMPLING);
		createEAttribute(taskConfigEClass, TASK_CONFIG__NEUTRAL_CLASS);
		createEAttribute(taskConfigEClass, TASK_CONFIG__CROSS_UNCORRELATED_FEATURES);
		createEReference(taskConfigEClass, TASK_CONFIG__CRITERIAS);
		createEAttribute(taskConfigEClass, TASK_CONFIG__ALGORITHM_NAME_STR);

		myEventDefinitionEClass = createEClass(MY_EVENT_DEFINITION);
		createEAttribute(myEventDefinitionEClass, MY_EVENT_DEFINITION__VALUE);

		temporalDependencyEClass = createEClass(TEMPORAL_DEPENDENCY);
		createEReference(temporalDependencyEClass, TEMPORAL_DEPENDENCY__SOURCE_REF);
		createEReference(temporalDependencyEClass, TEMPORAL_DEPENDENCY__TARGET_REF);
		createEAttribute(temporalDependencyEClass, TEMPORAL_DEPENDENCY__LAG_TIME);

		criteriasEClass = createEClass(CRITERIAS);
		createEAttribute(criteriasEClass, CRITERIAS__OVERFITTING);
		createEAttribute(criteriasEClass, CRITERIAS__IMBALANCED_DATA_SET);
		createEAttribute(criteriasEClass, CRITERIAS__MINORY_CLASS);
		createEAttribute(criteriasEClass, CRITERIAS__PROBLEM_TYPE);
		createEAttribute(criteriasEClass, CRITERIAS__CONFIDENTIALY_DATA_LABLELED);
		createEAttribute(criteriasEClass, CRITERIAS__ACCURACY);
		createEAttribute(criteriasEClass, CRITERIAS__DATA_TYPE);
		createEAttribute(criteriasEClass, CRITERIAS__SPEED_OF_TRAINING);
		createEAttribute(criteriasEClass, CRITERIAS__LABELED_DATA);
		createEAttribute(criteriasEClass, CRITERIAS__NMBER_OF_LABELS_BY_CLASSE);
		createEAttribute(criteriasEClass, CRITERIAS__NUMBER_OF_CLASSES);
		createEAttribute(criteriasEClass, CRITERIAS__SMALL_DATA_SET);
		createEAttribute(criteriasEClass, CRITERIAS__HIGH_TRAINING_SPEED);
		createEAttribute(criteriasEClass, CRITERIAS__EXPLAINABLE);

		// Create enums
		seperateDataEEnum = createEEnum(SEPERATE_DATA);
		typeAlgorithmeEEnum = createEEnum(TYPE_ALGORITHME);
		samplingEEnum = createEEnum(SAMPLING);
		neutralClassEEnum = createEEnum(NEUTRAL_CLASS);
		crossUncorrelatedFeaturesEEnum = createEEnum(CROSS_UNCORRELATED_FEATURES);
		yesNoEEnum = createEEnum(YES_NO);
		plusGandPlusPetitMilleEEnum = createEEnum(PLUS_GAND_PLUS_PETIT_MILLE);
		problemTypeEEnum = createEEnum(PROBLEM_TYPE);
		highModerateLowEEnum = createEEnum(HIGH_MODERATE_LOW);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		plusGandEgalDeuxEEnum = createEEnum(PLUS_GAND_EGAL_DEUX);
		plusGandEgalUnEEnum = createEEnum(PLUS_GAND_EGAL_UN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Bpmn2Package theBpmn2Package = (Bpmn2Package)EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		myEventDefinitionEClass.getESuperTypes().add(theBpmn2Package.getEventDefinition());
		temporalDependencyEClass.getESuperTypes().add(theBpmn2Package.getFlowElement());

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRoot_TaskConfig(), this.getTaskConfig(), null, "taskConfig", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TemporalDependency(), this.getTemporalDependency(), null, "temporalDependency", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MetaData(), this.getMetaData(), null, "metaData", null, 0, -2, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaData_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaData_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaData_Value(), ecorePackage.getEString(), "value", null, 0, 1, MetaData.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(taskConfigEClass, TaskConfig.class, "TaskConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskConfig_Algorithm(), this.getTypeAlgorithme(), "Algorithm", null, 0, 1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskConfig_SeperateData(), this.getSeperateData(), "SeperateData", null, 0, 1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskConfig_Sampling(), this.getSampling(), "Sampling", null, 0, 1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskConfig_NeutralClass(), this.getNeutralClass(), "NeutralClass", null, 0, 1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskConfig_CrossUncorrelatedFeatures(), this.getCrossUncorrelatedFeatures(), "CrossUncorrelatedFeatures", null, 0, 1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfig_Criterias(), this.getCriterias(), null, "criterias", null, 0, -2, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskConfig_AlgorithmNameStr(), theXMLTypePackage.getString(), "AlgorithmNameStr", null, 0, 1, TaskConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myEventDefinitionEClass, MyEventDefinition.class, "MyEventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyEventDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, MyEventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalDependencyEClass, TemporalDependency.class, "TemporalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalDependency_SourceRef(), theBpmn2Package.getBoundaryEvent(), null, "sourceRef", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalDependency_TargetRef(), theBpmn2Package.getBoundaryEvent(), null, "targetRef", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalDependency_LagTime(), ecorePackage.getEString(), "lagTime", null, 0, 1, TemporalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criteriasEClass, Criterias.class, "Criterias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriterias_Overfitting(), this.getYesNo(), "Overfitting", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_ImbalancedDataSet(), this.getYesNo(), "ImbalancedDataSet", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_MinoryClass(), this.getPlusGandPlusPetitMille(), "MinoryClass", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_ProblemType(), this.getProblemType(), "ProblemType", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_ConfidentialyDataLableled(), this.getYesNo(), "ConfidentialyDataLableled", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_Accuracy(), this.getHighModerateLow(), "Accuracy", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_DataType(), this.getDataType(), "DataType", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_SpeedOfTraining(), this.getHighModerateLow(), "SpeedOfTraining", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_LabeledData(), this.getYesNo(), "LabeledData", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_NmberOfLabelsByClasse(), this.getPlusGandEgalUn(), "NmberOfLabelsByClasse", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_NumberOfClasses(), this.getPlusGandEgalDeux(), "NumberOfClasses", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_SmallDataSet(), this.getYesNo(), "SmallDataSet", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_HighTrainingSpeed(), this.getYesNo(), "HighTrainingSpeed", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterias_Explainable(), this.getYesNo(), "Explainable", null, 0, 1, Criterias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(seperateDataEEnum, SeperateData.class, "SeperateData");
		addEEnumLiteral(seperateDataEEnum, SeperateData.SEPERATE_DATA_INTO_TRAINING_AND_TESTING);
		addEEnumLiteral(seperateDataEEnum, SeperateData.SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING);
		addEEnumLiteral(seperateDataEEnum, SeperateData.TES_SEPARATE_DATA);

		initEEnum(typeAlgorithmeEEnum, TypeAlgorithme.class, "TypeAlgorithme");
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.NAIVE_BAYES);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.SVM);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.BAYESIAN_NETWORK);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.DESCION_TREE);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.NEURAL_NETWORK);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.MULTI_CLASS_CLASSIFICATION);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.MULTI_LABEL_CLASSIFICATION);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.REGRESSION_ALGORITHMS);
		addEEnumLiteral(typeAlgorithmeEEnum, TypeAlgorithme.CLUSTERING_ALGORITHMS);

		initEEnum(samplingEEnum, Sampling.class, "Sampling");
		addEEnumLiteral(samplingEEnum, Sampling.OVER_SAMPLING);
		addEEnumLiteral(samplingEEnum, Sampling.UNDER_SAMPLING);

		initEEnum(neutralClassEEnum, NeutralClass.class, "NeutralClass");
		addEEnumLiteral(neutralClassEEnum, NeutralClass.ADD_NEUTRAL_CLASS);

		initEEnum(crossUncorrelatedFeaturesEEnum, CrossUncorrelatedFeatures.class, "CrossUncorrelatedFeatures");
		addEEnumLiteral(crossUncorrelatedFeaturesEEnum, CrossUncorrelatedFeatures.CROSS_UNCORRELATED_FEATURES);

		initEEnum(yesNoEEnum, YesNo.class, "YesNo");
		addEEnumLiteral(yesNoEEnum, YesNo.YES);
		addEEnumLiteral(yesNoEEnum, YesNo.NO);

		initEEnum(plusGandPlusPetitMilleEEnum, PlusGandPlusPetitMille.class, "PlusGandPlusPetitMille");
		addEEnumLiteral(plusGandPlusPetitMilleEEnum, PlusGandPlusPetitMille.PLUS_GRAND_1000);
		addEEnumLiteral(plusGandPlusPetitMilleEEnum, PlusGandPlusPetitMille.PLUS_PETIT_1000);

		initEEnum(problemTypeEEnum, ProblemType.class, "ProblemType");
		addEEnumLiteral(problemTypeEEnum, ProblemType.CLASSIFICATION);
		addEEnumLiteral(problemTypeEEnum, ProblemType.REGRESSION);
		addEEnumLiteral(problemTypeEEnum, ProblemType.CLUSTERING);

		initEEnum(highModerateLowEEnum, HighModerateLow.class, "HighModerateLow");
		addEEnumLiteral(highModerateLowEEnum, HighModerateLow.HIGH);
		addEEnumLiteral(highModerateLowEEnum, HighModerateLow.MODERATE);
		addEEnumLiteral(highModerateLowEEnum, HighModerateLow.LOW);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.CATEGORIAL);
		addEEnumLiteral(dataTypeEEnum, DataType.CONTINUE);

		initEEnum(plusGandEgalDeuxEEnum, PlusGandEgalDeux.class, "PlusGandEgalDeux");
		addEEnumLiteral(plusGandEgalDeuxEEnum, PlusGandEgalDeux.PLUS_GRAND_2);
		addEEnumLiteral(plusGandEgalDeuxEEnum, PlusGandEgalDeux.EGAL_2);

		initEEnum(plusGandEgalUnEEnum, PlusGandEgalUn.class, "PlusGandEgalUn");
		addEEnumLiteral(plusGandEgalUnEEnum, PlusGandEgalUn.PLUS_GRAND_1);
		addEEnumLiteral(plusGandEgalUnEEnum, PlusGandEgalUn.EGAL_1);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}



	
	
	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_TaskConfig(),
		   source,
		   new String[] {
			   "name", "taskConfig",
			   "kind", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TemporalDependency(),
		   source,
		   new String[] {
			   "name", "temporalDependency",
			   "kind", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MetaData(),
		   source,
		   new String[] {
			   "name", "metaData",
			   "kind", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (metaDataEClass,
		   source,
		   new String[] {
			   "kind", "mixed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMetaData_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed",
			   "namespace", "##targetNamespace"
		   });
	}

} //MyModelPackageImpl
