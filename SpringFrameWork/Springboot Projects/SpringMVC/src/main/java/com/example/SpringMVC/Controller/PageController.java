package com.example.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/welcome")
    public String getWelcomePage(){
        return "redirect:/welcome";
    }
}
