package com.java.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class School {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*To use these two annotations, you need to add a bean in XML name:  org.springframework.context.annotation.CommonAnnotationBeanPostProcessor*/
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("School Object: init() will be executed after properties has been set ");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("School Object: bean is going to distroy");
	}
	
	public void displayInfo() {
		System.out.println("School Name: " + name + "\n");
	}

}
