package com.softeq.jm.spring.repository;

import com.softeq.jm.model.Company;
import org.springframework.stereotype.Component;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydziadkouskaya on 6/28/2021.
 */
@Component
@Transactional
public class SpringCompanyRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void persist(Company company) {
        System.out.println("Add company");
        entityManager.persist(company);
    }

    public List<Company> findAll() {
//        Company company = new Company();
//        System.out.println("Class of Company" + company.getClass());
        System.out.println("Find all");
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Company> query = criteriaBuilder.createQuery(Company.class);
//        Root <Company> root = query.from(Company.class);
//        query.select(root);
//        List<Company> result = entityManager.createQuery(query).getResultList();
//        System.out.println("result companies" + result);
//        return result;
        //List<Company> list = entityManager.createQuery("select c from Company2 c order by c.id").getResultList();
        List<Company> list =entityManager.createNativeQuery("select * from company").getResultList();
        return list;
//
//
//        Company company = new Company();
//        company.setName("gtgt");
//        Company company1 = new Company();
//        company1.setName("jsbdfe");
//        return Arrays.asList(company, company1);
    }
/*
    public Company addCompany(Company company) {
        entityManager.persist(company);
        return company;
    }*/


}
