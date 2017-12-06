package personal.spring.mvc.view.resourcebundle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResourceBundleController {

    @GetMapping(path = "resource")
    public ModelAndView handlerRequest(){

        ModelAndView model = new ModelAndView("ResourceBundleResolverPage");
        return model;
    }
}
