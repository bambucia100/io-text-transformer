package pl.put.poznan.ioprojectarchitecture.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.ioprojectarchitecture.logic.TextClass;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.functionality.*;

import java.util.Arrays;

@RestController
@RequestMapping("/{text}")
public class TextTransformerController {
	private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);
    TextTransformer startText;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text, @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));
        return "{\n" +
                "\"basicTransform\": \"none\",\n" +
                "\"shortcuts\": \"none\",\n" +
                "\"inverse\": true,\n" +
                "\"numbers\": false,\n" +
                "\"latex\": false,\n" +
                "\"neighbors\": false,\n" +
                "\"comma\": false,\n" +
                "\"leetspeak\": false,\n" +
                "\"polishLetter\": false\n" +
                "}";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@PathVariable String text, @RequestBody TextTransformerClass transforms){
        logger.debug(text);
        System.out.println("Controll");
        System.out.println(text);
        startText = new TextClass(text);
        startText = new NumbersExpander(startText, transforms.isNumbers());
        startText = new ShortcutsModifier(startText, transforms.getShortcuts());
        startText = new LatexCharacters(startText, transforms.isLatex());
        startText = new NeighborRemover(startText, transforms.isNeighbors());
        startText = new BasicTransforms(startText, transforms.getBasicTransform());
        startText = new CommaAdder(startText, transforms.isComma());
        startText = new Leetspeak(startText, transforms.isLeetspeak());
        startText = new PolishLettersRemover(startText, transforms.isPolishLetter());
        startText = new Inverse(startText, transforms.isInverse());
        System.out.println(startText.getText());
        return  startText.transform();
    }
}
