package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cognizant.entities.Student;
import com.cognizant.repository.StudentRepo;


@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;  // = new StudentRepo();
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public Student getStudentById(int rno) {
		return studentRepo.findById(rno).orElse(null);
	}
	
	public List<Student> getsStudentsByDept(String dept){
		return studentRepo.findByDept(dept);
	}
	
	public List<Student> getStudentByNameAndDept(@Param("name") String name, @Param("dept") String dept){
		return studentRepo.getStudentByNameAndDept(name, dept);
	}
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);
//		boolean flag = false;
		
//		if(studentRepo.save(student) != null)
//			flag = true;
		
//		return flag;
	}

	public boolean updateStudent(Student student) {
		boolean flag = false;
		if(studentRepo.save(student) != null) flag = true;
		return flag;
	}
	
	
	public void deleteStudentById(int rno) {
		studentRepo.deleteById(rno);
	}
	
	public void deleteAllStudents() {
		studentRepo.deleteAll();
	}
}
