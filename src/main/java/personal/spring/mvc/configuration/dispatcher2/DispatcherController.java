package personal.spring.mvc.configuration.dispatcher2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DispatcherController {
	
	@Autowired
	String sqlReader;

	Logger LOGGER = LoggerFactory.getLogger(DispatcherController.class);
	
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
//    	LOGGER.error(sqlReader);
        String message = sqlReader;
        return new ModelAndView("hellopage", "message", message);
    }
}
