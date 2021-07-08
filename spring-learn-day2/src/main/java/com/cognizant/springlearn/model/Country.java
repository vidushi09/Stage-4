package com.cognizant.springlearn.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    @NotNull
    @Size(min = 2,max=2,message = "Country code should be two characters")
    private String code;
    private String name;
    private Logger log = LoggerFactory.getLogger(Country.class);

    Country(){
        log.debug("Inside country constructor");
    }

    public String getCode() {
        log.debug("Inside get code method");
        return code;
    }
    public void setCode(String code) {
        log.debug("Inside set code method");
        this.code = code;
    }
    public String getName() {
        log.debug("Inside get name method");
        return name;
    }
    public void setName(String name) {
        log.debug("Inside set name method");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
    
}
