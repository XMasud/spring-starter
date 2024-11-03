package com.project.employeeService.controller;

import com.project.employeeService.model.Employee;
import com.project.employeeService.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        return employeeRepository.add(employee);
    }

    @GetMapping("/{id}")
    public Employee getById(Long id){
        return employeeRepository.getById(id);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeRepository.getEmployees();
    }
}
