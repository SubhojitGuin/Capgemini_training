package com.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.entities.BookEntity;

public class BookRepository {
	
	private static final String SELECT_ALL_BOOKS = "SELECT book FROM BookEntity book";
	private static final String UPDATE_BOOK_PRICE_BY_ID_AND_AUTHOR = "UPDATE BookEntity book SET book.price = :price WHERE book.id = :id AND book.author = :author";
	private static final String DELETE_BOOK_BY_ID = "DELETE FROM BookEntity book WHERE book.id = :id";
	private static final String SELECT_BOOK_BY_TITLE = "SELECT book FROM BookEntity book WHERE book.title = :title";
	
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
		Query query = entityManager.createQuery(SELECT_ALL_BOOKS);
		List<BookEntity> books = query.getResultList();
		entityManager.close();
		return books;
	}
	
	public int updateBookPriceUsingIdAndAuthor(int bookId, String bookAuthor, double bookPrice) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Query query = entityManager.createQuery(UPDATE_BOOK_PRICE_BY_ID_AND_AUTHOR);
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
		
		Query query = entityManager.createQuery(DELETE_BOOK_BY_ID);
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
		Query query = entityManager.createQuery(SELECT_BOOK_BY_TITLE);
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
