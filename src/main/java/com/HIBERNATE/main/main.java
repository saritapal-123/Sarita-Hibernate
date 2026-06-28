
package com.HIBERNATE.main;

import org.hibernate.Session;


import org.hibernate.Transaction;

import com.HIBERNATE.config.HibernateConfig;
import com.HIBERNATE.entity.Employee;

public class main {

	

	

	

	public static void main(String[] args) {
		Employee  e = new Employee("aarav","male",3300000);
		
		
		Session session =  HibernateConfig.getSessionFactory().openSession();
		
		
		
		
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
	

		

	}

}
