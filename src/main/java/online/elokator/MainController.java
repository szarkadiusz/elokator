package online.elokator;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {


    @RequestMapping("/hello")
    public String redirect() {
        return "viewpage";
    }

    @RequestMapping("/helloagain")
    public String display() {
        return "final";
    }
}

//https://spring.io/guides/gs/serving-web-content/#initial
//https://www.javatpoint.com/spring-mvc-multiple-view-page-example