package com.test.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
