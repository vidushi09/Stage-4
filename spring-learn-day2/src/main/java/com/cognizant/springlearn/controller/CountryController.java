package com.cognizant.springlearn.controller;

import java.util.List;

import javax.validation.Valid;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private Logger log = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia(){
        log.info("getCountry called");
        return countryService.getCountryIndia();
    }

    
    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        log.info("getAllCountries called");
        return countryService.getAllCountries();
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException{
        log.info("get country by code called");
        return countryService.getCountry(code);
    }

    @PostMapping("/country")
    public Country addCountry(@Valid @RequestBody Country country){
        log.info("Start");
        return country;

    }
}
