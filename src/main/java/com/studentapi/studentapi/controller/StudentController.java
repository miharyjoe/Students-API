package com.studentapi.studentapi.controller;

import com.studentapi.studentapi.model.Students;
import com.studentapi.studentapi.service.StudentsRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    private final StudentsRepositoryImpl studentsRepository;

    @GetMapping("/students")
    public List<Students> findAllStudents(){
        return  studentsRepository.getAll();
    }
}
