package com.sree.dstation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.dstation.model.Employee;
import com.sree.dstation.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServices{

	@Autowired
	private EmployeeRepo empRepo;
	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(long empId) {
		return empRepo.findById(empId);
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public void deleteEmployeeById(long empId) {
		empRepo.deleteById(empId);;
	}

	@Override
	public void deleteAllEmployees() {
		empRepo.deleteAll();
	}

}
