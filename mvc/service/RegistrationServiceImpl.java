package com.lnt.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.mvc.dao.RegistrationDao;
import com.lnt.mvc.model.Registration;
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RegistrationDao registrationDao;

	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}

	@Override
	@Transactional
	public void save(Registration r) {
		this.registrationDao.save(r);
		
	}
	

}
