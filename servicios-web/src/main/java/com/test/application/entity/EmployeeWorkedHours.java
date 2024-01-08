package com.test.application.entity;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EMPLOYEE_WORKED_HOURS")
public class EmployeeWorkedHours {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    @Column(name = "WORKED_HOURS")
    private Integer workedHours;

    @Column(name = "WORKED_DATE")
    private LocalDate workedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(Integer workedHours) {
		this.workedHours = workedHours;
	}

	public LocalDate getWorkedDate() {
		return workedDate;
	}

	public void setWorkedDate(LocalDate workedDate) {
		this.workedDate = workedDate;
	}
    
}
