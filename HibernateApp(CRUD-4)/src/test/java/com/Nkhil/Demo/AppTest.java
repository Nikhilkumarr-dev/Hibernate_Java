package com.Nkhil.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//this code is the insert query code into the database
class AppTest 
{
	
	public static void main(String[] args) 
	{
		HibConfig obj = new HibConfig();
		
		Student stud = new Student();
		stud.setRollNo(1011);
		stud.setName("Ronaldo");
		stud.setMarks(86);
		
		
		Session s =obj.getSession();
		Transaction tx = s.beginTransaction();
		
		s.save(stud);
		
		tx.commit();
		
		System.out.println(stud);
		
		s.close();
		
	
		
		
		
		
    
}
}
