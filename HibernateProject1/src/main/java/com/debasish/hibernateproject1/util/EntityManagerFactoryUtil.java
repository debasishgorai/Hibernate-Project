package com.debasish.hibernateproject1.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class EntityManagerFactoryUtil {
	private static EntityManagerFactory factory;  
	public EntityManagerFactoryUtil() { 
	
	}   
	public static EntityManagerFactory  getfactory()  {    
		if(factory == null) {
			factory=Persistence.createEntityManagerFactory("sandy");    
		}   
		return factory;
   }	

}
