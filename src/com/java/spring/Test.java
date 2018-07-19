package com.java.spring;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/* If you want to use advance IOC, here we are using J2EE IOC */
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println();
		
		/* Only one object is created as by default it is singleton */
		ap.getBean("studentbean");
		ap.getBean("teacherbean");
		ap.getBean("schoolbean");
		
		/*if you do not close it, preDestory methods would not be called*/
		((AbstractApplicationContext) ap).close();
	}
}
