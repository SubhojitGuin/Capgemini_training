package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmailIdByUsingUserId {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		System.out.print("Enter the User Id: ");
		UserInformation userInformation = em.find(UserInformation.class, scanner.nextInt()); // first retrieve the data from the DB
		
		if (userInformation != null) {
			System.out.print("Enter the new Email Id: ");
			userInformation.setEmail(scanner.next());
			/*
			 * It is used to update the object in the database based on the PK
			 * If the PK which we inserted in the Object already exists in the DB table, it will perform UPDATE operation
			 * If the PK which we inserted in the Object does not exist in the DB table, it will perform INSERT operation
			 */
			em.merge(userInformation); // perform update operation on the object
			
			System.out.println("Email updated successfully....");
		} else {
			System.out.println("No data found");
		}
		
		et.commit();
		
		em.close();
		emf.close();
	}

}
