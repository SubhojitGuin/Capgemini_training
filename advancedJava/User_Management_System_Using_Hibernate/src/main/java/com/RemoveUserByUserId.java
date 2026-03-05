package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveUserByUserId {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		System.out.print("Enter the User Id: ");
		UserInformation userInformation = em.find(UserInformation.class, scanner.nextInt());
		
		if (userInformation != null) {
			em.remove(userInformation);
			System.out.println("User removed successfully: " + userInformation);
		} else {
			System.out.println("No data found");
		}
		
		et.commit();
		
		em.close();
		emf.close();
	}

}
