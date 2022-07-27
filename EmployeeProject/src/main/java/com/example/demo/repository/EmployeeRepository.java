package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;


public interface EmployeeRepository {

	public List<Employee> findAll();
	
	public Employee findById(int id);

	//public Object saveOrUpdate(Employee emp);

	public void saveOrUpdate(Employee emp);

	public void deleteById(int empId);
}
