package com.test.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.application.request.EmployeeWorkedHoursRequest;
import com.test.application.response.EmployeeWorkedHoursResponse;
import com.test.application.service.EmployeeWorkedHoursService;

@RestController
@RequestMapping("/employee-worked-hours")
public class EmployeeWorkedHoursController {
	@Autowired
    private EmployeeWorkedHoursService employeeWorkedHoursService;

    @PostMapping("/add")
    public EmployeeWorkedHoursResponse addWorkedHours(@RequestBody EmployeeWorkedHoursRequest request) {
        return employeeWorkedHoursService.addWorkedHours(request);
    }
}
