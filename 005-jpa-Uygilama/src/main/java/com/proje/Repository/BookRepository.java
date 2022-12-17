package com.proje.Repository;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactoryImpl.JpaFactoryImpl;
import com.proje.model.Book;

public interface BookRepository {
	
	JpaFactory jpafactory = new JpaFactoryImpl();
	
	void save(Book nook);
	void delete(Book book);
	Book find(int id);
	Book update(Book book);
	

}
