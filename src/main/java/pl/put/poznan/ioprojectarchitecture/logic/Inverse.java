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
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result = new byte [strAsByteArray.length]; 

        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] = strAsByteArray[strAsByteArray.length-i-1]; 
  
        return new String(result); 
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
