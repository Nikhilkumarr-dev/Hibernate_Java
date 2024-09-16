package com.Nkhil.HibApp;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Nkhil.entity.CallerTune;

public class Retrieval {

	public static void main(String[] args) 
	{
		SessionFactory  sessionFactory= new Configuration().configure().addAnnotatedClass(CallerTune.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		CallerTune tune = new CallerTune();
		tune=session.get(CallerTune.class,1);
		if(tune==null)
		{
			System.out.println("OBJECT RECORD NOT FOUND FOR UPDATION....");
		}
		else
		{
			Transaction transaction = session.beginTransaction();
			tune.setProvider("Airtel");
			transaction.commit();
			
			System.out.println("Object got updated for ::" + tune.getVersionCount() + "times..");
			session.close();
		}
		
		session.close();
		System.out.println("Application is stopping");
		
		
		
		
	}

}
