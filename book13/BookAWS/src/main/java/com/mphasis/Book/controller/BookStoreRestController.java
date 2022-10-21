package com.mphasis.Book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.Book.Domain.Book;
import com.mphasis.Book.service.BookStoreService;
import com.mphasis.Book.service.IBookStoreService;
@RestController
@Scope("request")
@RequestMapping("/book")
public class BookStoreRestController {
	@Autowired
	@Qualifier("bookStoreService")
	private IBookStoreService bookStoreService;
	
	@GetMapping(value="/books", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBookDetails(){
		return bookStoreService.getAllBookDetails();
	}
	@PostMapping(value="/books", produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Book insertbook(@RequestBody Book book) {
		return bookStoreService.save(book);
	}
	@PutMapping(value="/books",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Book updateAnyBook(@RequestBody Book book) {
		return bookStoreService.update(book);
	}
	@DeleteMapping(value="/books/{Id}")
	public void deleteBookById(@PathVariable int Id) {
		bookStoreService.delete(Id);
	}
	@GetMapping(value="/getbyid/{Id}",produces = {MediaType.APPLICATION_JSON_VALUE})
public Book getBookById(@PathVariable int Id) {
	return bookStoreService.getBookById(Id);
	
}
	@GetMapping(value="/Bookbytittle/{book_tittle}",produces = {MediaType.APPLICATION_JSON_VALUE})
public List<Book> getBookByTittle( String tittle) {
	return bookStoreService.getAllBookByTittle(tittle);
}
	@GetMapping(value="/Booksbypublisher/{publisher}",produces = {MediaType.APPLICATION_JSON_VALUE})
public List<Book> getBookByPublisher(@PathVariable String publisher) {
	return bookStoreService.getAllBookByPublisher(publisher);
	
}
	@GetMapping(value="/Bookbyyear/{year}",produces = {MediaType.APPLICATION_JSON_VALUE})
public List<Book> getBookByYear(@PathVariable int year) {
	return bookStoreService.getAllBookByYear(year);
	
}
}