package com.sree.dstation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	private String empFirstName;
	private String empLastName;
	@Email
	private String empEmail;
	private String empDesignation;
	private double empSalary;
	
	/*
	 * @OneToMany(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "emp_address_id") private EmpAddress empAddress;
	 * 
	 * @OneToMany(fetch = FetchType.LAZY) private Deptartment empDept;
	 */
}
