package personal.spring.mvc.configuration.dispatcher1;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class SpringController {

    Logger LOGGER = LoggerFactory.getLogger(SpringController.class);

    @RequestMapping("/hello")
    public ModelAndView helloWorld(HttpServletRequest request) {
//        String message = "HELLO SPRING MVC HOW R U";
    	String message = RequestContextUtils.findWebApplicationContext(request).getDisplayName();
        return new ModelAndView("hellopage", "message", message);
    }
}
