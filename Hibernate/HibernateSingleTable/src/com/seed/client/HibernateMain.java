package com.seed.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.seed.model.*;
import com.seed.util.HibernateUtil;
public class HibernateMain {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.obtainSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction(); // mandatory
		 PermanentEmployee pemp1 = new PermanentEmployee();
			pemp1.setId(123);
			pemp1.setName("Anup");
			pemp1.setSalary(50000);
			pemp1.setDepartment("Hr");
			pemp1.setDesignation("Sr. Hr Executive");
		 TemporaryEmployee temp1 = new TemporaryEmployee();
			temp1.setId(305);
			temp1.setName("Shreyash");
			temp1.setSalary(70000);
			temp1.setContractorname("Sarang");
			temp1.setWorkingdays(20);
		session.save(pemp1);
		session.save(temp1);
		txn.commit();
		System.out.println("Record saved!!");
	}}