package springintro.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//this is a REST controller that handles web requests
@RestController
public class HelloWorldController {
    //method to handle GET requests sent to the "/hello" URL
    @GetMapping("/hello")
    public String sayhello() {
        //when someone visits "/hello" this message will be sent as a response
        return "Hello from BridgeLabz";
    }
}