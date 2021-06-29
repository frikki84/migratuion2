package com.softeq.jm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */
@RestController
@RequestMapping("/home/v2")
public class SpringHomeController {

    @GetMapping
    public ModelAndView index(){
        return  new ModelAndView("redirect:/home/home");
    }

    @GetMapping(value = "/home")
    public ModelAndView getHomePage(){
        System.out.println("I'm in SPRING");
        ModelAndView home = new ModelAndView("home/home");
        return home;
    }

}
