package com.github.sterrasi.webflux.starter.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@Getter
@Setter
public class TeacherEntity {

    @Id
    private long id;

    private String firstName;
    private String middleName;
    private String lastName;

    @Version
    private int version;


}
