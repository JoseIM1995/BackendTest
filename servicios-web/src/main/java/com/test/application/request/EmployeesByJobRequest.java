package com.test.application.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeesByJobRequest {
	
	@JsonProperty("job_id")
	private Integer jobId;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
}
