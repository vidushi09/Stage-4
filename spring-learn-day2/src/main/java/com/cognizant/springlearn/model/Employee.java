package com.cognizant.springlearn.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {

    @NotNull
    @Min(value = 0)
    private int id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 30)
    private String name;

    @NotNull
    @Min(value = 0)
    private String salary;

    @NotNull
    private boolean permanent;
    private Department department;
    private List<Skill> skills;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public boolean isPermanent() {
        return permanent;
    }
    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "Employee [dateOfBirth=" + dateOfBirth + ", department=" + department + ", id=" + id + ", name=" + name
                + ", permanent=" + permanent + ", salary=" + salary + ", skills=" + skills + "]";
    }
}
