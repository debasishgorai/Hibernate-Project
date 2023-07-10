package com.debasish.hibernateproject1.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.debasish.hibernateproject1.entity.Customer;
import com.debasish.hibernateproject1.util.EntityManagerFactoryUtil;

public class CustomerRepository {
	private EntityManager manager=EntityManagerFactoryUtil.getfactory().createEntityManager(); 
	public void saveCustomer(Customer customer) {  
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();  
		manager.persist(customer);
		transaction.commit();
	}  
	public Customer getCustomer(int id) {
		return manager.find(Customer.class,id);   
	}

}
