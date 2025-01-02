package com.github.sterrasi.webflux.starter.persistence.repositories;

import com.github.sterrasi.webflux.starter.persistence.entities.AcademicClassEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicClassRepository extends R2dbcRepository<AcademicClassEntity, Long> {
    
}
