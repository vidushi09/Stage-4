package com.cognizant.springlearn.controller;

import java.util.List;

import javax.validation.Valid;

import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/updateEmployee")
    public void updateEmployee(@Valid @RequestBody Employee employee) throws EmployeeNotFoundException{
        log.info("START: updateEmployee");
        employeeService.updateEmployee(employee);
        log.debug("Employee = {}", employee);
        log.info("END; updateEmployee");
    }

    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@Valid @RequestBody Employee employee) throws EmployeeNotFoundException{
        log.info("START: deleteEmployee");
        employeeService.deleteEmployee(employee);
        log.debug("Employee = {}", employee);
        log.info("END; deleteemployee");
    }
}
