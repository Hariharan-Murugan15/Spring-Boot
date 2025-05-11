package com.cognizant.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Student;

@Service
public class StudentService {
	List<Student> students = new ArrayList<>(
				Arrays.asList(
						new Student(1, "Hari", "ECE"),
						new Student(2, "Lawliet", "ADS")
						)
			); 
	
	public List<Student> getStudents(){
		return students;
	}
	
	public Student getStudentByRno(int rno) {
		int index = 0;
		boolean found = false;
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getRno() == rno) {
				found = true;
				index=i;
				break;
			}
		}
		if(!found) return null;
		return students.get(index);
	}
	
	public boolean addStudent(Student student) {
		return  (students.add(student)) ? true: false;
		 
	}
	
	
	public String updateStu(Student student) {
		int index = 0;
		boolean found = false;
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getRno() == student.getRno()) {
				index = i;
				students.set(index, student);
				found = true;
				break;
			}
		}
		
		return (found) ? "Updated Successfully" : "Failed to Update";
	}
	
	
	public String deleteStudentById(int rno) {
		int index = 0;
		boolean found =false;
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getRno() ==  rno) {
				found  = true;
				index = i;
				students.remove(index);
				break;
			}
		}
		
		return (found) ? "Deleted Succesfully" : "No such Student Exist..";
	}
}







