package com.softeq.jm.spring.service;

import com.softeq.jm.model.Company;
import com.softeq.jm.service.CompanyService;
import com.softeq.jm.spring.entity.SpringCompany;
import com.softeq.jm.spring.repository.SpringCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ydziadkouskaya on 6/28/2021.
 */
@Component
public class SpringCompanyService {
//    @Resource(mappedName = "java:global/jm/CompanyService!com.softeq.jm.service.CompanyService")
    @Autowired
    private SpringCompanyRepository springCompanyRepository;

    public void persist(SpringCompany company) {
        springCompanyRepository.persist(company);
    }

    public List<SpringCompany> findAll() {
        return springCompanyRepository.findAll();
    }
}
