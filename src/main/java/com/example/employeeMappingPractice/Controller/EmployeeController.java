package com.example.employeeMappingPractice.Controller;

import com.example.employeeMappingPractice.Service.EmployeeService;
import com.example.employeeMappingPractice.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/org")
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.insertEmployee(emp);
    }

    @GetMapping("/employee")
    public List<Employee> getAlldata()
    {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getByid(@PathVariable Long id){
        return employeeService.getByIdEmployee(id);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee emp){
        return employeeService.insertEmployee(emp);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
        return "deleted";
    }
}
