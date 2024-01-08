package com.test.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.application.request.EmployeesByJobRequest;
import com.test.application.response.EmployeesByJobResponse;
import com.test.application.service.EmployeesByJobService;

@RestController
@RequestMapping("/employees-by-job")
public class EmployeesByJobController {
	@Autowired
    private EmployeesByJobService employeesByJobService;

    @GetMapping("/get")
    public EmployeesByJobResponse getEmployeesByJob(@RequestBody EmployeesByJobRequest request) {
        return employeesByJobService.getEmployeesByJob(request);
    }
}
