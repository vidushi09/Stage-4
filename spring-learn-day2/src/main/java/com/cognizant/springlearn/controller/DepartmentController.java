package com.cognizant.springlearn.controller;

import java.util.List;

import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
