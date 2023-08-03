package com.java.learningspringframwork.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculativeService {
	
	private DataService dataService;
	
	public BusinessCalculativeService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		
		return Arrays.stream(dataService.retrieveData()).max().getAsInt();
	}

}
