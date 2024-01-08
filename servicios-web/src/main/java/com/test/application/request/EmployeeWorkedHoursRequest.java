package com.test.application.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeWorkedHoursRequest {
	
	@JsonProperty("employee_id")
	private Integer employee_id;
	
	@JsonProperty("worked_hours")
    private Integer worked_hours;
	
	@JsonProperty("worked_date")
    private LocalDate worked_date;
    
	public Integer getEmployeeId() {
		return employee_id;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employee_id = employeeId;
	}
	public Integer getWorkedHours() {
		return worked_hours;
	}
	public void setWorkedHours(Integer workedHours) {
		this.worked_hours = workedHours;
	}
	public LocalDate getWorkedDate() {
		return worked_date;
	}
	public void setWorkedDate(LocalDate workedDate) {
		this.worked_date = workedDate;
	}
    
}