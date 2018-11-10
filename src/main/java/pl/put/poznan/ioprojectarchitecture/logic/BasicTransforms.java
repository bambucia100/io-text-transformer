package pl.put.poznan.ioprojectarchitecture.logic;

import javafx.scene.text.Text;

public class BasicTransforms {
	
	
	private String typeOfTransform;
	private String text;

	private String capitalize(String text) {
		String[] substrings = text.split(" ");
		String result = "";
		for(String ss : substrings) {
			char[] ss_char = ss.toCharArray();
			if (ss_char.length == 0) {
				result += " ";
				continue;
			}
			if (Character.isLetter(ss_char[0])) {
				ss_char[0] = Character.toUpperCase(ss_char[0]);
				result += new String(ss_char) + " ";
			} else {
				result += new String(ss_char) + " ";
				continue;
			}
		}
		return result;
	}

	public BasicTransforms() {}
	
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
			return capitalize(text);
		}
		else {
			return "Wrong type of transform";
		}
	}

}
