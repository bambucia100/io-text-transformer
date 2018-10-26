package pl.put.poznan.ioprojectarchitecture.logic;

public class NumbersExpander {
	
	private boolean numberExpandAllow;
	private String text;
	
	public NumbersExpander() {	
	}
	
	public NumbersExpander(boolean numberExpandAllow, String text) {
		this.numberExpandAllow = numberExpandAllow;
		this.text = text;
	}
	//TODO
	public String numberExpander() {
		return text;
	}
	
}
