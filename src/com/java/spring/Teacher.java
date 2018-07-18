package com.java.spring;

/*
 * Instead of implementing InitializingBean, DisposableBean each time setting init-meethod and destroy-method in xml file is easy 
 * way to manage object life cycle
 * For same methods in each bean you do not need to write init and destroy in each bean simple you can use
 *  default-init-method="init" default-destroy-method="destroy" in bean tag in XML file
 * 
 * */

public class Teacher {
	private String name;

	private Teacher(){
		System.out.println("Teacher object is created");
		System.out.println("init() will execute now");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("Hello This is, " + name);
	}
	
	public void init() throws Exception {
		System.out.println("Teacher Object: init() will be executed after properties has been set ");
	}
	
	public void destroy() throws Exception {
		System.out.println("Teacher Object: after running destroy(), this bean is going to distroy");
	}

}
