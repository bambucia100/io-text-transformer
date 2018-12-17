package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class NeighborRemover extends TextTransformerDecorator {

	private boolean removeAllow;

	/**
	 * Class constructor
	 */
	public NeighborRemover(TextTransformer textToTransform, boolean removeAllow) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.removeAllow = removeAllow;
	}

	/*
	/**
	 * Class constructor specifying type of transformation
	 *
	 * @param removeAllow 	bool variable to select the transformation
	 * @param text 			text to tramsform
	 *
	public NeighborRemover(boolean removeAllow, String text) {
		this.removeAllow = removeAllow;
		this.text = text;
	}*/


	/**
	 * Returns String "text" without multiple words next to each other
	 *
	 * @return 		String without multiple words
	 */
	public String function(String s) {
		String[] arr = s.split(" ");//textToTransform.getText().split(" ");
		String result = "";
		if(removeAllow) {
			for ( int i = 0; i < arr.length - 1; i++) {
				result += (arr[i].equals(arr[i + 1]) && !arr[i].equals("")) ? "": arr[i] + " ";
			}
			result += arr[arr.length - 1];
			return result;
		}
		else
			return s;
	}

	@Override
	public String transform() {
		return function(textToTransform.transform());
	}
}
