package com.github.sterrasi.webflux.starter.config;


import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@ConditionalOnClass(ConnectionFactory.class)
@EnableR2dbcRepositories(basePackages = {"com.github.sterrasi.webflux.starter.persistence"})
@EnableR2dbcAuditing
public class PersistenceConfig {
}
