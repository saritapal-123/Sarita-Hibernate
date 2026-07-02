package com.hbn.main;
import org.hibernate.Session;
import java.util.ArrayList;
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
		
		Address add2 =new Address();
		add2.setState("gzb");
		add2.setCity("up");
		
		Address add3 =new Address();
		add3.setState("gurgaon");
		add3.setCity("up");
		
		ArrayList<Address> ListOfAdd = new ArrayList();
		ListOfAdd.add(add1);
		ListOfAdd.add(add2);
		ListOfAdd.add(add3);
		
		Employee e1 =new Employee();
		e1.setName("ram");
		e1.setGender("male");
		e1.setSalary(55000);
		
		e1.setAddress(ListOfAdd);
		session.persist(add1);
		session.persist(add2);
		session.persist(add3);
		
		session.persist(e1);
		tx.commit();
	}
	public static void main(String[] args ) {
		Session session = Hibernateconfig.getSessionFactory().openSession();
		saveRecord(session);
		
	}
}


