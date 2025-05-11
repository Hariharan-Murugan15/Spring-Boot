package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ProductDatabase;

@Component
public class ProductService {
	@Autowired
	ProductDatabase pd;
	public void displayFromService() {
		pd.dbConnect();
		System.out.println("This is product service.");
	}
}
