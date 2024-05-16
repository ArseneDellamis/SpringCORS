package com.corsJpa.companySystem.controller;

import com.corsJpa.companySystem.Enities.Department;
import com.corsJpa.companySystem.Enities.Employee;
import com.corsJpa.companySystem.repository.DepartmentRepo;
import com.corsJpa.companySystem.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://127.0.0.1:5501")
//@RequestMapping("/api")
public class ResourceController {

    private EmployeeRepo employeeRepo;
    private DepartmentRepo departmentRepo;
    @Autowired
    public ResourceController(EmployeeRepo employeeRepo
    ,DepartmentRepo departmentRepo) {
        this.employeeRepo = employeeRepo;
        this.departmentRepo= departmentRepo;
    }

    @GetMapping("/employees")
    public List<Employee> getAll(){
        List<Employee> employeeList= employeeRepo.findAll();
        return employeeList;
    }
    @GetMapping("/departments")
    public List<Department> getDepartment(){
        List<Department> departmentList= departmentRepo.findAll();
        return departmentList;
    }

}
