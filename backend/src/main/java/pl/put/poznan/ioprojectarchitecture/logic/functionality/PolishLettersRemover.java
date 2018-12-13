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
	
	private static String[] letterArrayLower = {"a", "c", "e", "l", "n", "o", "s", "z", "z"};
	private static String[] letterArrayUpper = {"A", "C", "E", "L", "N", "O", "S", "Z", "Z"};
	private static String[] letterArrayPolishLower = {"ą", "ć", "ę", "ł", "ń", "ó", "ś", "ż", "ź"};
	private static String[] letterArrayPolishUpper = {"Ą", "Ć", "Ę", "Ł", "Ń", "Ó", "Ś", "Ż", "Ź"};
	
	//TODO Add functionality
	public String removePolishLetters() {
		
		if(polishLetter) {
			for(int i = 0; i < 9; i++) {
				
				text = text.replaceAll(letterArrayPolishLower[i], letterArrayLower[i]);
				text = text.replaceAll(letterArrayPolishUpper[i], letterArrayUpper[i]);
			}
			return text;
		} else {
			return text;
		}
	}
}
