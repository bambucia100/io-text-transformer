package pl.put.poznan.ioprojectarchitecture.logic;

public class Inverse {

	private boolean inverseAllow;
	private String text;

	public Inverse() {
		
	}
	
	
	public Inverse(boolean inverseAllow, String text) {
		this.inverseAllow = inverseAllow;
		this.text = text;
	}
	
	public String inv(String input) {
        return new StringBuilder(text).reverse().toString();
	}
	
	public String inversion() {
		if(inverseAllow) {
			return inv(text);
		}
		else {
			return text;
		}
	}
	
}
