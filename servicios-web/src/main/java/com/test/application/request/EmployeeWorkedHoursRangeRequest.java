package com.test.application.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeWorkedHoursRangeRequest {
	
	@JsonProperty("employee_id")
	private Integer employeeId;
	
	@JsonProperty("start_date")
    private LocalDate startDate;
	
	@JsonProperty("end_date")
    private LocalDate endDate;
    
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
    
}