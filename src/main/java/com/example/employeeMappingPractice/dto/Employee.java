package com.example.employeeMappingPractice.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String address;

    //Unidirectional
/*
    //OneToOne
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id" , referencedColumnName = "id")
    private Profile profile;

    //ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;

    //OneToMany
    @OneToMany(cascade = CascadeType.ALL,orphanRemovel = true)
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private List<Task> task;

    //ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> project;

*/

    //Bidirectional

    //OneToOne
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "profile_id",referencedColumnName = "id")
    private Profile profile;

    //ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;

    //OneToMany
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "employee" )
    private List<Task> task;

    //ManyToMany
    @ManyToMany(cascade = CascadeType.ALL )
    private List<Project> project;



}
