package com.cognizant.services;

import com.cognizant.dto.StudentDto;
import com.cognizant.entity.Student;

public interface IStudentService {

	public Student addStudent(StudentDto studentDto);
	
}
