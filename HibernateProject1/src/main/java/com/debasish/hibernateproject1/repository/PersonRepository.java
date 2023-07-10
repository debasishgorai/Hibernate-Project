package com.debasish.hibernateproject1.repository;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.debasish.hibernateproject1.entity.Person;

public class PersonRepository {
	private EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("abhi").createEntityManager();
	}
	public String savePerson(Person person ) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abhi");
//		EntityManager manager=factory.createEntityManager();
		EntityManager manager=getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
//		return "connected";
		return "Data saved";
	}
	public String updatePerson(Person person ) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(person);
		transaction.commit();
		return "Data updated";
	}
	public Person getPersonById(int id) {
		EntityManager manager= getEntityManager();
		return manager.find(Person.class, id);
	}
//	public String deletePerson(Person person ) {
//		EntityManager manager=getEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.remove(person);
//		transaction.commit();
//		return "Data deleted";
//	}
	public String deletePerson(int id ) {
		EntityManager manager=getEntityManager();
		Person person= manager.find(Person.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if(person!=null) {
			transaction.begin();
			manager.remove(person);
			transaction.commit();
			return "Data deleted";
		}
		else 
			return "no data found to be delete";
	}
	public List getAllData() {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery(" from Person p");
		List list = query.getResultList();
		return list;
	}
	public List getPhoneNumberByName(String name) {
		EntityManager manager = getEntityManager();
		String sql="select p.phoneNumb from Person p where p.name=?1";
		Query query = manager.createQuery(sql);
		query.setParameter(1, name);
		List list = query.getResultList();
		return list;
	}
	public List personDataByPersonNameAndAge(String name,int age) {
		EntityManager manager = getEntityManager();
		String sql=" from Person p where p.name=?1 and p.age=?2";
		Query query = manager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, age);
		List list = query.getResultList();
		return list;
	}}
//}
