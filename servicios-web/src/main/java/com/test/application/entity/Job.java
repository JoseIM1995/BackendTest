package com.test.application.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "JOBS")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SALARY")
    private BigDecimal salary;

    @OneToMany(mappedBy = "job")
    @JsonIgnore
    private List<Employee> employees;

    @JsonProperty("id")
    public Integer getJobId() {
        return id;
    }

    public void setJobId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name") 
    public String getJobName() {
        return name;
    }

    public void setJobName(String name) {
        this.name = name;
    }

    @JsonProperty("salary") 
    public BigDecimal getJobSalary() {
        return salary;
    }

    public void setJobSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
