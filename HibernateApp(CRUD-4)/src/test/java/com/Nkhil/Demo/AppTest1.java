package com.Nkhil.Demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

//this code is update database in to the student table
public class AppTest1 {

	public static void main(String[] args) {
		HibConfig obj = new HibConfig();
		Student stud1 = new Student();
		
		stud1.setRollNo(1011);
		stud1.setName("messi");
		stud1.setMarks(87);
		
		Session s =obj.getSession();
		Transaction tx=s.beginTransaction();
		
		s.update(stud1);
		tx.commit();
		
		s.close();
		
		

	}

}
