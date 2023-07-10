package com.debasish.hibernateproject1.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.debasish.hibernateproject1.entity.College;
import com.debasish.hibernateproject1.util.EntityManagerFactoryUtil;

public class CollegeRepository {
	private EntityManager manager=EntityManagerFactoryUtil.getfactory().createEntityManager();
	public void saveCollege(College college ) {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(college);
		transaction.commit();
	}
	public College getCollegeById(int id) {
		return manager.find(College.class, id);
	}

}
