package com.cognizant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private int rno;
	private String name;
	private String dept;
}
