package com.hbn.main;

import org.hibernate.Session;

import org.hibernate.Transaction;
import com.hbn.entity.Employee;
import com.hibernate.config.Hibernateconfig;

public class Main {

	public static void main(String[] args) {
	//	Employee e1 =new Employee("vikas","male",330000);
		Employee e1 =new Employee();
		
		Session session = Hibernateconfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	
		session.load(e1, 5);
	//	Employee employee = session.find(Employee.class,155);
		//System.out.println(employee);
		System.out.println(e1);
	


		tx.commit();
	}

}
