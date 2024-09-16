package com.Nkhil.HibApp;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.Nkhil.entity.Students;

public class Retrieval {

	public static void main(String[] args) 
	{
		SessionFactory  sessionFactory= new Configuration().configure().addAnnotatedClass(Students.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		int id =1;
		Students students = new Students();
		students = session.get(Students.class,id);
		
		if(students != null)
		{
			System.out.println(students);
		}
		else
		{
			System.out.println("Record not available for given id:: ...");
		}
		
		
		session.close();
		
		
		
		System.out.println("Aplication is closing....." + id);
		
		
	}

}
