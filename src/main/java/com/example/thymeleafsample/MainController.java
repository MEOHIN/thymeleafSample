package com.example.thymeleafsample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/thymeleaf")
    public String index() {
        return "index";
    }
}
