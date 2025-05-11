package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{}
