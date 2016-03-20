package com.palvair.jpa.hibernate.springboot.specification;

import com.palvair.jpa.hibernate.springboot.entity.Company;
import com.palvair.jpa.hibernate.springboot.entity.Company_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by rpalvair on 14/10/2014.
 */
public class CompanySpecification {

    public static Specification<Company> byName(final String name) {
        return new Specification<Company>() {
            @Override
            public Predicate toPredicate(Root<Company> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.equal(root.get(Company_.name), name);
            }
        };
    }


}
