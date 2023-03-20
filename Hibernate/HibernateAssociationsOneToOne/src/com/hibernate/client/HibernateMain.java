package com.hibernate.client;

import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Employee;
import com.hibernate.model.EmployeeDetail;
import com.hibernate.util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {

			SessionFactory factory = HibernateUtil.obtainSessionFactory();

			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();
		
			//create both objects & set each other's refernce
			EmployeeDetail eDetail = new EmployeeDetail(101, "10th Street","LA", "San Francisco", "U.S.");

			
			Employee emp = new Employee(101, "Nina", "Mayers",Date.valueOf("2010-03-04"), "114-857-965");
			
			//imp
			emp.setEmployeeDetail(eDetail);
			eDetail.setEmployee(emp);

			session.save(emp);
			System.out.println("Done...");
			
		/*	
			EmployeeDetail ed=(EmployeeDetail)session.get(EmployeeDetail.class, 101L);
			System.out.println(ed.getCity());
			System.out.println(ed.getEmployee().getFirstname());
			System.out.println(ed.getEmployee().getLastname());
			*/
				
			/*long empid=101;
			Employee e=(Employee)session.get(Employee.class, empid);
			if(e!=null){
			System.out.println(e.getFirstname());
			System.out.println(e.getLastname());
			System.out.println(e.getEmployeeDetail().getCity());
			System.out.println(e.getEmployeeDetail().getCountry());
			}
			else
			{
				System.out.println("Record Not Found!!");
			}*/
		
			txn.commit();
		}
}