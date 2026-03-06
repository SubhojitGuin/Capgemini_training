package com.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.entities.BookEntity;

public class BookRepository {
	
	private EntityManagerFactory entityManagerFactory;
	
	private BookRepository() {
		super();
		this.entityManagerFactory = SingletonResource.getEntityManagerFactory();
	}
	
	private static class Holder {
		private static final BookRepository INSTANCE = new BookRepository();
	}
	
	public static BookRepository getInstance() {
		return Holder.INSTANCE;
	}

	public boolean insertNewBook(BookEntity book) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			entityManager.persist(book);
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive())
				transaction.rollback();
			return false;
		}
		entityManager.close();
		
		return true;
	}
	
	public List<BookEntity> getAllBooks() {	
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<BookEntity> query = entityManager.createNamedQuery(BookEntity.SELECT_ALL_BOOKS, BookEntity.class);
		List<BookEntity> books = query.getResultList();
		entityManager.close();
		return books;
	}
	
	public int updateBookPriceUsingIdAndAuthor(int bookId, String bookAuthor, double bookPrice) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Query query = entityManager.createNamedQuery(BookEntity.UPDATE_PRICE_BY_ID_AND_AUTHOR);
		query.setParameter("id", bookId);
		query.setParameter("author", bookAuthor);
		query.setParameter("price", bookPrice);
		
		int rowsUpdated;
		
		try {
			transaction.begin();
			rowsUpdated = query.executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive())
				transaction.rollback();
			rowsUpdated = 0;
		}
		entityManager.close();
		
		return rowsUpdated;
	}
	
	public int deleteBookById(int bookId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Query query = entityManager.createNamedQuery(BookEntity.DELETE_BOOK_BY_ID);
		query.setParameter("id", bookId);
		
		int rowsUpdated;
		
		try {
			transaction.begin();
			rowsUpdated = query.executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive())
				transaction.rollback();
			rowsUpdated = 0;
		}
		entityManager.close();
		
		return rowsUpdated;
	}
	
	public BookEntity getBookByTitle(String bookTitle) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<BookEntity> query = entityManager.createNamedQuery(BookEntity.SELECT_BOOK_BY_TITLE, BookEntity.class);
		query.setParameter("title", bookTitle);
		
		BookEntity book;
		
		try {
			book = (BookEntity) query.getSingleResult();
		} catch (NoResultException e) {
			book = null;
		}
		entityManager.close();
		
		return book;
	}

}
