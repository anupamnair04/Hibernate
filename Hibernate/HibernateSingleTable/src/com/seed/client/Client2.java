package com.seed.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.model.Employee;
import com.seed.model.PermanentEmployee;
import com.seed.model.TemporaryEmployee;
import com.seed.util.HibernateUtil;
public class Client2 {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.obtainSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
	//To load
				int eid=123;
				Employee e=(Employee) session.get(Employee.class, eid);
				if(e!=null){
					System.out.println("Employee Id="+e.getId());
					System.out.println("Employee Name="+e.getName());
					System.out.println("Employee Salary="+e.getSalary());			
					if(e instanceof PermanentEmployee){
						PermanentEmployee pe= (PermanentEmployee) e;
						System.out.println("Designation="+pe.getDesignation());
						System.out.println("Department="+pe.getDepartment());
					}
					if(e instanceof TemporaryEmployee){
						TemporaryEmployee te=(TemporaryEmployee) e;
						System.out.println("Working Days="+te.getWorkingdays());
						System.out.println("Contractor Name="+te.getContractorname());
					} } else{
					System.out.println("Employee record not found!!"); }
				txn.commit();  } }