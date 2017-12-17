package io.pnt.edu.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.pnt.edu.bookstore.dto.Book;
import io.pnt.edu.bookstore.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/rest/all")
	@ResponseBody
	public List<Book> findAll(){
		return bookService.findAll();
	}
}
