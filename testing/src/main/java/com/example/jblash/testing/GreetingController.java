//I'll be using the controllers package for any rest controllers I intend to use
package com.example.jblash.testing;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class GreetingController {
    protected String stringy;

    public GreetingController() {
        this.stringy = "Hi! It's me, James. Following the blondiebytes youtube tutorial at https://www.youtube.com/watch?v=YDRNMAJo0MA.";
    }

    public void setStringy(String stringy) {
        this.stringy = stringy;
    }

    @RequestMapping( //get is the default! If you wanted to use another request, you'd do "method = RequestMethod.POST", or something.
            path = "/greeting",
            method = { RequestMethod.GET } //not necessary, get is the default
    )
    public String getGreeting() { //I don't know if convention is to collapse get/put into one method, but I'm not going to
        return stringy;
        //return "Hi! It's me, James. Following the blondiebytes youtube tutorial at https://www.youtube.com/watch?v=YDRNMAJo0MA.";
    }

    @GetMapping("/greeting/{id}")
    public @ResponseBody ResponseEntity<String> getGreetingById(@PathVariable String id) {
        return new ResponseEntity<String>("GET Response : " + id, HttpStatus.OK);
    }

    @PutMapping("/greeting")
    public @ResponseBody ResponseEntity<String> updateGreeting() {
        setStringy("Changed!");
        return null;
    }
}
