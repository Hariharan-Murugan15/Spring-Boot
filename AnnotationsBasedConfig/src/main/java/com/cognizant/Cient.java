package com.cognizant;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cient {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cognizant");
		context.refresh();
		
		Employee emp = (Employee)context.getBean("employee");
		emp.displayEmp();
	}
}
