package com.example.SecondSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String home(Model model) {
        Message message = new Message("Welcome to Spring Boot MVC!");
        model.addAttribute("message", message);
        return "home"; // Maps to home.html in templates folder
    }
}
