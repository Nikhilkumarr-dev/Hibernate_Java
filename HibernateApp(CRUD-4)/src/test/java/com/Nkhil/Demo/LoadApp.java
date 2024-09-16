package com.Nkhil.Demo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//this cod is basically code for the selection of data from the database.
public class LoadApp {

	public static void main(String[] args) throws IOException 
	{
		Configuration configuration = new Configuration();
		
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		
		Student student = new Student();
		
		student=session.load(Student.class,1010);
		
		System.out.println("student ROLLNO ::" + student.getRollNo());
		
		System.in.read();
		
		
		System.out.println("student NAME   ::" + student.getName());
		System.out.println("student marks ::" + student.getMarks());
		
		System.in.read();
		
		Student student1 = new Student();
		
		student1=session.load(Student.class,1010);
		
		System.out.println("student ROLLNO ::" + student1.getRollNo());
		
		System.in.read();
		
		
		System.out.println("student NAME   ::" + student1.getName());
		System.out.println("student marks ::" + student1.getMarks());
		
		
		session.close();
		
;
		

	}

}
