package pl.put.poznan.ioprojectarchitecture.logic;

public class LatexCharacters {

	private boolean latexCharactersAllow;
	private String text;
	
	public LatexCharacters() {
		}
	
	
	public LatexCharacters(boolean latexCharactersAllow, String text) {
		this.latexCharactersAllow = latexCharactersAllow;
		this.text = text;
	}

	
	
	//TODO
	public String changeToLatexFont() {
		return text;
	}
	
}
