package objectClass;

import java.util.Objects;

public class Book {
	
	String name;
	String author;
	int isbn;
	
	public Book(String name, String author, int isbn) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "name: " + name + " author: " + author + " isbn: " + isbn;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		
		Book b = (Book) o;
		return this.name == b.name && this.author == b.author && this.isbn == b.isbn;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, author, isbn);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter", "JK Rowling", 1234);
		Book b2 = new Book("Hard Times", "Charles Dickens", 1235);
		Book b3 = b1;
		Book b4 = null;
		
		System.out.println(b1.toString());
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b4));
		System.out.println(b1.equals(b3));
		
		System.out.println(b1.hashCode());
	}
}
