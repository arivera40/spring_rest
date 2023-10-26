package com.demo.spring_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_rest.model.Employee;

@Repository	// Not necessary but good practice to annotate as repository.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
