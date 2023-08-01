package com.example.employeeMappingPractice.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shift;

    @OneToOne(mappedBy = "profile")
    Employee employee;
}
