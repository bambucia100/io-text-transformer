package pl.put.poznan.ioprojectarchitecture.logic.functionality;

public class PolishLettersRemover {

	boolean polishLetter;
	String text;
	
	public PolishLettersRemover() {

	}
	
	public PolishLettersRemover(boolean polishLetter, String text) {
		
		this.polishLetter = polishLetter;
		this.text = text;
	}
	
	//TODO Add functionality
	public String removePolishLetters() {
		
		if(polishLetter) {
			
			return text;
		} else {
			
			return text;
		}
	}
}
