package pl.put.poznan.ioprojectarchitecture.logic.functionality;


import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class PolishLettersRemover extends TextTransformerDecorator {

	/**
	 * When variable is true do transform
	 */
	private boolean polishLetter;

	/**
	 * Class constructor
	 */
	public PolishLettersRemover(TextTransformer textToTransform, boolean polishLetter) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.polishLetter = polishLetter;
	}


	/**
	 * latin equivalent to lower polish letters
	 */
	private static String[] letterArrayLower = {"a", "c", "e", "l", "n", "o", "s", "z", "z"};
	/**
	 * latin equivalent to upper polish letters
	 */
	private static String[] letterArrayUpper = {"A", "C", "E", "L", "N", "O", "S", "Z", "Z"};
	/**
	 * dictionary of lower polish letters
	 */
	private static String[] letterArrayPolishLower = {"ą", "ć", "ę", "ł", "ń", "ó", "ś", "ż", "ź"};
	/**
	 * dictionary of upper polish letters
	 */
	private static String[] letterArrayPolishUpper = {"Ą", "Ć", "Ę", "Ł", "Ń", "Ó", "Ś", "Ż", "Ź"};


	/**
	 * Returns String "text" without polish letters
	 *
	 * @return 		text without polish letters
	 */
	public String function(String s) {

		String text = s;
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
