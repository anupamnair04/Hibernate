package com.hibernate.client;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtil;

public class Client1 {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction txn=null;
		try {
			factory = HibernateUtil.obtainSessionFactory();
			session = factory.getCurrentSession();
			txn = session.beginTransaction(); // mandatory

			// save a new record
			Employee emp1 = new Employee();
			emp1.setEmpId(101);
			emp1.setEmpName("Rekha");
			emp1.setEmpSal(86000);
			emp1.setJoiningDate(Date.valueOf("2010-08-03")); // format yyyy-MM-dd
			session.save(emp1);

			Employee emp2 = new Employee();
			emp2.setEmpId(102);
			emp2.setEmpName("Mohan");
			emp2.setEmpSal(99000);
			emp2.setJoiningDate(Date.valueOf("2014-05-04")); // format
																// yyyy-MM-dd
			session.save(emp2);

			Employee emp3 = new Employee();
			emp3.setEmpId(103);
			emp3.setEmpName("Shivani");
			emp3.setEmpSal(299000);
			emp3.setJoiningDate(Date.valueOf("2015-02-04")); // format
																// yyyy-MM-dd
			session.save(emp3);
			System.out.println("data saved successfully");
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally{
			txn.commit();// mandatory			
		}
	}
}