package com.repositories;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonResource {
	
	private static EntityManagerFactory entityManagerFactory;
	private static Scanner scanner;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("Book_Management_System");
		}
		
		return entityManagerFactory;
	}
	
	public static Scanner getScanner() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		
		return scanner;
	}

}
