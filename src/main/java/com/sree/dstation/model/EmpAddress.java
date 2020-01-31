package com.sree.dstation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmpAddress {
	

	@Id
	private long addressId;
	private int doorNo;
	private String street;
	private String pin;
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY) private int empAddressId;
	 */
}
