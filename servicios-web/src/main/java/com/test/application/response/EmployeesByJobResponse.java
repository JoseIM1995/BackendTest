package com.test.application.response;

import java.util.List;

import com.test.application.entity.Employee;

public class EmployeesByJobResponse {
	
	private List<Employee> employees;
    private boolean success;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
