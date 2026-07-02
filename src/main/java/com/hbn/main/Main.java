package com.hbn.main;

import org.hibernate.Session;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.entity.Address;
import com.hbn.entity.Employee;
import com.hibernate.config.Hibernateconfig;

public class Main {

	public static void main(String[] args) {
		Address add1 =new Address();
		add1.setState("GZB");
		add1.setCity("up");
		
	
		Employee e1 =new Employee();
		e1.setName("ashis");
		e1.setGender("male");
		e1.setSalary(550000);
		e1.setAddress(add1);
		
		
		Session session = Hibernateconfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(add1);
		session.persist(e1);
		
		
	


		tx.commit();
	}

}
