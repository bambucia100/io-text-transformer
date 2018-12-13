package pl.put.poznan.ioprojectarchitecture.rest;


public class TextTransformerClass {

	private String basicTransform;
	private boolean inverse;
	private boolean numbers;
	private String shortcuts;
	private boolean latex;
	private boolean neighbors;
	private boolean comma;
	private boolean leetspeak;
	private boolean polishLetter;
	
	
	public TextTransformerClass() {
		
	}
	
	public TextTransformerClass(String basicTransform, boolean inverse, boolean numbers, 
			String shortcuts, boolean latex, boolean neighbors, 
			boolean comma, boolean leetspeak, boolean polishLetter) {
		super();
		this.basicTransform = basicTransform;
		this.inverse = inverse;
		this.numbers = numbers;
		this.shortcuts = shortcuts;
		this.latex = latex;
		this.neighbors = neighbors;
		this.comma = comma;
		this.leetspeak = leetspeak;
		this.polishLetter = polishLetter;
	}
	
	public String getBasicTransform() {
		return basicTransform;
	}

	public void setBasicTransform(String basicTransform) {
		this.basicTransform = basicTransform;
	}

	public boolean isInverse() {
		return inverse;
	}

	public void setInverse(boolean inverse) {
		this.inverse = inverse;
	}

	public boolean isNumbers() {
		return numbers;
	}

	public void setNumbers(boolean numbers) {
		this.numbers = numbers;
	}

	public String getShortcuts() {
		return shortcuts;
	}

	public void setShortcuts(String shortcuts) {
		this.shortcuts = shortcuts;
	}

	public boolean isLatex() {
		return latex;
	}

	public void setLatex(boolean latex) {
		this.latex = latex;
	}

	public boolean isNeighbors() {
		return neighbors;
	}

	public void setNeighbors(boolean neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isComma() {
		return comma;
	}

	public void setComma(boolean comma) {
		this.comma = comma;
	}

	public boolean isLeetspeak() {
		return leetspeak;
	}

	public void setLeetspeak(boolean leetspeak) {
		this.leetspeak = leetspeak;
	}

	public boolean isPolishLetter() {
		return polishLetter;
	}

	public void setPolishLetter(boolean polishLetter) {
		this.polishLetter = polishLetter;
	}

	
	
	
}
