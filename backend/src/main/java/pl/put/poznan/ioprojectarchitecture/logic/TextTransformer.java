package pl.put.poznan.ioprojectarchitecture.logic;

import java.util.Arrays;

import pl.put.poznan.ioprojectarchitecture.logic.functionality.*;
import pl.put.poznan.ioprojectarchitecture.rest.TextTransformerClass;


public abstract class TextTransformer {
	protected String descr = "valueATT";

	public String getText() {
		return descr;
	}

	public abstract String transform();

}
/*
public class TextTransformer {

	private TextTransformerClass transforms;
	
    public TextTransformer(TextTransformerClass transforms){
        this.transforms = transforms;
 
    }

    public void checkValues(TextTransformerClass transforms) {
    	System.out.println(transforms.getBasicTransform());
    	System.out.println(transforms.isInverse());
    	System.out.println(transforms.isNumbers());
    	System.out.println(transforms.getShortcuts());
    	System.out.println(transforms.isLatex());
    	System.out.println(transforms.isNeighbors());
    }
    

	public String transform(TextTransformerClass transforms, String text) {
		NumbersExpander numbersModifier = new NumbersExpander(transforms.isNumbers(), text);
		text = numbersModifier.numberExpander();
		ShortcutsModifier shortcutsModifier = new ShortcutsModifier(transforms.getShortcuts(), text);
		text = shortcutsModifier.modifyShortcuts();
		LatexCharacters latexCharacters = new LatexCharacters(transforms.isLatex(), text);
		text = latexCharacters.changeToLatexFont();
		NeighborRemover neighborRemover = new NeighborRemover(transforms.isNeighbors(), text);
		text = neighborRemover.removeNeighbor();
		BasicTransforms basicTransforms = new BasicTransforms(transforms.getBasicTransform(), text);
		text =  basicTransforms.transform();
		CommaAdder comma = new CommaAdder(transforms.isComma(), text);
		text = comma.addComma();
		Leetspeak leetspeak = new Leetspeak(transforms.isLeetspeak(), text);
		text = leetspeak.make1337();
		PolishLettersRemover polishLetters = new PolishLettersRemover(transforms.isPolishLetter(), text);
		text = polishLetters.removePolishLetters();
		Inverse inverse = new Inverse(transforms.isInverse(), text);
		text = inverse.inversion();

		System.out.println("Transformed Text: " + text);
		return text;
	}
    
	
}*/
