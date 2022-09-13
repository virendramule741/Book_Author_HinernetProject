package com.cg.service;

import com.cg.entities.Book;

public interface BookService {
	
	public abstract Book getBookById(int id);

	public abstract void addBook(Book Book);

	public abstract void updateBook(Book Book);

	public abstract void removeBook(Book Book);


}
