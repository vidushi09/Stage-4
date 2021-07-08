package com.cognizant.springlearn.service;

import java.util.List;

import com.cognizant.springlearn.dao.DepartmentDao;
import com.cognizant.springlearn.model.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;

    public List<Department> getAllDepartments(){
        return departmentDao.getAllDepartments();
    }
}
