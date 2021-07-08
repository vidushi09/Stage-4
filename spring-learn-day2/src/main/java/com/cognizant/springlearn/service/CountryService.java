package com.cognizant.springlearn.service;

import java.util.List;

import com.cognizant.springlearn.dao.CountryDao;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryDao countryDao;

    public Country getCountry(String code) throws CountryNotFoundException{
        return countryDao.getCountry(code);
    }
    
    public List<Country> getAllCountries(){
        return countryDao.getAllCountries();
    }

    public Country getCountryIndia(){
        return countryDao.getCountryIndia();
    }
    
}
