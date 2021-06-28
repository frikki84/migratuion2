package com.softeq.jm.spring.controller;

import com.softeq.jm.model.Company;
import com.softeq.jm.spring.service.SpringCompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */
@RestController
@RequestMapping("/company")
public class SpringCompanyController {

    private final SpringCompanyService companyService;

    public SpringCompanyController(SpringCompanyService companyService) {
        this.companyService = companyService;
    }


    @GetMapping("/companies")
    public ModelAndView companies() {
        System.out.println("I'm in SPRING COMPANIES");
        List<Company> companies = companyService.findAll();
        ModelAndView view = new ModelAndView("company/companies");
        view.addObject("companies", companies);
        return view;
    }

    @PostMapping
    public ModelAndView addCompany(Company company) {
        companyService.persist(company);
        List<Company> companies = companyService.findAll();
        ModelAndView view = new ModelAndView("company/companies");
        view.addObject("companies", companies);
        return view;
    }
}
