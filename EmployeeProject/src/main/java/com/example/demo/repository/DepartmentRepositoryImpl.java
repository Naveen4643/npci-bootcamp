package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;


@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository{

	@Autowired
	private EntityManager entityManager;
	
	public List<Department> getAll() {
		
		Session session = entityManager.unwrap(Session.class);
		
		Query<Department> query = session.createQuery("select d from Department d",Department.class);
		 
		List<Department> depList = query.getResultList();
		return depList;
	}

}
