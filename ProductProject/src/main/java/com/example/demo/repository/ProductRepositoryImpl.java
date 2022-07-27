package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductsRepository {
	@Autowired
	EntityManager entityManager;
	
	
	public List<Product> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Product> query = currentSession.createQuery("select p from Product p", Product.class);
		
		List<Product> proList = query.getResultList();
		return proList;
		
	}


	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
	
		return currentSession.get(Product.class, id);
	}

	@Transactional
	public void saveOrUpdate(Product pro) {
		Session currentSession  = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(pro);
	}





	@Transactional
	public void deleteById(int proId) {
		
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :proId");
		query.setParameter("employeeId",proId );
		query.executeUpdate();
	}


}
