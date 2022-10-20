package com.mphasis.Book.contoller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.Book.service.IBookStoreService;
import com.mphasis.Book.Domain.Book;

@RestController
@Scope("request")
@RequestMapping("/book")
public class BookStoreRestController {
	
	
	@Autowired
	@Qualifier("bookStoreService")
	private IBookStoreService bookStoreService;
	
	@GetMapping(value="/books", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getallBooks(){
		return bookStoreService.getallBooks();
	}
	
	
	@PostMapping(value = "/addNewBook", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Book addNewBook(@RequestBody Book book)
	{
	return	bookStoreService.save(book);
	}
	
	@PutMapping(value = "/updatebook", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public Book updateBookById(@RequestBody Book book)
	{
	return bookStoreService.update(book);
	}
	
	@DeleteMapping(value="/books/{book_id}")	
    public void delete(@PathVariable int id) {
    	 bookStoreService.delete(id);
    }
	
	@GetMapping(value="/getbyid/{id}", produces = { MediaType.APPLICATION_JSON_VALUE})
	public Book getBookByID(@PathVariable int id) {
		return bookStoreService.getBookByID(id);
	}
	
	@GetMapping(value = "/bookbytitle/{title}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBookByTitle(String title) {
		return bookStoreService.getAllBookByTitle(title);
		
	}
	
	
	@GetMapping(value = "/booksbypublisher/{publisher}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBookByPublisher(@PathVariable String publisher)
	{
		return bookStoreService.getAllBookByPublisher(publisher);
	}
	
	@GetMapping(value = "/bookbyyear/{year}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getALLBookByYear(@PathVariable int year)
	{
		return bookStoreService.getAllBookByYear(year);
	}
	
	
	
	
	
	


}
