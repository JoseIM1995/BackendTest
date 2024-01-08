package com.test.application.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.entity.Employee;
import com.test.application.entity.EmployeeWorkedHours;

public interface EmployeeWorkedHoursRepository extends JpaRepository<EmployeeWorkedHours, Integer>{
	
	boolean existsByEmployeeAndWorkedDate(Employee employee, LocalDate workedDate);
	List<EmployeeWorkedHours> findByEmployeeAndWorkedDateBetween(
	        Employee employee,
	        LocalDate startDate,
	        LocalDate endDate);
}
