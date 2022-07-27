package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@Column(name="deptno")
	private int deptNo;
	@Column(name="dname")
	private String dName;
	@Column(name="location")
	private String location;
	
	public Department() {
		
	}

	public Department(int deptNo, String dName, String location) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.location = location;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", dName=" + dName + ", location=" + location + "]";
	}
	
}
