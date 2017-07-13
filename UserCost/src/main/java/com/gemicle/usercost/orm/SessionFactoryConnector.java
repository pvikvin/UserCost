package com.gemicle.usercost.orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactoryConnector {
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (RuntimeException e) {
			throw new RuntimeException("Initial SessionFactory creation failed.");
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
