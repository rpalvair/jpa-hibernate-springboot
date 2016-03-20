package com.palvair.jpa.hibernate.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by widdy on 20/03/2016.
 */
@Entity
@Table()
@ToString
public class Company {

    @Id
    @GeneratedValue
    private Long ID;

    @Column
    @Getter
    @Setter
    private String name;
}
