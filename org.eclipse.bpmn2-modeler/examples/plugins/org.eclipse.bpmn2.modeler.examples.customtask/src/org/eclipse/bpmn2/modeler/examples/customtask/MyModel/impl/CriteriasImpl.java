/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitDeux;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getOverfitting <em>Overfitting</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getImbalancedDataSet <em>Imbalanced Data Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getMinoryClass <em>Minory Class</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getProblemType <em>Problem Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getConfidentialyDataLableled <em>Confidentialy Data Lableled</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getSpeedOfTraining <em>Speed Of Training</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getLabeledData <em>Labeled Data</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getNmberOfLabelsByClasse <em>Nmber Of Labels By Classe</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getNumberOfClasses <em>Number Of Classes</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getSmallDataSet <em>Small Data Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getHighTrainingSpeed <em>High Training Speed</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl#getExplainable <em>Explainable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriteriasImpl extends EObjectImpl implements Criterias {
	/**
	 * The default value of the '{@link #getOverfitting() <em>Overfitting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverfitting()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo OVERFITTING_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getOverfitting() <em>Overfitting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverfitting()
	 * @generated
	 * @ordered
	 */
	protected YesNo overfitting = OVERFITTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getImbalancedDataSet() <em>Imbalanced Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbalancedDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo IMBALANCED_DATA_SET_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getImbalancedDataSet() <em>Imbalanced Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbalancedDataSet()
	 * @generated
	 * @ordered
	 */
	protected YesNo imbalancedDataSet = IMBALANCED_DATA_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinoryClass() <em>Minory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinoryClass()
	 * @generated
	 * @ordered
	 */
	protected static final PlusGandPlusPetitMille MINORY_CLASS_EDEFAULT = PlusGandPlusPetitMille.PLUS_GRAND_1000;

	/**
	 * The cached value of the '{@link #getMinoryClass() <em>Minory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinoryClass()
	 * @generated
	 * @ordered
	 */
	protected PlusGandPlusPetitMille minoryClass = MINORY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProblemType() <em>Problem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected static final ProblemType PROBLEM_TYPE_EDEFAULT = ProblemType.CLASSIFICATION;

	/**
	 * The cached value of the '{@link #getProblemType() <em>Problem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected ProblemType problemType = PROBLEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentialyDataLableled() <em>Confidentialy Data Lableled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialyDataLableled()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo CONFIDENTIALY_DATA_LABLELED_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getConfidentialyDataLableled() <em>Confidentialy Data Lableled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialyDataLableled()
	 * @generated
	 * @ordered
	 */
	protected YesNo confidentialyDataLableled = CONFIDENTIALY_DATA_LABLELED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final HighModerateLow ACCURACY_EDEFAULT = HighModerateLow.HIGH;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected HighModerateLow accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.CATEGORIAL;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedOfTraining() <em>Speed Of Training</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOfTraining()
	 * @generated
	 * @ordered
	 */
	protected static final HighModerateLow SPEED_OF_TRAINING_EDEFAULT = HighModerateLow.HIGH;

	/**
	 * The cached value of the '{@link #getSpeedOfTraining() <em>Speed Of Training</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOfTraining()
	 * @generated
	 * @ordered
	 */
	protected HighModerateLow speedOfTraining = SPEED_OF_TRAINING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabeledData() <em>Labeled Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledData()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo LABELED_DATA_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getLabeledData() <em>Labeled Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledData()
	 * @generated
	 * @ordered
	 */
	protected YesNo labeledData = LABELED_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNmberOfLabelsByClasse() <em>Nmber Of Labels By Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmberOfLabelsByClasse()
	 * @generated
	 * @ordered
	 */
	protected static final PlusGandEgalUn NMBER_OF_LABELS_BY_CLASSE_EDEFAULT = PlusGandEgalUn.PLUS_GRAND_1;

	/**
	 * The cached value of the '{@link #getNmberOfLabelsByClasse() <em>Nmber Of Labels By Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmberOfLabelsByClasse()
	 * @generated
	 * @ordered
	 */
	protected PlusGandEgalUn nmberOfLabelsByClasse = NMBER_OF_LABELS_BY_CLASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfClasses() <em>Number Of Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfClasses()
	 * @generated
	 * @ordered
	 */
	protected static final PlusGandEgalDeux NUMBER_OF_CLASSES_EDEFAULT = PlusGandEgalDeux.PLUS_GRAND_2;

	/**
	 * The cached value of the '{@link #getNumberOfClasses() <em>Number Of Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfClasses()
	 * @generated
	 * @ordered
	 */
	protected PlusGandEgalDeux numberOfClasses = NUMBER_OF_CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallDataSet() <em>Small Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo SMALL_DATA_SET_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getSmallDataSet() <em>Small Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallDataSet()
	 * @generated
	 * @ordered
	 */
	protected YesNo smallDataSet = SMALL_DATA_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighTrainingSpeed() <em>High Training Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighTrainingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo HIGH_TRAINING_SPEED_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getHighTrainingSpeed() <em>High Training Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighTrainingSpeed()
	 * @generated
	 * @ordered
	 */
	protected YesNo highTrainingSpeed = HIGH_TRAINING_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplainable() <em>Explainable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainable()
	 * @generated
	 * @ordered
	 */
	protected static final YesNo EXPLAINABLE_EDEFAULT = YesNo.YES;

	/**
	 * The cached value of the '{@link #getExplainable() <em>Explainable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainable()
	 * @generated
	 * @ordered
	 */
	protected YesNo explainable = EXPLAINABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.CRITERIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getOverfitting() {
		return overfitting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverfitting(YesNo newOverfitting) {
		YesNo oldOverfitting = overfitting;
		overfitting = newOverfitting == null ? OVERFITTING_EDEFAULT : newOverfitting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__OVERFITTING, oldOverfitting, overfitting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getImbalancedDataSet() {
		return imbalancedDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImbalancedDataSet(YesNo newImbalancedDataSet) {
		YesNo oldImbalancedDataSet = imbalancedDataSet;
		imbalancedDataSet = newImbalancedDataSet == null ? IMBALANCED_DATA_SET_EDEFAULT : newImbalancedDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__IMBALANCED_DATA_SET, oldImbalancedDataSet, imbalancedDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlusGandPlusPetitMille getMinoryClass() {
		return minoryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinoryClass(PlusGandPlusPetitMille newMinoryClass) {
		PlusGandPlusPetitMille oldMinoryClass = minoryClass;
		minoryClass = newMinoryClass == null ? MINORY_CLASS_EDEFAULT : newMinoryClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__MINORY_CLASS, oldMinoryClass, minoryClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemType getProblemType() {
		return problemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProblemType(ProblemType newProblemType) {
		ProblemType oldProblemType = problemType;
		problemType = newProblemType == null ? PROBLEM_TYPE_EDEFAULT : newProblemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__PROBLEM_TYPE, oldProblemType, problemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getConfidentialyDataLableled() {
		return confidentialyDataLableled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidentialyDataLableled(YesNo newConfidentialyDataLableled) {
		YesNo oldConfidentialyDataLableled = confidentialyDataLableled;
		confidentialyDataLableled = newConfidentialyDataLableled == null ? CONFIDENTIALY_DATA_LABLELED_EDEFAULT : newConfidentialyDataLableled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__CONFIDENTIALY_DATA_LABLELED, oldConfidentialyDataLableled, confidentialyDataLableled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighModerateLow getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccuracy(HighModerateLow newAccuracy) {
		HighModerateLow oldAccuracy = accuracy;
		accuracy = newAccuracy == null ? ACCURACY_EDEFAULT : newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighModerateLow getSpeedOfTraining() {
		return speedOfTraining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeedOfTraining(HighModerateLow newSpeedOfTraining) {
		HighModerateLow oldSpeedOfTraining = speedOfTraining;
		speedOfTraining = newSpeedOfTraining == null ? SPEED_OF_TRAINING_EDEFAULT : newSpeedOfTraining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__SPEED_OF_TRAINING, oldSpeedOfTraining, speedOfTraining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getLabeledData() {
		return labeledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabeledData(YesNo newLabeledData) {
		YesNo oldLabeledData = labeledData;
		labeledData = newLabeledData == null ? LABELED_DATA_EDEFAULT : newLabeledData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__LABELED_DATA, oldLabeledData, labeledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlusGandEgalUn getNmberOfLabelsByClasse() {
		return nmberOfLabelsByClasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNmberOfLabelsByClasse(PlusGandEgalUn newNmberOfLabelsByClasse) {
		PlusGandEgalUn oldNmberOfLabelsByClasse = nmberOfLabelsByClasse;
		nmberOfLabelsByClasse = newNmberOfLabelsByClasse == null ? NMBER_OF_LABELS_BY_CLASSE_EDEFAULT : newNmberOfLabelsByClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE, oldNmberOfLabelsByClasse, nmberOfLabelsByClasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlusGandEgalDeux getNumberOfClasses() {
		return numberOfClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfClasses(PlusGandEgalDeux newNumberOfClasses) {
		PlusGandEgalDeux oldNumberOfClasses = numberOfClasses;
		numberOfClasses = newNumberOfClasses == null ? NUMBER_OF_CLASSES_EDEFAULT : newNumberOfClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__NUMBER_OF_CLASSES, oldNumberOfClasses, numberOfClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getSmallDataSet() {
		return smallDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmallDataSet(YesNo newSmallDataSet) {
		YesNo oldSmallDataSet = smallDataSet;
		smallDataSet = newSmallDataSet == null ? SMALL_DATA_SET_EDEFAULT : newSmallDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__SMALL_DATA_SET, oldSmallDataSet, smallDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getHighTrainingSpeed() {
		return highTrainingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighTrainingSpeed(YesNo newHighTrainingSpeed) {
		YesNo oldHighTrainingSpeed = highTrainingSpeed;
		highTrainingSpeed = newHighTrainingSpeed == null ? HIGH_TRAINING_SPEED_EDEFAULT : newHighTrainingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__HIGH_TRAINING_SPEED, oldHighTrainingSpeed, highTrainingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YesNo getExplainable() {
		return explainable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplainable(YesNo newExplainable) {
		YesNo oldExplainable = explainable;
		explainable = newExplainable == null ? EXPLAINABLE_EDEFAULT : newExplainable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.CRITERIAS__EXPLAINABLE, oldExplainable, explainable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.CRITERIAS__OVERFITTING:
				return getOverfitting();
			case MyModelPackage.CRITERIAS__IMBALANCED_DATA_SET:
				return getImbalancedDataSet();
			case MyModelPackage.CRITERIAS__MINORY_CLASS:
				return getMinoryClass();
			case MyModelPackage.CRITERIAS__PROBLEM_TYPE:
				return getProblemType();
			case MyModelPackage.CRITERIAS__CONFIDENTIALY_DATA_LABLELED:
				return getConfidentialyDataLableled();
			case MyModelPackage.CRITERIAS__ACCURACY:
				return getAccuracy();
			case MyModelPackage.CRITERIAS__DATA_TYPE:
				return getDataType();
			case MyModelPackage.CRITERIAS__SPEED_OF_TRAINING:
				return getSpeedOfTraining();
			case MyModelPackage.CRITERIAS__LABELED_DATA:
				return getLabeledData();
			case MyModelPackage.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE:
				return getNmberOfLabelsByClasse();
			case MyModelPackage.CRITERIAS__NUMBER_OF_CLASSES:
				return getNumberOfClasses();
			case MyModelPackage.CRITERIAS__SMALL_DATA_SET:
				return getSmallDataSet();
			case MyModelPackage.CRITERIAS__HIGH_TRAINING_SPEED:
				return getHighTrainingSpeed();
			case MyModelPackage.CRITERIAS__EXPLAINABLE:
				return getExplainable();
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
			case MyModelPackage.CRITERIAS__OVERFITTING:
				setOverfitting((YesNo)newValue);
				return;
			case MyModelPackage.CRITERIAS__IMBALANCED_DATA_SET:
				setImbalancedDataSet((YesNo)newValue);
				return;
			case MyModelPackage.CRITERIAS__MINORY_CLASS:
				setMinoryClass((PlusGandPlusPetitMille)newValue);
				return;
			case MyModelPackage.CRITERIAS__PROBLEM_TYPE:
				setProblemType((ProblemType)newValue);
				return;
			case MyModelPackage.CRITERIAS__CONFIDENTIALY_DATA_LABLELED:
				setConfidentialyDataLableled((YesNo)newValue);
				return;
			case MyModelPackage.CRITERIAS__ACCURACY:
				setAccuracy((HighModerateLow)newValue);
				return;
			case MyModelPackage.CRITERIAS__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case MyModelPackage.CRITERIAS__SPEED_OF_TRAINING:
				setSpeedOfTraining((HighModerateLow)newValue);
				return;
			case MyModelPackage.CRITERIAS__LABELED_DATA:
				setLabeledData((YesNo)newValue);
				return;
			case MyModelPackage.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE:
				setNmberOfLabelsByClasse((PlusGandEgalUn)newValue);
				return;
			case MyModelPackage.CRITERIAS__NUMBER_OF_CLASSES:
				setNumberOfClasses((PlusGandEgalDeux)newValue);
				return;
			case MyModelPackage.CRITERIAS__SMALL_DATA_SET:
				setSmallDataSet((YesNo)newValue);
				return;
			case MyModelPackage.CRITERIAS__HIGH_TRAINING_SPEED:
				setHighTrainingSpeed((YesNo)newValue);
				return;
			case MyModelPackage.CRITERIAS__EXPLAINABLE:
				setExplainable((YesNo)newValue);
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
			case MyModelPackage.CRITERIAS__OVERFITTING:
				setOverfitting(OVERFITTING_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__IMBALANCED_DATA_SET:
				setImbalancedDataSet(IMBALANCED_DATA_SET_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__MINORY_CLASS:
				setMinoryClass(MINORY_CLASS_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__PROBLEM_TYPE:
				setProblemType(PROBLEM_TYPE_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__CONFIDENTIALY_DATA_LABLELED:
				setConfidentialyDataLableled(CONFIDENTIALY_DATA_LABLELED_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__SPEED_OF_TRAINING:
				setSpeedOfTraining(SPEED_OF_TRAINING_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__LABELED_DATA:
				setLabeledData(LABELED_DATA_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE:
				setNmberOfLabelsByClasse(NMBER_OF_LABELS_BY_CLASSE_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__NUMBER_OF_CLASSES:
				setNumberOfClasses(NUMBER_OF_CLASSES_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__SMALL_DATA_SET:
				setSmallDataSet(SMALL_DATA_SET_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__HIGH_TRAINING_SPEED:
				setHighTrainingSpeed(HIGH_TRAINING_SPEED_EDEFAULT);
				return;
			case MyModelPackage.CRITERIAS__EXPLAINABLE:
				setExplainable(EXPLAINABLE_EDEFAULT);
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
			case MyModelPackage.CRITERIAS__OVERFITTING:
				return overfitting != OVERFITTING_EDEFAULT;
			case MyModelPackage.CRITERIAS__IMBALANCED_DATA_SET:
				return imbalancedDataSet != IMBALANCED_DATA_SET_EDEFAULT;
			case MyModelPackage.CRITERIAS__MINORY_CLASS:
				return minoryClass != MINORY_CLASS_EDEFAULT;
			case MyModelPackage.CRITERIAS__PROBLEM_TYPE:
				return problemType != PROBLEM_TYPE_EDEFAULT;
			case MyModelPackage.CRITERIAS__CONFIDENTIALY_DATA_LABLELED:
				return confidentialyDataLableled != CONFIDENTIALY_DATA_LABLELED_EDEFAULT;
			case MyModelPackage.CRITERIAS__ACCURACY:
				return accuracy != ACCURACY_EDEFAULT;
			case MyModelPackage.CRITERIAS__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case MyModelPackage.CRITERIAS__SPEED_OF_TRAINING:
				return speedOfTraining != SPEED_OF_TRAINING_EDEFAULT;
			case MyModelPackage.CRITERIAS__LABELED_DATA:
				return labeledData != LABELED_DATA_EDEFAULT;
			case MyModelPackage.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE:
				return nmberOfLabelsByClasse != NMBER_OF_LABELS_BY_CLASSE_EDEFAULT;
			case MyModelPackage.CRITERIAS__NUMBER_OF_CLASSES:
				return numberOfClasses != NUMBER_OF_CLASSES_EDEFAULT;
			case MyModelPackage.CRITERIAS__SMALL_DATA_SET:
				return smallDataSet != SMALL_DATA_SET_EDEFAULT;
			case MyModelPackage.CRITERIAS__HIGH_TRAINING_SPEED:
				return highTrainingSpeed != HIGH_TRAINING_SPEED_EDEFAULT;
			case MyModelPackage.CRITERIAS__EXPLAINABLE:
				return explainable != EXPLAINABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Overfitting: ");
		result.append(overfitting);
		result.append(", ImbalancedDataSet: ");
		result.append(imbalancedDataSet);
		result.append(", MinoryClass: ");
		result.append(minoryClass);
		result.append(", ProblemType: ");
		result.append(problemType);
		result.append(", ConfidentialyDataLableled: ");
		result.append(confidentialyDataLableled);
		result.append(", Accuracy: ");
		result.append(accuracy);
		result.append(", DataType: ");
		result.append(dataType);
		result.append(", SpeedOfTraining: ");
		result.append(speedOfTraining);
		result.append(", LabeledData: ");
		result.append(labeledData);
		result.append(", NmberOfLabelsByClasse: ");
		result.append(nmberOfLabelsByClasse);
		result.append(", NumberOfClasses: ");
		result.append(numberOfClasses);
		result.append(", SmallDataSet: ");
		result.append(smallDataSet);
		result.append(", HighTrainingSpeed: ");
		result.append(highTrainingSpeed);
		result.append(", Explainable: ");
		result.append(explainable);
		result.append(')');
		return result.toString();
	}

} //CriteriasImpl
