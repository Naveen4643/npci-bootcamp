package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="empno")
	private int empNo;
	@Column(name="ename")
	private String eName;
	@Column(name="job")
	private String job;
	@Column(name="hiredate")
	private Date hireDate;
	@Column(name="managerid")
	private int managerId;
	@Column(name="salary")
	private int salary;
	@Column(name="commission")
	private int commission;
	@Column(name="deptno")
	private int deptNo;
	
	public Employee() {
		
	}

	public Employee(int empNo, String eName, String job, Date hireDate, int managerId, int salary, int commission,
			int deptNo) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.hireDate = hireDate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", hireDate=" + hireDate
				+ ", managerId=" + managerId + ", salary=" + salary + ", commission=" + commission + ", deptNo="
				+ deptNo + "]";
	}
	
}
