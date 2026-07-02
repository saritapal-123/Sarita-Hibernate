package com.hbn.main;

import org.hibernate.Session;

import org.hibernate.Transaction;
import com.hbn.entity.Employee;
import com.hibernate.config.Hibernateconfig;

public class Main {

	public static void main(String[] args) {
		Employee e =new Employee("vikas","male",330000);

		Session session = Hibernateconfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
	}

}
