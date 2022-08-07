package com.studentapi.studentapi.repository;

import com.studentapi.studentapi.model.Students;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students, Long> {
    List<Students> findAll();

    @Query(value = "SELECT S FROM Students S")
    List<Students> findAllStudents(Sort sort);

}
