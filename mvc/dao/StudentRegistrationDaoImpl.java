package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.MinisterLogin;
//import com.lnt.mvc.model.Registration;
import com.lnt.mvc.model.StudentRegistration;





@Repository
public class StudentRegistrationDaoImpl implements StudentRegistrationDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	 

	

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory=sf;
	}	
	
	 
		private static final Logger logger = 			
				LoggerFactory.getLogger(StudentRegistrationDaoImpl.class);
		
		@Override
		public void save(StudentRegistration s) {
			
			Session session = this.sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(s);
			logger.info("Student saved successfully, Person Details="
			+ s);
			tx.commit();
			
			session.close();
			
			
			
			
			
			
	}

		@Override
		public boolean verifyUser(Integer aadharno, String password) {
			Session session = this.sessionFactory.openSession();
			
	 
			
			  System.out.println("hello");
			  String query="from StudentRegistration a where a.aadharno=:aadharno and a.password=:password";
		
			  Query q=session.createQuery(query);
			  q.setInteger("aadharno",aadharno);
			  q.setString("password", password);
			  List<StudentRegistration>list=q.list();
			  System.out.println("hello");
	if(list.size()==0)
	{
		  return false;
	}
	session.close();
		  return true;

	}

		@Override
		public boolean verifyMinister(String username, String password) {
				Session session = this.sessionFactory.openSession();
				
		 

				  System.out.println("hello");	
				  
				  String query="Select * from minister a where a.username=:username and a.password=:password";
				  SQLQuery q = session.createSQLQuery(query);				  
				  q.setParameter("username", username);
				  q.setParameter("password", password);
				 // Query q=session.createQuery(query);
				  //q.setString("username",username);
				 // q.setString("password", password);
				 
				  System.out.println("hello");
				  List<MinisterLogin>list1=q.list();
					if(list1.size()==0){
						  return false;
					}
					session.close();
			     return true;

		}
		}

		
		


	 

	
		 
		 


