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

	private char[] latexSpecialCharacters = {'&', '$', '#', '_', '{', '}', '~', '*' };

	public String changeToLatexFont() {
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < latexSpecialCharacters.length; j++) {
				if(text.charAt(i) == latexSpecialCharacters[j] ) {
					text = text.substring(0, i) + '\\' + text.substring(i, text.length());
					i++;
				}
			}
		}
		return text;
	}

}