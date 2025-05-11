package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("obj3.xml");
		AutowireEg auto=  (AutowireEg) context.getBean("auto2");
		auto.writing();
	}
}
