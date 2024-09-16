package com.Nkhil.Demo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//this cod is basically code for the deletion  of data from the database.
public class AppTest_Delete {

	public static void main(String[] args) throws IOException 
	{
		Configuration configuration = new Configuration();
	    configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Student student= new Student();
		
		int rolno=1010;
		student=session.get(Student.class,rolno);
		if(student!=null)
		{
			
			Transaction transaction  = session.beginTransaction();
			session.delete(student);
			transaction.commit();
		}
		else
		{
			System.out.println("student data not available with given rolno ::" + rolno);
		}
		
		System.out.println(student);
		
		
		session.close();
		
;
		

	}

}
