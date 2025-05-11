package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	List<Student> findByDept(String dept);
	
	@Query(nativeQuery = true,
			value = "SELECT * FROM student WHERE name = :name AND dept = :dept")
	List<Student> getStudentByNameAndDept(@Param("name") String name, @Param("dept") String dept);
}
