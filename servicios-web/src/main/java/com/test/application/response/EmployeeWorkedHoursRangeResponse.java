package com.test.application.response;

public class EmployeeWorkedHoursRangeResponse {

	private Integer totalWorkedHours;
    private boolean success;
    
	public Integer getTotalWorkedHours() {
		return totalWorkedHours;
	}
	public void setTotalWorkedHours(Integer totalWorkedHours) {
		this.totalWorkedHours = totalWorkedHours;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
    
}
