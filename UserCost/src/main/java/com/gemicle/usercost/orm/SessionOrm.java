package com.gemicle.usercost.orm;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class SessionOrm {
	SessionFactoryConnector connector = new SessionFactoryConnector();
	
	public Session openSession(){
		SessionFactory sf = connector.getSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		return session;
	}
	
	public void commitAndCloseSession(Session session){
		session.getTransaction().commit();
	}
}
