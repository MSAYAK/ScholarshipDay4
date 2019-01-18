package com.lnt.mvc.dao;

 


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
		private static final Logger logger = 			
				LoggerFactory.getLogger(RegistrationDaoImpl.class);
		
		@Override
		public void save(Registration r) {
			
			Session session = this.sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(r);
			logger.info("Person saved successfully, Person Details="
			+ r);
			tx.commit();
			
			session.close();
			
			
	}

}
