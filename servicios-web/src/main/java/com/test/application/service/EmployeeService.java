package com.test.application.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.application.entity.Employee;
import com.test.application.entity.Gender;
import com.test.application.entity.Job;
import com.test.application.repository.EmployeeRepository;
import com.test.application.repository.GenderRepository;
import com.test.application.repository.JobRepository;
import com.test.application.request.EmployeeRequest;
import com.test.application.response.EmployeeResponse;

@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private JobRepository jobRepository;

    public EmployeeResponse addEmployee(EmployeeRequest request) {
        EmployeeResponse response = new EmployeeResponse();

        Optional<Gender> genderOptional = genderRepository.findById(request.getGenderId());
        Optional<Job> jobOptional = jobRepository.findById(request.getJobId());

        if (genderOptional.isPresent() && jobOptional.isPresent()) {
            if (!employeeRepository.existsByNameAndLastName(request.getName(), request.getLastName())) {
                Date currentDate = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.YEAR, -18);
                Date eighteenYearsAgo = calendar.getTime();

                if (request.getBirthdate().before(eighteenYearsAgo)) {
                    Employee employee = new Employee();
                    employee.setGender(genderOptional.get());
                    employee.setJob(jobOptional.get());
                    employee.setName(request.getName());
                    employee.setLastName(request.getLastName());
                    employee.setBirthdate(request.getBirthdate());

                    Employee savedEmployee = employeeRepository.save(employee);

                    response.setId(savedEmployee.getId());
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

        return response;
    }
}