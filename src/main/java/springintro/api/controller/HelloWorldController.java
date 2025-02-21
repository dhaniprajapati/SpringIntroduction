package springintro.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//this is a REST controller that handles web requests
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    //method to handle GET requests sent to the "/hello" URL
    @GetMapping("/hello")
    public String sayhello() {
        //when someone visits "/hello" this message will be sent as a response
        return "Hello from BridgeLabz";
    }
    @GetMapping("/message")
    public String getMessage() {
        return "Hello from BridgeLabz";
    }
    
    //creating a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    //method to log different levels of messages when "/api/log" is accessed
    @GetMapping("/log")
    public String logMessages() {
        logger.info("Information of logMessages() method");
        logger.debug("Debugging log");
        logger.warn("warning");
        logger.error("ERROR");
        //returning a response to indicate logs have been recorded
        return "Logs have been recorded.";
    }
}
