package com.test.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.application.request.EmployeeWorkedHoursRangeRequest;
import com.test.application.response.EmployeeWorkedHoursRangeResponse;
import com.test.application.service.EmployeeWorkedHoursRangeService;

@RestController
@RequestMapping("/employee-worked")
public class EmployeeWorkedHoursRangeController {
    @Autowired
    private EmployeeWorkedHoursRangeService employeeWorkedHoursRangeService;

    @PostMapping("/calculate-hours")
    public EmployeeWorkedHoursRangeResponse getTotalWorkedHours(@RequestBody EmployeeWorkedHoursRangeRequest request) {
        return employeeWorkedHoursRangeService.getTotalWorkedHours(request);
    }
}
