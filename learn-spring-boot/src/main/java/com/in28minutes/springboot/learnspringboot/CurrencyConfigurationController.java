package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
PUT - http://localhost:8080/courses/100001
{
	 "id": 100001,
	 "name": "Learn Microservices 2",
	 "author": "in28minutes"
	}
*/

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration csc;
	
	@RequestMapping("/currency-service")
	public CurrencyServiceConfiguration getAllCourses(){
		return csc;
	}
}
