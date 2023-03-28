/*******************************************************************************
 * Copyright (c) 2011, 2012, 2013, 2014 Red Hat, Inc.
 *  All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 *
 * @author Bob Brodt
 ******************************************************************************/

package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.ExtensionAttributeValue;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.TextObjectEditor;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalDeux;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandEgalUn;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.PlusGandPlusPetitDeux;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.impl.CriteriasImpl;
import org.eclipse.bpmn2.modeler.ui.preferences.SelectableComboFieldEditor;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.swt.widgets.Composite;
 
public class MyTaskDetailComposite extends DefaultDetailComposite {
	final static EStructuralFeature METADATA_FEATURE = MyModelPackage.eINSTANCE.getDocumentRoot_TaskConfig();

	public MyTaskDetailComposite(AbstractBpmn2PropertySection section) {
		super(section);
	}

	public MyTaskDetailComposite(Composite parent, int style) {
		super(parent, style);
	}
	/**
	 * Find the first entry in this BaseElement's extension elements container
	 * that matches the given structural feature.
	 * 
	 * @param be a BaseElement
	 * @param feature the structural feature to search for
	 * @return the value of the extension element
	 */
	Object findExtensionAttributeValue(BaseElement be, EStructuralFeature feature) {
		for (ExtensionAttributeValue eav : be.getExtensionValues()) {
			for (FeatureMap.Entry entry : eav.getValue()) {
				if (entry.getEStructuralFeature() == feature) {
					return entry.getValue();
				}
			}
		}
		return null;
	}
	@Override
	public void createBindings(EObject be) {
		// This must be a Task because this Property Tab is only active for Tasks.
		// The Property Tab will only display the Parameter list in our TaskConfig
		// model element (see the definition of this element in MyModel.ecore).
		
		TaskConfig metaData = (TaskConfig) findExtensionAttributeValue((BaseElement)be, METADATA_FEATURE);
		
		Task myTask = (Task) be;
		//TypeAlgorithme algorithm = (TypeAlgorithme) findExtensionAttributeValue((BaseElement)be, MyModelPackage.eINSTANCE.getTaskConfig_Algorithm());

		TaskConfig taskConfig = null;
		SelectableComboFieldEditor nameEditor = null;
		// Fetch all TaskConfig extension objects from the Task
		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
		if (allTaskConfigs.size() == 0) {
			// There are none, so we need to construct a new TaskConfig
			// which is required by the Property Sheet UI.
			taskConfig = MyModelFactory.eINSTANCE.createTaskConfig();
			TargetRuntime rt = getTargetRuntime();
			// We need our CustomTaskDescriptor for this Task. The ID must match
			// the one defined in the <customTask> extension point in plugin.xml
			CustomTaskDescriptor ctd = rt.getCustomTask("org.eclipse.bpmn2.modeler.examples.customtask.customTask1");
			// Get the model feature for the "taskConfig" element name.
			// Again, this must match the <property> element in <customTask>
			EStructuralFeature feature = ctd.getModelDecorator().getEStructuralFeature(be, "taskConfig");

			// Add the newly constructed TaskConfig object to the Task's Extension Values
			// list.
			// Note that we will delay the actual insertion of the new object until some
			// feature
			// of the object changes (e.g. the Parameter.name)
			ModelDecorator.addExtensionAttributeValue(myTask.eResource(), myTask, feature, taskConfig, true);
			
			//EStructuralFeature feature2 = ctd.getModelDecorator().getEStructuralFeature(be, "selectableComboFieldEditor");

			//ModelDecorator.addExtensionAttributeValue(myTask.eResource(), myTask, feature2, nameEditor, true);


			
			
		} else {
			// Else reuse the existing TaskConfig object.
			taskConfig = allTaskConfigs.get(0);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		// Obtain the package and factory instances for the existing model
//		MyModelPackage myPackage = MyModelPackage.eINSTANCE;
//		MyModelFactory myFactory = MyModelFactory.eINSTANCE;
//
//		// Create a new EEnum for the gender enumeration
//		EEnum genderEnum = EcoreFactory.eINSTANCE.createEEnum();
//		genderEnum.setName("Gender");
//		genderEnum.setInstanceTypeName("http://org.eclipse.bpmn2.modeler.examples.customtask#//Gender");
//
//		// Create the EEnumLiterals for the gender enumeration
//		EEnumLiteral maleLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//		maleLiteral.setName("MALE");
//		maleLiteral.setValue(0);
//		genderEnum.getELiterals().add(maleLiteral);
//
//		EEnumLiteral femaleLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//		femaleLiteral.setName("FEMALE");
//		femaleLiteral.setValue(1);
//		genderEnum.getELiterals().add(femaleLiteral);
//
//		// Add the new enumeration to the Person class
//		EClass personClass = myPackage.getTaskConfig();
//		EReference myEnumRef = EcoreFactory.eINSTANCE.createEReference();
//		myEnumRef.setName("myEnum");
//		myEnumRef.setEType(personClass.getEPackage().getEClassifier("Gender"));
//		myEnumRef.setLowerBound(0);
//		myEnumRef.setUpperBound(1);
//		myEnumRef.setChangeable(true);
//		myEnumRef.setContainment(false);
//		personClass.getEStructuralFeatures().add(myEnumRef);
//
//		
//		EAttribute genderAttribute = EcoreFactory.eINSTANCE.createEAttribute();
//		genderAttribute.setName("gender");
//		genderAttribute.setEType(genderEnum);
//		
//		// Create a new Person instance and set the gender
//		TaskConfig person = myFactory.createTaskConfig();
//		//person.setGender(genderEnum.getELiterals().get(0));
//
//		// Save the Person instance to a resource
//		ResourceSet resourceSet2 = new ResourceSetImpl();
//		Resource resource2 = resourceSet2.createResource(URI.createFileURI("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\org.eclipse.bpmn2.modeler.examples.customtask\\model\\MyModel.ecore"));
//		resource2.getContents().add(person);
//		try {
//			resource2.save(null);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {

			// Replace "http://example.com/mypackage" with the actual namespace URI of your
			// package
//			EEnum enumer = (EEnum) EPackage.Registry.INSTANCE
//					.getEPackage("http://org.eclipse.bpmn2.modeler.examples.customtask")
//					.getEClassifier("TypeAlgorithme");
//			
			

			// Step 1: Get the existing EEnum instance
			EEnum enumer = (EEnum) EPackage.Registry.INSTANCE
					.getEPackage("http://org.eclipse.bpmn2.modeler.examples.customtask")
					.getEClassifier("TypeAlgorithme");

//			// Step 2: Create a new EEnum instance
//			EEnum newEnum = EcoreFactory.eINSTANCE.createEEnum();
//			newEnum.setName("ExtendedTaskType");
//			newEnum.setInstanceTypeName("java.lang.String"); // set the data type of the enum if not EString
//			newEnum.setNsPrefix(enumer.getEPackage().getNsPrefix());
//			newEnum.setNsURI(enumer.getEPackage().getNsURI());
//			//newEnum.set(existingEnum.getEPackage()); // set the namespace of the new enum
//
//			// Step 3: Copy existing EEnumLiterals to the new EEnum
//			for (EEnumLiteral existingLiteral : enumer.getELiterals()) {
//			    EEnumLiteral newLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//			    newLiteral.setName(existingLiteral.getName());
//			    newLiteral.setValue(existingLiteral.getValue());
//			    newEnum.getELiterals().add(newLiteral);
//			}
//
//			// Step 4: Add new EEnumLiteral to the new EEnum
//			EEnumLiteral newLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//			newLiteral.setName("EXECUTE");
//			newLiteral.setValue(100); // This value should be unique within the enum
//			newEnum.getELiterals().add(newLiteral);
//
//			// Step 5: Add the new EEnum to the EPackage containing the existing EEnum
//			enumer.getEPackage().getEClassifiers().add(newEnum);
//
//			// Step 6: Save the changes to the model resource
//			try {
//				enumer.eResource().save(Collections.emptyMap());
//			} catch (IOException e) {
//			    // Handle the exception
//			}
			
			
//			EEnumLiteral newLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//
//			// Set the name and value of the new EEnumLiteral
//			newLiteral.setName("NEW_LITERAL_NAME");
//			newLiteral.setValue(enumer.getELiterals().size() );
//			newLiteral.setLiteral("NEW_LITERAL_NAME");
//
//			// Add the new EEnumLiteral to the EEnum
//			enumer.getELiterals().add(newLiteral);
//
////			// Obtain the resource containing the model
//			ResourceSet resourceSet = new ResourceSetImpl();
//			Resource resource = resourceSet.getResource(URI.createURI("http://org.eclipse.bpmn2.modeler.examples.customtask"), true);
//
//			// Make some modifications to the model
// 
//			// Save the changes to the resource
//			try {
////				enumer.eResource().save(Collections.emptyMap());
//			    resource.save(null);
//			} catch (IOException e) {
//			    // Handle the exception
//			}
//			
//			
//			
			
			
			
			
//			// Define the EEnum
//			EEnum typeAlgorithmeEEnum = EcoreFactory.eINSTANCE.createEEnum();
//			typeAlgorithmeEEnum.setName("TypeAlgorithme");

//			// Associate the EEnum with the Java enumeration class
//			enumer.setInstanceClassName("org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme");
//
//			
//			// Add EEnumLiterals to the EEnum
//			EEnumLiteral naiveBayesLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//			naiveBayesLiteral.setName("NAIVE_BAYES");
//			naiveBayesLiteral.setValue(0);
//			enumer.getELiterals().add(naiveBayesLiteral);
//
//			EEnumLiteral decisionTreeLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
//			decisionTreeLiteral.setName("DECISION_TREE");
//			decisionTreeLiteral.setValue(1);
//			enumer.getELiterals().add(decisionTreeLiteral);
			
			
			
			
			
			
			
			
//			
//			EEnumLiteral newLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
	//
//			// Set the name and value of the new EEnumLiteral
//			newLiteral.setName("NEW_LITERAL_NAME");
//			newLiteral.setValue(enumer.getELiterals().size() );
//			newLiteral.setLiteral("NEW_LITERAL_NAME");
	//
//			// Add the new EEnumLiteral to the EEnum
//			enumer.getELiterals().add(newLiteral);

			
			
			
			
//			// Obtain the resource containing the model
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(URI.createURI("http://org.eclipse.bpmn2.modeler.examples.customtask"), true);

			// Make some modifications to the model

			// Save the changes to the resource
			try {
//				enumer.eResource().save(Collections.emptyMap());
			    resource.save(null);
			} catch (IOException e) {
			    // Handle the exception
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			// Save the changes to the resource
//			resource.save(Collections.emptyMap());
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			// enable all the iteral
			for (EEnumLiteral enumliteral : enumer.getELiterals()) {
				enumliteral.setLiteral(enumliteral.getName());
			}

			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\lookm\\git\\org.eclipse.bpmn2-modeler\\examples\\plugins\\org.eclipse.bpmn2.modeler.examples.customtask\\src\\org\\eclipse\\bpmn2\\modeler\\examples\\customtask\\MyModel\\util\\Criteria.txt"));

			String[] firstLine = br.readLine().split(";");

			resources.Criteria criteria = new resources.Criteria();

			// Process the query results
			criteria.setId(Integer.parseInt(firstLine[0]));
			criteria.setOverfitting(firstLine[1]);
			criteria.setImbalancedDataSet(firstLine[2]);
			criteria.setMinoryClass(firstLine[3]);
			criteria.setProblemType(firstLine[4]);
			criteria.setConfidentialyDataLableled(firstLine[5]);
			criteria.setAccuracy(firstLine[6]);
			criteria.setDataType(firstLine[7]);
			criteria.setSpeedOfTraining(firstLine[8]);
			criteria.setLabeledData(firstLine[9]);
			criteria.setNmberOfLabelsByClasse(firstLine[10]);
			criteria.setNumberOfClasses(firstLine[11]);
			criteria.setSmallDataSet(firstLine[12]);
			criteria.setHighTrainingSpeed(firstLine[13]);
			criteria.setExplainable(firstLine[14]); 

			List<String> algosToAdd = new ArrayList<String>();
			
				if (criteria.getLabeledData().equals("No")) {
					algosToAdd.add(TypeAlgorithme.CLUSTERING_ALGORITHMS.toString());
				} 
				
				//DataType==Continue && LabeledData==Yes
				if (criteria.getDataType().equals("Continue") &&
					criteria.getLabeledData().equals("Yes")) {
					
					algosToAdd.add(TypeAlgorithme.REGRESSION_ALGORITHMS.toString());
				} 
				//NmberOfLabelsByClasse>1 && DataType==Categorial && LabeledData==Yes ">1"
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.PLUS_GRAND_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes")) {
						
						algosToAdd.add(TypeAlgorithme.MULTI_LABEL_CLASSIFICATION.toString());
					} 
				//NmberOfLabelsByClasse==1 && DataType==Categorial && LabeledData==Yes && NumberOfClasses>2
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.EGAL_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes") &&
						criteria.getNumberOfClasses().equals(PlusGandEgalDeux.PLUS_GRAND_2.toString())) {
						
						algosToAdd.add(TypeAlgorithme.MULTI_CLASS_CLASSIFICATION.toString());
					} 
				//NmberOfLabelsByClasse==1 && DataType==Categorial && LabeledData==Yes && NumberOfClasses==2 && SmallDataSet==No && HighTrainingSpeed==No && Explainable==No && Accuracy==High
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.EGAL_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes") &&
						criteria.getNumberOfClasses().equals(PlusGandEgalDeux.EGAL_2.toString()) &&
						criteria.getSmallDataSet().equals("No") &&
						criteria.getHighTrainingSpeed().equals("No") &&
						criteria.getExplainable().equals("No") &&
						criteria.getAccuracy().equals("High")) {
						
						algosToAdd.add(TypeAlgorithme.NEURAL_NETWORK.toString());
					} 
				//NmberOfLabelsByClasse==1 && DataType==Categorial && LabeledData==Yes && NumberOfClasses==2 && SmallDataSet==Yes && HighTrainingSpeed==Yes && Explainable==Yes && Accuracy==High
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.EGAL_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes") &&
						criteria.getNumberOfClasses().equals(PlusGandEgalDeux.EGAL_2.toString()) &&
						criteria.getSmallDataSet().equals("Yes") &&
						criteria.getHighTrainingSpeed().equals("Yes") &&
						criteria.getExplainable().equals("Yes") &&
						criteria.getAccuracy().equals("High")) {
						
						algosToAdd.add(TypeAlgorithme.DESCION_TREE.toString());
					} 
				
				//NmberOfLabelsByClasse==1 && DataType==Categorial && LabeledData==Yes && NumberOfClasses==2 && SmallDataSet==Yes && HighTrainingSpeed==Yes && Explainable==Yes && Accuracy==High
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.EGAL_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes") &&
						criteria.getNumberOfClasses().equals(PlusGandEgalDeux.EGAL_2.toString()) &&
						criteria.getSmallDataSet().equals("Yes") &&
						criteria.getHighTrainingSpeed().equals("Yes") &&
						criteria.getExplainable().equals("Yes") &&
						criteria.getAccuracy().equals("High")) {
						
						algosToAdd.add(TypeAlgorithme.BAYESIAN_NETWORK.toString());
					} 
				
				//NmberOfLabelsByClasse==1 && DataType==Categorial && LabeledData==Yes && NumberOfClasses==2 && SmallDataSet==Yes && HighTrainingSpeed==No && Explainable==No && Accuracy==High
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.EGAL_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes") &&
						criteria.getNumberOfClasses().equals(PlusGandEgalDeux.EGAL_2.toString()) &&
						criteria.getSmallDataSet().equals("Yes") &&
						criteria.getHighTrainingSpeed().equals("No") &&
						criteria.getExplainable().equals("No") &&
						criteria.getAccuracy().equals("High")) {
						
						algosToAdd.add(TypeAlgorithme.SVM.toString());
					} 
				//NmberOfLabelsByClasse==1 && DataType==Categorial && LabeledData==Yes && NumberOfClasses==2 && SmallDataSet==Yes && HighTrainingSpeed==Yes && Explainable==Yes
				if (criteria.getNmberOfLabelsByClasse().equals(PlusGandEgalUn.EGAL_1.toString()) &&
						criteria.getDataType().equals("Categorial") &&
						criteria.getLabeledData().equals("Yes") &&
						criteria.getNumberOfClasses().equals(PlusGandEgalDeux.EGAL_2.toString()) &&
						criteria.getSmallDataSet().equals("Yes") &&
						criteria.getHighTrainingSpeed().equals("Yes") &&
						criteria.getExplainable().equals("Yes")) {
						
						algosToAdd.add(TypeAlgorithme.SVM.toString());
					} 
				
				
