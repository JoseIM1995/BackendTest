package com.test.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.application.entity.Employee;
import com.test.application.entity.EmployeeWorkedHours;
import com.test.application.repository.EmployeeRepository;
import com.test.application.repository.EmployeeWorkedHoursRepository;
import com.test.application.request.EmployeeWorkedHoursRangeRequest;
import com.test.application.response.EmployeeWorkedHoursRangeResponse;

import java.util.List;

@Service
public class EmployeeWorkedHoursRangeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeWorkedHoursRepository employeeWorkedHoursRepository;

    public EmployeeWorkedHoursRangeResponse getTotalWorkedHours(EmployeeWorkedHoursRangeRequest request) {
        EmployeeWorkedHoursRangeResponse response = new EmployeeWorkedHoursRangeResponse();

        Optional<Employee> employeeOptional = employeeRepository.findById(request.getEmployeeId());

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();

            if (!request.getStartDate().isAfter(request.getEndDate())) {
                List<EmployeeWorkedHours> workedHoursList = employeeWorkedHoursRepository.findByEmployeeAndWorkedDateBetween(
                        employee, request.getStartDate(), request.getEndDate());

                int totalHours = calcularTotalHorasTrabajadas(workedHoursList);

                response.setTotalWorkedHours(totalHours);
                response.setSuccess(true);
            } else {
                response.setTotalWorkedHours(null);
                response.setSuccess(false);
            }
        } else {
            response.setTotalWorkedHours(null);
            response.setSuccess(false);
        }

        return response;
    }

    private int calcularTotalHorasTrabajadas(List<EmployeeWorkedHours> workedHoursList) {
        int totalHours = 0;
        for (EmployeeWorkedHours workedHours : workedHoursList) {
            totalHours += workedHours.getWorkedHours();
        }
        return totalHours;
    }
}
