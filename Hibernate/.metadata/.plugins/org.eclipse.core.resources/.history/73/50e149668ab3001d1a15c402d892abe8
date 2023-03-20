package com.hibernate.client;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.hibernate.model.*;

public class Client3 {

	
	public static void main(String[] args) {
		Transaction txn=null;
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			txn=session.beginTransaction();
			
			System.out.println("Enter the Employee Id to be deleted=");
			Scanner sc=new Scanner(System.in);
			int eid=sc.nextInt();
			
			Employee emp=(Employee) session.get(Employee.class, eid);
			if(emp!=null){
				session.delete(emp);
				System.out.println("Record Deleted!!");
			}
			else{
				System.out.println("Record Not Found!!");
			}		
			sc.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			txn.commit();
		}
	}
}