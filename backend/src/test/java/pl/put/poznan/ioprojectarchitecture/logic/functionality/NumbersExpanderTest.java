package pl.put.poznan.ioprojectarchitecture.logic.functionality;

import org.junit.Test;
import pl.put.poznan.ioprojectarchitecture.logic.TextClass;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;

import static org.junit.Assert.*;

public class NumbersExpanderTest {

    @Test
    public void transformNumExp1() {
        TextTransformer startText;
        startText = new TextClass("1 jeden");
        NumbersExpander testUpper = new NumbersExpander(startText, true);
        assertEquals("jeden jeden", testUpper.transform());
    }
    @Test
    public void transformNumExp2() {
        TextTransformer startText;
        startText = new TextClass("11");
        NumbersExpander testUpper = new NumbersExpander(startText, true);
        assertEquals("jedenaście", testUpper.transform());
    }
    @Test
    public void transformNumExp3() {
        TextTransformer startText;
        startText = new TextClass("999");
        NumbersExpander testUpper = new NumbersExpander(startText, true);
        assertEquals("dziewięćset dziewięćdziesiąt dziewięć", testUpper.transform());
    }
    @Test
    public void transformNumExp4() {
        TextTransformer startText;
        startText = new TextClass("111");
        NumbersExpander testUpper = new NumbersExpander(startText, true);
        assertEquals("sto jedenaście", testUpper.transform());
    }

    @Test
    public void transformNumExp5() {
        TextTransformer startText;
        startText = new TextClass("1");
        NumbersExpander testUpper = new NumbersExpander(startText, false);
        assertEquals("1", testUpper.transform());
    }
}