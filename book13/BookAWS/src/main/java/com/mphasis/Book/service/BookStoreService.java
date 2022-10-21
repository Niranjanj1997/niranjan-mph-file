package com.mphasis.Book.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mphasis.Book.Domain.Book;
import com.mphasis.Book.repository.*;
@Service("bookStoreService")
@Scope("singleton")
public class BookStoreService implements IBookStoreService {
	
@Autowired
@Qualifier("bookStoreRepository")
private BookStoreRepository bookStoreRepository;
	@Override
	public Book save(Book book) {
		return bookStoreRepository.save(book);
	}

	@Override
	public Book update(Book book) {
		return bookStoreRepository.save(book);
		
	}

	@Override
	public void delete(int id) {
		bookStoreRepository.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBookDetails() {
		
		return bookStoreRepository.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookStoreRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBookByPublisher(String publisher) {
		
		return bookStoreRepository.findAllBookByPublisher(publisher);
	}

	@Override
	public List<Book> getAllBookByYear(int year) {
		
		return bookStoreRepository.findAllBookByYear(year);
	}

	@Override
	public List<Book> getAllBookByTittle(String tittle) {
		return bookStoreRepository.findBookBytittle(tittle);
	}

}

