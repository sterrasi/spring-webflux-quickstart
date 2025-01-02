package com.github.sterrasi.webflux.starter.persistence.entities;

import org.springframework.data.annotation.Id;

public class StudentEntity {

    @Id
    private long id;

    private int grade;

    private String firstName;
    private String middleName;
    private String lastName;
}
