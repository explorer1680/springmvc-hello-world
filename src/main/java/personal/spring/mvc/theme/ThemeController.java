package personal.spring.mvc.theme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThemeController {

    @GetMapping(value = "theme")
    public String getTheme() {

        return "theme";
    }
}
