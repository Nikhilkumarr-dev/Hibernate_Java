package com.Nkhil.HibApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Nkhil.entity.Person;

public class TestApp {

	public static void main(String[] args) throws IOException
	{
		SessionFactory  sessionFactory= new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Person person=new Person();
		person.setPid(10);
		person.setPname("Nikhil");
		person.setCost(36500.00);
		
		FileInputStream fs= new FileInputStream("C:\\images\\nikhil.JPG");
		byte[] imgArr=new byte[fs.available()];
		fs.read(imgArr);
		person.setPimg(imgArr);
		
		
		String info = "Welcome to PWSKILLS java with dsa 1.0 in English";
		char[] charArray= info.toCharArray();
		person.setStdInfo(charArray);
		
		
		session.save(person);
		
		System.out.println("RECORD INSERTED SUCESSFULLY");
		transaction.commit();
		
		
		session.close();
		fs.close();
		
		
		
		System.out.println("Aplication is closing.....");
		
		
	}

}
