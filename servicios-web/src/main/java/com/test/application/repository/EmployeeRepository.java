package com.test.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	boolean existsByNameAndLastName(String name, String lastName);
	List<Employee> findByJobId(Integer jobId);
}
