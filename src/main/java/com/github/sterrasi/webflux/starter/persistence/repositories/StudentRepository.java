package com.github.sterrasi.webflux.starter.persistence.repositories;

import com.github.sterrasi.webflux.starter.persistence.entities.StudentEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends R2dbcRepository<StudentEntity, Long> {

}
