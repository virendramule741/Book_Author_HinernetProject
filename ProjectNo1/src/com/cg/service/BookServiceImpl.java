package com.cg.service;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.entities.Book;

public class BookServiceImpl implements BookService
{
    private BookDao dao;
    public BookServiceImpl()
    {
    	dao=new BookDaoImpl();
    }
    
	@Override
	public Book getBookById(int id)
	{
		return dao.getBookById(id);
	}

	@Override
	public void addBook(Book Book) {
		dao.beginTransaction();
		dao.addBook(Book);
		dao.commitTransaction();
		System.out.println("Book added..");
	}

	@Override
	public void updateBook(Book Book) {
		dao.beginTransaction();
		dao.updateBook(Book);
		dao.commitTransaction();
		System.out.println("Book updated..");
		
	}

	@Override
	public void removeBook(Book Book) {
		dao.beginTransaction();
		dao.removeBook(Book);
		dao.commitTransaction();
		System.out.println("Book deleted..");
		
	}

}
