package personal.spring.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        LOGGER.error("I am here");

        String message = "HELLO SPRING MVC HOW R U";
        return new ModelAndView("hellopage", "message", message);
    }
}
