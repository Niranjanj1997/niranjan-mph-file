package com.mphasis.Book.service;

import java.util.List;
import java.util.Map;

import com.mphasis.Book.Domain.*;

public interface IBookStoreService {
	Book save(Book book);
	Book update (Book book);
	void delete (int id);
	List<Book> getAllBookDetails();
Book getBookById(int id);


List<Book> getAllBookByPublisher(String publisher);
List<Book> getAllBookByYear(int year);
List<Book> getAllBookByTittle(String tittle);

}
