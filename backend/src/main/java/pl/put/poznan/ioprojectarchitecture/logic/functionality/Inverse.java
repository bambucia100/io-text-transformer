package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class Inverse extends TextTransformerDecorator {

	/**
	 * When variable is true do transform
	 */
	private boolean inverseAllow;

	/**
	 * Class constructor
	 */
	public Inverse(TextTransformer textToTransform, boolean inverseAllow) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.inverseAllow = inverseAllow;
	}

	/**
	 *
	 * @param input String you'd like to transform
	 *
	 * @return inverted input
	 */
	private String inv(String input) {
        return new StringBuilder(input).reverse().toString();
	}

	@Override
	public String transform() {
		if(inverseAllow)
			return inv(textToTransform.transform());//inv(text);
		else
			return textToTransform.transform();
	}
	
}
