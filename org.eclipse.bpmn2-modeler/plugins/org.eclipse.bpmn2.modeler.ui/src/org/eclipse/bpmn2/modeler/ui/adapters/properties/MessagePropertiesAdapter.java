/*******************************************************************************
 * Copyright (c) 2011, 2012 Red Hat, Inc.
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

package org.eclipse.bpmn2.modeler.ui.adapters.properties;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.modeler.core.features.choreography.ChoreographyUtil;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author Gary Brown
 *
 */
public class MessagePropertiesAdapter extends RootElementPropertiesAdapter<Message> {

	/**
	 * @param adapterFactory
	 * @param object
	 */
	public MessagePropertiesAdapter(AdapterFactory adapterFactory, Message object) {
		super(adapterFactory, object);

		EStructuralFeature feature = Bpmn2Package.eINSTANCE.getMessage_ItemRef();
		setProperty(feature, UI_IS_MULTI_CHOICE, Boolean.TRUE);
    	setFeatureDescriptor(feature, new ItemDefinitionRefFeatureDescriptor<Message>(this, object, feature));
    	
    	setObjectDescriptor(new RootElementObjectDescriptor<Message>(this, object) {
			@Override
			public String getTextValue() {
				Message message = (Message)object;
				String text = message.getName();

				if (text == null) 
					text = message.getId();

				return text;
			}
    	});
	}

}
