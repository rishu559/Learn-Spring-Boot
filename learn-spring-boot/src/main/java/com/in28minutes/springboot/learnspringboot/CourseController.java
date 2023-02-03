package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

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
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course(1,"Durga","C++"),
				new Course(2,"Durga","Java"),
				new Course(3,"Ranga","Python"),
				new Course(4,"Babu","JSP")
				);
	}
}
