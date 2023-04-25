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

package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties.dataPreprocessing;

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
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.SeperateData;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme;
import org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties.Item;
import org.eclipse.bpmn2.modeler.ui.preferences.SelectableComboFieldEditor;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import resources.Criteria;
 
public class MyTaskDetailCompositeDataPreProcessing extends DefaultDetailComposite {

    private static Combo algorithmCombo;   
    private static String ConsevedChoice;
   
	public MyTaskDetailCompositeDataPreProcessing(AbstractBpmn2PropertySection section) {
		super(section);
	}

	public MyTaskDetailCompositeDataPreProcessing(Composite parent, int style) {
		super(parent, style);
	}

	public List<Item> GetCriteriaWithSelectedValue() {

		List<Item> listCritere = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\criteria.txt"))) {

			String line;

			while ((line = br.readLine()) != null) {

				String[] partsOfLine = line.split(";");

				for (int i = 0; i < partsOfLine.length;) {

					listCritere.add(new Item(partsOfLine[i], partsOfLine[i + 1]));
					i++;
					i++;

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return listCritere;
	}

	@Override
	public void createBindings(EObject be) {

		try {
			List<Item> listCritereValue = GetCriteriaWithSelectedValue();

			super.createBindings(be);
			// bebe=be;
			// Create a label and a combo box for selecting an algorithm

			createLabel(this, "Select algorithm:");
			algorithmCombo = new Combo(this, SWT.READ_ONLY | SWT.DROP_DOWN);
			algorithmCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

			try (BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\data.txt"))) {

				String line;

				while ((line = br.readLine()) != null) {

					String[] partsOfLine = line.split(";");

					// TODO : is better to comme from the MlTemplate model, but there is an error
					// when we call the template
					if (partsOfLine[0].equals("DataPreProcessing")) {

						Boolean GetThisAlgorithm = true;

						for (int i = 2; i < partsOfLine.length; i++) {

							for (Item item : listCritereValue) {

								if (partsOfLine[i].equals(item.getCritere()) && !partsOfLine[i + 1].equals(item.getValue())) {
									GetThisAlgorithm = false;
								}
							}

						}

						if (GetThisAlgorithm)
							algorithmCombo.add(partsOfLine[1]);

					}

					// }
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

			// Add items to the combo box
			algorithmCombo.add("Algorithm1");
			algorithmCombo.add("Algorithm2");
			algorithmCombo.add("Algorithm3");

			// Add a selection listener to the combo box
			algorithmCombo.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					// TODO: handle algorithm selection

					try {
						Combo combo = (Combo) e.widget;

						ConsevedChoice = combo.getText() + "_" + algorithmCombo.getSelectionIndex();

					} catch (Exception ex) {

					}

				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// Do nothing
				}
			});

			String[] splitedValues = ConsevedChoice.split("_");

			// Set a default value for the combo box
			algorithmCombo.select(Integer.parseInt(splitedValues[splitedValues.length - 1]));

		} catch (Exception ex) {

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Override
	public void createBindingsX(EObject be) {
		// This must be a Task because this Property Tab is only active for Tasks.
		// The Property Tab will only display the Parameter list in our TaskConfig
		// model element (see the definition of this element in MyModel.ecore).
		Task myTask = (Task) be;
		TaskConfig taskConfig = null;
		// Fetch all TaskConfig extension objects from the Task
		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
		if (allTaskConfigs.size() == 0) {
			// There are none, so we need to construct a new TaskConfig
			// which is required by the Property Sheet UI.
			taskConfig = MyModelFactory.eINSTANCE.createTaskConfig();
			TargetRuntime rt = getTargetRuntime();
			// We need our CustomTaskDescriptor for this Task. The ID must match
			// the one defined in the <customTask> extension point in plugin.xml
			CustomTaskDescriptor ctd = rt.getCustomTask("org.eclipse.bpmn2.modeler.examples.customtask.customTask1.separateData");
			// Get the model feature for the "taskConfig" element name.
			// Again, this must match the <property> element in <customTask>
			EStructuralFeature feature = ctd.getModelDecorator().getEStructuralFeature(be, "taskConfig");
			// Add the newly constructed TaskConfig object to the Task's Extension Values
			// list.
			// Note that we will delay the actual insertion of the new object until some
			// feature
			// of the object changes (e.g. the Parameter.name)
			ModelDecorator.addExtensionAttributeValue(myTask.eResource(), myTask, feature, taskConfig, true);
		} else {
			// Else reuse the existing TaskConfig object.
			taskConfig = allTaskConfigs.get(0);
		}

		try {

			// Replace "http://example.com/mypackage" with the actual namespace URI of your
			// package
			EEnum enumer = (EEnum) EPackage.Registry.INSTANCE
					.getEPackage("http://org.eclipse.bpmn2.modeler.examples.customtask")
					.getEClassifier("SeperateData");

			// enable all the iteral
			for (EEnumLiteral enumliteral : enumer.getELiterals()) {
				enumliteral.setLiteral(enumliteral.getName());
			}

			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\lookm\\git\\org.eclipse.bpmn2-modeler\\examples\\plugins\\org.eclipse.bpmn2.modeler.examples.customtask\\src\\org\\eclipse\\bpmn2\\modeler\\examples\\customtask\\MyModel\\util\\Criteria.txt"));

			String[] firstLine = br.readLine().split(";");

			Criteria criteria = new Criteria();

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
			
				//Overfitting==Yes
				if (criteria.getOverfitting().equals("Yes")) {
					algosToAdd.add(SeperateData.SEPERATE_DATA_INTO_TRAINING_AND_TESTING.toString());
				}  
				//Overfitting==No
				if (criteria.getOverfitting().equals("No")) {
					algosToAdd.add(SeperateData.SEPERATE_DATA_INTO_TRAINING_VALIDATION_AND_TESTING.toString());
				} 
  

			// Disabled the cibled iteral
			for (EEnumLiteral enumliteral : enumer.getELiterals()) {
				
				if (!algosToAdd.contains(enumliteral.getName())) {
					
					enumliteral.setLiteral("");
					
				}
			}

			// save modification to ecore
			EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;
			EPackage ePackage = packageRegistry.getEPackage("http://org.eclipse.bpmn2.modeler.examples.customtask");
			ePackage.eResource().save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			// Handle exception
		}

		bindAttribute(taskConfig, MyModelPackage.eINSTANCE.getTaskConfig_SeperateData());
	}

}