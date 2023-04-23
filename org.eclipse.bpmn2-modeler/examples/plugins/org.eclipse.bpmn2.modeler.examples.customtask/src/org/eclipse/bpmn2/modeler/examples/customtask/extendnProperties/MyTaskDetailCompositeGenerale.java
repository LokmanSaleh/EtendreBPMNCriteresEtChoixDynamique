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

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.ExtensionAttributeValue;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TypeAlgorithme;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
 
public class MyTaskDetailCompositeGenerale extends DefaultDetailComposite {

	public static List<Combo> ListDeCritereValue = new ArrayList();
	public static List<String> ListDeCritereName = new ArrayList();

	final static EClass METADATA_CLASS = MyModelPackage.eINSTANCE.getTaskConfig();
	final static EStructuralFeature METADATA_FEATURE = MyModelPackage.eINSTANCE.getDocumentRoot_TaskConfig();
	 
	final static EStructuralFeature METADATA_NAME = MyModelPackage.eINSTANCE.getTaskConfig_Criterias();
	
	public MyTaskDetailCompositeGenerale(AbstractBpmn2PropertySection section) {
		super(section);
	}

	public MyTaskDetailCompositeGenerale(Composite parent, int style) {
		super(parent, style);
	}

	
    @Override
    public void createBindings(EObject be) {
    	
 
        //super.createBindings(be);
        //bebe=be;
        // Create a label and a combo box for selecting an algorithm
    	
    	// une nouvelle liste 
    	ListDeCritereValue = new ArrayList();

          
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\data.txt"))) {
        	
            String line;
            
            while ((line = br.readLine()) != null) {
            	
                 String[] partsOfLine = line.split(";");
                
                //for (String part : parts) {
                	
                	// TODO : is better to comme from the MlTemplate model, but there is an error when we call the template 
                	if (partsOfLine[0].equals("SelectionCriteria")) {
                		
                        createLabel(this, partsOfLine[1]);
                        Combo critereCombo = new Combo(this, SWT.READ_ONLY | SWT.DROP_DOWN);
                        
                        // Ajouter le combo dans la liste 
                        ListDeCritereValue.add(critereCombo); 
                        ListDeCritereName.add(partsOfLine[1]);
                        
                        critereCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1)); 
                        
                        for(int i= 2; i<partsOfLine.length; i++) {
                    		critereCombo.add(partsOfLine[i]); 
                        }
                        
                        // Add a selection listener to the combo box
						critereCombo.addSelectionListener(new SelectionListener() {
							
							@Override
							public void widgetSelected(SelectionEvent e) {

								try {

									File file = new File("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\criteria.txt");
									FileWriter fw = new FileWriter(file);
									BufferedWriter bw = new BufferedWriter(fw);

									for (int i = 0; i < ListDeCritereName.size(); i++) {
										bw.write(ListDeCritereName.get(i) + ";" + ListDeCritereValue.get(i).getText() + ";");
									}
									
									bw.write("\n");
									bw.close();

								} catch (IOException e1) {

									e1.printStackTrace();
								}

							}

                            @Override
                            public void widgetDefaultSelected(SelectionEvent e) {
                                // Do nothing
                            }
                        });
                	}
                		
                    
                //}
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
	
	
	
