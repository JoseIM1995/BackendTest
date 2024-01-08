package com.test.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.test.application.entity.Employee;
import com.test.application.entity.Job;
import com.test.application.repository.EmployeeRepository;
import com.test.application.repository.JobRepository;
import com.test.application.request.EmployeesByJobRequest;
import com.test.application.response.EmployeesByJobResponse;

@Service
public class EmployeesByJobService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private JobRepository jobRepository;

    public EmployeesByJobResponse getEmployeesByJob(EmployeesByJobRequest request) {
        EmployeesByJobResponse response = new EmployeesByJobResponse();

        Optional<Job> jobOptional = jobRepository.findById(request.getJobId());

        if (jobOptional.isPresent()) {
            Job job = jobOptional.get();

            List<Employee> employees = employeeRepository.findByJobId(job.getJobId());

            response.setEmployees(employees);
            response.setSuccess(true);
        } else {
            response.setEmployees(null);
            response.setSuccess(false);
        }

        return response;
    }
}


