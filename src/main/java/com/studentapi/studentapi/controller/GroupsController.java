package com.studentapi.studentapi.controller;

import com.studentapi.studentapi.model.Groups;
import com.studentapi.studentapi.model.Students;
import com.studentapi.studentapi.repository.GroupsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class GroupsController {
    private final GroupsRepository groupsRepository;

    @GetMapping("/groups")
    public List<Groups> findAllGroups(){
        return  groupsRepository.findAllGroups();
    }
}
