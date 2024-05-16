package com.corsJpa.companySystem.repository;

import com.corsJpa.companySystem.Enities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
