package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entities.Student;
import com.cognizant.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	//    GET
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{rno}")
	public ResponseEntity<String> getStudentById(@PathVariable int rno) {
		return (studentService.getStudentById(rno) == null) ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>("Fetched..",HttpStatus.OK);
	}
	
	@GetMapping("/students/department/{dept}")
	public List<Student> getStudentsByDept(@PathVariable String dept){
		return studentService.getsStudentsByDept(dept);
	}
	
	@GetMapping("students/filter")
	public List<Student> getStudentByNameAndDept(@Param("name") String name, @Param("dept") String dept){
		return studentService.getStudentByNameAndDept(name, dept);
	} 
	
	
	//    POST
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return (studentService.addStudent(student) == null) ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(student,HttpStatus.CREATED);
	}
	
	//    UPDATE
	@PutMapping("/students")
	public String updateStudent(Student student) {
		return studentService.updateStudent(student) ? "Updated Successfully" : "Failed";
	}
	
	//    DELETE
	@DeleteMapping("/students/{rno}")
	public String deleteStudentById(@PathVariable int rno) {
		studentService.deleteStudentById(rno);
		return "deleted..";
	}
	
	@DeleteMapping("/students/clear")
	public String deleteAllStudents() {
		studentService.deleteAllStudents();
		return "deleted all students..";
	}
}
