package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Book;

public class BookDaoImpl implements BookDao {
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookById(int id) {
		
		return entityManager.find(Book.class, id) ;
	}

	@Override
	public void addBook(Book Book) {
		
		entityManager.persist(Book);
	

	}

	@Override
	public void updateBook(Book Book) {
		
		entityManager.merge(Book);

	}

	@Override
	public void removeBook(Book Book) {
		entityManager.remove(Book);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
