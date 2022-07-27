package com.example.demo.repository;

import java.util.List;


import com.example.demo.entity.Product;

public interface ProductsRepository {
	public List<Product> findAll();
	
	public Product findById(int id);

	
	public void saveOrUpdate(Product pro);

	public void deleteById(int proId);
}
