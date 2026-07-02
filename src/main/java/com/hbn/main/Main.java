package com.hbn.main;

import org.hibernate.Session;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.entity.Employee;
import com.hibernate.config.Hibernateconfig;

public class Main {

	public static void main(String[] args) {
	
		Employee e1 =new Employee();
		
		Session session = Hibernateconfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createNamedQuery("findByid",Employee.class);
		query.setParameter("id",2);
		List list = query.getResultList();
		System.out.println(list);
		System.out.println("-------------------------------------------");
		Query query2 = session.createNamedQuery("findByGender",Employee.class);
		query2.setParameter("gender","female");
		List list2 = query2.getResultList();
		System.out.println(list2);
	
		
		
	


		tx.commit();
	}

}
