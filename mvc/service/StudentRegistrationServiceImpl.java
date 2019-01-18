package com.lnt.mvc.service;

//import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.mvc.dao.StudentRegistrationDao;
import com.lnt.mvc.model.StudentRegistration;
@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService{
@	Autowired	
private StudentRegistrationDao studentRegistrationDao;

public void setStudentRegistrationDao(StudentRegistrationDao studentRegistrationDao) {
	this.studentRegistrationDao = studentRegistrationDao;
}

@Override
@Transactional
public void save(StudentRegistration s) {
 this.studentRegistrationDao.save(s);
	
}

@Override
public boolean verifyUser(Integer aadharno, String password) {
	return this.studentRegistrationDao.verifyUser(aadharno, password);
}

@Override
public boolean verifyMinister(String username, String password) {

	return this.studentRegistrationDao.verifyMinister(username, password);
}

 
	

}
