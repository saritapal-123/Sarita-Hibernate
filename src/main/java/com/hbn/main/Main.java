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
		// to get all the records from DB
	//	Query query = session.createQuery("from Employee",Employee.class);
	//	List list = query.getResultList();
	//	System.out.println(list);
		
	//	to get records with pagination from DB
	//	Query query = session.createQuery("from Employee",Employee.class);
	//	query.setFirstResult(2);
	//	query.setMaxResults(5);
	//	List list = query.getResultList();
	//	System.out.println(list);
		
		// to update the records DB
	//	MutationQuery query = session.createMutationQuery("update Employee set name = :n where id = :i");
	//	query.setParameter("n", "param");
	//	query.setParameter("i", 3);
	//	query.executeUpdate();
		
		// to delete all the records from DB
	//	MutationQuery query = session.createMutationQuery("delete from Employee  where id = :i");
	//		query.setParameter("i", 7);
	//		query.executeUpdate();
			
			//aggrigation function
			Query query1 = session.createQuery("select max(name)from Employee");
			List list = query1.getResultList();
			System.out.println(list);
		
		
		
	


		tx.commit();
	}

}
