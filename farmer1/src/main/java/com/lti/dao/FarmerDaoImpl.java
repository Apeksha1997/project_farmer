package com.lti.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Login;
@Repository
public class FarmerDaoImpl implements FarmerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public FarmerDaoImpl() {
	}

	public int login(Login login) {
		String jpql="From Login l where l.email=:email and l.password=:password";
		TypedQuery<Login> tquery=entityManager.createQuery(jpql,Login.class);
		tquery.setParameter("email",login.getEmail());
		tquery.setParameter("password",login.getPassword());
		
		List<Login> result=tquery.getResultList();
		return result.size();
	}

	/*public int login(String email, String password) {
//			String email1=email;
//			String pass=password;
			//Query q = entityManager.createQuery("select l from Login l where l.email=:em ");
		
		
			String jpql = "select l from Login l where l.email=:em and l.password=:pa";
			System.out.println("Username: " + email);
			TypedQuery<Login> tquery=  entityManager.createQuery(jpql,Login.class);
			System.out.println("Username: " + email);
			 tquery.setParameter("em", email);
			 tquery.setParameter("pa", password);
			 System.out.println("Username: " + email);
			 List<Login> login = tquery.getResultList(); 
			System.out.println("Login: " + login);
//			 String pin= login.getPassword();
			 
			 return 1;
//			 if(login==null)
//			 {
//					return 0;
//			 }
//			 else{
//				 if(pass == pin)
//				 {
//					 return 1;
//				 }
//				 else
//				 {
//					 return 2;
//				 }
//			 }
	}*/

//	@Transactional
//	public int createFarmer(Farmer farmer) {
//		System.out.println(farmer);
////		farmer=entityManager.merge(farmer);
//		entityManager.persist(farmer);
//		return 1;
//	
	
	
	}

	/*	public Login login(String email, String password) {
			Query q = entityManager.createQuery("select l from Login l where l.email=:em and l.password=:pa");
			q.setParameter("em", email);
			q.setParameter("pa", password);
			return (Login) q.getSingleResult();
		}*/
	
	
	
	
	



