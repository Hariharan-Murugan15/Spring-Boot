package com.cognizant;

public class Car {
	int model;
	Engine eng;
	public void setModel(int model) {
		this.model = model;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	void display() {
		System.out.println("Model: " + model);
		System.out.println("Engine: "+ eng.engine);
	}
}
