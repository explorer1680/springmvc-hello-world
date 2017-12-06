package personal.spring.mvc.configuration.dispatcher1;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class SpringController {

    Logger LOGGER = LoggerFactory.getLogger(SpringController.class);

    @Autowired
    String sqlReader;

    @RequestMapping("/hello")
    public ModelAndView helloWorld(HttpServletRequest request) {
        String message = sqlReader;
//    	String message = RequestContextUtils.findWebApplicationContext(request).getDisplayName();
    	for(String s: RequestContextUtils.findWebApplicationContext(request).getBeanDefinitionNames()){
            LOGGER.error(s);
        }

        ModelAndView rtn = new ModelAndView("hellopage", "message", message);
//        rtn.addObject("info", info);
        return rtn;

    }
}
