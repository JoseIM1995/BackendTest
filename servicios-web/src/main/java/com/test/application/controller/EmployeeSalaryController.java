package com.test.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.application.request.EmployeeSalaryRequest;
import com.test.application.response.EmployeeSalaryResponse;
import com.test.application.service.EmployeeSalaryService;

@RestController
@RequestMapping("/employee-salary")
public class EmployeeSalaryController {
	@Autowired
    private EmployeeSalaryService employeeSalaryService;

    @GetMapping("/get-salary")
    public EmployeeSalaryResponse getEmployeeSalary(@RequestBody EmployeeSalaryRequest request) {
        return employeeSalaryService.getEmployeeSalary(request);
    }
}
