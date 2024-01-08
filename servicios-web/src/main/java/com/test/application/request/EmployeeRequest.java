package com.test.application.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest {

	@JsonProperty("gender_id")
	private Integer genderId;
	
	@JsonProperty("job_id")
    private Integer jobId;
	
    private String name;
    
    @JsonProperty("last_name")
    private String lastName;
    
    private Date birthdate;
    
    
	public Integer getGenderId() {
		return genderId;
	}
	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
    
}
