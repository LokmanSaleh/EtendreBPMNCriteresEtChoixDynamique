package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties;

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

public class MyTaskDetailCompositetest extends DefaultDetailComposite {
	
	final static EStructuralFeature METADATA_FEATURE = MyModelPackage.eINSTANCE.getDocumentRoot_TaskConfig();

    private Combo algorithmCombo; 
    private static  TaskConfig taskConfig = null;
    Combo combo;
    private static EObject bebe;
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
	
    @Override
    public void createBindings(EObject be) {
        super.createBindings(be);
        bebe=be;
        // Create a label and a combo box for selecting an algorithm
        createLabel(this, "Select algorithm:");
        algorithmCombo = new Combo(this, SWT.READ_ONLY | SWT.DROP_DOWN);
        algorithmCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        // Add items to the combo box
        algorithmCombo.add("Algorithm 1");
        algorithmCombo.add("Algorithm 2");
        algorithmCombo.add("Algorithm 3");

        // Add a selection listener to the combo box
        algorithmCombo.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                // TODO: handle algorithm selection
                combo = (Combo) e.widget;  

//                EObject selectedObject = MyTaskDetailCompositetest.this.getBusinessObject();
                // Call createBindings with the selected EObject
//                createBindings(selectedObject);

//                // Get the composite that contains the selected widget
//                Composite selectedComposite = combo.getParent();
//
//                // Get the parent composite of the selected composite
//                Composite parentComposite = selectedComposite.getParent();
//
//                // Get the BusinessObject associated with the parent composite
//                EObject bo = BusinessObjectUtil.getBusinessObjectForSelection((ISelection) parentComposite);
//
//                // Check if the BusinessObject is a task
//                if (selectedObject instanceof Task) {
//                    Task myTask = (Task) selectedObject;
//            		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
//        			taskConfig = allTaskConfigs.get(0);
//
//                    // Do something with the task object
//                }
             // get the resource set
    			ResourceSet resourceSet = new ResourceSetImpl();
    			Resource resource = resourceSet.getResource(URI.createURI("http://org.eclipse.bpmn2.modeler.examples.customtask"), true);
    			
                TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resource);

                if (editingDomain == null) {
                    editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
                }

                editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
                    @Override
                    protected void doExecute() {
                    	
//                        // Make modifications to the model here
//                		TaskConfig metaData = (TaskConfig) findExtensionAttributeValue((BaseElement)bebe, METADATA_FEATURE);
//                		
//                		Task myTask = (Task) bebe;
//                		//TypeAlgorithme algorithm = (TypeAlgorithme) findExtensionAttributeValue((BaseElement)be, MyModelPackage.eINSTANCE.getTaskConfig_Algorithm());
//
//                		
//                		SelectableComboFieldEditor nameEditor = null;
//                		// Fetch all TaskConfig extension objects from the Task
//                		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
//                		taskConfig = allTaskConfigs.get(0);
                		
                		taskConfig.setAlgorithmNameStr(combo.getText()+"_"+algorithmCombo.getSelectionIndex());
                		
                		//bindAttribute(taskConfig, MyModelPackage.eINSTANCE.getTaskConfig_AlgorithmNameStr());
                    }
                });

                

            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // Do nothing
            }
        });
 
        
		TaskConfig metaData = (TaskConfig) findExtensionAttributeValue((BaseElement)be, METADATA_FEATURE);
		
		Task myTask = (Task) be;
		//TypeAlgorithme algorithm = (TypeAlgorithme) findExtensionAttributeValue((BaseElement)be, MyModelPackage.eINSTANCE.getTaskConfig_Algorithm());

		
		SelectableComboFieldEditor nameEditor = null;
		// Fetch all TaskConfig extension objects from the Task
		List<TaskConfig> allTaskConfigs = ModelDecorator.getAllExtensionAttributeValues(myTask, TaskConfig.class);
		if (allTaskConfigs.size() == 0) {
			// There are none, so we need to construct a new TaskConfig
			// which is required by the Property Sheet UI.
			taskConfig = MyModelFactory.eINSTANCE.createTaskConfig();
			taskConfig.setAlgorithmNameStr(algorithmCombo.getText()+"_"+0);
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
//		bindAttribute(taskConfig, MyModelPackage.eINSTANCE.getTaskConfig_AlgorithmNameStr());

		String[] splitedValues = taskConfig.getAlgorithmNameStr().split("_");
        // Set a default value for the combo box
		algorithmCombo.select(Integer.parseInt(splitedValues[splitedValues.length-1]));
    }
}
