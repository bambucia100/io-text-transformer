package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import org.junit.Test;
import pl.put.poznan.ioprojectarchitecture.logic.TextClass;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;

import javax.websocket.RemoteEndpoint;

import static org.junit.Assert.*;

public class BasicTransformsTest {

    @Test
    public void transformUpper() {

        TextTransformer startText;
        startText = new TextClass("ala ma kota");
        BasicTransforms testUpper = new BasicTransforms(startText, "upper");
        assertEquals("ALA MA KOTA", testUpper.transform());

    }

    @Test
    public void transformLower() {

        TextTransformer startText;
        startText = new TextClass("AlA Ma KoTa");
        BasicTransforms testLower = new BasicTransforms(startText, "lower");
        assertEquals("ala ma kota", testLower.transform());
    }

    @Test
    public  void transformCapitalize0() {

        TextTransformer startText;
        startText = new TextClass("ala Ma koTa");
        BasicTransforms testCapitalize = new BasicTransforms(startText, "capitalize");
        assertEquals("Ala Ma KoTa", testCapitalize.transform());



    }

    @Test
    public void transformCapitalize1() {

        TextTransformer startText;
        startText = new TextClass("ala");
        BasicTransforms testCapitalize = new BasicTransforms(startText, "capitalize");
        assertEquals("Ala", testCapitalize.transform());
    }

    @Test
    public void transformCapitalize2() {

        TextTransformer startText;
        startText = new TextClass("ala  alaA");
        BasicTransforms testCapitalize = new BasicTransforms(startText, "capitalize");
        assertEquals("Ala  AlaA", testCapitalize.transform());
    }

    @Test
    public void transformCapitalize3() {

        TextTransformer startText;
        startText = new TextClass("1 kot");
        BasicTransforms testCapitalize = new BasicTransforms(startText, "capitalize");
        assertEquals("1 Kot", testCapitalize.transform());
    }

    @Test
    public void transformCapitalize4() {

        TextTransformer startText;
        startText = new TextClass("aLa Ma KoTa");
        BasicTransforms testCapitalize = new BasicTransforms(startText, "none");
        assertEquals("aLa Ma KoTa", testCapitalize.transform());
    }
}