package com.test.application.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.application.entity.Employee;
import com.test.application.entity.EmployeeWorkedHours;
import com.test.application.request.EmployeeWorkedHoursRequest;
import com.test.application.response.EmployeeWorkedHoursResponse;
import com.test.application.repository.EmployeeRepository;
import com.test.application.repository.EmployeeWorkedHoursRepository;

@Service
public class EmployeeWorkedHoursService {
    @Autowired
    private EmployeeWorkedHoursRepository employeeWorkedHoursRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeWorkedHoursResponse addWorkedHours(EmployeeWorkedHoursRequest request) {
        EmployeeWorkedHoursResponse response = new EmployeeWorkedHoursResponse();

        Optional<Employee> employeeOptional = employeeRepository.findById(request.getEmployeeId());

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();

            if (request.getWorkedHours() <= 20) {
                LocalDate currentDate = LocalDate.now();

                if (!request.getWorkedDate().isAfter(currentDate)) {
                    if (!employeeWorkedHoursRepository.existsByEmployeeAndWorkedDate(employee, request.getWorkedDate())) {
                        EmployeeWorkedHours workedHours = new EmployeeWorkedHours();
                        workedHours.setEmployee(employee);
                        workedHours.setWorkedHours(request.getWorkedHours());
                        workedHours.setWorkedDate(request.getWorkedDate());

                        EmployeeWorkedHours savedWorkedHours = employeeWorkedHoursRepository.save(workedHours);

                        response.setId(savedWorkedHours.getId());
                        response.setSuccess(true);
                    } else {
                        response.setId(null);
                        response.setSuccess(false);
                    }
                } else {
                    response.setId(null);
                    response.setSuccess(false);
                }
            } else {
                response.setId(null);
                response.setSuccess(false);
            }
        } else {
            response.setId(null);
            response.setSuccess(false);
        }

        return response;
    }
}

