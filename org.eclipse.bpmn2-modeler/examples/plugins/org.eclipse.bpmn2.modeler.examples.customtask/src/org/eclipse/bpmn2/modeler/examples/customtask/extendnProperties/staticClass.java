package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List; 
public class staticClass {
 
	public static List<Item> GetCriteriaWithSelectedValue () {   
        
		List<Item> listCritere = new ArrayList<>();
		
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\data.txt"))) {
        	
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
}
