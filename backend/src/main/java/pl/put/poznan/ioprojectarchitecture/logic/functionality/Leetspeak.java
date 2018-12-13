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

	private static String[] normal = {"a", "A", "b", "B", "e", "E", "g", "G", "i", "I", "o", "O", "s", "S", "t", "T", "z", "Z"};
	private static String[] leet = {"4", "4", "8", "8", "3", "3", "9", "9", "1", "1", "0", "0", "5", "5", "7", "7", "2", "2"};

	public String make1337() {
		
		if(leetspeak) {
			for(int i = 0; i < normal.length; i++)
				text = text.replaceAll(normal[i], leet[i]);
			return text;
		} else {
			
			return text;
		}
	}
}
