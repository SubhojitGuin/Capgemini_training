package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUserDetails {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* 1) Loads the persistence.xml */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties"); 
		
		/* 2) establish the connection
		 * 3) create the platform
		 */
		EntityManager em = emf.createEntityManager(); 
		
		System.out.println("My Persistence.xml file info: " + em.getProperties());
		EntityTransaction et = em.getTransaction(); // get the transaction
		
		/* 4) begin the transaction */
		et.begin(); 
		
		UserInformation userInformation = new UserInformation();
		
		System.out.print("Enter User Name: ");
		userInformation.setName(scanner.nextLine());
		
		System.out.print("Enter User Email: ");
		userInformation.setEmail(scanner.nextLine());
		
		System.out.print("Enter User Mobile Number: ");
		userInformation.setMobileNumber(Long.parseLong(scanner.nextLine()));
		
		System.out.print("Enter User Gender: ");
		userInformation.setGender(scanner.nextLine());
		
		System.out.println(userInformation);
		
		/* 5) Perform the operations
		 * Insert
		 * Update
		 * Delete
		 * Select
		 */
		System.out.println("Before Persist: " + em.contains(userInformation));
		em.persist(userInformation); // insert user data in the DB
		System.out.println("After Persist: " + em.contains(userInformation));
		System.out.println("Data Inserted");
		
		/* If it is Insert, Update or Delete
		 * 6) Commit the transaction
		 */
		et.commit();
		
		/* 7) Close the connection */
		em.close();
		
		/* Close the persistence.xml */
		emf.close();
	}

}
