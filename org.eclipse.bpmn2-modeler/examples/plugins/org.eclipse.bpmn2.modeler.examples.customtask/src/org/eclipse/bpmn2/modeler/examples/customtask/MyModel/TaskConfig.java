/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSeperateData <em>Seperate Data</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSampling <em>Sampling</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getNeutralClass <em>Neutral Class</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCriterias <em>Criterias</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithmNameStr <em>Algorithm Name Str</em>}</li>
 * </ul>
 *
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig()
 * @model
 * @generated
 */
public interface TaskConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme
	 * @see #setAlgorithm(TypeAlgorithme)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_Algorithm()
	 * @model
	 * @generated
	 */
	TypeAlgorithme getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(TypeAlgorithme value);

	/**
	 * Returns the value of the '<em><b>Seperate Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seperate Data</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData
	 * @see #setSeperateData(SeperateData)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_SeperateData()
	 * @model dataType="org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData"
	 * @generated
	 */
	SeperateData getSeperateData();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSeperateData <em>Seperate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperate Data</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData
	 * @see #getSeperateData()
	 * @generated
	 */
	void setSeperateData(SeperateData value);

	/**
	 * Returns the value of the '<em><b>Sampling</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling
	 * @see #setSampling(Sampling)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_Sampling()
	 * @model
	 * @generated
	 */
	Sampling getSampling();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getSampling <em>Sampling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Sampling
	 * @see #getSampling()
	 * @generated
	 */
	void setSampling(Sampling value);

	/**
	 * Returns the value of the '<em><b>Neutral Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Class</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass
	 * @see #setNeutralClass(NeutralClass)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_NeutralClass()
	 * @model
	 * @generated
	 */
	NeutralClass getNeutralClass();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getNeutralClass <em>Neutral Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Class</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.NeutralClass
	 * @see #getNeutralClass()
	 * @generated
	 */
	void setNeutralClass(NeutralClass value);

	/**
	 * Returns the value of the '<em><b>Cross Uncorrelated Features</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Uncorrelated Features</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures
	 * @see #setCrossUncorrelatedFeatures(CrossUncorrelatedFeatures)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_CrossUncorrelatedFeatures()
	 * @model
	 * @generated
	 */
	CrossUncorrelatedFeatures getCrossUncorrelatedFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCrossUncorrelatedFeatures <em>Cross Uncorrelated Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Uncorrelated Features</em>' attribute.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.CrossUncorrelatedFeatures
	 * @see #getCrossUncorrelatedFeatures()
	 * @generated
	 */
	void setCrossUncorrelatedFeatures(CrossUncorrelatedFeatures value);

	/**
	 * Returns the value of the '<em><b>Criterias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterias</em>' containment reference.
	 * @see #setCriterias(Criterias)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_Criterias()
	 * @model containment="true" upper="-2"
	 * @generated
	 */
	Criterias getCriterias();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getCriterias <em>Criterias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterias</em>' containment reference.
	 * @see #getCriterias()
	 * @generated
	 */
	void setCriterias(Criterias value);

	/**
	 * Returns the value of the '<em><b>Algorithm Name Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Name Str</em>' attribute.
	 * @see #setAlgorithmNameStr(String)
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getTaskConfig_AlgorithmNameStr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAlgorithmNameStr();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig#getAlgorithmNameStr <em>Algorithm Name Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Name Str</em>' attribute.
	 * @see #getAlgorithmNameStr()
	 * @generated
	 */
	void setAlgorithmNameStr(String value);

} // TaskConfig
