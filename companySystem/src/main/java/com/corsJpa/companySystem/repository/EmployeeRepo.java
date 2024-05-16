package com.corsJpa.companySystem.repository;

import com.corsJpa.companySystem.Enities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
