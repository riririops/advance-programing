package windows.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping({"/login", "/login/"})
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String index2() {
        return "index";
    }

    @GetMapping("/typing")
    public String typing() {
        return "typing";
    }

    @GetMapping("/puzzle")
    public String puzzle() {
        return "puzzle";
    }

   

}
