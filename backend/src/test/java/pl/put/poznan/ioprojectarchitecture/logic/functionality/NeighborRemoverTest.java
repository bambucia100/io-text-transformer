package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import org.junit.Test;
import pl.put.poznan.ioprojectarchitecture.logic.TextClass;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;

import static org.junit.Assert.*;

public class NeighborRemoverTest {

    @Test
    public void transformNeighborRemove1() {

        TextTransformer startText;
        startText = new TextClass("ala ala ala ala ala");
        NeighborRemover testCapitalize = new NeighborRemover(startText, true);
        assertEquals("ala", testCapitalize.transform());
    }

    @Test
    public void transformNeighborRemove2() {

        TextTransformer startText;
        startText = new TextClass("ala ala aLa ala ala ala");
        NeighborRemover testCapitalize = new NeighborRemover(startText, true);
        assertEquals("ala aLa ala", testCapitalize.transform());
    }

    @Test
    public void transformNeighborRemove3() {

        TextTransformer startText;
        startText = new TextClass("ala ala aLa ala ala");
        NeighborRemover testCapitalize = new NeighborRemover(startText, false);
        assertEquals("ala ala aLa ala ala", testCapitalize.transform());
    }

    @Test
    public void transformNeighborRemove4() {

        TextTransformer startText;
        startText = new TextClass("ala ma kota ale ala ala");
        NeighborRemover testCapitalize = new NeighborRemover(startText, true);
        assertEquals("ala ma kota ale ala", testCapitalize.transform());
    }
}