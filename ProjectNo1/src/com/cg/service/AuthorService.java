package com.cg.service;

import com.cg.entities.Author;

public interface AuthorService {
	
	public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author Author);

	public abstract void updateAuthor(Author Author);

	public abstract void removeAuthor(Author Author);


}
