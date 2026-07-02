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
	

	

	

	public static void saveRecord(Session session) {
		Transaction tx = session.beginTransaction();
		Address add1 =new Address();
		add1.setState("noida");
		add1.setCity("up");
		Employee e1 =new Employee();
		e1.setName("ram");
		e1.setGender("male");
		//e1.setSalary(550000);
		e1.setAddress(add1);
		add1.setEmployee(e1);
	//	session.persist(add1);
		session.persist(e1);
		tx.commit();
		
	}

	public static void main(String[] args ) {
		
		Session session = Hibernateconfig.getSessionFactory().openSession();
	//	Transaction tx = session.beginTransaction();
	//	saveRecord(session);
		
		Employee employee = session.find(Employee.class,1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
	//	Address address = session.find(Address.class, 1);
	//	System.out.println(address);
	//	System.out.println(address.getEmployee());
		
	}

}
