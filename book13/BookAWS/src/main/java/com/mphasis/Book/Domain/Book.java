package com.mphasis.Book.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
private Integer id;
	@Column(name="book_publisher")
private String publisher;
	@Column(name="book_tittle")
private String tittle;
	@Column(name="book_year")
private int year;
public Book(Integer id, String publisher, String tittle, int year) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.tittle = tittle;
		this.year = year;
	}
@Override
	public String toString() {
		return "Book [id=" + id + ", publisher=" + publisher + ", tittle=" + tittle + ", year=" + year + "]";
	}
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
public Book() {}
}