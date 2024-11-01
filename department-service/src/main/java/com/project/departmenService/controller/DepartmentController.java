package com.project.departmenService.controller;

import com.project.departmenService.model.Department;
import com.project.departmenService.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> getDepartment (){
        return departmentRepository.findAll();
    }
}
