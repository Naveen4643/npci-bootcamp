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


import com.example.demo.entity.Product;

import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class Controller {
	@Autowired
	private ProductService proService;
	
	
	@GetMapping("/prolist")
	public List<Product> findAll(){
		return proService.findAll();
		
	}
	
	
	
	@GetMapping("prolist/{proid}")
	public Product findById(@PathVariable int proid) throws Exception {
		
		Product e = proService.findById(proid);
				
				if(e==null) {
					throw new Exception("ProductId :"+proid+"details is not available");
				}
		return e;
	}
	
	@PostMapping("/savePro")
	public String saveEmployee(@RequestBody Product emp) {
		emp.setId(0);
		proService.saveOrUpdate(emp);
		
		return "Product details added Successfully";
	}
	
	@PutMapping("/updateProduct")
	public String updateEmployee(@RequestBody Product emp) throws Exception {
	
		
		proService.saveOrUpdate(emp);
		
		return "Product ID : "+ emp.getId() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("pro/{id}")
	public String deleteById(@PathVariable int id) {
		proService.deleteById(id);
		return "Product ID : " + id +"details  deleted !!!";
	}


}
