package com.cognizant.services;

import java.util.List;

import com.cognizant.dto.TeacherDto;
import com.cognizant.entity.Teacher;

public interface ITeacherService {
	public Teacher createTeacher(TeacherDto teacherDto);
	public List<TeacherDto> viewAllTeachers();
	public TeacherDto findTeacherById(long id);
}
