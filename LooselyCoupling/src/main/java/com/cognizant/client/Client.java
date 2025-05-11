package com.cognizant.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.service.ProductService;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.scan("com.cognizant");
		context.refresh();
		
		ProductService ps = (ProductService)context.getBean("productService");
		ps.displayFromService();
	}
}
