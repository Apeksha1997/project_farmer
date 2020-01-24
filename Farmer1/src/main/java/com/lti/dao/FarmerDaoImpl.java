package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Farmer;
@Repository
public class FarmerDaoImpl implements FarmerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public FarmerDaoImpl() {
	}

	@Transactional
	public int createFarmer(Farmer farmer) {
		entityManager.persist(farmer);
		return 1;
	}
	
	
	


}
