package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayAllUserDetails {
	
	public static void main(String[] args) {
		String select = "FROM UserInformation user";
//		String select = "SELECT user FROM UserInformation user";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(select);
		
		List<UserInformation> resultList = query.getResultList();
		
		for (UserInformation o: resultList) {
			System.out.println(o);
		}
		
		em.close();
		emf.close();
	}

}
