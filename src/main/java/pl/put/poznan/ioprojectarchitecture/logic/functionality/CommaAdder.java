package pl.put.poznan.ioprojectarchitecture.logic.functionality;

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
			
			return text;
		} else {
			
			return text;
		}
		
		
	}
	
}
