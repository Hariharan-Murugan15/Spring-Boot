package com.cognizant;

public class Student2 {
	private Writer write;
	

	public Student2() {
		System.out.println("Student2 is creating..");
	}

	public Writer getWrite() {
		return write;
	}

	public void setWrite(Writer write) {
		this.write = write;
	}
	
	public void writing () {
		write.write();
	}
}
