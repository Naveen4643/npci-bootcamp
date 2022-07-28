package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	
	public void save(Product p);
	
	public Product findById(int id);
	
	public void deleteById(int id);
	
	public List<Product> findByName(String name);


	public List<Product> findByCategoryId(Integer categoryId);

}
