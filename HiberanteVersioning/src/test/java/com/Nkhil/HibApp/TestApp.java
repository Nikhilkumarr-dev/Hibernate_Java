package com.Nkhil.HibApp;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.Nkhil.entity.Students;

public class TestApp {

	public static void main(String[] args) throws IOException
	{
		SessionFactory  sessionFactory= new Configuration().configure().addAnnotatedClass(Students.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//insert Operation
		Students students = new Students();
		
		students.setSid(1);
		students.setSname("Sachin");
		students.setDt1(new Date());
		students.setDt2(new Date());
		students.setDt3(new Date());
		
		
		session.save(students);
		
		
		transaction.commit();
		
		
		session.close();
		
		
		
		System.out.println("Aplication is closing.....");
		
		
	}

}
