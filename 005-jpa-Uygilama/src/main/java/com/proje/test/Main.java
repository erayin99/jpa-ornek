package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import com.proje.Repository.BookRepository;
import com.proje.Repository.Impl.BookRepositoryImpl;
import com.proje.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book = new Book(100, "Harry Potter", 350, "Aksiyon", "Erdal Ayin",createCustomDate(25, 12, 2001));
		Book book2 = new Book(105, "Lord of rings", 300, "Aksiyon", "Erdal Ayin", createCustomDate(22, 02, 2000));
		
		BookRepository bookre = new BookRepositoryImpl();
		bookre.save(book);
		bookre.save(book2);
		
	}
	public static Date createCustomDate(int day, int mounth, int year) {

		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, mounth);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}

}
