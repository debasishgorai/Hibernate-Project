package com.debasish.hibernateproject1.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.debasish.hibernateproject1.entity.OrderData;

public class OrderdataRepository {
	private EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("abhi").createEntityManager();
	}
	public String saveOrder(OrderData order ) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(order);
		transaction.commit();
		return "Data saved";
	}
	public String updateOrder(OrderData order ) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(order);
		transaction.commit();
		return "Data updated";
	}
	public OrderData getOrderById(int id) {
		EntityManager manager= getEntityManager();
		return manager.find(OrderData.class, id);
	}
	public String deleteOrder(int id ) {
		EntityManager manager=getEntityManager();
		OrderData order= manager.find(OrderData.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if(order!=null) {
			transaction.begin();
			manager.remove(order);
			transaction.commit();
			return "Data deleted";
		}
		else 
			return "no data found to be delete";
	}
	public List getAllData() {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery(" from OrderData od ");
		List list = query.getResultList();
		return list;
	}

}
