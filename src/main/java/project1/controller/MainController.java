package project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/grace")
    public String gracePage() {
        return "grace";
    }

    @GetMapping("/aaron")
    public String aaronPage() {
        return "aaron";
    }

    @GetMapping("/praneeth")
    public String praneethPage() {
        return "praneeth";
    }

}