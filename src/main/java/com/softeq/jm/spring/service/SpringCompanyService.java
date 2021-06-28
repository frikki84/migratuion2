package com.softeq.jm.spring.service;

import com.softeq.jm.model.Company;
import com.softeq.jm.spring.repository.SpringCompanyRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ydziadkouskaya on 6/28/2021.
 */
@Component
public class SpringCompanyService {
    private final SpringCompanyRepository springCompanyRepository;

    public SpringCompanyService(SpringCompanyRepository springCompanyRepository) {
        this.springCompanyRepository = springCompanyRepository;
    }

    public void persist(Company company) {
        springCompanyRepository.persist(company);
    }

    public List<Company> findAll() {
        return springCompanyRepository.findAll();
    }
}
