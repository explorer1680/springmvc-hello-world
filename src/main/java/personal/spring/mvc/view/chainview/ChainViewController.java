package personal.spring.mvc.view.chainview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChainViewController {


    @GetMapping(value = "{resolver}")
    public ModelAndView handlerRequest(@PathVariable String resolver){

        ModelAndView model = null;

        if("resource".equalsIgnoreCase(resolver)){

            model = new ModelAndView("ResourceBundleResolverPage");
        }else {
            model = new ModelAndView("UrlBasedResolverPage");
        }


        return model;
    }
}
