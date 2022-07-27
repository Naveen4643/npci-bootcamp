package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;


public interface EmployeeService {
	
	public List<Employee> findAll();

	public Employee findById(int id);

	public void saveOrUpdate(Employee emp);

	public void deleteById(int id);
	
}
