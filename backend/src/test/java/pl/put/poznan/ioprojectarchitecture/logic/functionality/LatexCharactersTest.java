package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import org.junit.Test;
import pl.put.poznan.ioprojectarchitecture.logic.TextClass;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;

import static org.junit.Assert.*;

public class LatexCharactersTest {

    @Test
    public void transformLatex1() {

        TextTransformer startText;
        startText = new TextClass(" &,^! $_,,{}sadasdasda~~~*");
        LatexCharacters testCapitalize = new LatexCharacters(startText, true);
        assertEquals(" \\&,^! \\$\\_,,\\{\\}sadasdasda\\~\\~\\~\\*", testCapitalize.transform());
    }
    @Test
    public void transformLatex2() {

        TextTransformer startText;
        startText = new TextClass(" &, $_,,{}sadasdasda~~~*");
        LatexCharacters testCapitalize = new LatexCharacters(startText, false);
        assertEquals(" &, $_,,{}sadasdasda~~~*", testCapitalize.transform());
    }

}