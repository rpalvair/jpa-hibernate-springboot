package com.palvair.jpa.hibernate.springboot.entity;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by widdy on 20/03/2016.
 */
@Entity
@Table()
@ToString
public class Employee {

    @Id
    @GeneratedValue
    private Long ID;
}
