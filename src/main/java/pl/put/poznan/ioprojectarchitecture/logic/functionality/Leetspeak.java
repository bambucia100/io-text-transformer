package pl.put.poznan.ioprojectarchitecture.logic.functionality;

public class Leetspeak {

	private boolean leetspeak;
	private String text;
	
	public Leetspeak() {
		
	}
	
	public Leetspeak(boolean leetspeak, String text) {
		
		this.leetspeak = leetspeak;
		this.text = text;
	}
	
	//TODO: Add functionality
	public String make1337() {
		
		if(leetspeak) {
			
			return text;
		} else {
			
			return text;
		}
	}
}
