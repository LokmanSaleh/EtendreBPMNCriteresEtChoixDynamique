/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.YesNo;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CriteriasItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriasItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOverfittingPropertyDescriptor(object);
			addImbalancedDataSetPropertyDescriptor(object);
			addMinoryClassPropertyDescriptor(object);
			addProblemTypePropertyDescriptor(object);
			addConfidentialyDataLableledPropertyDescriptor(object);
			addAccuracyPropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
			addSpeedOfTrainingPropertyDescriptor(object);
			addLabeledDataPropertyDescriptor(object);
			addNmberOfLabelsByClassePropertyDescriptor(object);
			addNumberOfClassesPropertyDescriptor(object);
			addSmallDataSetPropertyDescriptor(object);
			addHighTrainingSpeedPropertyDescriptor(object);
			addExplainablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overfitting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverfittingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_Overfitting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_Overfitting_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__OVERFITTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imbalanced Data Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImbalancedDataSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_ImbalancedDataSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_ImbalancedDataSet_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__IMBALANCED_DATA_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minory Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinoryClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_MinoryClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_MinoryClass_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__MINORY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Problem Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProblemTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_ProblemType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_ProblemType_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__PROBLEM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Confidentialy Data Lableled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfidentialyDataLableledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_ConfidentialyDataLableled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_ConfidentialyDataLableled_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__CONFIDENTIALY_DATA_LABLELED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accuracy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccuracyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_Accuracy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_Accuracy_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__ACCURACY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_DataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_DataType_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__DATA_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed Of Training feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedOfTrainingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_SpeedOfTraining_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_SpeedOfTraining_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__SPEED_OF_TRAINING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Labeled Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabeledDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_LabeledData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_LabeledData_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__LABELED_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nmber Of Labels By Classe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNmberOfLabelsByClassePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_NmberOfLabelsByClasse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_NmberOfLabelsByClasse_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_NumberOfClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_NumberOfClasses_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__NUMBER_OF_CLASSES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Small Data Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmallDataSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_SmallDataSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_SmallDataSet_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__SMALL_DATA_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the High Training Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHighTrainingSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_HighTrainingSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_HighTrainingSpeed_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__HIGH_TRAINING_SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Explainable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExplainablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Criterias_Explainable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Criterias_Explainable_feature", "_UI_Criterias_type"),
				 MyModelPackage.Literals.CRITERIAS__EXPLAINABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Criterias.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Criterias"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		YesNo labelValue = ((Criterias)object).getOverfitting();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Criterias_type") :
			getString("_UI_Criterias_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Criterias.class)) {
			case MyModelPackage.CRITERIAS__OVERFITTING:
			case MyModelPackage.CRITERIAS__IMBALANCED_DATA_SET:
			case MyModelPackage.CRITERIAS__MINORY_CLASS:
			case MyModelPackage.CRITERIAS__PROBLEM_TYPE:
			case MyModelPackage.CRITERIAS__CONFIDENTIALY_DATA_LABLELED:
			case MyModelPackage.CRITERIAS__ACCURACY:
			case MyModelPackage.CRITERIAS__DATA_TYPE:
			case MyModelPackage.CRITERIAS__SPEED_OF_TRAINING:
			case MyModelPackage.CRITERIAS__LABELED_DATA:
			case MyModelPackage.CRITERIAS__NMBER_OF_LABELS_BY_CLASSE:
			case MyModelPackage.CRITERIAS__NUMBER_OF_CLASSES:
			case MyModelPackage.CRITERIAS__SMALL_DATA_SET:
			case MyModelPackage.CRITERIAS__HIGH_TRAINING_SPEED:
			case MyModelPackage.CRITERIAS__EXPLAINABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MyModelEditPlugin.INSTANCE;
	}

}
