package com.java.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/* This is not a good practice to use these methods this way as you need to implements these interfaces for each bean
 * */

public class Student implements InitializingBean, DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public Student() {
		System.out.println("Student: Object is Created");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Student: Properties have been set");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student: afterPropertiesSet() runing after properties has been set ");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Student: bean is going to distroy");
	}
}
