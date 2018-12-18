package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class Leetspeak extends TextTransformerDecorator {

	/**
	 * When variable is true do transform
	 */
	private boolean leetspeak;

	/**
	 * Class constructor
	 */
	public Leetspeak(TextTransformer textToTransform, boolean leetspeak) {
			super(textToTransform);
			this.descr = textToTransform.getText();
			this.leetspeak = leetspeak;
		}
	/**
	 * dictionary of convertible chars
	 */
	private static String[] normal = {"a", "A", "b", "B", "e", "E", "g", "G", "i", "I", "o", "O", "s", "S", "t", "T", "z", "Z"};
	/**
	 * dictionary of chars you'd like to convert
	 */
	private static String[] leet = {"4", "4", "8", "8", "3", "3", "9", "9", "1", "1", "0", "0", "5", "5", "7", "7", "2", "2"};

	/**
	 * Returns String "text" with converted some letters into numbers
	 *
	 * @return 		text in leet language
	 */
	public String function(String s){
		String text = s;
			for(int i = 0; i < normal.length; i++)
				text = text.replaceAll(normal[i], leet[i]);
			//descr = text;
			return text;
	}

	@Override
	public String transform() {
		if(leetspeak) {
			return function(textToTransform.transform());
		} else {
			return textToTransform.transform();
	}
	}
}
