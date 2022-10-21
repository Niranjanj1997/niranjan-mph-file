package com.mphasis.Book.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mphasis.Book.Domain.Book;

@Repository("bookStoreRepository")
@Scope("singleton")

public interface BookStoreRepository extends JpaRepository<Book, Integer>{

List<Book> findBookBytittle(String tittle);



List<Book> findAllBookByPublisher(String publisher);

List<Book> findAllBookByYear(int year);

	


}
