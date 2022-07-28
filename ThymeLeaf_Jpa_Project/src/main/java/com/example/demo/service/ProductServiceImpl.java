package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;

import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository prorepo;
	
	public List<Product> findAll() {
		
		return prorepo.findAll();
	}

	@Transactional
	public void save(Product p) {
		// TODO Auto-generated method stub
		prorepo.save(p);
	}

	@Override
	public Product findById(int id) {
		Optional<Product> result = prorepo.findById(id);
		
		Product pro=null;
		if(result.isPresent())
			pro=result.get();
		return pro;
		
	}

	@Override
	public void deleteById(int id) {
		prorepo.deleteById(id);
		
	}

	
	public List<Product> findByName(String name) {
		List<Product> result = null;
		
		if(name!= null && (name.trim().length()>0)) {
			result = prorepo.findByName(name);
		}
		else {
			result = findAll();
		}
		
		return result;
	}

	@Override
	public List<Product> findByCategoryId(Integer categoryId) {
		List<Product> result = null;
		
		if(categoryId!= 0 && (categoryId>0)) {
			result = prorepo.findByCategoryId(categoryId);
		}
		else {
			result = findAll();
		}
		
		return result;
	}
}
