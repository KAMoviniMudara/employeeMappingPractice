package com.example.employeeMappingPractice.repo;

import com.example.employeeMappingPractice.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
