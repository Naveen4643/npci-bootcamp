package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductsRepository;


@Service	
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductsRepository repo;
	
	public List<Product> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Product findById(int id) {
		
		return repo.findById(id);
	}

	public void saveOrUpdate(Product emp) {
		repo.saveOrUpdate(emp);
	}


	public void deleteById(int proId) {
		repo.deleteById(proId);
	}
}
