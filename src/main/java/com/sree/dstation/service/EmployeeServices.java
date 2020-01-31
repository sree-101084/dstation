package com.sree.dstation.service;

import java.util.List;
import java.util.Optional;

import com.sree.dstation.model.Employee;

public interface EmployeeServices {
	
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(long empId);
	public Employee addNewEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployeeById(long empId);
	public void deleteAllEmployees();

}
