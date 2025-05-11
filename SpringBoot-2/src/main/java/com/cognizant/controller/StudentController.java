package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Student;
import com.cognizant.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	//  GET
	
	@GetMapping("students")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@GetMapping("students/{rno}")
	public Student getStudentByRno(@PathVariable("rno") int rollNo) {
		return studentService.getStudentByRno(rollNo);
	}
	
	
	//  POST
	
	@PostMapping("students")
	public String addStudent(@RequestBody Student student) {
		return (studentService.addStudent(student)) ? "success" : "fail";
	}
	
	
	//  PUT
	
	@PutMapping("students")
	public String updateStudent(@RequestBody Student student) {
		return studentService.updateStu(student);
	}
	
	
	//  DELETE
	
	@DeleteMapping("students/{rno}")
	public String deleteStudentById(@PathVariable int rno) {
		return studentService.deleteStudentById(rno);
	}

}






