package com.example.projecthw8thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("view")
    public String test(Model model){
        model.addAttribute("view", "We can put anything here");
        return "viewer";
    }
}
