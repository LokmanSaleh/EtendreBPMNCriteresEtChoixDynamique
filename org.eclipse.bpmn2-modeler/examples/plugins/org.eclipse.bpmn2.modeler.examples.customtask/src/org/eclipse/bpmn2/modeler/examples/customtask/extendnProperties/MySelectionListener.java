package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class MySelectionListener implements ISelectionListener {

    private MyTaskDetailCompositetest detailComposite;

    public MySelectionListener(MyTaskDetailCompositetest detailComposite) {
        this.detailComposite = detailComposite;
        // Register this listener with the active workbench window
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(this);
    }

    @Override
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        // Check if the selection is a structured selection and contains a single EObject
        if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
            Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
            if (selectedObject instanceof EObject) {
                EObject selectedEObject = (EObject) selectedObject;
                detailComposite.createBindings(selectedEObject);
            }
        }
    }

    public void dispose() {
        // Unregister this listener with the active workbench window
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().removeSelectionListener(this);
    }
}
