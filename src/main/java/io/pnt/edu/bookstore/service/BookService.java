package io.pnt.edu.bookstore.service;

import java.util.List;

import io.pnt.edu.bookstore.dto.Book;

public interface BookService {
	
	public List<Book> findAll();
	public List<Book> findByName(String name);
	public int addBooks(Book... books);
	
}
