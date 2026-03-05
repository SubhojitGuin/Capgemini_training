package com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayUserDetailsByUsingEmail {
	
	public static void main(String[] args) {
//		String select = "SELECT user FROM UserInformation user WHERE user.email=?1";
		String select = "SELECT user FROM UserInformation user WHERE user.email=:email";
		Scanner scanner = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(select);
		System.out.print("Enter the email: ");
//		query.setParameter(1, scanner.next());
		query.setParameter("email", scanner.next());
		
		try {
			UserInformation result = (UserInformation) query.getSingleResult();
			System.out.println("Id: " + result.getId());
			System.out.println("Name: " + result.getName());
			System.out.println("Email: " + result.getEmail());
			System.out.println("MobileNumber: " + result.getMobileNumber());
			System.out.println("Gender: " + result.getGender());
		} catch (NoResultException e) {
			System.out.println("No data found!");
		} catch (NonUniqueResultException e) {
			System.out.println("Multiple data found!");
		}
		
		em.close();
		emf.close();
	}

}
