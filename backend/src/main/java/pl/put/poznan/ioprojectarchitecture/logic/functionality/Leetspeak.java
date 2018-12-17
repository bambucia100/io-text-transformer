package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class Leetspeak extends TextTransformerDecorator {

	private boolean leetspeak;
	private String text;

	public Leetspeak(TextTransformer textToTransform, boolean leetspeak) {
			super(textToTransform);
			System.out.println("before " + descr);
			this.descr = textToTransform.getText();
			System.out.println("after " + descr);
			this.leetspeak = leetspeak;
		}

	private static String[] normal = {"a", "A", "b", "B", "e", "E", "g", "G", "i", "I", "o", "O", "s", "S", "t", "T", "z", "Z"};
	private static String[] leet = {"4", "4", "8", "8", "3", "3", "9", "9", "1", "1", "0", "0", "5", "5", "7", "7", "2", "2"};

	public String function(String s){
		text = s;//textToTransform.getText();
			for(int i = 0; i < normal.length; i++)
				text = text.replaceAll(normal[i], leet[i]);
			//descr = text;
			System.out.println(text + "text11");
			System.out.println(descr + "descr11");
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
