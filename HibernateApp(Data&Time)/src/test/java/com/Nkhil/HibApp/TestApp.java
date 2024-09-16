package com.Nkhil.HibApp;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Nkhil.entity.CallerTune;


public class TestApp {

	public static void main(String[] args) throws IOException
	{
		SessionFactory  sessionFactory= new Configuration().configure().addAnnotatedClass(CallerTune.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		CallerTune  tune = new CallerTune();
		tune.setCallerTune("JAILER");
		tune.setCallerTuneId(1);
		tune.setMobileNumber(8686868686L);
		tune.setProvider("JIO");
		
		session.save(tune);
		
		System.out.println("Record inserted succesfully......");
		
		transaction.commit();
		session.close();
		
		
		
		
	}

}
