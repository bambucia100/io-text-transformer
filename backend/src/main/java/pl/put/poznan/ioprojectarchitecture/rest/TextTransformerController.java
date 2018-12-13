package pl.put.poznan.ioprojectarchitecture.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;

import java.util.Arrays;

@RestController
@RequestMapping("/{text}")
public class TextTransformerController {
	private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

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
        TextTransformer transformer = new TextTransformer(transforms);
        text = transformer.transform(transforms, text);
        return text;
    }
}
