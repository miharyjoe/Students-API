package com.studentapi.studentapi.service;

import com.studentapi.studentapi.model.Students;
import com.studentapi.studentapi.repository.StudentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentsRepositoryImpl {
    private final StudentsRepository studentsRepository;

    public List<Students> getAll(){
        return studentsRepository.findAll();
    }

}
