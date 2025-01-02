package com.github.sterrasi.webflux.starter.services;

import com.github.sterrasi.webflux.starter.controllers.TeacherMapper;
import com.github.sterrasi.webflux.starter.controllers.model.Teacher;
import com.github.sterrasi.webflux.starter.persistence.repositories.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;

    public Mono<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id)
                .map(teacherMapper::entityToDto);
    }

    public Mono<Teacher> createTeacher(Teacher teacher) {
        if ( null == teacher ){
            throw new IllegalArgumentException("Teacher is null");
        }
        var entity = teacherMapper.dtoToEntity(teacher);
        return teacherRepository.save(entity)
                .map(teacherMapper::entityToDto);
    }
}
