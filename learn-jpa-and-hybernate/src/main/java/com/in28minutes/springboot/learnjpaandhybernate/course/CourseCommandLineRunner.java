package com.in28minutes.springboot.learnjpaandhybernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhybernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
//	private CourseJdbcRepository repository;
//	private CourseJpaRepository repository;
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Java","Ranga"));		
		repository.save(new Course(2,"Python","Durga"));		
		repository.save(new Course(3,"Spring","Ranga"));	
		repository.deleteById(1l);
//		
		
		System.out.println(repository.count());
		System.out.println(repository.findById(2l));
		System.out.println(repository.findByName("Java"));
		System.out.println(repository.findByAuthor("Ranga"));
	}
}
