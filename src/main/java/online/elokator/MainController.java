package online.elokator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

   @GetMapping("/home")
    private String home(){
        return null;
    }
}
//https://spring.io/guides/gs/serving-web-content/#initial