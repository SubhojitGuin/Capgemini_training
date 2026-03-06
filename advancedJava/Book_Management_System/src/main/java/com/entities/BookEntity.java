package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@NamedQueries(value = { 
	@NamedQuery(
			name = BookEntity.SELECT_ALL_BOOKS, 
			query = "SELECT book FROM BookEntity book"
		),
	@NamedQuery(
			name = BookEntity.UPDATE_PRICE_BY_ID_AND_AUTHOR, 
			query = "UPDATE BookEntity book SET book.price = :price WHERE book.id = :id AND book.author = :author"
		),
	@NamedQuery(
			name = BookEntity.DELETE_BOOK_BY_ID, 
			query = "DELETE FROM BookEntity book WHERE book.id = :id"
		),
	@NamedQuery(
			name = BookEntity.SELECT_BOOK_BY_TITLE, 
			query = "SELECT book FROM BookEntity book WHERE book.title = :title"
		)
})
@Table(name = "book_details")
public class BookEntity {
	
	public static final String SELECT_ALL_BOOKS = "BookEntity.selectAllBooks";
	public static final String UPDATE_PRICE_BY_ID_AND_AUTHOR = "BookEntity.updatePriceByIdAndAuthor";
	public static final String DELETE_BOOK_BY_ID = "BookEntity.deleteBookById";
	public static final String SELECT_BOOK_BY_TITLE = "BookEntity.selectBookByTitle";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;
	
	@Column(name = "book_title", nullable = false, unique = true)
	private String title;
	
	@Column(name = "book_author", nullable = false)
	private String author;
	
	@Column(name = "book_price", nullable = false, precision = 10, scale = 2)
	private double price;

	public BookEntity() {
		super();
	}

	public BookEntity(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
