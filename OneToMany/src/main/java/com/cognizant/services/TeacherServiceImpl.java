package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dto.TeacherDto;
import com.cognizant.entity.Teacher;
import com.cognizant.repository.StudentRepository;
import com.cognizant.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements ITeacherService {
	@Autowired
	TeacherRepository teacherRepo;
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Teacher createTeacher(TeacherDto teacherDto) {

		Teacher teacher = new Teacher();
		teacher.setName(teacherDto.getName());
		
		return teacherRepo.save(teacher);
	}
	
	
	 

	@Override
	public List<TeacherDto> viewAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeacherDto findTeacherById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
