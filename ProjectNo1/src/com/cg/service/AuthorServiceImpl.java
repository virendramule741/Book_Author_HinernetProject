package com.cg.service;

import com.cg.dao.AuthorDao;
import com.cg.dao.AuthorDaoImpl;
import com.cg.entities.Author;

public class AuthorServiceImpl implements AuthorService
{
    private AuthorDao dao;
    public AuthorServiceImpl()
    {
    	dao=new AuthorDaoImpl();
    }
    
	@Override
	public Author getAuthorById(int id)
	{
		return dao.getAuthorById(id);
	}

	@Override
	public void addAuthor(Author Author) {
		dao.beginTransaction();
		dao.addAuthor(Author);
		dao.commitTransaction();
		System.out.println("Author added..");
	}

	@Override
	public void updateAuthor(Author Author) {
		dao.beginTransaction();
		dao.updateAuthor(Author);
		dao.commitTransaction();
		System.out.println("Author updated..");
		
	}

	@Override
	public void removeAuthor(Author Author) {
		dao.beginTransaction();
		dao.removeAuthor(Author);
		dao.commitTransaction();
		System.out.println("Author deleted..");
		
	}

}
