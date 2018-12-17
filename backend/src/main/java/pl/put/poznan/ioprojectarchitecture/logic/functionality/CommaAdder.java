package pl.put.poznan.ioprojectarchitecture.logic.functionality;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

import java.util.regex.*;

public class CommaAdder extends TextTransformerDecorator {

	private boolean comma;
	private String text;
	

	public CommaAdder(TextTransformer textToTransform, boolean comma) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.comma = comma;
	}


	public String function(String s) {
		/*
		if(comma) {
			String[] arr = text.split(" ");
			char[] chars;
			text = arr[0];
			for(int i = 1; i < arr.length; i++)
				if(Pattern.matches("[A-Z].+", arr[i]) && !Pattern.matches(".+\\.$", arr[i-1]))
					text +=  ". " + arr[i];
				else
					text +=  " " + arr[i];
			if(!Pattern.matches(".+\\.$", arr[arr.length-1]))
			text +=  ".";
			return text;
		} else {*/
		if(comma) {
			String[] arr = s.split(" ");//textToTransform.getText().split(" ");
			char[] chars;
			text = arr[0];
			for(int i = 1; i < arr.length; i++)
				if(arr[i].equals("że") || arr[i].equals("który") || arr[i].equals("aż") || arr[i].equals("więc") || arr[i].equals("lecz") || arr[i].equals("ponieważ") && !Pattern.matches(".+,$", arr[i-1]))
					text +=  ", " + arr[i];
				else
					text +=  " " + arr[i];
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
