package com.github.sterrasi.webflux.starter.controllers;

import com.github.sterrasi.webflux.starter.controllers.model.Teacher;
import com.github.sterrasi.webflux.starter.persistence.entities.TeacherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class TeacherMapper {

    public abstract Teacher entityToDto(TeacherEntity entity);

    @Mapping(target = "version", ignore = true)
    public abstract TeacherEntity dtoToEntity(Teacher dto);

}
