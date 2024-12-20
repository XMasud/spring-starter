package com.project.departmenService.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
