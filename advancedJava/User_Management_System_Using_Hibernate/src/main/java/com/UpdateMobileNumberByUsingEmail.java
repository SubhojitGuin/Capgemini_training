package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateMobileNumberByUsingEmail {
	
	public static void main(String[] args) {
		String update = "UPDATE UserInformation user SET user.mobileNumber=?1 WHERE user.email=?2";
		
		Scanner scanner = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(update);
		
		System.out.print("Enter the Mobile Number: ");
		query.setParameter(1, scanner.nextLong());
	
		
		System.out.print("Enter the Email: ");
		query.setParameter(2, scanner.next());
		
		int result = query.executeUpdate();
		if (result != 0) {
			System.out.println("Data updated");
		} else {
			System.out.println("No Data Updated");
		}
		
		et.commit();

		em.close();
		emf.close();
	}

}
