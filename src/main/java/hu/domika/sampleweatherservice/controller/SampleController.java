package hu.domika.sampleweatherservice.controller;

import hu.domika.sampleweatherservice.model.SampleResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample Controller.
 * @author Balazs_Domonkos
 */
@RestController
public class SampleController {
    private static final String sampleMessage = "Hello, this is a sample response!";

    @RequestMapping(path = "/sample", method = RequestMethod.GET)
    public SampleResponse sample() {
        return new SampleResponse(sampleMessage);
    }
}
