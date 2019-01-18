package com.lnt.mvc.service;

//import java.util.List;

import com.lnt.mvc.model.StudentRegistration;

public interface StudentRegistrationService {
	
	public void save(StudentRegistration s);

	public boolean verifyUser(Integer aadharno,String password);
	public  boolean verifyMinister(String username,String password);
}
