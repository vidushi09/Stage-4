package com.cognizant.springlearn.dao;

import java.util.List;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;

import org.springframework.stereotype.Component;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Component
public class CountryDao {

    private static List<Country> countries;

    public CountryDao(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        countries = context.getBean("countryList",List.class);
        context.close();
    }

    public Country getCountry(String code) throws CountryNotFoundException{
        for (Country country : countries) {
            if(country.getCode().equalsIgnoreCase(code)){
                return country;
            }
        }
        throw new CountryNotFoundException();
    }

    public List<Country> getAllCountries(){
        return countries;
    }

    public Country getCountryIndia(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        var c = context.getBean("in",Country.class);
        context.close();
        return c;
    }
}
