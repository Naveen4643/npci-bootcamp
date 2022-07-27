package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Employee findById(int id) {
		
		return repo.findById(id);
	}

	public void saveOrUpdate(Employee emp) {
		repo.saveOrUpdate(emp);
	}

//	public void update(Employee emp) {
//		repository.update(emp);
//		
//	}

	public void deleteById(int empId) {
		repo.deleteById(empId);
		
	}

}
