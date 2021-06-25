package com.softeq.jm.spring.controller;

import com.softeq.jm.model.Company;
import com.softeq.jm.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */
@RestController
@RequestMapping("/v2/home")
public class SpringHomeController {
    @Resource(mappedName = "java:global/jm/CompanyService!com.softeq.jm.service.CompanyService")
    private CompanyService companyService;

    @GetMapping
    public List<Company> findUsers() {
        return companyService.findAll();
    }

}
