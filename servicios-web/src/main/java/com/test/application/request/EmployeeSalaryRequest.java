package com.test.application.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeSalaryRequest {

	@JsonProperty("employee_id")
	private Integer employee_id;
	private LocalDate start_date;
    private LocalDate end_date;

	public Integer getEmployeeId() {
		return employee_id;
	}

	public void setEmployeeId(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	
}
