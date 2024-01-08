package com.test.application.response;

import java.math.BigDecimal;

public class EmployeeSalaryResponse {

	private BigDecimal salary;
    private boolean success;
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
    
}
