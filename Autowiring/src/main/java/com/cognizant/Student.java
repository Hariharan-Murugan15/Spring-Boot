package com.cognizant;
public class Student {
	private Writer write1;
	private Writer write2;
	
	public void writing() {
		write1.write();
	}
	
	public Writer getWrite1() {
		return write1;
	}

	public void setWrite1(Writer write1) {
		this.write1 = write1;
	}
	
	public Writer getWrite2() {
		return write2;
	}


	public void setWrite2(Writer write2) {
		this.write2 = write2;
	}


	public Student() {
		System.out.println("Student is creating..");
	}
}
