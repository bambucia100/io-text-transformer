package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import org.junit.Test;
import pl.put.poznan.ioprojectarchitecture.logic.TextClass;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;

import static org.junit.Assert.*;

public class InverseTest {

    @Test
    public void transformInverse1() {

        TextTransformer startText;
        startText = new TextClass("ala ma kota");
        Inverse testUpper = new Inverse(startText, true);
        assertEquals("atok am ala", testUpper.transform());
    }

    @Test
    public void transformInverse2() {

        TextTransformer startText;
        startText = new TextClass("kajak kajak ");
        Inverse testUpper = new Inverse(startText, true);
        assertEquals(" kajak kajak", testUpper.transform());
    }

    @Test
    public void transformInverse3() {

        TextTransformer startText;
        startText = new TextClass("ala ma kota");
        Inverse testUpper = new Inverse(startText, false);
        assertEquals("ala ma kota", testUpper.transform());
    }
}