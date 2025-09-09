package com.example.ecslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("fullName", "Linus Tabari");
        return "index";
    }

    @GetMapping("/health")
    public String health() {
        return "health";
    }
}