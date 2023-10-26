package com.demo.spring_rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_rest.model.Employee;
import com.demo.spring_rest.repository.EmployeeRepository;

@Service // Required in order to be scanned as a bean and auto-injected in EmployeeController.
public class EmployeeClient implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee findAllEmployeeById(long employeeId) {
		Optional<Employee> opt = employeeRepository.findById(employeeId);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void addEmployee() {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Andy", "Rivera"));
		emp.add(new Employee("Danny", "Rivera"));
		emp.add(new Employee("Josselyn", "Perez"));
		emp.add(new Employee("Jon", "Ortiz"));
		
		for (Employee e : emp) {
			System.out.println(e);
			employeeRepository.save(e);
		}
	}

	@Override
	public void deleteAllData() {
		employeeRepository.deleteAll();
	}
}
