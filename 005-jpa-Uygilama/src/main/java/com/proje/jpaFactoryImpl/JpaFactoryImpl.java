package com.proje.jpaFactoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.jpaFactory.JpaFactory;



public class JpaFactoryImpl implements JpaFactory {

	private EntityManager entitymanager = null;
	
	
	@Override
	public EntityManager getEntityManager() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		this.entitymanager = factory.createEntityManager();
		return entitymanager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction transaction = this.entitymanager.getTransaction(); 
		return transaction;
	}

}
