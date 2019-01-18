package com.lnt.mvc.dao;

 

 
import com.lnt.mvc.model.StudentRegistration;

public interface StudentRegistrationDao {
	
public void save(StudentRegistration s);
public boolean verifyUser(Integer aadharno,String password);
public  boolean verifyMinister(String username,String password);

}
