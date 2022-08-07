package com.studentapi.studentapi.repository;

import com.studentapi.studentapi.model.Groups;
import com.studentapi.studentapi.model.Students;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupsRepository extends JpaRepository<Students, Long> {
    List<Groups> findByName();

    @Query(value = "SELECT G FROM Groups G ")
    List<Groups> findAllGroups();

}
