/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyModelFactoryImpl extends EFactoryImpl implements MyModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyModelFactory init() {
		try {
			MyModelFactory theMyModelFactory = (MyModelFactory)EPackage.Registry.INSTANCE.getEFactory(MyModelPackage.eNS_URI);
			if (theMyModelFactory != null) {
				return theMyModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MyModelPackage.PARAMETER: return createParameter();
			case MyModelPackage.META_DATA: return createMetaData();
			case MyModelPackage.TASK_CONFIG: return createTaskConfig();
			case MyModelPackage.MY_EVENT_DEFINITION: return createMyEventDefinition();
			case MyModelPackage.TEMPORAL_DEPENDENCY: return createTemporalDependency();
			case MyModelPackage.CRITERIAS: return createCriterias();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyModelPackage.SEPERATE_DATA:
				return createSeperateDataFromString(eDataType, initialValue);
			case MyModelPackage.TYPE_ALGORITHME:
				return createTypeAlgorithmeFromString(eDataType, initialValue);
			case MyModelPackage.SAMPLING:
				return createSamplingFromString(eDataType, initialValue);
			case MyModelPackage.NEUTRAL_CLASS:
				return createNeutralClassFromString(eDataType, initialValue);
			case MyModelPackage.CROSS_UNCORRELATED_FEATURES:
				return createCrossUncorrelatedFeaturesFromString(eDataType, initialValue);
			case MyModelPackage.YES_NO:
				return createYesNoFromString(eDataType, initialValue);
			case MyModelPackage.PLUS_GAND_PLUS_PETIT_MILLE:
				return createPlusGandPlusPetitMilleFromString(eDataType, initialValue);
			case MyModelPackage.PROBLEM_TYPE:
				return createProblemTypeFromString(eDataType, initialValue);
			case MyModelPackage.HIGH_MODERATE_LOW:
				return createHighModerateLowFromString(eDataType, initialValue);
			case MyModelPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case MyModelPackage.PLUS_GAND_EGAL_DEUX:
				return createPlusGandEgalDeuxFromString(eDataType, initialValue);
			case MyModelPackage.PLUS_GAND_EGAL_UN:
				return createPlusGandEgalUnFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyModelPackage.SEPERATE_DATA:
				return convertSeperateDataToString(eDataType, instanceValue);
			case MyModelPackage.TYPE_ALGORITHME:
				return convertTypeAlgorithmeToString(eDataType, instanceValue);
			case MyModelPackage.SAMPLING:
				return convertSamplingToString(eDataType, instanceValue);
			case MyModelPackage.NEUTRAL_CLASS:
				return convertNeutralClassToString(eDataType, instanceValue);
			case MyModelPackage.CROSS_UNCORRELATED_FEATURES:
				return convertCrossUncorrelatedFeaturesToString(eDataType, instanceValue);
			case MyModelPackage.YES_NO:
				return convertYesNoToString(eDataType, instanceValue);
			case MyModelPackage.PLUS_GAND_PLUS_PETIT_MILLE:
				return convertPlusGandPlusPetitMilleToString(eDataType, instanceValue);
			case MyModelPackage.PROBLEM_TYPE:
				return convertProblemTypeToString(eDataType, instanceValue);
			case MyModelPackage.HIGH_MODERATE_LOW:
				return convertHighModerateLowToString(eDataType, instanceValue);
			case MyModelPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case MyModelPackage.PLUS_GAND_EGAL_DEUX:
				return convertPlusGandEgalDeuxToString(eDataType, instanceValue);
			case MyModelPackage.PLUS_GAND_EGAL_UN:
				return convertPlusGandEgalUnToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskConfig createTaskConfig() {
		TaskConfigImpl taskConfig = new TaskConfigImpl();
		return taskConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MyEventDefinition createMyEventDefinition() {
		MyEventDefinitionImpl myEventDefinition = new MyEventDefinitionImpl();
		return myEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDependency createTemporalDependency() {
		TemporalDependencyImpl temporalDependency = new TemporalDependencyImpl();
		return temporalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criterias createCriterias() {
		CriteriasImpl criterias = new CriteriasImpl();
		return criterias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeperateData createSeperateDataFromString(EDataType eDataType, String initialValue) {
		SeperateData result = SeperateData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeperateDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAlgorithme createTypeAlgorithmeFromString(EDataType eDataType, String initialValue) {
		TypeAlgorithme result = TypeAlgorithme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAlgorithmeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sampling createSamplingFromString(EDataType eDataType, String initialValue) {
		Sampling result = Sampling.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSamplingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutralClass createNeutralClassFromString(EDataType eDataType, String initialValue) {
		NeutralClass result = NeutralClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeutralClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossUncorrelatedFeatures createCrossUncorrelatedFeaturesFromString(EDataType eDataType, String initialValue) {
		CrossUncorrelatedFeatures result = CrossUncorrelatedFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossUncorrelatedFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNo createYesNoFromString(EDataType eDataType, String initialValue) {
		YesNo result = YesNo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYesNoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusGandPlusPetitMille createPlusGandPlusPetitMilleFromString(EDataType eDataType, String initialValue) {
		PlusGandPlusPetitMille result = PlusGandPlusPetitMille.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlusGandPlusPetitMilleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemType createProblemTypeFromString(EDataType eDataType, String initialValue) {
		ProblemType result = ProblemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProblemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighModerateLow createHighModerateLowFromString(EDataType eDataType, String initialValue) {
		HighModerateLow result = HighModerateLow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHighModerateLowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusGandEgalDeux createPlusGandEgalDeuxFromString(EDataType eDataType, String initialValue) {
		PlusGandEgalDeux result = PlusGandEgalDeux.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlusGandEgalDeuxToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusGandEgalUn createPlusGandEgalUnFromString(EDataType eDataType, String initialValue) {
		PlusGandEgalUn result = PlusGandEgalUn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlusGandEgalUnToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MyModelPackage getMyModelPackage() {
		return (MyModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyModelPackage getPackage() {
		return MyModelPackage.eINSTANCE;
	}

} //MyModelFactoryImpl
