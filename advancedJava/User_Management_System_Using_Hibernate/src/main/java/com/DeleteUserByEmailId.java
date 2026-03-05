package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteUserByEmailId {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String DELETE_QUERY = "DELETE FROM UserInformation user WHERE user.email=?1";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(DELETE_QUERY);
		
		System.out.print("Enter the User Email: ");
		query.setParameter(1, scanner.next());
		
		int rowsUpdated = query.executeUpdate();
		
		if (rowsUpdated != 0) {
			System.out.println("Data deleted");
		} else {
			System.out.println("Nothing changed");
		}
		
		et.commit();
		em.close();
		emf.close();
	}

}
