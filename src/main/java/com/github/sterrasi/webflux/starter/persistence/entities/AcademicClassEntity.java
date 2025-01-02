package com.github.sterrasi.webflux.starter.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Set;

@Getter
@Setter
public class AcademicClassEntity {

    @Id
    private long id;

    private String subject;
    private long teacherId;

    private Set<String> subjects;

}
