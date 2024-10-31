package com.project.departmenService.repository;

import com.project.departmenService.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department department){
        departments.add(department);
        return department;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
