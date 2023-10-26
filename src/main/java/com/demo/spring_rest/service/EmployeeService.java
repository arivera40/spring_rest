package com.demo.spring_rest.service;

import java.util.List;

import com.demo.spring_rest.model.Employee;

public interface EmployeeService {
	List<Employee> findAllEmployees();
	Employee findAllEmployeeById(long employeeId);
	void addEmployee();
	void deleteAllData();
}