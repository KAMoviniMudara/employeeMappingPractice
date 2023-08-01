package com.example.employeeMappingPractice.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String clientName;

    @ManyToMany(mappedBy = "project")
   List<Employee> employee;
}
