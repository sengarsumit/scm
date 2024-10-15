package com.scm.controller;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("home page handler");
        model.addAttribute("name","substring tech");
        model.addAttribute("youtubeChannel","learn cdode");
        model.addAttribute("githubRepo","sumitsengar");
        return "home";
    }
    @RequestMapping("/about")
    public String aboutPage()
    {
        System.out.println("about page loading");
        return "about";
    }
    @RequestMapping("/services")
    public String servicesPage()
    {
        System.out.println("services page loading");
        return "services";
    }
}
