package com.project.employeeService.repository;

import com.project.employeeService.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public Employee add(Employee employee){
        employees.add(employee);
        return employee;
    }

    public Employee getById(Long id){
        return employees.stream()
                .filter(a -> a.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
