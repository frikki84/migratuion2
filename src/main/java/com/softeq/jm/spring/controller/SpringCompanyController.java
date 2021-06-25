package com.softeq.jm.spring.controller;

import com.softeq.jm.model.Company;
import com.softeq.jm.service.CompanyService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */
@RestController
@RequestMapping("/v2/companies")
public class SpringCompanyController {
    @Resource(mappedName = "java:global/jm/CompanyService!com.softeq.jm.service.CompanyService")
    private CompanyService companyService;


    @GetMapping
    public ModelAndView companies(){
        List<Company> companies = companyService.findAll();
        ModelAndView view = new ModelAndView("/company/companies");
        view.addObject("companies", companies);
        return view;
    }
    @PostMapping
    public ModelAndView addCompany(Company company){
        companyService.persist(company);
        List<Company> companies = companyService.findAll();
        ModelAndView view = new ModelAndView("/company/companies");
        view.addObject("companies", companies);
        return view;
    }
}
