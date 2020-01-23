package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.StudentDao;
import com.lti.model.Farmer;

@Service("service")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;
	public StudentDao getDao() {
		return dao;
	}
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public boolean addStuden(Farmer farmer) {
		int result=dao.createFarmer(farmer);
		if(result==1)
			return true;
		else		
		return false;
	}
	}
	