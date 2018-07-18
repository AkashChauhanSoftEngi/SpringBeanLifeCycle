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
		System.out.println("Student Object Created");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("afterPropertiesSet() will run now");
	}

	public void displayInfo() {
		System.out.println("Hello This is, " + name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student Object, runing after properties has been set ");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Student Object, after running destroy(), bean is going to distroy");
	}
}
