package com.services;

import com.entities.BookEntity;

public interface BookService {
	
	void addBook(BookEntity book);
	
	void viewAllBooks();
	
	void updateBookPriceUsingIdAndAuthor(int bookId, String bookAuthor, double bookPrice);
	
	void deleteBookById(int bookId);
	
	void displayBookUsingTitle(String bookTitle);

}
