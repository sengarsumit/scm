package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    //dashboard
    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public String userDashboard() {
        return "user/dashboard";
    }
    //user profile
    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    public String userProfile() {
        return "user/profile";
    }

    //add contact
    //view contact
    //edit
    //deltere

}
