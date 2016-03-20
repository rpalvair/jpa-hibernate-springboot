package com.palvair.jpa.hibernate.springboot.specification;

import com.palvair.jpa.hibernate.springboot.entity.Employee;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by rpalvair on 14/10/2014.
 */
public class EmployeeSpecification {

    public static Specification<Employee> byName(final String name) {
        return new Specification<Employee>() {
            @Override
            public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.equal(root.get("name"), name);
            }
        };
    }


}
