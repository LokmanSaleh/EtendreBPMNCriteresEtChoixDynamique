package resource2;

import java.sql.Blob;

public class Chaine {
	
	Blob blob;
	String name;
	
	public Chaine(Blob blob, String name) {
		super();
		this.blob = blob;
		this.name = name;
	}
	public Blob getBlob() {
		return blob;
	}
	public void setBlob(Blob blob) {
		this.blob = blob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	
}
