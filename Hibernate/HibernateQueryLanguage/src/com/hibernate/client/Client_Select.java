package com.hibernate.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import com.hibernate.util.HibernateUtil;

public class Client_Select {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();	//mandatory	
			
			//print all the book titles & authors
			/*Query q=session.createQuery("select b.title,b.author from Book b");
			List<Object[]> lst=q.list();
			Iterator<Object[]> itr=lst.iterator();
			while(itr.hasNext()){
				Object[] obj= itr.next();
				System.out.println(obj[0]+"--"+obj[1]);
			}	
		*/	
						
			//print all book title & price in a particular range
			/*Scanner sc=new Scanner(System.in);
			System.out.println("Enter minimum price");
			double min=sc.nextDouble();
			System.out.println("Enter maximum price");
			double max=sc.nextDouble();	
			
			Query q=session.createQuery("select b.title,b.price from Book b where b.price between ? and ?");
			q.setParameter(0, min);
			q.setParameter(1, max);
			
			List<Object[]> lst=q.list();
			Iterator<Object[]> itr=lst.iterator();
			while(itr.hasNext()){
				Object[] obj=itr.next();
				System.out.println(obj[0]+"--"+obj[1]);
			}*/
			
			//print total no of books,cheapest price,expensive price
			Query q=session.createQuery("select count(*),min(b.price),max(b.price) from Book b");
			@SuppressWarnings("unchecked")
			List<Object[]> lst=q.list();
			Iterator<Object[]> itr=lst.iterator();
			while(itr.hasNext()){
				Object[] obj=itr.next();
				System.out.println("Total No of Books="+obj[0]);
				System.out.println("cheapest price="+obj[1]);
				System.out.println("expensive price="+obj[2]);
			}
			
			txn.commit(); //here session is closed automatically
			System.out.println("Done!!");
		} catch (HibernateException e) {
			e.printStackTrace();
		}		
	}
}