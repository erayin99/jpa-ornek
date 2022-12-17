package com.proje.test;

import com.proje.Repository.BookRepository;
import com.proje.Repository.Impl.BookRepositoryImpl;
import com.proje.model.Book;

public class MainUpdate {

	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositoryImpl();
		Book book = bookRepository.find(100);
		book.setTopic("bilim kurgu");
		bookRepository.update(book);
		
	}
}
