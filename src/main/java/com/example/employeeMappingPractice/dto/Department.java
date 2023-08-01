package com.example.employeeMappingPractice.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "department")
    List<Employee> employee;


}
