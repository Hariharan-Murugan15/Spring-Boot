package com.cognizant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{}