package com.cognizant;

public class AutowireEg {
	private Writer writer;
	
	public AutowireEg() {
		System.out.println("Autowire is created..");
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
	public void writing() {
		System.out.println("called using auto wiring..");
		writer.write();
		
	}
}
