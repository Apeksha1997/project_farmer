package com.lti.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.FarmerDao;
import com.lti.model.DetailsFarmer;
import com.lti.model.Farmer;
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


	@Transactional
	public boolean addFarmer(Farmer farmer) {
		int result=dao.createFarmer(farmer);
		if(result==1)
			return true;
		else		
		return false;
	}
	@Override
	public boolean addFarmerDetails(DetailsFarmer farmer) {
		int result=dao.detailsFarmer(farmer);
		if(result==1)
			return true;
		else		
		return false;	}
	
}
