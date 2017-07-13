package com.gemicle.usercost.service;

import org.hibernate.classic.Session;

import com.gemicle.usercost.orm.SessionOrm;

public class PurseService {
	private SessionOrm sessionOrm = new SessionOrm();

	public long save(Object obj) {
		Session session = sessionOrm.openSession();
		long result = (long) session.save(obj);
		sessionOrm.commitAndCloseSession(session);
		return result;
	} 
	
	
}