	//@Override
	public void createBindingsx(EObject be) {
		
		TaskConfig metaData = (TaskConfig) findExtensionAttributeValue((BaseElement)be, METADATA_FEATURE);
		//Criterias Criterias = (Criterias) findExtensionAttributeValue((BaseElement)be, MyModelPackage.eINSTANCE.getTaskConfig_Criterias());
		if (metaData !=null) remplirCriteres(metaData.getCriterias());
		if (metaData ==null) {
			metaData = MyModelFactory.eINSTANCE.createTaskConfig();
		
	//	TargetRuntime rt = getTargetRuntime();
		// We need our CustomTaskDescriptor for this Task. The ID must match
		// the one defined in the <customTask> extension point in plugin.xml
	//	CustomTaskDescriptor ctd = rt.getCustomTask("org.eclipse.bpmn2.modeler.examples.customtask.customTask1");
		// Get the model feature for the "taskConfig" element name.
		// Again, this must match the <property> element in <customTask>
	//	EStructuralFeature feature = ctd.getModelDecorator().getEStructuralFeature(be, "taskConfig");
		// Add the newly constructed TaskConfig object to the Task's Extension Values
		// list.
		// Note that we will delay the actual insertion of the new object until some
		// feature
		// of the object changes (e.g. the Parameter.name)
		ModelDecorator.addExtensionAttributeValue(be.eResource(), be, METADATA_FEATURE, metaData, true);
		}
		
		bindReference(metaData, MyModelPackage.eINSTANCE.getTaskConfig_Criterias()); 
	}
	
	
	public void remplirCriteres(Criterias criteria) {
		
		
		String a = criteria.getOverfitting().toString(); 
		
    	List<String> listOfCondition = new ArrayList<String>(Arrays.asList("Overfitting==" + criteria.getOverfitting(),
																		   "ImbalancedDataSet==" + criteria.getImbalancedDataSet(), 
																		   "MinoryClass==" + criteria.getMinoryClass(), 
																		   "ProblemType==" + criteria.getProblemType(), 
																		   "ConfidentialyDataLableled==" + criteria.getConfidentialyDataLableled(), 
																		   "Accuracy==" + criteria.getAccuracy(),
																		   "DataType==" + criteria.getDataType(), 
																		   "SpeedOfTraining==" + criteria.getSpeedOfTraining(),
																		   "LabeledData==" + criteria.getLabeledData(),
																		   "NmberOfLabelsByClasse==" + criteria.getNmberOfLabelsByClasse(),
																		   "NumberOfClasses==" + criteria.getNumberOfClasses(),
																		   "SmallDataSet==" + criteria.getSmallDataSet(),
																		   "HighTrainingSpeed==" + criteria.getHighTrainingSpeed(),
																		   "Explainable==" + criteria.getExplainable()));
    	
    	//DataType==Categorial && SpeedOfTraining==High && Accuracy==High
    	try {
    		 
			FileWriter fileWriter = new FileWriter(
					"C:\\Users\\lookm\\git\\org.eclipse.bpmn2-modeler\\examples\\plugins\\org.eclipse.bpmn2.modeler.examples.customtask\\src\\org\\eclipse\\bpmn2\\modeler\\examples\\customtask\\MyModel\\util\\Criteria.txt");
			
			String line ="1;";
			for (String el : listOfCondition) {
				line += el.split("==")[1]+";";
			}
	        fileWriter.write(line);
	        fileWriter.close();
			//BPMN2TaskAndSequenceFlowRemover.CreateNewChaineByRemovingUnecessaryComponent(listOfCondition, index++);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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

	/**
	 * Add a new extension element to the given BaseElement.
	 * 
	 * @param be a BaseElement
	 * @param feature the structural feature
	 */
	void addExtensionAttributeValue(BaseElement be, EStructuralFeature feature, Object value) {
		ExtensionAttributeValue eav = null;
		if (be.getExtensionValues().size()>0) {
			// reuse the <bpmn2:extensionElements> container if this BaseElement already has one
			eav = be.getExtensionValues().get(0);
		}
		else {
			// otherwise create a new one
			eav = Bpmn2Factory.eINSTANCE.createExtensionAttributeValue();
			be.getExtensionValues().add(eav);
		}
		eav.getValue().add(feature, value);
	}
	
	/**
	 * Remove an extension element from the given BaseElement that matches the
	 * given structural feature.
	 * 
	 * @param be a BaseElement
	 * @param feature the structural feature
	 */
	void removeExtensionAttributeValue(BaseElement be, EStructuralFeature feature) {
		for (ExtensionAttributeValue eav : be.getExtensionValues()) {
			for (FeatureMap.Entry entry : eav.getValue()) {
				if (entry.getEStructuralFeature() == feature) {
					be.getExtensionValues().remove(eav);
					return;
				}
			}
		}
	}
}