package personal.spring.mvc.view.xml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class XmlViewResolverController {

    @GetMapping(path = "page")
    public ModelAndView handlerRequest(){

        ModelAndView model = new ModelAndView("XmlViewResolverPage");
        return model;
    }
}
