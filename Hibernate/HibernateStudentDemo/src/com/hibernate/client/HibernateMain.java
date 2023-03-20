package com.hibernate.client;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.PrimaryStudent;
import com.hibernate.model.SecondaryStudent;
import com.hibernate.util.HibernateUtil;

public class HibernateMain {
	public static void main(String[] args) {
		
		PrimaryStudent ps1 = new PrimaryStudent();
		ps1.setRollno(1);
		ps1.setName("Anup");
		ps1.setAddmissionDate(Date.valueOf("2010-08-03"));
		ps1.setGrade("100");
		
		SecondaryStudent temp1 = new SecondaryStudent();
		temp1.setRollno(2);
		temp1.setName("Shreyash");
		temp1.setAddmissionDate(Date.valueOf("2010-03-08"));
		temp1.setPercentage(60.0f);
		
		SessionFactory factory = HibernateUtil.obtainSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		
		session.save(ps1);   
		session.save(temp1);
		txn.commit();    
		}
}