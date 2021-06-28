package com.softeq.jm.spring.repository;

import com.softeq.jm.model.Company;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by ydziadkouskaya on 6/28/2021.
 */
@Component
public class SpringCompanyRepository {

    @PersistenceContext
    private EntityManager em;

    public void persist(Company company) {
        em.persist(company);
    }

    public List<Company> findAll() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Company> query = criteriaBuilder.createQuery(Company.class);
        Root<Company> root = query.from(Company.class);
        query.select(root);
        List<Company> result = em.createQuery(query).getResultList();
        System.out.println(result);
        return result;

//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<ConfigurationEntry> cq = cb.createQuery(ConfigurationEntry.class);
//        Root<ConfigurationEntry> rootEntry = cq.from(ConfigurationEntry.class);
//        CriteriaQuery<ConfigurationEntry> all = cq.select(rootEntry);
//        TypedQuery<ConfigurationEntry> allQuery = em.createQuery(all);
//        return allQuery.getResultList();
    }


}
