package com.softeq.jm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */
@Controller
@RequestMapping("/v2/home")
public class SpringHomeController {

    @GetMapping
    public ModelAndView home() {
        return new ModelAndView("/home/home");

    }

}
