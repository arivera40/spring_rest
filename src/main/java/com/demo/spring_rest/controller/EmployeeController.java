package com.demo.spring_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest.service.EmployeeClient;
import com.demo.spring_rest.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeClient employeeClient;
	
	@PostMapping("/")
	public void add() {
		employeeClient.addEmployee();
	}
	
	@GetMapping("/find-all")
	public List<Employee> getAllEmployee() {
		return employeeClient.findAllEmployees();
	}
	
	@GetMapping("/find-by-id/{id}")
	public Employee getEmployeeUsingId(@PathVariable long id) {
		return employeeClient.findAllEmployeeById(id);
	}
	
	@DeleteMapping("/delete")
	public void delete() {
		employeeClient.deleteAllData();
	}
}
