package com.sree.dstation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sree.dstation.model.Employee;
import com.sree.dstation.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empService;
	
	//Get All employee details from the below API
	@GetMapping("/employees")
	public List<Employee> getAllEmployeeData(){
		
		return empService.getAllEmployees();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployeeDataById(@PathVariable String empId) throws Exception{
		
		Optional<Employee> employeeDetails =  empService.getEmployeeById(Long.parseLong(empId));
		if(!employeeDetails.isPresent()) 
			 throw new Exception("Could not find employee with id- " + empId);
		return employeeDetails.get();
	}
}
