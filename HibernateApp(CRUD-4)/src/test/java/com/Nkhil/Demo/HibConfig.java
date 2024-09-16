package com.Nkhil.Demo;
//this is code for configure file do not reequire to load agian and agian
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibConfig 
{
	public Session getSession()
	{
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s=sf.openSession();
		return s;
	}
}
