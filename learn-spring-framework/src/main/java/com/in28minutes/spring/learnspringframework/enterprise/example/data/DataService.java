package com.in28minutes.spring.learnspringframework.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService{
	public List<Integer> value() {
		return Arrays.asList(10,20,80,40);
	}
}