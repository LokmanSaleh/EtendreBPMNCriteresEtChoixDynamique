/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getOverfitting <em>Overfitting</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getImbalancedDataSet <em>Imbalanced Data Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getMinoryClass <em>Minory Class</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getProblemType <em>Problem Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getConfidentialyDataLableled <em>Confidentialy Data Lableled</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSpeedOfTraining <em>Speed Of Training</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getLabeledData <em>Labeled Data</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNmberOfLabelsByClasse <em>Nmber Of Labels By Classe</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNumberOfClasses <em>Number Of Classes</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSmallDataSet <em>Small Data Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getHighTrainingSpeed <em>High Training Speed</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getExplainable <em>Explainable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias()
 * @model
 * @generated
 */
public interface Criterias extends EObject {
	/**
	 * Returns the value of the '<em><b>Overfitting</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overfitting</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setOverfitting(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_Overfitting()
	 * @model
	 * @generated
	 */
	YesNo getOverfitting();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getOverfitting <em>Overfitting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overfitting</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getOverfitting()
	 * @generated
	 */
	void setOverfitting(YesNo value);

	/**
	 * Returns the value of the '<em><b>Imbalanced Data Set</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imbalanced Data Set</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setImbalancedDataSet(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_ImbalancedDataSet()
	 * @model
	 * @generated
	 */
	YesNo getImbalancedDataSet();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getImbalancedDataSet <em>Imbalanced Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imbalanced Data Set</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getImbalancedDataSet()
	 * @generated
	 */
	void setImbalancedDataSet(YesNo value);

	/**
	 * Returns the value of the '<em><b>Minory Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minory Class</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille
	 * @see #setMinoryClass(PlusGandPlusPetitMille)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_MinoryClass()
	 * @model
	 * @generated
	 */
	PlusGandPlusPetitMille getMinoryClass();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getMinoryClass <em>Minory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minory Class</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitMille
	 * @see #getMinoryClass()
	 * @generated
	 */
	void setMinoryClass(PlusGandPlusPetitMille value);

	/**
	 * Returns the value of the '<em><b>Problem Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Type</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType
	 * @see #setProblemType(ProblemType)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_ProblemType()
	 * @model
	 * @generated
	 */
	ProblemType getProblemType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getProblemType <em>Problem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Type</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.ProblemType
	 * @see #getProblemType()
	 * @generated
	 */
	void setProblemType(ProblemType value);

	/**
	 * Returns the value of the '<em><b>Confidentialy Data Lableled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentialy Data Lableled</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setConfidentialyDataLableled(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_ConfidentialyDataLableled()
	 * @model
	 * @generated
	 */
	YesNo getConfidentialyDataLableled();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getConfidentialyDataLableled <em>Confidentialy Data Lableled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentialy Data Lableled</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getConfidentialyDataLableled()
	 * @generated
	 */
	void setConfidentialyDataLableled(YesNo value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
	 * @see #setAccuracy(HighModerateLow)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_Accuracy()
	 * @model
	 * @generated
	 */
	HighModerateLow getAccuracy();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(HighModerateLow value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType
	 * @see #setDataType(DataType)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Speed Of Training</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Of Training</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
	 * @see #setSpeedOfTraining(HighModerateLow)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_SpeedOfTraining()
	 * @model
	 * @generated
	 */
	HighModerateLow getSpeedOfTraining();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSpeedOfTraining <em>Speed Of Training</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Of Training</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.HighModerateLow
	 * @see #getSpeedOfTraining()
	 * @generated
	 */
	void setSpeedOfTraining(HighModerateLow value);

	/**
	 * Returns the value of the '<em><b>Labeled Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Data</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setLabeledData(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_LabeledData()
	 * @model
	 * @generated
	 */
	YesNo getLabeledData();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getLabeledData <em>Labeled Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled Data</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getLabeledData()
	 * @generated
	 */
	void setLabeledData(YesNo value);

	/**
	 * Returns the value of the '<em><b>Nmber Of Labels By Classe</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nmber Of Labels By Classe</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn
	 * @see #setNmberOfLabelsByClasse(PlusGandEgalUn)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_NmberOfLabelsByClasse()
	 * @model
	 * @generated
	 */
	PlusGandEgalUn getNmberOfLabelsByClasse();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNmberOfLabelsByClasse <em>Nmber Of Labels By Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nmber Of Labels By Classe</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn
	 * @see #getNmberOfLabelsByClasse()
	 * @generated
	 */
	void setNmberOfLabelsByClasse(PlusGandEgalUn value);

	/**
	 * Returns the value of the '<em><b>Number Of Classes</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Classes</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux
	 * @see #setNumberOfClasses(PlusGandEgalDeux)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_NumberOfClasses()
	 * @model
	 * @generated
	 */
	PlusGandEgalDeux getNumberOfClasses();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getNumberOfClasses <em>Number Of Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Classes</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux
	 * @see #getNumberOfClasses()
	 * @generated
	 */
	void setNumberOfClasses(PlusGandEgalDeux value);

	/**
	 * Returns the value of the '<em><b>Small Data Set</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Data Set</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setSmallDataSet(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_SmallDataSet()
	 * @model
	 * @generated
	 */
	YesNo getSmallDataSet();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getSmallDataSet <em>Small Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Data Set</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getSmallDataSet()
	 * @generated
	 */
	void setSmallDataSet(YesNo value);

	/**
	 * Returns the value of the '<em><b>High Training Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Training Speed</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setHighTrainingSpeed(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_HighTrainingSpeed()
	 * @model
	 * @generated
	 */
	YesNo getHighTrainingSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getHighTrainingSpeed <em>High Training Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Training Speed</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getHighTrainingSpeed()
	 * @generated
	 */
	void setHighTrainingSpeed(YesNo value);

	/**
	 * Returns the value of the '<em><b>Explainable</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explainable</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #setExplainable(YesNo)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getCriterias_Explainable()
	 * @model
	 * @generated
	 */
	YesNo getExplainable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias#getExplainable <em>Explainable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explainable</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo
	 * @see #getExplainable()
	 * @generated
	 */
	void setExplainable(YesNo value);

} // Criterias
