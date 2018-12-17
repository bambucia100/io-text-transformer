package pl.put.poznan.ioprojectarchitecture.logic.functionality;


import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class PolishLettersRemover extends TextTransformerDecorator {

	boolean polishLetter;
	private String text;

	public PolishLettersRemover(TextTransformer textToTransform, boolean polishLetter) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.polishLetter = polishLetter;
	}
	

	
	private static String[] letterArrayLower = {"a", "c", "e", "l", "n", "o", "s", "z", "z"};
	private static String[] letterArrayUpper = {"A", "C", "E", "L", "N", "O", "S", "Z", "Z"};
	private static String[] letterArrayPolishLower = {"ą", "ć", "ę", "ł", "ń", "ó", "ś", "ż", "ź"};
	private static String[] letterArrayPolishUpper = {"Ą", "Ć", "Ę", "Ł", "Ń", "Ó", "Ś", "Ż", "Ź"};


	public String function(String s) {

		text = s;//textToTransform.getText();
		if(polishLetter) {
			for(int i = 0; i < 9; i++) {
				
				text = text.replaceAll(letterArrayPolishLower[i], letterArrayLower[i]);
				text = text.replaceAll(letterArrayPolishUpper[i], letterArrayUpper[i]);
			}
			return text;
		} else {
			return s;
		}
	}

	@Override
	public String transform() {
		return function(textToTransform.transform());
	}
}
