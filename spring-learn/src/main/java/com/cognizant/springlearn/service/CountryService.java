package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;

@Service
public class CountryService {
	
	
	public Country getCountry(String code) {
		List<String> presentCountry = new ArrayList<String>(Arrays.asList("in","us","de","jp"));
		
		if(presentCountry.indexOf(code)!=-1) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("country.xml");
			Country country =  (Country) ctx.getBean(code.toLowerCase());
			return country;
		}	
		return null;
	}
}
