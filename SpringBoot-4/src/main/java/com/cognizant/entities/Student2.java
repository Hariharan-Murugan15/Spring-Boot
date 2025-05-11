package com.cognizant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno;
	private String name;
	private String dept;
	private String domain;
}
