package com.softeq.jm.spring.controller;

import com.softeq.jm.service.RememberMeService;
import com.softeq.jm.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */

@RestController
@RequestMapping("/login")
public class SpringLoginController {
    @Resource(mappedName = "java:global/jm/UserService!com.softeq.jm.service.UserService")
    private UserService userService;
    @Resource(mappedName = "java:global/jm/RememberMeService!com.softeq.jm.service.RememberMeService")
    private RememberMeService rememberMeService;

    @PostMapping("login")
    public ModelAndView signin(String email, String password, boolean rememberme) {
        System.out.println("i'm in SPRING LOGIN");
        ModelAndView view = new ModelAndView("/login/login");
        return view;
    }
}
