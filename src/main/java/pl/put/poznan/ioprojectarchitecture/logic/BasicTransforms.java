package pl.put.poznan.ioprojectarchitecture.logic;

import javafx.scene.text.Text;

public class BasicTransforms {
	
	
	private String typeOfTransform;
	private String text;
	
	public BasicTransforms() {
		
	}
	
	public BasicTransforms(String typeOfTransform, String text) {
		this.typeOfTransform = typeOfTransform;
		this.text = text;
	}
	public String transform() {

		if(typeOfTransform.equals("upper")) {
			return text.toUpperCase();
		}
		else if(typeOfTransform.equals("lower")) {
			return text.toLowerCase();
		}
		else if(typeOfTransform.equals("capitalize")) {
			//Funckja do zrobienia
			return "TODO";
		}
		else {
			return "Wrong type of transform";
		}
	}

}