//			List<String> elementsToRemove = new ArrayList<String>();
//
//			// conditions
//			if (criteria.getLabeledData().equals("Yes"))
//				elementsToRemove.add(TypeAlgorithme.REGROUPEMENT.toString());
//			
//			if (criteria.getLabeledData().equals("No")) { 
//				elementsToRemove.add(TypeAlgorithme.CLASSIFICATION.toString());
//				elementsToRemove.add(TypeAlgorithme.REGRESSION.toString());
//			}

			// Disabled the cibled iteral
			for (EEnumLiteral enumliteral : enumer.getELiterals()) {
				
				if (!algosToAdd.contains(enumliteral.getName())) {
					
					//enumliteral.setLiteral("");
					
				}
			}

			// save modification to ecore
			EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;
			EPackage ePackage = packageRegistry.getEPackage("http://org.eclipse.bpmn2.modeler.examples.customtask");
			ePackage.eResource().save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			// Handle exception
		}

//		TextObjectEditor nameEditor = new TextObjectEditor(this, metaData, METADATA_NAME);
//		//TextObjectEditor valueEditor = new TextObjectEditor(this, metaData, METADATA_VALUE);
//		//valueEditor.setMultiLine(true);
//		nameEditor.createControl(section, "Name");
		

		
		
//	    String[][] newArray = new String[2][2];
//	    newArray[0][0] = "France";
//	    newArray[0][1] = "Blue";
//
//	    newArray[1][0] = "Ireland";
//	    newArray[1][1] = "Green";
//		
		//nameEditor = new SelectableComboFieldEditor("EMPTY_LABEL_PROPERTY", "EMPTY_LABEL_PROPERTY", newArray, getAttributesParent()); //(this, metaData, METADATA_NAME);
		//ModelDecorator.addExtensionAttributeValue(myTask.eResource(), myTask, feature, taskConfig, true);
		

		bindAttribute(taskConfig, MyModelPackage.eINSTANCE.getTaskConfig_Algorithm());
	}

}