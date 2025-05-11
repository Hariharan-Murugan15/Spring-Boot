package com.cognizant.Student;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int rno;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public void show() {
		System.out.println("In Show");
	}
	
}
