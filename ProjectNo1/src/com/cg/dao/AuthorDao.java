package com.cg.dao;

import com.cg.entities.Author;

public interface AuthorDao {

	public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author Author);

	public abstract void updateAuthor(Author Author);

	public abstract void removeAuthor(Author Author);
	
	public abstract void beginTransaction();
    public abstract void commitTransaction();

	
}
