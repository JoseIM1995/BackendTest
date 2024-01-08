package com.test.application.entity;

import javax.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "GENDERS")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "gender")
    @JsonIgnore
    private List<Employee> employees;

    @JsonProperty("id")
    public Integer getGenderId() {
        return id;
    }

    public void setGenderId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getGenderName() {
        return name;
    }

    public void setGenderName(String name) {
        this.name = name;
    }

}
