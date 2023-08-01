package com.example.employeeMappingPractice.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String priority;

    @ManyToOne()
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    Employee employee;
}
