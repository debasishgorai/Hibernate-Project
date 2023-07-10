package com.debasish.hibernateproject1.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.debasish.hibernateproject1.entity.Course;
import com.debasish.hibernateproject1.repository.*;
import com.debasish.hibernateproject1.util.EntityManagerFactoryUtil;

public class CourseRepository {
	private EntityManager manager= EntityManagerFactoryUtil.getfactory().createEntityManager();
	public void saveCourse(Course course) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(course);
		transaction.commit();
	}
	public void saveAllCourse(List<Course> courses) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		for(Course c:courses) 
			manager.persist(c);
		transaction.commit();
		
		
	}

}
