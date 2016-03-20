package com.palvair.jpa.hibernate.springboot.repository;

import com.palvair.jpa.hibernate.springboot.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by widdy on 20/03/2016.
 */
public interface CompanyRepository<T extends Company> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}
