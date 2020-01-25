package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.FarmerDao;
import com.lti.model.DetailsFarmer;
import com.lti.model.Farmer;
import com.lti.model.Login;

@Service("service")
public class FarmerServiceImpl implements FarmerService {

	@Autowired
	private FarmerDao dao;

	public FarmerDao getDao() {
		return dao;
	}

	public void setDao(FarmerDao dao) {
		this.dao = dao;
	}

	public boolean addLogin(Login login) {
		int result = dao.login(login);
		if (result == 1)
			return true;
		else
			return false;
	}

	/*
	 * @Transactional public boolean addLogin(String email,String password) {
	 * int result=dao.login(email, password); System.out.println("result");
	 * if(result==1) return true; else return false; }
	 */
	/*
	 * public boolean login(String email, String password) {
	 * 
	 * int result=dao.login(email,password); if(result==1) return true; else
	 * return false; }
	 */

}
