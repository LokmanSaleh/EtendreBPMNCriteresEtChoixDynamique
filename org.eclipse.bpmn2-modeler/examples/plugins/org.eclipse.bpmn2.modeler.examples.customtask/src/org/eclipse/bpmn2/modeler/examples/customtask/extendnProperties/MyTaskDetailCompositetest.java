package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.ExtensionAttributeDefinition;
import org.eclipse.bpmn2.ExtensionAttributeValue;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractDetailComposite;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.DefaultDetailComposite;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.bpmn2.modeler.core.utils.BusinessObjectUtil;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;
import org.eclipse.bpmn2.modeler.ui.preferences.SelectableComboFieldEditor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;
 
import java.io.*;

public class MyTaskDetailCompositetest extends DefaultDetailComposite {
	
	final static EStructuralFeature METADATA_FEATURE = MyModelPackage.eINSTANCE.getDocumentRoot_TaskConfig();

    private static Combo algorithmCombo; 
//    private static Combo combo ;
//    private static  TaskConfig taskConfig = null;
    private static String ConsevedChoice;
//    private static Combo combo;
//    private static EObject bebe;
    public MyTaskDetailCompositetest(Composite parent, int style) {
        super(parent, style);
		
	    // Register a selection listener to recall createBindings when the selection is changed
	    //new MySelectionListener(this);
    }

    public MyTaskDetailCompositetest(AbstractBpmn2PropertySection parent ) {
        super(parent);
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
	
	public List<Item> GetCriteriaWithSelectedValue () {   
        
		List<Item> listCritere = new ArrayList<>();
		
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\criteria.txt"))) {
        	
            String line;
            
            while ((line = br.readLine()) != null) {
            	
                 String[] partsOfLine = line.split(";");
                  
            		for (int i= 0;i<partsOfLine.length;) {
            			
            			listCritere.add(new Item(partsOfLine[i], partsOfLine[i+1]));
            			i++;i++;
            			
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
        //bebe=be;
        // Create a label and a combo box for selecting an algorithm
        
        createLabel(this, "Select algorithm:");
        algorithmCombo = new Combo(this, SWT.READ_ONLY | SWT.DROP_DOWN);
        algorithmCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
          
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\data.txt"))) {
        	
            String line;
            
            while ((line = br.readLine()) != null) {
            	
                 String[] partsOfLine = line.split(";"); 
                 
                	// TODO : is better to comme from the MlTemplate model, but there is an error when we call the template 
                	if (partsOfLine[0].equals("ModelConstruction")) {
                		
                		Boolean GetThisAlgorithm = true;

                		for (int i= 2;i<partsOfLine.length;i++) {
                			
                			for (Item item : listCritereValue) {
                				
                				if(partsOfLine[i].equals(item.getCritere()) && !partsOfLine[i+1].equals(item.getValue())) {
                					GetThisAlgorithm = true; 
                				}
                			}
                			
                		}
                		
                		
                		if (GetThisAlgorithm) algorithmCombo.add(partsOfLine[1]);
                		
                	}
                		
                    
                //}
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
		//List<String> listl = test.main();

//        EList<MLAlgorithmSolutionPattern>  list = BdQueries.GetdAlgorithmsByCategory(Componenets.MODEL_CONSTRUCTION.toString()).getMlalgorithmsolutionpattern();
//        
//        
//        for (MLAlgorithmSolutionPattern mlsolutionAlgorithmSolutionPattern 	: list) {
//        	algorithmCombo.add(mlsolutionAlgorithmSolutionPattern.getMlalgorithm().getName());
//        }
        
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
            		 
            		ConsevedChoice = combo.getText()+"_"+algorithmCombo.getSelectionIndex();

            	} catch ( Exception ex) {
            		
            	}
  
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // Do nothing
            }
        });
 
        
		TaskConfig metaData = (TaskConfig) findExtensionAttributeValue((BaseElement)be, METADATA_FEATURE);
		
		Task myTask = (Task) be;
		//TypeAlgorithme algorithm = (TypeAlgorithme) findExtensionAttributeValue((BaseElement)be, MyModelPackage.eINSTANCE.getTaskConfig_Algorithm());

		TaskConfig taskConfig=null;
		SelectableComboFieldEditor nameEditor = null;
		// Fetch all TaskConfig extension objects from the Task
		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
		if (allTaskConfigs.size() == 0) {
			// There are none, so we need to construct a new TaskConfig
			// which is required by the Property Sheet UI.
			taskConfig = MyModelFactory.eINSTANCE.createTaskConfig();
			taskConfig.setAlgorithmNameStr(algorithmCombo.getText()+"_"+0);
			ConsevedChoice=algorithmCombo.getText()+"_"+0; 
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
//		taskConfig.setAlgorithmNameStr(algorithmValue);
//		


		
//		algorithmCombo.select(combo.getSelectionIndex());
		
		String[] splitedValues = ConsevedChoice.split("_");
        // Set a default value for the combo box
		algorithmCombo.select(Integer.parseInt(splitedValues[splitedValues.length-1]));
		
 		//taskConfig.setAlgorithmNameStr(algorithmCombo.getText()+"_"+algorithmCombo.getSelectionIndex());

 		
 		//bindAttribute(taskConfig, MyModelPackage.eINSTANCE.getTaskConfig_AlgorithmNameStr());


    	} catch ( Exception ex) {
    		
    	}
    	
    }
}
