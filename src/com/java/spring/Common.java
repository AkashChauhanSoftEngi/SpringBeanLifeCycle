package com.java.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 * These two methods will run for each and every bean created in XML file.
 * Before and after initialization of the bean, actually init method also works before initialization 
 * and after property set
 * */

public class Common implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		return bean; /*Return current bean*/
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName + "\n");
		return bean;
	}

}
