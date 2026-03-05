package com;

import java.util.Scanner;

import com.entities.BookEntity;
import com.repositories.SingletonResource;
import com.services.BookService;
import com.services.BookServiceImpl;

public class App {
    public static void main( String[] args ) {
        System.out.println("Welcome to Book Management System");
        
        Scanner scanner = SingletonResource.getScanner();
        
        BookService bookService = BookServiceImpl.getInstance();
        
        while (true) {
        	System.out.println("Select any option from the menu:");
        	System.out.println("1. Add a new book");
        	System.out.println("2. View all books");
        	System.out.println("3. Update Book price using Book Id and Book Author");
        	System.out.println("4. Delete book by using Book Id");
        	System.out.println("5. Display book details by using Book Title");
        	System.out.println("6. Exit the program");
        	
        	System.out.print("Enter your choice: ");
        	int choice = Integer.parseInt(scanner.nextLine());
        	System.out.println();
        	
        	try {
	        	switch (choice) {
				case 1: {
						BookEntity book = new BookEntity();
						
						System.out.print("Enter Book Title: ");
						book.setTitle(scanner.nextLine());
						
						System.out.print("Enter Author Name: ");
						book.setAuthor(scanner.nextLine());
						
						System.out.print("Enter Book Price: ");
						book.setPrice(Double.parseDouble(scanner.nextLine()));
						
						bookService.addBook(book);
					}
					break;
				case 2: {
						bookService.viewAllBooks();
					}
					break;
				case 3: {
						System.out.print("Enter the Book ID: ");
						int bookId = Integer.parseInt(scanner.nextLine());
						
						System.out.print("Enter the Author Name: ");
						String bookAuthor = scanner.nextLine();
						
						System.out.print("Enter the new Price: ");
						double bookPrice = Double.parseDouble(scanner.nextLine());
						
						bookService.updateBookPriceUsingIdAndAuthor(bookId, bookAuthor, bookPrice);
					}
					break;
				case 4: {
						System.out.print("Enter the Book ID: ");
						int bookId = Integer.parseInt(scanner.nextLine());
						
						bookService.deleteBookById(bookId);
					}
					break;
				case 5: {
						System.out.print("Enter the Book Title: ");
						String bookTitle = scanner.nextLine();
						
						bookService.displayBookUsingTitle(bookTitle);
					}
					break;
				case 6: {
						System.out.println("\nThank you for using Book Management System!!");
						return;
					}
				default: {
						System.out.println("Wrong Choice!");
					}
					break;
				}
        	} catch (Exception e) {
        		System.out.println("Unexpected Exception!!");
        		System.out.println(e.getMessage());
        	}
        	
        	System.out.println();
        }
    }
}
