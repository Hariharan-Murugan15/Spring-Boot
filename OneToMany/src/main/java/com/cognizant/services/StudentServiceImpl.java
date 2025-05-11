package com.cognizant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dto.StudentDto;
import com.cognizant.entity.Student;
import com.cognizant.entity.Teacher;
import com.cognizant.repository.StudentRepository;
import com.cognizant.repository.TeacherRepository;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addStudent(StudentDto studentDto) {
		
		Student student = new Student();
		
		student.setName(studentDto.getName());
		student.setRollNo(studentDto.getRollNo());
		
		Teacher teacher = teacherRepository.findById(studentDto.getTeacherId()).get();
		student.setTeacher(teacher);
		
		Student stu= studentRepository.save(student); 
		
		//again convert to dto 
		
		
		
		return stu;
	}

}
