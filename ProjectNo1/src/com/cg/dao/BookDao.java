package com.cg.dao;

import com.cg.entities.Book;

public interface BookDao {

	public abstract Book getBookById(int id);

	public abstract void addBook(Book Book);

	public abstract void updateBook(Book Book);

	public abstract void removeBook(Book Book);
	
	public abstract void beginTransaction();
    public abstract void commitTransaction();

	
}
