/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl;

import java.util.Collection;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getSeperateData <em>Seperate Data</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getSampling <em>Sampling</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getNeutralClass <em>Neutral Class</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getCrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getCriterias <em>Criterias</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.TaskConfigImpl#getAlgorithmNameStr <em>Algorithm Name Str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskConfigImpl extends EObjectImpl implements TaskConfig {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAlgorithme ALGORITHM_EDEFAULT = TypeAlgorithme.NAIVE_BAYES;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected TypeAlgorithme algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeperateData() <em>Seperate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperateData()
	 * @generated
	 * @ordered
	 */
	protected static final SeperateData SEPERATE_DATA_EDEFAULT = SeperateData.SEPERATE_DATA_INTO_TRAINING_AND_TESTING;

	/**
	 * The cached value of the '{@link #getSeperateData() <em>Seperate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperateData()
	 * @generated
	 * @ordered
	 */
	protected SeperateData seperateData = SEPERATE_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampling() <em>Sampling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampling()
	 * @generated
	 * @ordered
	 */
	protected static final Sampling SAMPLING_EDEFAULT = Sampling.OVER_SAMPLING;

	/**
	 * The cached value of the '{@link #getSampling() <em>Sampling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampling()
	 * @generated
	 * @ordered
	 */
	protected Sampling sampling = SAMPLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralClass() <em>Neutral Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralClass()
	 * @generated
	 * @ordered
	 */
	protected static final NeutralClass NEUTRAL_CLASS_EDEFAULT = NeutralClass.ADD_NEUTRAL_CLASS;

	/**
	 * The cached value of the '{@link #getNeutralClass() <em>Neutral Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralClass()
	 * @generated
	 * @ordered
	 */
	protected NeutralClass neutralClass = NEUTRAL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossUncorrelatedFeatures() <em>Cross Uncorrelated Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossUncorrelatedFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final CrossUncorrelatedFeatures CROSS_UNCORRELATED_FEATURES_EDEFAULT = CrossUncorrelatedFeatures.CROSS_UNCORRELATED_FEATURES;

	/**
	 * The cached value of the '{@link #getCrossUncorrelatedFeatures() <em>Cross Uncorrelated Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossUncorrelatedFeatures()
	 * @generated
	 * @ordered
	 */
	protected CrossUncorrelatedFeatures crossUncorrelatedFeatures = CROSS_UNCORRELATED_FEATURES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCriterias() <em>Criterias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterias()
	 * @generated
	 * @ordered
	 */
	protected Criterias criterias;

	/**
	 * The default value of the '{@link #getAlgorithmNameStr() <em>Algorithm Name Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmNameStr()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_NAME_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmNameStr() <em>Algorithm Name Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmNameStr()
	 * @generated
	 * @ordered
	 */
	protected String algorithmNameStr = ALGORITHM_NAME_STR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.TASK_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAlgorithme getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(TypeAlgorithme newAlgorithm) {
		TypeAlgorithme oldAlgorithm = algorithm;
		algorithm = newAlgorithm == null ? ALGORITHM_EDEFAULT : newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeperateData getSeperateData() {
		return seperateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeperateData(SeperateData newSeperateData) {
		SeperateData oldSeperateData = seperateData;
		seperateData = newSeperateData == null ? SEPERATE_DATA_EDEFAULT : newSeperateData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__SEPERATE_DATA, oldSeperateData, seperateData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sampling getSampling() {
		return sampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSampling(Sampling newSampling) {
		Sampling oldSampling = sampling;
		sampling = newSampling == null ? SAMPLING_EDEFAULT : newSampling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__SAMPLING, oldSampling, sampling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeutralClass getNeutralClass() {
		return neutralClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeutralClass(NeutralClass newNeutralClass) {
		NeutralClass oldNeutralClass = neutralClass;
		neutralClass = newNeutralClass == null ? NEUTRAL_CLASS_EDEFAULT : newNeutralClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__NEUTRAL_CLASS, oldNeutralClass, neutralClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossUncorrelatedFeatures getCrossUncorrelatedFeatures() {
		return crossUncorrelatedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossUncorrelatedFeatures(CrossUncorrelatedFeatures newCrossUncorrelatedFeatures) {
		CrossUncorrelatedFeatures oldCrossUncorrelatedFeatures = crossUncorrelatedFeatures;
		crossUncorrelatedFeatures = newCrossUncorrelatedFeatures == null ? CROSS_UNCORRELATED_FEATURES_EDEFAULT : newCrossUncorrelatedFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__CROSS_UNCORRELATED_FEATURES, oldCrossUncorrelatedFeatures, crossUncorrelatedFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criterias getCriterias() {
		return criterias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriterias(Criterias newCriterias, NotificationChain msgs) {
		Criterias oldCriterias = criterias;
		criterias = newCriterias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__CRITERIAS, oldCriterias, newCriterias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriterias(Criterias newCriterias) {
		if (newCriterias != criterias) {
			NotificationChain msgs = null;
			if (criterias != null)
				msgs = ((InternalEObject)criterias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.TASK_CONFIG__CRITERIAS, null, msgs);
			if (newCriterias != null)
				msgs = ((InternalEObject)newCriterias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyModelPackage.TASK_CONFIG__CRITERIAS, null, msgs);
			msgs = basicSetCriterias(newCriterias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__CRITERIAS, newCriterias, newCriterias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithmNameStr() {
		return algorithmNameStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithmNameStr(String newAlgorithmNameStr) {
		String oldAlgorithmNameStr = algorithmNameStr;
		algorithmNameStr = newAlgorithmNameStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyModelPackage.TASK_CONFIG__ALGORITHM_NAME_STR, oldAlgorithmNameStr, algorithmNameStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyModelPackage.TASK_CONFIG__CRITERIAS:
				return basicSetCriterias(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.TASK_CONFIG__ALGORITHM:
				return getAlgorithm();
			case MyModelPackage.TASK_CONFIG__SEPERATE_DATA:
				return getSeperateData();
			case MyModelPackage.TASK_CONFIG__SAMPLING:
				return getSampling();
			case MyModelPackage.TASK_CONFIG__NEUTRAL_CLASS:
				return getNeutralClass();
			case MyModelPackage.TASK_CONFIG__CROSS_UNCORRELATED_FEATURES:
				return getCrossUncorrelatedFeatures();
			case MyModelPackage.TASK_CONFIG__CRITERIAS:
				return getCriterias();
			case MyModelPackage.TASK_CONFIG__ALGORITHM_NAME_STR:
				return getAlgorithmNameStr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyModelPackage.TASK_CONFIG__ALGORITHM:
				setAlgorithm(TypeAlgorithme.get(((Enumerator)newValue).getValue()));
				return;
			case MyModelPackage.TASK_CONFIG__SEPERATE_DATA:
				setSeperateData((SeperateData)newValue);
				return;
			case MyModelPackage.TASK_CONFIG__SAMPLING:
				setSampling((Sampling)newValue);
				return;
			case MyModelPackage.TASK_CONFIG__NEUTRAL_CLASS:
				setNeutralClass((NeutralClass)newValue);
				return;
			case MyModelPackage.TASK_CONFIG__CROSS_UNCORRELATED_FEATURES:
				setCrossUncorrelatedFeatures((CrossUncorrelatedFeatures)newValue);
				return;
			case MyModelPackage.TASK_CONFIG__CRITERIAS:
				setCriterias((Criterias)newValue);
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
			case MyModelPackage.TASK_CONFIG__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case MyModelPackage.TASK_CONFIG__SEPERATE_DATA:
				setSeperateData(SEPERATE_DATA_EDEFAULT);
				return;
			case MyModelPackage.TASK_CONFIG__SAMPLING:
				setSampling(SAMPLING_EDEFAULT);
				return;
			case MyModelPackage.TASK_CONFIG__NEUTRAL_CLASS:
				setNeutralClass(NEUTRAL_CLASS_EDEFAULT);
				return;
			case MyModelPackage.TASK_CONFIG__CROSS_UNCORRELATED_FEATURES:
				setCrossUncorrelatedFeatures(CROSS_UNCORRELATED_FEATURES_EDEFAULT);
				return;
			case MyModelPackage.TASK_CONFIG__CRITERIAS:
				setCriterias((Criterias)null);
				return;
			case MyModelPackage.TASK_CONFIG__ALGORITHM_NAME_STR:
				setAlgorithmNameStr(ALGORITHM_NAME_STR_EDEFAULT);
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
			case MyModelPackage.TASK_CONFIG__ALGORITHM:
				return algorithm != ALGORITHM_EDEFAULT;
			case MyModelPackage.TASK_CONFIG__SEPERATE_DATA:
				return seperateData != SEPERATE_DATA_EDEFAULT;
			case MyModelPackage.TASK_CONFIG__SAMPLING:
				return sampling != SAMPLING_EDEFAULT;
			case MyModelPackage.TASK_CONFIG__NEUTRAL_CLASS:
				return neutralClass != NEUTRAL_CLASS_EDEFAULT;
			case MyModelPackage.TASK_CONFIG__CROSS_UNCORRELATED_FEATURES:
				return crossUncorrelatedFeatures != CROSS_UNCORRELATED_FEATURES_EDEFAULT;
			case MyModelPackage.TASK_CONFIG__CRITERIAS:
				return criterias != null;
			case MyModelPackage.TASK_CONFIG__ALGORITHM_NAME_STR:
				return ALGORITHM_NAME_STR_EDEFAULT == null ? algorithmNameStr != null : !ALGORITHM_NAME_STR_EDEFAULT.equals(algorithmNameStr);
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
		result.append(" (Algorithm: ");
		result.append(algorithm);
		result.append(", SeperateData: ");
		result.append(seperateData);
		result.append(", Sampling: ");
		result.append(sampling);
		result.append(", NeutralClass: ");
		result.append(neutralClass);
		result.append(", CrossUncorrelatedFeatures: ");
		result.append(crossUncorrelatedFeatures);
		result.append(", AlgorithmNameStr: ");
		result.append(algorithmNameStr);
		result.append(')');
		return result.toString();
	}

} //TaskConfigImpl
