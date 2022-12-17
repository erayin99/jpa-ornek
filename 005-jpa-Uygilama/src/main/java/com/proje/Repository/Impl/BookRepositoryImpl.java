package com.proje.Repository.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.proje.Repository.BookRepository;
import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactoryImpl.JpaFactoryImpl;
import com.proje.model.Book;

public class BookRepositoryImpl implements BookRepository {

	EntityManager entitymanager = jpafactory.getEntityManager();
	EntityTransaction transaction = jpafactory.getEntityTransaction();
	
	@Override
	public void save(Book nook) {
	transaction.begin();
	entitymanager.persist(nook);
	transaction.commit();	

	}

	@Override
	public void delete(Book book) {
		transaction.begin();
		this.entitymanager.remove(book);
		transaction.commit();	

	}

	@Override
	public Book find(int id) {
		
		Book book = this.entitymanager.find(Book.class, id);
		if(book != null) {
			return book;
		}
			
		
		return null;
	}

	@Override
	public Book update(Book book) {
		transaction.begin();
		Book updateBook = this.entitymanager.merge(book);
		transaction.commit();
		return updateBook;
	}

}
