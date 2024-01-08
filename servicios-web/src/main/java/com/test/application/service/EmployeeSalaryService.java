package com.test.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.Optional;
import com.test.application.entity.Employee;
import com.test.application.repository.EmployeeRepository;
import com.test.application.request.EmployeeSalaryRequest;
import com.test.application.response.EmployeeSalaryResponse;

@Service
public class EmployeeSalaryService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeSalaryResponse getEmployeeSalary(EmployeeSalaryRequest request) {
        EmployeeSalaryResponse response = new EmployeeSalaryResponse();

        Optional<Employee> employeeOptional = employeeRepository.findById(request.getEmployeeId());

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();

            if (request.getStart_date().isBefore(request.getEnd_date())) {
                BigDecimal salary = employee.getJob().getJobSalary();

                response.setSalary(salary);
                response.setSuccess(true);
            } else {
                response.setSalary(null);
                response.setSuccess(false);
            }
        } else {
            response.setSalary(null);
            response.setSuccess(false);
        }

        return response;
    }
}
