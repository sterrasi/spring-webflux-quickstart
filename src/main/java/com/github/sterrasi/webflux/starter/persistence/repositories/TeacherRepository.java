package com.github.sterrasi.webflux.starter.persistence.repositories;

import com.github.sterrasi.webflux.starter.persistence.entities.TeacherEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends R2dbcRepository<TeacherEntity, Long> {


}
