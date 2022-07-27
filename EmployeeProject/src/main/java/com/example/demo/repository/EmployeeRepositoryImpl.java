package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	EntityManager entityManager;
	
	
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Employee> query = currentSession.createQuery("select e from Employee e", Employee.class);
		
		List<Employee> empList = query.getResultList();
		return empList;
		
	}


	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
	
		return currentSession.get(Employee.class, id);
	}

	@Transactional
	public void saveOrUpdate(Employee emp) {
		Session currentSession  = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(emp);
	}





	@Transactional
	public void deleteById(int empId) {
		
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("delete from Employee where id = :employeeId");
		query.setParameter("employeeId",empId );
		query.executeUpdate();
	}


}
