package com.test.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.entity.Gender;

public interface GenderRepository extends JpaRepository<Gender, Integer>{

}
