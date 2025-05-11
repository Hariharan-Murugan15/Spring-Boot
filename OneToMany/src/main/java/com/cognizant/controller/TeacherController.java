package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.dto.StudentDto;
import com.cognizant.dto.TeacherDto;
import com.cognizant.entity.Student;
import com.cognizant.entity.Teacher;
import com.cognizant.services.IStudentService;
import com.cognizant.services.ITeacherService;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
	@Autowired
	ITeacherService teacherService;
	
	@Autowired
	IStudentService studentService;
	
	
	
	@PostMapping("/addTeacher")
	public ResponseEntity<Teacher> addTeacher(@RequestBody TeacherDto teacherDto){
		
		return new ResponseEntity<>(teacherService.createTeacher(teacherDto), HttpStatus.CREATED); 
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addTeacher(@RequestBody StudentDto studentDto){
		
		return new ResponseEntity<>(studentService.addStudent(studentDto), HttpStatus.CREATED); 
	}
	

}
