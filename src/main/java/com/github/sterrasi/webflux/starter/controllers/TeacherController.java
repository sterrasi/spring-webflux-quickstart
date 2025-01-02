package com.github.sterrasi.webflux.starter.controllers;

import com.github.sterrasi.webflux.starter.controllers.model.Teacher;
import com.github.sterrasi.webflux.starter.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping()
    public Mono<Teacher> getTeacherById(String id){

        return null;
    }
}
