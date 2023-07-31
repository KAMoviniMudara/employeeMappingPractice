package com.example.employeeMappingPractice.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String address;

    //Unidirectional

    //OneToOne
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id" , referencedColumnName = "id")
    private Profile profile;

    //ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;

}
