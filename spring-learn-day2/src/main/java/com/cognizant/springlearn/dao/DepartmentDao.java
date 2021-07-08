package com.cognizant.springlearn.dao;

import java.util.List;

import com.cognizant.springlearn.model.Department;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDao {
    private static List<Department> DEPARTMENT_LIST;

    DepartmentDao() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        DEPARTMENT_LIST = context.getBean("departmentList", List.class);
        context.close();
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }

}