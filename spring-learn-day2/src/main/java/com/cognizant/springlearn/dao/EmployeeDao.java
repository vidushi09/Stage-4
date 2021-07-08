package com.cognizant.springlearn.dao;

import java.util.List;

import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Employee;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
    private static List<Employee> EMPLOYEE_LIST;

    EmployeeDao() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = context.getBean("employeeList", List.class);
        context.close();
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }

    public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException{
        for (Employee e : EMPLOYEE_LIST) {
            if(e.getId() == employee.getId()){
                //update employee
                EMPLOYEE_LIST.remove(e);
                EMPLOYEE_LIST.add(employee);
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

    public Employee deleteEmployee(Employee employee) throws EmployeeNotFoundException{
        for (Employee e : EMPLOYEE_LIST) {
            if(e.getId() == employee.getId()){
                //delete employee
                EMPLOYEE_LIST.remove(e);
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

}
