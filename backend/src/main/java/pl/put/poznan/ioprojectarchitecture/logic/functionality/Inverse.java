package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class Inverse extends TextTransformerDecorator {

	private boolean inverseAllow;

	
	public Inverse(TextTransformer textToTransform, boolean inverseAllow) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.inverseAllow = inverseAllow;
	}
	
	public String inv(String input) {
        return new StringBuilder(input).reverse().toString();
	}

	@Override
	public String transform() {
		//System.out.println(inv(textToTransform.transform()) +"klas inv");
		if(inverseAllow)
			return inv(textToTransform.transform());//inv(text);
		else
			return textToTransform.transform();
	}
	
}
