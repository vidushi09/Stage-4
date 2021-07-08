package com.cognizant.springlearn.service;

import java.util.List;

import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

    public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException{
        return employeeDao.updateEmployee(employee);
    }

    public Employee deleteEmployee(Employee employee) throws EmployeeNotFoundException{
        return employeeDao.deleteEmployee(employee);
    }

}
