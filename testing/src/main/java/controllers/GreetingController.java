package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting") //get is the default! If you wanted to use another request, you'd do "method = RequestMethod.POST", or something.
    public String getGreeting() {
        return "Hi! It's me, James. Following the blondiebytes youtube tutorial at https://www.youtube.com/watch?v=YDRNMAJo0MA.";
    }
}
