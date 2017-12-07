package personal.spring.mvc.view.contentnegotiating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.LinkedList;

@Controller
public class ContentNegotiatingController {

    Logger LOGGER = LoggerFactory.getLogger(ContentNegotiatingController.class);

//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public LinkedList<Article> get(Model model) {
//
//
//        LinkedList<Article> articles = new LinkedList<>();
//
//        Article article1 = new Article("Spring MVC View (JSON, XML, PDF or Excel)",
//                "http://hmkcode.com/spring-mvc-view-json-xml-pdf-or-excel/",
//                Arrays.asList(new String[]{"Spring"}),
//                Arrays.asList(new String[]{"Spring", "JSON", "XML", "iText", "Apache POI"}));
//
//        articles.add(article1);
//
//        model.addAttribute("articles", articles);
//        return articles;
//    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ModelAndView get() {

        LinkedList<Article> articles = new LinkedList<>();

        Article article1 = new Article("Spring MVC View (JSON, XML, PDF or Excel)",
                "http://hmkcode.com/spring-mvc-view-json-xml-pdf-or-excel/",
                Arrays.asList(new String[]{"Spring"}),
                Arrays.asList(new String[]{"Spring", "JSON", "XML", "iText", "Apache POI"}));

        articles.add(article1);

        return new ModelAndView("negotiating", "articles", articles);
    }
}
