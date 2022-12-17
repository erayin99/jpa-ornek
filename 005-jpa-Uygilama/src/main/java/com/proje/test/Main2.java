package com.proje.test;

import com.proje.Repository.BookRepository;
import com.proje.Repository.Impl.BookRepositoryImpl;
import com.proje.model.Book;

public class Main2 {
	
	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositoryImpl();
		Book book = bookRepository.find(100);
		
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("urun bulunamadi");
		}
	}

}
