package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.cognizant.springlearn.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		//displayDate();
		//displayCountry();
	}

	public static void displayDate(){
		log.info("START");
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat",SimpleDateFormat.class);
		
		try {
			var date = format.parse("31/12/2018");
			log.info("date: {}", date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		log.info("END");
		context.close();
	}
	public static void displayCountry(){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		var country = context.getBean("countryList", List.class);
		log.debug("Country : {}", country);

		// Country anotherCountry = context.getBean("country", Country.class);
		// log.debug("Country : {}", anotherCountry);
		context.close();
	}
}
