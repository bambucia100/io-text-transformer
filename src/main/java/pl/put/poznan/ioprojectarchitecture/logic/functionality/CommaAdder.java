package pl.put.poznan.ioprojectarchitecture.logic.functionality;
import java.util.regex.*;

public class CommaAdder {

	private boolean comma;
	private String text;
	
	public CommaAdder() {
		
	}
	
	public CommaAdder(boolean comma, String text) {
		
		this.comma = comma;
		this.text = text;
	}
	
	//TODO Add functionality
	public String addComma() {
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
		} else {
			
			return text;
		}
		
		
	}
	
}
