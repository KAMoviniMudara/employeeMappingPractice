package com.example.employeeMappingPractice.Service;

import com.example.employeeMappingPractice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employeeMappingPractice.dto.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee insertEmployee(Employee emp){
        return employeeRepo.save(emp);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }
    public Optional<Employee> getByIdEmployee(Long id){
        return employeeRepo.findById(id);
    }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }
}
