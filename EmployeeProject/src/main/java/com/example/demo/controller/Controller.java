package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/empDetails")
public class Controller {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/emplist")
	public List<Employee> findAll(){
		return empService.findAll();
		
	}
	
	@GetMapping("/deptlist")
	public List<Department> getAll(){
		return deptService.getAll();
		
	}
	
	@GetMapping("emplist/{empid}")
	public Employee findById(@PathVariable int empid) throws Exception {
		
		Employee e = empService.findById(empid);
				
				if(e==null) {
					throw new Exception("EmpId :"+empid+"details is not available");
				}
		return e;
	}
	
	@PostMapping("/saveEmp")
	public String saveEmployee(@RequestBody Employee emp) {
		emp.setEmpNo(0);
		empService.saveOrUpdate(emp);
		
		return "Employee details added Successfully";
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee emp) throws Exception {
	
		
		empService.saveOrUpdate(emp);
		
		return "Employee ID : "+ emp.getEmpNo() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("emp/{id}")
	public String deleteById(@PathVariable int id) {
		empService.deleteById(id);
		return "Employee ID : " + id +"details  deleted !!!";
	}

	
}
