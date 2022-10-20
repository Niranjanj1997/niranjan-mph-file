package com.mphasis.Book.service;
import com.mphasis.Book.Domain.*;
import java.util.List;

public interface IBookStoreService {
	
	Book save(Book book);
	Book update(Book book);
	
	List<Book> getallBooks();
	void delete(int id);
	Book getBookByID(int id);
	List<Book> getAllBookByTitle(String title);
	List<Book> getAllBookByPublisher(String Publisher);
	List<Book> getAllBookByYear(int year);

	
	
	

}
