package org.eclipse.bpmn2.modeler.examples.customtask.extendnProperties;

public class Item {
	
	private String Critere;
	private String Value;

	public Item (String Critere, String Value){
		this.Critere = Critere;
		this.Value = Value;
	}

	public String getCritere() {
		return Critere;
	}

	public void setCritere(String critere) {
		Critere = critere;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}
	
}