package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class NeighborRemover extends TextTransformerDecorator {


	/**
	 * When variable is true do transform
	 */
	private boolean removeAllow;

	/**
	 * Class constructor
	 */
	public NeighborRemover(TextTransformer textToTransform, boolean removeAllow) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.removeAllow = removeAllow;
	}



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
