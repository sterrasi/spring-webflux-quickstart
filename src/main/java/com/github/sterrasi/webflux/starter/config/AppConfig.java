package com.github.sterrasi.webflux.starter.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.time.Clock;

@Configuration
public class AppConfig {

    private static final Module JAVA_TIME_MODULE = new JavaTimeModule();

    /**
     * Use an application specific {@link ObjectMapper}
     */
    @Bean
    public ObjectMapper getObjectMapper() {
        return ObjectMapperProvider.get();
    }

    /**
     * Use the application specific {@link ObjectMapper} in the Web MVC
     * {@link org.springframework.http.converter.HttpMessageConverter}.
     * @param objectMapper custom mapper for the application
     * @return converter with the custom mapper.
     */
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(ObjectMapper objectMapper) {
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }

    @Bean
    public Clock getClock() {
        return Clock.systemDefaultZone();
    }

}
