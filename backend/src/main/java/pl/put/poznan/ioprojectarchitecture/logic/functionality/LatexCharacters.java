package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class LatexCharacters extends TextTransformerDecorator {

	/**
	 * When variable is true do transform
	 */
	private boolean latexCharactersAllow;

	/**
	 * Class constructor
	 */
	public LatexCharacters(TextTransformer textToTransform, Boolean latexCharactersAllow) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.latexCharactersAllow = latexCharactersAllow;
	}

	/**
	 * dictionary of Latex Special chars
	 */
	private char[] latexSpecialCharacters = {'&', '$', '#', '_', '{', '}', '~', '*' };


	/**
	 * Returns String "text" with added backslash before Latex Special chars
	 *
	 * @return 		backslash before Latex Special chars
	 */
	public String function(String s) {
		if(latexCharactersAllow) {
			String text = s;
			for(int i = 0; i < text.length(); i++) {
				for(int j = 0; j < latexSpecialCharacters.length; j++) {
					if(text.charAt(i) == latexSpecialCharacters[j] ) {
						text = text.substring(0, i) + '\\' + text.substring(i);
						i++;
					}
				}
			}
			return text;
		}
		else{
			return s;}
	}

	@Override
	public String transform() {
		return function(textToTransform.transform());
	}

}