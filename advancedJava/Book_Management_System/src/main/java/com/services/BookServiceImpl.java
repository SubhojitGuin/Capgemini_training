package com.services;

import com.entities.BookEntity;
import com.repositories.BookRepository;

public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	private BookServiceImpl() {
		bookRepository = BookRepository.getInstance();
	}
	
	private static class Holder {
		private static final BookServiceImpl INSTANCE = new BookServiceImpl();
	}
	
	public static BookServiceImpl getInstance() {
		return Holder.INSTANCE;
	}

	@Override
	public void addBook(BookEntity book) {
		boolean inserted = bookRepository.insertNewBook(book);
		if (inserted)
			System.out.println("Book added successfully");
		else
			System.out.println("Book already exists!!");
	}

	@Override
	public void viewAllBooks() {
		System.out.println("The list of books are");
		bookRepository.getAllBooks().forEach(System.out::println);
	}

	@Override
	public void updateBookPriceUsingIdAndAuthor(int bookId, String bookAuthor, double bookPrice) {
		int rowsUpdated = bookRepository.updateBookPriceUsingIdAndAuthor(bookId, bookAuthor, bookPrice);
		
		if (rowsUpdated > 0) {
			System.out.println("Book price updated successfully");
		} else {
			System.out.println("No books updated");
		}
	}

	@Override
	public void deleteBookById(int bookId) {
		int rowsUpdated = bookRepository.deleteBookById(bookId);
		
		if (rowsUpdated > 0) {
			System.out.println("Book deleted successfully");
		} else {
			System.out.println("No books deleted");
		}
	}

	@Override
	public void displayBookUsingTitle(String bookTitle) {
		BookEntity book = bookRepository.getBookByTitle(bookTitle);
		if (book != null)
			System.out.println(book);
		else 
			System.out.println("No such book found.");
	}

}
