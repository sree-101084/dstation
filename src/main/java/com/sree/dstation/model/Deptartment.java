package com.sree.dstation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Deptartment {

	@Id
	private long deptId;
	private String deptName;
	private String deptHead;
	
}
