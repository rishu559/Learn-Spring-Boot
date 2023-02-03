
package com.in28minutes.spring.learnspringframework.enterprise.example.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;

@Component
public class BussinessService{
	
	@Autowired
	private DataService data;
	
	public int returnFromDataService() {
		List<Integer> list = data.value();
		int sum =0;
		for(Integer i:list) {
			sum+=i;
		}
		return sum;
	}
}

