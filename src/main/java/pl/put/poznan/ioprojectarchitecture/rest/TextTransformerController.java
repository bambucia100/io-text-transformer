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
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        System.out.println("textGet: " + text);
        logger.debug(Arrays.toString(transforms));
        System.out.println("transformsGet: " + transforms.toString());

        // do the transformation, you should run your logic here, below just a silly example
       // TextTransformer transformer = new TextTransformer(transforms);
        //return transformer.transform(text);
        return "XD";
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                      @RequestBody TextTransformerClass transforms){

        // log the parameters
        logger.debug(text);
        System.out.println("textPost: " + text);
        // do the transformation, you should run your logic here, below just a silly example
        TextTransformer transformer = new TextTransformer(transforms);
        text = transformer.transform(transforms, text);
        
        
        return text;
    }
}
