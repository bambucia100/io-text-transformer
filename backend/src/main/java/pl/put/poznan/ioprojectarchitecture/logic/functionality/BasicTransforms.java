package pl.put.poznan.ioprojectarchitecture.logic.functionality;


import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class BasicTransforms extends TextTransformerDecorator{
	
	
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


	public BasicTransforms(TextTransformer textToTransform, String typeOfTransform) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.typeOfTransform = typeOfTransform;
	}

	@Override
	public String transform() {
		System.out.println("Basic");
		if(typeOfTransform.equals("upper")) {
			return textToTransform.transform().toUpperCase();
		}
		else if(typeOfTransform.equals("lower")) {
			return textToTransform.transform().toLowerCase();
		}
		else if(typeOfTransform.equals("capitalize")) {
			return capitalize(textToTransform.transform());
		}
		else {
			return textToTransform.transform();
		}
	}

}
