package com.mphasis.Book;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mphasis.Book.Domain.Book;
import com.mphasis.Book.repository.*;
@SpringBootApplication
@ComponentScan()
public class BookApplication implements CommandLineRunner{
	
	
	@Autowired
	@Qualifier("bookStoreRepository")
	private BookStoreRepository bookStoreRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		bookStoreRepository.save(new Book(0,"java","Niranjan",2022));
		bookStoreRepository.save(new Book(0,"python","priyanka",2021));
		bookStoreRepository.save(new Book(0,"sql","sushma",2020));
		bookStoreRepository.save(new Book(0,"javascript","neelu",2019));
		
		System.out.println(bookStoreRepository.findAll());
		
		
		
		
	}

}
