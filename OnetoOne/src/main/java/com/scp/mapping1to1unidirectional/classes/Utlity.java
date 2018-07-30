package com.scp.mapping1to1unidirectional.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utlity {

	static SessionFactory sf;

	static Session s;
	public static SessionFactory getSessionFactory()
	{
		if(sf==null) {
		sf=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
		return sf;
		}
		return sf;
		
	}
	
	public static Session getSession() {
		if(sf!=null)
		{
			s=sf.openSession();
			return s;
		}
		else {
		s=getSessionFactory().openSession();
		return s;
		
	}
	}

}
